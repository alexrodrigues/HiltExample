package br.com.rodriguesalex.hiltexample

import javax.inject.Inject

interface ApiObject {
    fun provideIdenfier(): String
}

class ApiObjectImpl @Inject constructor(): ApiObject {
    override fun provideIdenfier() = "c41ef619-c1f4-45b4-88b1-ddf9fa63a901"
}