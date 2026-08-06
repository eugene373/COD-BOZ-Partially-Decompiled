package com.ideaworks3d.marmalade

import android.content.ContentResolver
import android.content.ContentUris
import android.content.Context
import android.database.Cursor
import android.net.Uri
import android.provider.ContactsContract
import android.util.Log

class s3eContacts {

    companion object {
        private const val TAG = "s3eContacts"
        private var s_Instance: s3eContacts? = null

        fun GetInstance(): s3eContacts {
            if (s_Instance == null) {
                s_Instance = s3eContacts()
            }
            return s_Instance!!
        }
    }

    private var m_Context: Context? = null

    fun s3eContactsInit(context: Context?): Int {
        m_Context = context
        return 0
    }

    fun s3eContactsTerm() {
    }

    fun s3eContactsGetCount(): Int {
        val context = m_Context ?: return 0
        val resolver: ContentResolver = context.contentResolver
        val cursor = resolver.query(
            ContactsContract.Contacts.CONTENT_URI,
            arrayOf(ContactsContract.Contacts._ID),
            null, null, null
        )
        val count = cursor?.count ?: 0
        cursor?.close()
        return count
    }

    fun s3eContactsGetContactID(index: Int): String {
        val context = m_Context ?: return ""
        val resolver: ContentResolver = context.contentResolver
        val cursor = resolver.query(
            ContactsContract.Contacts.CONTENT_URI,
            arrayOf(ContactsContract.Contacts._ID),
            null, null, null
        )
        cursor?.moveToPosition(index)
        val id = cursor?.getString(cursor.getColumnIndexOrThrow(ContactsContract.Contacts._ID)) ?: ""
        cursor?.close()
        return id
    }

    fun s3eContactsGetFieldString(contactID: String, fieldType: Int): String {
        val context = m_Context ?: return ""
        val resolver: ContentResolver = context.contentResolver

        val uri = ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, contactID.toLong())

