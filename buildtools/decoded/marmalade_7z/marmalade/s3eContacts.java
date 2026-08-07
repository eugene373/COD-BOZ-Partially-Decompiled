package com.ideaworks3d.marmalade;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract.Data;
import android.provider.ContactsContract.RawContacts;
import android.util.Log;
import java.util.HashMap;

class s3eContacts {
      private int[] contactsMap = null;
      private final int S3E_CONTACTS_FIELD_DISPLAY_NAME = 0;
      private final int S3E_CONTACTS_FIELD_HOME_PHONE = 5;
      private final int S3E_CONTACTS_FIELD_MOBILE_PHONE = 6;
      private final int S3E_CONTACTS_FIELD_WORK_PHONE = 7;
      private final int S3E_CONTACTS_FIELD_EMAIL_ADDR = 8;
      private final int S3E_CONTACTS_FIELD_ADDRESS = 10;
      private final int S3E_CONTACTS_FIELD_LAST_NAME = 2;
      private final int S3E_CONTACTS_FIELD_FIRST_NAME = 1;
      private final int S3E_CONTACTS_FIELD_MIDDLE_NAME = 3;
      private final int S3E_CONTACTS_FIELD_HONORIFIC_PREFIX = 16;
      private final int S3E_CONTACTS_FIELD_HONORIFIC_SUFFIX = 17;
      private final int S3E_CONTACTS_FIELD_NICKNAME = 4;
      private final int S3E_CONTACTS_FIELD_FORMATTED_ADDR = 19;
      private final int S3E_CONTACTS_FIELD_CITY = 11;
      private final int S3E_CONTACTS_FIELD_REGION = 20;
      private final int S3E_CONTACTS_FIELD_POSTAL_CODE = 12;
      private final int S3E_CONTACTS_FIELD_COUNTRY = 13;
      private final int S3E_CONTACTS_FIELD_IM = 25;
      private final int S3E_CONTACTS_FIELD_NOTE = 36;
      private final int S3E_CONTACTS_FIELD_URL = 9;
      private final int S3E_CONTACTS_FIELD_ORGANISATION = 32;
      private final int S3E_CONTACTS_FIELD_ORGANISATION_DEPT = 33;
      private final int S3E_CONTACTS_FIELD_ORGANISATION_TITLE = 34;
      private final int S3E_CONTACTS_UNLIMITED_MAX_ENTRIES = Integer.MAX_VALUE;
      private String m_QueryToSearch = new String();
      private final HashMap m_ContactFields = this.InitContactFieldMap();

      HashMap InitContactFieldMap() {
            HashMap var1 = new HashMap();
            var1.put(4, new s3eContacts.FieldItem("vnd.android.cursor.item/nickname", "data1", 1));
            var1.put(8, new s3eContacts.FieldItem("vnd.android.cursor.item/email_v2", "data1", Integer.MAX_VALUE));
            var1.put(25, new s3eContacts.FieldItem("vnd.android.cursor.item/im", "data1", Integer.MAX_VALUE));
            var1.put(36, new s3eContacts.FieldItem("vnd.android.cursor.item/note", "data1", 1));
            var1.put(9, new s3eContacts.FieldItem("vnd.android.cursor.item/website", "data1", Integer.MAX_VALUE));
            var1.put(19, new s3eContacts.FieldItem("vnd.android.cursor.item/postal-address_v2", "data1", Integer.MAX_VALUE));
            var1.put(10, new s3eContacts.FieldItem("vnd.android.cursor.item/postal-address_v2", "data1", Integer.MAX_VALUE));
            var1.put(11, new s3eContacts.FieldItem("vnd.android.cursor.item/postal-address_v2", "data7", 1));
            var1.put(20, new s3eContacts.FieldItem("vnd.android.cursor.item/postal-address_v2", "data8", 1));
            var1.put(12, new s3eContacts.FieldItem("vnd.android.cursor.item/postal-address_v2", "data9", 1));
            var1.put(13, new s3eContacts.FieldItem("vnd.android.cursor.item/postal-address_v2", "data10", 1));
            var1.put(0, new s3eContacts.FieldItem("vnd.android.cursor.item/name", "data1", 1));
            var1.put(1, new s3eContacts.FieldItem("vnd.android.cursor.item/name", "data2", 1));
            var1.put(2, new s3eContacts.FieldItem("vnd.android.cursor.item/name", "data3", 1));
            var1.put(17, new s3eContacts.FieldItem("vnd.android.cursor.item/name", "data6", 1));
            var1.put(32, new s3eContacts.FieldItem("vnd.android.cursor.item/organization", "data1", 1));
            var1.put(33, new s3eContacts.FieldItem("vnd.android.cursor.item/organization", "data5", 1));
            var1.put(34, new s3eContacts.FieldItem("vnd.android.cursor.item/organization", "data4", 1));
            var1.put(5, new s3eContacts.FieldItem("vnd.android.cursor.item/phone_v2", "data1", Integer.MAX_VALUE, "data2", 1));
            var1.put(6, new s3eContacts.FieldItem("vnd.android.cursor.item/phone_v2", "data1", Integer.MAX_VALUE, "data2", 2));
            var1.put(7, new s3eContacts.FieldItem("vnd.android.cursor.item/phone_v2", "data1", Integer.MAX_VALUE, "data2", 3));
            return var1;
      }

