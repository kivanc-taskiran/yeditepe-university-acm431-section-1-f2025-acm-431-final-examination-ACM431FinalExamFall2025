package com.yeditepe.finalexam.viewmodel

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateListOf
import com.yeditepe.finalexam.model.Task

class TaskViewModel : ViewModel() {

    // TODO 1: Create a mutable state list of Task objects
    // Initially add at least 2 tasks
    val tasks = mutableStateListOf<Task>(
        Task(1, "Complete Lab 1", false),
        Task(2, "Study for Final", false)
    )

    fun toggleTask(taskId: Int) {
        // TODO 2: Update isCompleted for the given task
    }
}
