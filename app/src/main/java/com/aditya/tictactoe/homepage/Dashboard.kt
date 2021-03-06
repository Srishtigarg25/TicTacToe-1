package com.aditya.tictactoe.homepage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.aditya.tictactoe.R
import com.aditya.tictactoe.vsfriend.VsFriend
import com.aditya.tictactoe.vsfriend.VsFriendHistory as VsFriendHistory

class Dashboard : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val buttonVsFriend = findViewById<Button>(R.id.dashboard_vs_friend)
        val buttonPlayerHistory = findViewById<Button>(R.id.dashboard_player_history)


        buttonVsFriend.setOnClickListener {
            val intent = Intent(this, VsFriend::class.java)
            startActivity(intent)
        }

        buttonPlayerHistory.setOnClickListener {
                val intent = Intent(this, VsFriendHistory::class.java)
                startActivity(intent)
        }
    }
}