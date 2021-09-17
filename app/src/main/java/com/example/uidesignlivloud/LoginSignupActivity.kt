package com.example.uidesignlivloud

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.uidesignlivloud.SocialApp.FaceBookActivity
import com.example.uidesignlivloud.SocialApp.GoogleActivity
import com.example.uidesignlivloud.databinding.ActivityMainBinding
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator


class LoginSignupActivity : AppCompatActivity() {
    lateinit var dot1:DotsIndicator
    lateinit var viewAdapter:ViewAdapter
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
       setAdapter()

         socialIconFun()
        binding.mainSignUp?.setOnClickListener {
            SignUpFrag()
        }
        binding.mainLoginUp?.setOnClickListener {
            LoginFrag()
        }
 }



    private fun LoginFrag() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)

    }

    private fun SignUpFrag() {
        val intent = Intent(this, SignUpActivity::class.java)
        startActivity(intent)
    }

   private fun setAdapter() {
         viewAdapter = ViewAdapter(this)
         binding.viewPager.adapter = viewAdapter
         binding.dot1.setViewPager(binding.viewPager)
     }

    private fun socialIconFun() {
        binding.googleBtn.setOnClickListener {

            LoginFrag()

        //    val intent = Intent(this@LoginSignupActivity,GoogleActivity::class.java)
         //   startActivity(intent)
        }
        binding.facebookBtn.setOnClickListener {
            SignUpFrag()

         //   val intent = Intent(this@LoginSignupActivity,FaceBookActivity::class.java)
          //  startActivity(intent)
        }
    }


}