      private String CreateSearchQuery(String var1, String var2, String var3, String var4, int var5) {
            String var6 = "((mimetype = '" + var2 + "') AND (" + var3 + " LIKE '%" + var1 + "%')";
            if (var4 != null) {
                  var6 = var6 + "AND ( " + var4 + " = '" + var5 + "' )";
            }

            var6 = var6 + ")";
            return var6;
      }

      public String QueryForContactRow(int var1, String var2, String var3, int var4) {
            String var5 = "mimetype = '" + var2 + "'" + " AND " + "contact_id" + " = " + var1;
            if (var3 != null) {
                  var5 = var5 + " AND " + var3 + " = " + var4;
            }

            Log.v("myapp", "query for row: " + var5);
            return var5;
      }

      private void AddQueryes(String var1, int var2) {
            s3eContacts.FieldItem var3 = (s3eContacts.FieldItem)this.m_ContactFields.get(var2);
            if (var3 != null) {
                  if (this.m_QueryToSearch.length() > 0) {
                        this.m_QueryToSearch = this.m_QueryToSearch + " OR ";
                  }

                  this.m_QueryToSearch = this.m_QueryToSearch + this.CreateSearchQuery(var1, var3.mimeType, var3.searchColumn, var3.fieldTypeColumn, var3.fieldType);
            }
      }

      private boolean UpdateUIDMap(String var1) {
            Log.v("myapp", "update contacts with query: " + var1);
            this.contactsMap = new int[0];
            Cursor var2 = null;
            boolean var5 = var1 == null;
            Uri var3 = var5 ? RawContacts.CONTENT_URI : Data.CONTENT_URI;
            String var4 = var5 ? "contact_id" : "contact_id";
            var1 = var5 ? "deleted = 0 " : var1;

            try {
                  var2 = LoaderActivity.m_Activity.getContentResolver().query(var3, new String[]{var4}, var1, (String[])null, (String)null);
                  var2.moveToFirst();
            } catch (Exception var8) {
                  return false;
            }

            if (var2 == null) {
                  return false;
            } else {
                  int var6 = var2.getCount();
                  this.contactsMap = new int[var6];
                  Log.v("myapp", "cursor: number of records: " + var6);
                  int var7 = 0;

                  while(var7 < var6) {
                        this.contactsMap[var7] = var2.getInt(var2.getColumnIndex(var4));
                        ++var7;
                        var2.moveToNext();
                  }

                  var2.close();
                  return true;
            }
      }

      public boolean contactsSimpleSearch(String var1, int[] var2, boolean var3) {
            this.m_QueryToSearch = "";

            for(int var4 = 0; var4 < var2.length; ++var4) {
                  this.AddQueryes(var1, var2[var4]);
            }

            return this.m_QueryToSearch == "" ? false : this.UpdateUIDMap(this.m_QueryToSearch);
      }

      public boolean contactsUpdate() {
            return this.UpdateUIDMap((String)null);
      }

      public int contactsGetNumRecords() {
            return this.contactsMap != null ? this.contactsMap.length : -1;
      }

      public int contactsGetUID(int var1) {
            return this.contactsMap != null && var1 >= 0 && var1 < this.contactsMap.length ? this.contactsMap[var1] : -1;
      }

      public Cursor contactsGetData(int var1, int var2) {
            s3eContacts.FieldItem var3 = (s3eContacts.FieldItem)this.m_ContactFields.get(var2);
            return var3 == null ? null : LoaderActivity.m_Activity.getContentResolver().query(Data.CONTENT_URI, new String[]{var3.searchColumn}, this.QueryForContactRow(var1, var3.mimeType, var3.fieldTypeColumn, var3.fieldType), (String[])null, (String)null);
      }

