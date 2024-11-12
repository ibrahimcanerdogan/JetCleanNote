package com.plcoding.cleanarchitecturenoteapp.di

import com.plcoding.cleanarchitecturenoteapp.domain.repository.NoteRepository
import com.plcoding.cleanarchitecturenoteapp.domain.usecase.AddNote
import com.plcoding.cleanarchitecturenoteapp.domain.usecase.DeleteNote
import com.plcoding.cleanarchitecturenoteapp.domain.usecase.GetNote
import com.plcoding.cleanarchitecturenoteapp.domain.usecase.GetNotes
import com.plcoding.cleanarchitecturenoteapp.domain.usecase.NoteUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository): NoteUseCase {
        return NoteUseCase(
            getNotes = GetNotes(repository),
            deleteNote = DeleteNote(repository),
            addNote = AddNote(repository),
            getNote = GetNote(repository)
        )
    }
}