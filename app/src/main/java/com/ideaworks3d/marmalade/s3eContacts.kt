package com.ideaworks3d.marmalade

import android.content.ContentUris
import android.content.ContentValues
import android.content.ContentResolver
import android.database.Cursor
import android.net.Uri
import android.provider.ContactsContract.Data
import android.provider.ContactsContract.RawContacts
import android.util.Log

internal class s3eContacts {
    private var contactsMap: IntArray? = null
    private var m_QueryToSearch: String = ""
    private val m_ContactFields: HashMap<Int, FieldItem> = InitContactFieldMap()

    internal inner class FieldItem(
        @JvmField var mimeType: String?,
        @JvmField var searchColumn: String?,
        @JvmField var maxEntries: Int,
        @JvmField var fieldTypeColumn: String? = null,
        @JvmField var fieldType: Int = 0,
    )

    fun InitContactFieldMap(): HashMap<Int, FieldItem> = hashMapOf(
        4 to FieldItem("vnd.android.cursor.item/nickname", "data1", 1),
        8 to FieldItem("vnd.android.cursor.item/email_v2", "data1", Int.MAX_VALUE),
        25 to FieldItem("vnd.android.cursor.item/im", "data1", Int.MAX_VALUE),
        36 to FieldItem("vnd.android.cursor.item/note", "data1", 1),
        9 to FieldItem("vnd.android.cursor.item/website", "data1", Int.MAX_VALUE),
        19 to FieldItem("vnd.android.cursor.item/postal-address_v2", "data1", Int.MAX_VALUE),
        10 to FieldItem("vnd.android.cursor.item/postal-address_v2", "data1", Int.MAX_VALUE),
        11 to FieldItem("vnd.android.cursor.item/postal-address_v2", "data7", 1),
        20 to FieldItem("vnd.android.cursor.item/postal-address_v2", "data8", 1),
        12 to FieldItem("vnd.android.cursor.item/postal-address_v2", "data9", 1),
        13 to FieldItem("vnd.android.cursor.item/postal-address_v2", "data10", 1),
        0 to FieldItem("vnd.android.cursor.item/name", "data1", 1),
        1 to FieldItem("vnd.android.cursor.item/name", "data2", 1),
        2 to FieldItem("vnd.android.cursor.item/name", "data3", 1),
        17 to FieldItem("vnd.android.cursor.item/name", "data6", 1),
        32 to FieldItem("vnd.android.cursor.item/organization", "data1", 1),
        33 to FieldItem("vnd.android.cursor.item/organization", "data5", 1),
        34 to FieldItem("vnd.android.cursor.item/organization", "data4", 1),
        5 to FieldItem("vnd.android.cursor.item/phone_v2", "data1", Int.MAX_VALUE, "data2", 1),
        6 to FieldItem("vnd.android.cursor.item/phone_v2", "data1", Int.MAX_VALUE, "data2", 2),
        7 to FieldItem("vnd.android.cursor.item/phone_v2", "data1", Int.MAX_VALUE, "data2", 3),
    )

    private fun CreateSearchQuery(
        query: String,
        mimeType: String,
        searchColumn: String,
        fieldTypeColumn: String?,
        fieldType: Int,
    ): String {
        var s = "((mimetype = '$mimeType') AND ($searchColumn LIKE '%$query%')"
        if (fieldTypeColumn != null) {
            s = "$s AND ( $fieldTypeColumn = '$fieldType' )"
        }
        s = "$s)"
        return s
    }

    fun QueryForContactRow(contactId: Int, mimeType: String, fieldTypeColumn: String?, fieldType: Int): String {
        var s = "mimetype = '$mimeType' AND contact_id = $contactId"
        if (fieldTypeColumn != null) {
            s = "$s AND $fieldTypeColumn = $fieldType"
        }
        Log.v("myapp", "query for row: $s")
        return s
    }

    private fun AddQueryes(query: String, field: Int) {
        val item = m_ContactFields[field] ?: return
        if (m_QueryToSearch.isNotEmpty()) {
            m_QueryToSearch = "$m_QueryToSearch OR "
        }
        m_QueryToSearch = m_QueryToSearch + CreateSearchQuery(
            query, item.mimeType!!, item.searchColumn!!, item.fieldTypeColumn!!, item.fieldType!!,
        )
    }

    private fun UpdateUIDMap(query: String?): Boolean {
        Log.v("myapp", "update contacts with query: $query")
        contactsMap = IntArray(0)
        var cursor: Cursor? = null
        val nullQuery = query == null
        val uri = if (nullQuery) RawContacts.CONTENT_URI else Data.CONTENT_URI
        val idColumn = if (nullQuery) "contact_id" else "contact_id"
        val selection = if (nullQuery) "deleted = 0 " else query
        return try {
            cursor = LoaderActivity.m_Activity!!.contentResolver.query(
                uri, arrayOf(idColumn), selection, null, null,
            )
            cursor!!.moveToFirst()
            val count = cursor.count
            contactsMap = IntArray(count)
            Log.v("myapp", "cursor: number of records: $count")
            var i = 0
            while (i < count) {
                contactsMap!![i] = cursor.getInt(cursor.getColumnIndex(idColumn))
                i++
                cursor.moveToNext()
            }
            cursor.close()
            true
        } catch (_: Exception) {
            false
        }
    }

    fun contactsSimpleSearch(query: String, fields: IntArray, unused: Boolean): Boolean {
        m_QueryToSearch = ""
        for (f in fields) AddQueryes(query, f)
        return if (m_QueryToSearch == "") false else UpdateUIDMap(m_QueryToSearch)
    }

    fun contactsUpdate(): Boolean = UpdateUIDMap(null)

