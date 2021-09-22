package com.example.atask.data.repositories

import com.example.atask.data.TaskDao
import com.example.atask.data.models.Task
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class TaskRepository @Inject constructor(private val taskDao: TaskDao) {

    val getAllTask: Flow<List<Task>> = taskDao.getAllTasks()

    val sortByLowPriority: Flow<List<Task>> = taskDao.sortByLowPriority()

    val sortByHighPriority: Flow<List<Task>> = taskDao.sortByHighPriority()

    fun getSelectedTask(taskId: Int): Flow<Task> {
        return taskDao.getSingleTask(taskId = taskId)
    }

    suspend fun addTask(task: Task) {
        taskDao.addTask(task = task)
    }

    suspend fun updateTask(task: Task) {
        taskDao.updateTask(task = task)
    }

    suspend fun deleteTask(task: Task) {
        taskDao.deleteTask(task = task)
    }

    suspend fun deleteAllTasks() {
        taskDao.deleteAllTasks()
    }

    fun searchDatabase(query: String): Flow<List<Task>> {
        return taskDao.searchDatabase(query = query)
    }


}
