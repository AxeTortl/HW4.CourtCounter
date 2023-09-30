package com.bateman.msu.hw4courtcounter


import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.bateman.msu.hw4courtcounter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //var scoreTeamA = 0
   //var scoreTeamB = 0
    private lateinit var binding: ActivityMainBinding
    private val counterViewModel:CounterViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        displayForTeamA(counterViewModel.displayTeamAScore())
        displayForTeamB(counterViewModel.displayTeamBScore())
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    fun addOneForTeamA(v: View?) {
        counterViewModel.addToTeamA(1)
        displayForTeamA(counterViewModel.displayTeamAScore())
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    fun addTwoForTeamA(v: View?) {
        counterViewModel.addToTeamA(2)
        displayForTeamA(counterViewModel.displayTeamAScore())
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    fun addThreeForTeamA(v: View?) {
        counterViewModel.addToTeamA(3)
        displayForTeamA(counterViewModel.displayTeamAScore())
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    fun addOneForTeamB(v: View?) {
        counterViewModel.addToTeamB(1)
        displayForTeamB(counterViewModel.displayTeamBScore())
    }

    /**
     * Increase the score for Team B by 2 points.
     */
    fun addTwoForTeamB(v: View?) {
        counterViewModel.addToTeamB(2)
        displayForTeamB(counterViewModel.displayTeamBScore())
    }

    /**
     * Increase the score for Team B by 3 points.
     */
    fun addThreeForTeamB(v: View?) {
        counterViewModel.addToTeamB(3)
        displayForTeamB(counterViewModel.displayTeamBScore())
    }

    /**
     * Resets the score for both teams back to 0.
     */
    fun resetScore(v: View?) {
        counterViewModel.resetScore()
        displayForTeamA(counterViewModel.scoreTeamA)
        displayForTeamB(counterViewModel.scoreTeamB)
    }

    /**
     * Displays the given score for Team A.
     */
    fun displayForTeamA(score: Int) {
        val scoreView = binding.teamAScore
        scoreView.text = score.toString()
    }

    /**
     * Displays the given score for Team B.
     */
    fun displayForTeamB(score: Int) {
        val scoreView = binding.teamBScore
        scoreView.text = score.toString()
    }
}