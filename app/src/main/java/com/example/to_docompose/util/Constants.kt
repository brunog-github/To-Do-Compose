package com.example.to_docompose.util

import androidx.compose.ui.unit.dp

object Constants {

    const val DATABASE_TABLE = "todo_table"
    const val DATABASE_NAME = "todo_database"

    const val SPLASH_SCREEN = "splash"
    const val LIST_SCREEN = "list/{action}"
    const val TASK_SCREEN = "task/{taskId}"

    const val LIST_ARGUMENT_KEY = "action"
    const val TASK_ARGUMENT_KEY = "taskId"

    const val PREFERENCE_NAME = "todo_preferences"
    const val PREFERENCE_KEY = "sort_state"

    val TASK_ITEM_ELEVATION = 2.dp

    const val MAX_TITLE_LENGTH = 30
    const val SPLASH_SCREEN_DELAY = 3000L
}