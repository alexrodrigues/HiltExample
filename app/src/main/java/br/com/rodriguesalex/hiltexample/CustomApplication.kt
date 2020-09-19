package br.com.rodriguesalex.hiltexample

import android.app.Application
import android.util.Log
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject
import javax.inject.Named

@HiltAndroidApp
class CustomApplication: Application() {
    @Inject
    lateinit var api: ApiObject

    override fun onCreate() {
        super.onCreate()
        Log.d("CustomApplication", api.provideIdenfier())
    }
}