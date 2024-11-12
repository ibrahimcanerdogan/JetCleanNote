package com.plcoding.cleanarchitecturenoteapp.di

import com.plcoding.cleanarchitecturenoteapp.data.database.NoteDatabase
import com.plcoding.cleanarchitecturenoteapp.data.repository.NoteRepositoryImpl
import com.plcoding.cleanarchitecturenoteapp.domain.repository.NoteRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideNoteRepository(noteDatabase: NoteDatabase): NoteRepository {
        return NoteRepositoryImpl(noteDatabase.noteDao)
    }
}