package com.example.uidesignlivloud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.uidesignlivloud.databinding.ActivityDialogBoxBinding
import com.example.uidesignlivloud.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    lateinit var binding:ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.previousScreen.setOnClickListener {
            val intent = Intent(this, LoginSignupActivity::class.java)
            startActivity(intent)
        }
        binding.createAcBtn.setOnClickListener {
            if (binding.etEmail.getText().toString().isEmpty()) {
                Toast.makeText(applicationContext,
                    "plz fill your email  ",
                    Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(applicationContext,
                    "Your Account is created  ",
                    Toast.LENGTH_SHORT).show()

                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
            }
        }
    }

}