        return when (fieldType) {
            1 -> getName(resolver, uri)
            2 -> getPhone(resolver, uri)
            3 -> getEmail(resolver, uri)
            4 -> getAddress(resolver, uri)
            5 -> getOrganization(resolver, uri)
            6 -> getNote(resolver, uri)
            7 -> getIM(resolver, uri)
            else -> ""
        }
    }

    private fun getName(resolver: ContentResolver, uri: Uri): String {
        val cursor = resolver.query(
            uri,
            arrayOf(ContactsContract.Contacts.DISPLAY_NAME),
            null, null, null
        )
        cursor?.moveToFirst()
        val name = cursor?.getString(cursor.getColumnIndexOrThrow(ContactsContract.Contacts.DISPLAY_NAME)) ?: ""
        cursor?.close()
        return name
    }

    private fun getPhone(resolver: ContentResolver, uri: Uri): String {
        val dataUri = ContactsContract.Data.CONTENT_URI
        val selection = ContactsContract.Data.CONTACT_ID + "=? AND " + ContactsContract.Data.MIMETYPE + "=?"
        val selectionArgs = arrayOf(uri.lastPathSegment, ContactsContract.CommonDataKinds.Phone.CONTENT_ITEM_TYPE)
        val cursor = resolver.query(dataUri, arrayOf(ContactsContract.CommonDataKinds.Phone.NUMBER), selection, selectionArgs, null)
        cursor?.moveToFirst()
        val phone = cursor?.getString(cursor.getColumnIndexOrThrow(ContactsContract.CommonDataKinds.Phone.NUMBER)) ?: ""
        cursor?.close()
        return phone
    }

    private fun getEmail(resolver: ContentResolver, uri: Uri): String {
        val dataUri = ContactsContract.Data.CONTENT_URI
        val selection = ContactsContract.Data.CONTACT_ID + "=? AND " + ContactsContract.Data.MIMETYPE + "=?"
        val selectionArgs = arrayOf(uri.lastPathSegment, ContactsContract.CommonDataKinds.Email.CONTENT_ITEM_TYPE)
        val cursor = resolver.query(dataUri, arrayOf(ContactsContract.CommonDataKinds.Email.ADDRESS), selection, selectionArgs, null)
        cursor?.moveToFirst()
        val email = cursor?.getString(cursor.getColumnIndexOrThrow(ContactsContract.CommonDataKinds.Email.ADDRESS)) ?: ""
        cursor?.close()
        return email
    }

    private fun getAddress(resolver: ContentResolver, uri: Uri): String {
        val dataUri = ContactsContract.Data.CONTENT_URI
        val selection = ContactsContract.Data.CONTACT_ID + "=? AND " + ContactsContract.Data.MIMETYPE + "=?"
        val selectionArgs = arrayOf(uri.lastPathSegment, ContactsContract.CommonDataKinds.StructuredPostal.CONTENT_ITEM_TYPE)
        val cursor = resolver.query(dataUri, null, selection, selectionArgs, null)
        cursor?.moveToFirst()
        var address = ""
        if (cursor != null && !cursor.isAfterLast) {
            val street = cursor.getString(cursor.getColumnIndexOrThrow(ContactsContract.CommonDataKinds.StructuredPostal.STREET)) ?: ""
            val city = cursor.getString(cursor.getColumnIndexOrThrow(ContactsContract.CommonDataKinds.StructuredPostal.CITY)) ?: ""
            val region = cursor.getString(cursor.getColumnIndexOrThrow(ContactsContract.CommonDataKinds.StructuredPostal.REGION)) ?: ""
            val postcode = cursor.getString(cursor.getColumnIndexOrThrow(ContactsContract.CommonDataKinds.StructuredPostal.POSTCODE)) ?: ""
            val country = cursor.getString(cursor.getColumnIndexOrThrow(ContactsContract.CommonDataKinds.StructuredPostal.COUNTRY)) ?: ""
            address = "$street, $city, $region $postcode, $country"
        }
        cursor?.close()
        return address
    }

    private fun getOrganization(resolver: ContentResolver, uri: Uri): String {
        val dataUri = ContactsContract.Data.CONTENT_URI
        val selection = ContactsContract.Data.CONTACT_ID + "=? AND " + ContactsContract.Data.MIMETYPE + "=?"
        val selectionArgs = arrayOf(uri.lastPathSegment, ContactsContract.CommonDataKinds.Organization.CONTENT_ITEM_TYPE)
        val cursor = resolver.query(dataUri, arrayOf(ContactsContract.CommonDataKinds.Organization.COMPANY), selection, selectionArgs, null)
        cursor?.moveToFirst()
        val org = cursor?.getString(cursor.getColumnIndexOrThrow(ContactsContract.CommonDataKinds.Organization.COMPANY)) ?: ""
        cursor?.close()
        return org
    }

    private fun getNote(resolver: ContentResolver, uri: Uri): String {
        val dataUri = ContactsContract.Data.CONTENT_URI
        val selection = ContactsContract.Data.CONTACT_ID + "=? AND " + ContactsContract.Data.MIMETYPE + "=?"
        val selectionArgs = arrayOf(uri.lastPathSegment, ContactsContract.CommonDataKinds.Note.CONTENT_ITEM_TYPE)
        val cursor = resolver.query(dataUri, arrayOf(ContactsContract.CommonDataKinds.Note.NOTE), selection, selectionArgs, null)
        cursor?.moveToFirst()
        val note = cursor?.getString(cursor.getColumnIndexOrThrow(ContactsContract.CommonDataKinds.Note.NOTE)) ?: ""
        cursor?.close()
        return note
    }

    private fun getIM(resolver: ContentResolver, uri: Uri): String {
        val dataUri = ContactsContract.Data.CONTENT_URI
        val selection = ContactsContract.Data.CONTACT_ID + "=? AND " + ContactsContract.Data.MIMETYPE + "=?"
        val selectionArgs = arrayOf(uri.lastPathSegment, ContactsContract.CommonDataKinds.Im.CONTENT_ITEM_TYPE)
        val cursor = resolver.query(dataUri, arrayOf(ContactsContract.CommonDataKinds.Im.DATA), selection, selectionArgs, null)
        cursor?.moveToFirst()
        val im = cursor?.getString(cursor.getColumnIndexOrThrow(ContactsContract.CommonDataKinds.Im.DATA)) ?: ""
        cursor?.close()
        return im
    }
}