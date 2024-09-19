package com.muan.textreaderapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform