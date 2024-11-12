package com.plcoding.cleanarchitecturenoteapp.domain.usecase

import com.plcoding.cleanarchitecturenoteapp.data.model.Note
import com.plcoding.cleanarchitecturenoteapp.domain.repository.NoteRepository
import javax.inject.Inject

class GetNote @Inject constructor(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note? {
        return repository.getSingleNoteRepository(id)
    }
}