package com.example.atask.data.models

import androidx.compose.ui.graphics.Color
import com.example.atask.ui.theme.HighPriority
import com.example.atask.ui.theme.LowPriority
import com.example.atask.ui.theme.MediumPriority
import com.example.atask.ui.theme.NonePriority

enum class Priority(val color: Color) {
    High(HighPriority),
    Medium(MediumPriority),
    Low(LowPriority),
    None(NonePriority)
}
