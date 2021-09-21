package com.example.atask.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.atask.util.Constants.DATABASE_TABLE

@Entity(tableName = DATABASE_TABLE)
data class Task(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String,
    val description: String,
    val priority: Priority
)
