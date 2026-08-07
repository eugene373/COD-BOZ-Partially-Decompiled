package com.ideaworks3d.marmalade

// Auto-emitted from javap text dump. See HOWTO_BUILD.md.
// 2 fields, 15 methods.

open class s3eContacts {
        private var contactsMap: Array<Int>
        private var m_QueryToSearch: String

    private fun CreateSearchQuery(p0: String, p1: String, p2: String, p3: String, p4: Int): String { return TODO("body: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;") }
    public fun QueryForContactRow(p0: Int, p1: String, p2: String, p3: Int): String { return TODO("body: (ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;") }
    private fun AddQueryes(p0: String, p1: Int) { /* TODO(body): (Ljava/lang/String;I)V */ }
    private fun UpdateUIDMap(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    public fun contactsSimpleSearch(p0: String, p1: Array<Int>, p2: Boolean): Boolean { return TODO("body: (Ljava/lang/String;[IZ)Z") }
    public fun contactsUpdate(): Boolean { return TODO("body: ()Z") }
    public fun contactsGetNumRecords(): Int { return TODO("body: ()I") }
    public fun contactsGetUID(p0: Int): Int { return TODO("body: (I)I") }
    public fun contactsGetData(p0: Int, p1: Int): android.database.Cursor { return TODO("body: (II)Landroid/database/Cursor;") }
    public fun contactsGetMaxNumEntries(p0: Int): Int { return TODO("body: (I)I") }
    public fun contactsGetNumEntries(p0: Int, p1: Int): Int { return TODO("body: (II)I") }
    public fun contactsGetField(p0: Int, p1: Int, p2: Int): String { return TODO("body: (III)Ljava/lang/String;") }
    public fun contactsSetField(p0: String, p1: Int, p2: Int, p3: Int): Boolean { return TODO("body: (Ljava/lang/String;III)Z") }
    public fun contactsCreate(): Int { return TODO("body: ()I") }
    public fun contactsDelete(p0: Int): Boolean { return TODO("body: (I)Z") }
}
