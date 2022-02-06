package com.shovelant.shovelant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.shovelant.shovelant.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    var count = 0
    lateinit var title :TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = findViewById(R.id.titlesplash)

        //reenable if want to get rid of notification bar/navbar (can also do individually), but have to deal with setting minAPI to 27 to draw below screen cutouts (holepunch)
        //hideSystemBars()

    }

    private fun hideSystemBars() {
        val windowInsetsController =
            ViewCompat.getWindowInsetsController(window.decorView) ?: return
        // Configure the behavior of the hidden system bars
        windowInsetsController.systemBarsBehavior =
            WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        // Hide both the status bar and the navigation bar
        windowInsetsController.hide(WindowInsetsCompat.Type.systemBars())
    }

    fun exampleOnClick(view: View) {
        count++
        System.out.println(count)
        title.text = "shovel ant: " + count
    }
}