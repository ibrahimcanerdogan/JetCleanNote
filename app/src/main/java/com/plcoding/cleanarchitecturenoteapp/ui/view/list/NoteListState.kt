package com.plcoding.cleanarchitecturenoteapp.ui.view.list

import com.plcoding.cleanarchitecturenoteapp.data.model.Note
import com.plcoding.cleanarchitecturenoteapp.domain.util.NoteOrder
import com.plcoding.cleanarchitecturenoteapp.domain.util.OrderType

data class NoteListState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
