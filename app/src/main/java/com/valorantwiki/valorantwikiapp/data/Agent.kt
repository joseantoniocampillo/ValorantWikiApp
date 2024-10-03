package com.valorantwiki.valorantwikiapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Agent(
    @PrimaryKey(autoGenerate = true)
    val uuid: String,
    val displayName: String,
    val description: String,
    val displayIcon: String,
    val fullPortrait: String?,
    val background: String?,
    val backgroundGradientColors: List<String>,
    //val role: Role?,
    //val abilities: List<Ability>
)

/*
data class Role(
    val uuid: String,
    val displayName: String,
    val description: String
)

data class Ability(
    val slot: String,
    val displayName: String,
    val description: String
)

 */