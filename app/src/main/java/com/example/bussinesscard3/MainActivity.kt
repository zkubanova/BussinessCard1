package com.example.bussinesscard3

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.bussinesscard3.databinding.ActivityMainBinding
import java.net.URLEncoder


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {

            startActivity(
                Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel:0703999222"))
            )
        }
        binding.addressmap.setOnClickListener {

            startActivity(
                Intent(Intent.ACTION_VIEW).setData(Uri.parse("geo:42.882004, 74.582748"))
            )
        }

        binding.txtCom.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com")))
        }
        binding.whatsapp.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://www.whatsapp.com")))
        }
        binding.email.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://mail.google.com/mail/u/0/?tab=rm#inbox?compose=CllgCJlHnCGdkPTRWKcqltxPPJVrxvbTzfQVPCwtzdqbzMhBkpTJPLqdqJMKVfjTWZHjjtWvShL")))
        }
        binding.saveToContact.setOnClickListener {
            startActivity(
                Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel:0703999222"))
            )
        }
        binding.portrait.setOnClickListener {
            //FirebaseAuth.getInstance().signOut()
            val intent = Intent (this, SecondActivity::class.java)
            startActivity(intent)
        }

    }
}