package com.plcoding.cleanarchitecturenoteapp.data.database

import androidx.room.*
import com.plcoding.cleanarchitecturenoteapp.data.model.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {

    @Query("SELECT * FROM note")
    fun getAllNoteDatabase(): Flow<List<Note>>

    @Query("SELECT * FROM note WHERE id = :id")
    suspend fun getSingleNoteDatabase(id: Int): Note?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNoteDatabase(note: Note)

    @Delete
    suspend fun deleteNoteDatabase(note: Note)
}