    fun contactsGetNumRecords(): Int = if (contactsMap != null) contactsMap!!.size else -1

    fun contactsGetUID(index: Int): Int =
        if (contactsMap != null && index >= 0 && index < contactsMap!!.size) contactsMap!![index] else -1

    fun contactsGetData(contactId: Int, field: Int): Cursor? {
        val item = m_ContactFields[field] ?: return null
        return LoaderActivity.m_Activity!!.contentResolver.query(
            Data.CONTENT_URI,
            arrayOf(item.searchColumn!!),
            QueryForContactRow(contactId, item.mimeType!!, item.fieldTypeColumn!!, item.fieldType!!),
            null, null,
        )
    }

    fun contactsGetMaxNumEntries(field: Int): Int = m_ContactFields[field]?.maxEntries ?: 0

    fun contactsGetNumEntries(contactId: Int, field: Int): Int {
        var count = 0
        var cursor: Cursor? = null
        try {
            cursor = contactsGetData(contactId, field) ?: return 0
            count = cursor.count
            if (field != 0 || count != 1 || !cursor.moveToPosition(0) || cursor.getString(0) == null) {
                return count
            }
            return 0
        } catch (_: Exception) {
            return count
        } finally {
            cursor?.close()
        }
    }

    fun contactsGetField(contactId: Int, field: Int, entry: Int): String? {
        var result: String? = null
        var cursor: Cursor? = null
        try {
            cursor = contactsGetData(contactId, field) ?: return null
            if (cursor.moveToPosition(entry)) {
                result = cursor.getString(0)
            }
            return result
        } catch (_: Exception) {
            return result
        } finally {
            cursor?.close()
        }
    }

    fun contactsSetField(value: String, contactId: Int, field: Int, entry: Int): Boolean {
        val item = m_ContactFields[field] ?: return false
        var success = true
        var cursor: Cursor? = null
        try {
            val cr: ContentResolver = LoaderActivity.m_Activity!!.contentResolver
            cursor = cr.query(
                Data.CONTENT_URI,
                arrayOf("_id", "contact_id", "mimetype"),
                QueryForContactRow(contactId, item.mimeType!!, item.fieldTypeColumn!!, item.fieldType!!),
                null, null,
            )
            val values = ContentValues().apply {
                put(item.searchColumn, value)
                put("mimetype", item.mimeType)
                put("raw_contact_id", contactId)
                if (item.fieldTypeColumn != null) {
                    put(item.fieldTypeColumn, item.fieldType)
                }
            }
            if (cursor != null && entry != cursor.count) {
                Log.v("myapp", "update row. type: ${item.mimeType} value: $value")
                cursor.moveToPosition(entry)
                val updateUri = Uri.withAppendedPath(Data.CONTENT_URI, cursor.getString(cursor.getColumnIndex("_id")))
                cr.update(updateUri, values, null, null)
            } else {
                Log.v("myapp", "insert row. type: ${item.mimeType} value: $value")
                cr.insert(Data.CONTENT_URI, values)
            }
        } catch (_: Exception) {
            success = false
        } finally {
            cursor?.close()
        }
        return success
    }

    fun contactsCreate(): Int = try {
        val values = ContentValues().apply { put("aggregation_mode", 3) }
        val uri = LoaderActivity.m_Activity!!.contentResolver.insert(RawContacts.CONTENT_URI, values)
        uri!!.lastPathSegment!!.toInt()
    } catch (_: Exception) {
        -1
    }

    fun contactsDelete(contactId: Int): Boolean = try {
        val cr = LoaderActivity.m_Activity!!.contentResolver
        val uri = ContentUris.withAppendedId(RawContacts.CONTENT_URI, contactId.toLong())
        cr.delete(uri, null, null) != 0
    } catch (_: Exception) {
        false
    }

    companion object {
        private const val S3E_CONTACTS_FIELD_DISPLAY_NAME = 0
        private const val S3E_CONTACTS_FIELD_HOME_PHONE = 5
        private const val S3E_CONTACTS_FIELD_MOBILE_PHONE = 6
        private const val S3E_CONTACTS_FIELD_WORK_PHONE = 7
        private const val S3E_CONTACTS_FIELD_EMAIL_ADDR = 8
        private const val S3E_CONTACTS_FIELD_ADDRESS = 10
        private const val S3E_CONTACTS_FIELD_LAST_NAME = 2
        private const val S3E_CONTACTS_FIELD_FIRST_NAME = 1
        private const val S3E_CONTACTS_FIELD_MIDDLE_NAME = 3
        private const val S3E_CONTACTS_FIELD_HONORIFIC_PREFIX = 16
        private const val S3E_CONTACTS_FIELD_HONORIFIC_SUFFIX = 17
        private const val S3E_CONTACTS_FIELD_NICKNAME = 4
        private const val S3E_CONTACTS_FIELD_FORMATTED_ADDR = 19
        private const val S3E_CONTACTS_FIELD_CITY = 11
        private const val S3E_CONTACTS_FIELD_REGION = 20
        private const val S3E_CONTACTS_FIELD_POSTAL_CODE = 12
        private const val S3E_CONTACTS_FIELD_COUNTRY = 13
        private const val S3E_CONTACTS_FIELD_IM = 25
        private const val S3E_CONTACTS_FIELD_NOTE = 36
        private const val S3E_CONTACTS_FIELD_URL = 9
        private const val S3E_CONTACTS_FIELD_ORGANISATION = 32
        private const val S3E_CONTACTS_FIELD_ORGANISATION_DEPT = 33
        private const val S3E_CONTACTS_FIELD_ORGANISATION_TITLE = 34
        private const val S3E_CONTACTS_UNLIMITED_MAX_ENTRIES = Int.MAX_VALUE
    }
}
