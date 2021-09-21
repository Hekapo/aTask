package com.example.atask.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.atask.data.models.Task

@Database(entities = [Task::class], version = 1, exportSchema = false)
abstract class TaskDatabase : RoomDatabase() {

    abstract fun taskDao(): TaskDao

}
