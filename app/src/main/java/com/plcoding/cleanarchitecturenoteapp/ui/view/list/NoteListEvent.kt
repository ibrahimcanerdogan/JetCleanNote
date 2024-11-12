package com.plcoding.cleanarchitecturenoteapp.ui.view.list

import com.plcoding.cleanarchitecturenoteapp.data.model.Note
import com.plcoding.cleanarchitecturenoteapp.domain.util.NoteOrder

sealed class NoteListEvent {
    data class Order(val noteOrder: NoteOrder): NoteListEvent()
    data class DeleteNote(val note: Note): NoteListEvent()
    data object RestoreNote: NoteListEvent()
    data object ToggleOrderSection: NoteListEvent()
}