      public int contactsGetMaxNumEntries(int var1) {
            s3eContacts.FieldItem var2 = (s3eContacts.FieldItem)this.m_ContactFields.get(var1);
            return var2 == null ? 0 : var2.maxEntries;
      }

      public int contactsGetNumEntries(int var1, int var2) {
            int var3 = 0;
            Cursor var4 = null;

            byte var5;
            try {
                  var4 = this.contactsGetData(var1, var2);
                  if (var4 == null) {
                        var5 = 0;
                        return var5;
                  }

                  var3 = var4.getCount();
                  if (var2 != 0 || var3 != 1 || !var4.moveToPosition(0) || var4.getString(0) != null) {
                        return var3;
                  }

                  var5 = 0;
            } catch (Exception var9) {
                  return var3;
            } finally {
                  if (var4 != null) {
                        var4.close();
                  }

            }

            return var5;
      }

      public String contactsGetField(int var1, int var2, int var3) {
            String var4 = null;
            Cursor var5 = null;

            Object var6;
            try {
                  var5 = this.contactsGetData(var1, var2);
                  if (var5 != null) {
                        if (var5.moveToPosition(var3)) {
                              var4 = var5.getString(0);
                        }

                        return var4;
                  }

                  var6 = null;
            } catch (Exception var10) {
                  return var4;
            } finally {
                  if (var5 != null) {
                        var5.close();
                  }

            }

            return (String)var6;
      }

      public boolean contactsSetField(String var1, int var2, int var3, int var4) {
            s3eContacts.FieldItem var5 = (s3eContacts.FieldItem)this.m_ContactFields.get(var3);
            if (var5 == null) {
                  return false;
            } else {
                  boolean var6 = true;
                  Cursor var7 = null;

                  try {
                        ContentResolver var8 = LoaderActivity.m_Activity.getContentResolver();
                        var7 = var8.query(Data.CONTENT_URI, new String[]{"_id", "contact_id", "mimetype"}, this.QueryForContactRow(var2, var5.mimeType, var5.fieldTypeColumn, var5.fieldType), (String[])null, (String)null);
                        ContentValues var9 = new ContentValues();
                        var9.put(var5.searchColumn, var1);
                        var9.put("mimetype", var5.mimeType);
                        var9.put("raw_contact_id", var2);
                        if (var5.fieldTypeColumn != null) {
                              var9.put(var5.fieldTypeColumn, var5.fieldType);
                        }

                        if (var7 != null && var4 != var7.getCount()) {
                              Log.v("myapp", "update row. type: " + var5.mimeType + " value: " + var1);
                              var7.moveToPosition(var4);
                              Uri var10 = Uri.withAppendedPath(Data.CONTENT_URI, var7.getString(var7.getColumnIndex("_id")));
                              var8.update(var10, var9, (String)null, (String[])null);
                        } else {
                              Log.v("myapp", "insert row. type: " + var5.mimeType + " value: " + var1);
                              var8.insert(Data.CONTENT_URI, var9);
                        }
                  } catch (Exception var14) {
                        var6 = false;
                  } finally {
                        if (var7 != null) {
                              var7.close();
                        }

                  }

                  return var6;
            }
      }

      public int contactsCreate() {
            try {
                  ContentValues var1 = new ContentValues();
                  var1.put("aggregation_mode", 3);
                  Uri var2 = LoaderActivity.m_Activity.getContentResolver().insert(RawContacts.CONTENT_URI, var1);
                  return Integer.parseInt(var2.getLastPathSegment());
            } catch (Exception var3) {
                  return -1;
            }
      }

      public boolean contactsDelete(int var1) {
            try {
                  ContentResolver var2 = LoaderActivity.m_Activity.getContentResolver();
                  Uri var3 = ContentUris.withAppendedId(RawContacts.CONTENT_URI, (long)var1);
                  return var2.delete(var3, (String)null, (String[])null) != 0;
            } catch (Exception var4) {
                  return false;
            }
      }

      class FieldItem {
            public String mimeType;
            public String searchColumn;
            public int maxEntries;
            public String fieldTypeColumn;
            public int fieldType;

            public FieldItem(String var2, String var3, int var4) {
                  this.mimeType = null;
                  this.searchColumn = null;
                  this.maxEntries = 0;
                  this.fieldTypeColumn = null;
                  this.fieldType = 0;
                  this.mimeType = var2;
                  this.searchColumn = var3;
                  this.maxEntries = var4;
            }

            public FieldItem(String var2, String var3, int var4, String var5, int var6) {
                  this(var2, var3, var4);
                  this.fieldTypeColumn = var5;
                  this.fieldType = var6;
            }
      }
}
