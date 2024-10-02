package com.example.kotlin.chatapp.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.chatapp.R
import com.google.android.ads.mediationtestsuite.activities.HomeActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val emailEditText = findViewById<EditText>(R.id.emailEditText)
        val passwordEditText = findViewById<EditText>(R.id.passwordEditText)
        val loginButton = findViewById<Button>(R.id.loginButton)

        loginButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            // Aquí se validan las credenciales (esto es solo un ejemplo)
            if (email == "user@example.com" && password == "password123") {
                // Redirige a la pantalla de inicio (HomeActivity) si el login es exitoso
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                finish() // Cierra la pantalla de login
            } else {
                Toast.makeText(this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
