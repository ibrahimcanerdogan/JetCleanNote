package com.plcoding.cleanarchitecturenoteapp.domain.usecase

import com.plcoding.cleanarchitecturenoteapp.data.model.InvalidNoteException
import com.plcoding.cleanarchitecturenoteapp.data.model.Note
import com.plcoding.cleanarchitecturenoteapp.domain.repository.NoteRepository
import javax.inject.Inject

class AddNote @Inject constructor(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if(note.title.isBlank()) {
            throw InvalidNoteException("The title of the note can't be empty.")
        }
        if(note.content.isBlank()) {
            throw InvalidNoteException("The content of the note can't be empty.")
        }
        repository.insertNoteRepository(note)
    }
}