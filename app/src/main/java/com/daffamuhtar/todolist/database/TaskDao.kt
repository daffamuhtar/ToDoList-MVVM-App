package com.daffamuhtar.todolist.database

import androidx.lifecycle.LiveData
import androidx.room.*
import kotlin.concurrent.timerTask

@Dao
interface TaskDao {

    @Insert
    suspend fun insert(taskEntry: TaskEntry)

    @Delete
    suspend fun delete(taskEntry: TaskEntry)

    @Update
    suspend fun update(taskEntry: TaskEntry)

    @Query("DELETE FROM task_table")
    suspend fun deleteALl()

    @Query("SELECT * FROM task_table ORDER BY timestamp DESC")
    fun getAllTask(): LiveData<List<TaskEntry>>

}