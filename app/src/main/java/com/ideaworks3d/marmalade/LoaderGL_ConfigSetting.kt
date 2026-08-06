package com.ideaworks3d.marmalade

class LoaderGL_ConfigSetting(val mSetting: Int, val mDefault: Int = -1) {
    var mValue: Int = -1
        private set

    fun setValueToDefault() {
        mValue = mDefault
    }

    fun setValue(value: Int) {
        mValue = value
    }

    fun hasValue(): Boolean = mValue != -1
}
