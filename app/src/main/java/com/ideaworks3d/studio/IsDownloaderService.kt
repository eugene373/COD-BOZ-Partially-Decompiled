package com.ideaworks3d.studio

import com.android.vending.expansion.downloader.impl.DownloaderService

class IsDownloaderService : DownloaderService() {

    companion object {
        val SALT: ByteArray = byteArrayOf(
            0x1, 0x2b, -0xc, -0x1,
            0x36, 0x62, -0x64, -0xc,
            0x2b, 0x2, -0x8, -0x4,
            0x9, 0x5, -0x6a, -0x6c,
            -0x21, 0x2d, -0x1, 0x54
        )

        const val BASE64_PUBLIC_KEY = "REPLACE THIS WITH YOUR PUBLIC KEY"
    }

    override fun getAlarmReceiverClassName(): String {
        return IsAlarmReciever::class.java.name
    }

    override fun getPublicKey(): String {
        return BASE64_PUBLIC_KEY
    }

    override fun getSALT(): ByteArray {
        return SALT
    }
}
