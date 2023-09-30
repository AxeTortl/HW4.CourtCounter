package com.bateman.msu.hw4courtcounter

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

private const val SCORE_TEAM_A = "SCORE_TEAM_A"
private const val SCORE_TEAM_B = "SCORE_TEAM_B"

class CounterViewModel (private val savedStateHandle:SavedStateHandle):ViewModel() {

    var scoreTeamA:Int
        get() = savedStateHandle.get(SCORE_TEAM_A) ?: 0
        set(value) = savedStateHandle.set(SCORE_TEAM_A,value)

    var scoreTeamB:Int
        get() = savedStateHandle.get(SCORE_TEAM_B)?:0
        set(value) = savedStateHandle.set(SCORE_TEAM_B,value)

    var teamAScore: Int = 0
    var teamBScore: Int = 0

    fun addToTeamA(scoreTeamA: Int): Int {
        teamAScore += scoreTeamA
        return teamAScore
    }

    fun addToTeamB(scoreTeamB: Int): Int {
        teamBScore += scoreTeamB
        return teamBScore
    }

    fun resetScore() {
        scoreTeamA = 0
        scoreTeamB = 0
    }

    fun displayTeamAScore():Int {
        return teamAScore
    }

    fun displayTeamBScore():Int {
        return teamBScore
    }
}