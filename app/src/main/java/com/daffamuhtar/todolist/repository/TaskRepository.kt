package com.daffamuhtar.todolist.repository

import androidx.lifecycle.LiveData
import com.daffamuhtar.todolist.database.TaskDao
import com.daffamuhtar.todolist.database.TaskEntry

class TaskRepository(val taskDao: TaskDao) {
    suspend fun insert(taskEntry: TaskEntry) = taskDao.insert(taskEntry)

    suspend fun updateData(taskEntry: TaskEntry) = taskDao.update(taskEntry)

    suspend fun deleteItem(taskEntry: TaskEntry) = taskDao.delete(taskEntry)

    suspend fun deleteAll() {
        taskDao.deleteALl()
    }

    fun getAlTasks(): LiveData<List<TaskEntry>> = taskDao.getAllTask()
}