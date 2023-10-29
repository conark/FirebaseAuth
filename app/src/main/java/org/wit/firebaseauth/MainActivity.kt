package org.wit.firebaseauth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //hide action bar
        supportActionBar?.hide()

        //put delay
        Handler (Looper.getMainLooper()).postDelayed( {
            // use to start activities
            val intent = Intent (this, SignInActivity::class.java)
            startActivity(intent)

            // user to destroy current activity
            finish ()
        }, 3000) // 3000 mill is = 3 sec
    }
}