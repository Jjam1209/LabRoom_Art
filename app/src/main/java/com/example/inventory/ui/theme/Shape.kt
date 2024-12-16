package com.example.inventory.ui.theme

import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

val Shapes = Shapes(
    // extraSmall shape with unique cut corner angles
    extraSmall = CutCornerShape(topEnd = 12.dp, bottomStart = 12.dp),

    // small shape with rounded corners for a smoother feel
    small = RoundedCornerShape(topStart = 8.dp, topEnd = 8.dp, bottomEnd = 16.dp, bottomStart = 16.dp),

    // medium shape with asymmetric rounded corners for a more dynamic appearance
    medium = RoundedCornerShape(topStart = 24.dp, bottomEnd = 12.dp, topEnd = 8.dp, bottomStart = 16.dp)
)
