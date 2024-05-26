package com.example.psychothesis
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Initialize your views here
        val loginButton = findViewById<Button>(R.id.loginButton)
        loginButton.setOnClickListener {
            val loginIntent = Intent(this, Profile::class.java)
            startActivity(loginIntent)
        }
    }
}
