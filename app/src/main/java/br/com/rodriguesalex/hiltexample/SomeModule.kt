package br.com.rodriguesalex.hiltexample

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ApplicationComponent

@InstallIn(value = [ApplicationComponent::class, ActivityComponent::class])
@Module
abstract class SomeModule {

    @Binds
    abstract fun providesIdentifier(api: ApiObjectImpl): ApiObject
}
