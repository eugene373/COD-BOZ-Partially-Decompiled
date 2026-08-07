package android.support.v4.widget

// Auto-emitted from smali source: CursorFilter.java.
// 0 fields, 4 methods.

interface CursorFilter_CursorFilterClient {
    public fun changeCursor(p0: android.database.Cursor)

    public fun convertToString(p0: android.database.Cursor): CharSequence

    public fun getCursor(): android.database.Cursor

    public fun runQueryOnBackgroundThread(p0: CharSequence): android.database.Cursor

}
