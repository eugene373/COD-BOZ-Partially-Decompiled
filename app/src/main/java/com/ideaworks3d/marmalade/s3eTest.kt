package com.ideaworks3d.marmalade

import android.content.Context
import android.util.Log

class s3eTest {

    companion object {
        private const val TAG = "s3eTest"
        private var s_Instance: s3eTest? = null

        @JvmStatic
        fun GetInstance(): s3eTest {
            if (s_Instance == null) {
                s_Instance = s3eTest()
            }
            return s_Instance!!
        }
    }

    private var m_Context: Context? = null

    fun s3eTestInit(context: Context?): Int {
        m_Context = context
        return 0
    }

    fun s3eTestTerm() {
    }

    inner class TestEntry(var name: String = "", var value: String = "")

    inner class TestResult(var success: Int = 0, var message: String = "")

    inner class TestGroup(var name: String = "", var entries: MutableList<TestEntry> = mutableListOf())

    inner class TestSuite(var name: String = "", var groups: MutableList<TestGroup> = mutableListOf())

    inner class TestRunner(var suite: TestSuite? = null) {
        fun run(): Int {
            return 0
        }
    }

    inner class TestAssert {
        fun assertTrue(condition: Boolean, message: String): Boolean {
            if (!condition) {
                Log.e(TAG, "Assertion failed: $message")
            }
            return condition
        }

        fun assertFalse(condition: Boolean, message: String): Boolean {
            return assertTrue(!condition, message)
        }

        fun <T> assertEquals(expected: T, actual: T, message: String): Boolean {
            val equals = expected == actual
            if (!equals) {
                Log.e(TAG, "Assertion failed: $message (expected: $expected, actual: $actual)")
            }
            return equals
        }
    }
}