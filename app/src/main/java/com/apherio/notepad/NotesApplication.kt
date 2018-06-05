package com.apherio.notepad

import android.app.Application

import com.apherio.notepad.data.DataStore

class NotesApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        DataStore.init(this)
    }
}