package com.example.uidesignlivloud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.uidesignlivloud.databinding.ActivityDialogBoxBinding
import com.example.uidesignlivloud.databinding.ActivityLoginBinding

class DialogBoxActivity : AppCompatActivity() {
    lateinit var binding: ActivityDialogBoxBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDialogBoxBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.submitBtn.setOnClickListener {
            binding.edittextEmail.setText("")
            Toast.makeText(applicationContext,
                "forgot password plz check yor email ",
                Toast.LENGTH_SHORT).show()

        }
        binding.closeBtn.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }

}