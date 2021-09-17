package com.example.uidesignlivloud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.uidesignlivloud.databinding.ActivityLoginBinding
import com.example.uidesignlivloud.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding:ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.forgotPass.setOnClickListener {
            val intent = Intent(this, DialogBoxActivity::class.java)
            startActivity(intent)
        }
        binding.previousScreen.setOnClickListener {
            val intent = Intent(this, LoginSignupActivity::class.java)
            startActivity(intent)
        }


    }
}