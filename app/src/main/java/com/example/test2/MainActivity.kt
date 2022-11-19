package com.example.test2

import android.os.Bundle
import android.view.GestureDetector
import android.view.Menu
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.test2.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView


class MainActivity : AppCompatActivity() {

    val x: Float? = null
    val y: Float? = null

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding
    private lateinit var gestureDetector: GestureDetector


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.appBarMain.toolbar)


        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)


        val textView: TextView = findViewById(R.id.tvFood)
        val bone =  findViewById<ImageView>(R.id.bone)
        /*
        bone.setOnClickListener {
            textView.setVisibility(View.VISIBLE);
        }
            */

        var r_fun1 = null
        bone.setOnTouchListener(fun1())



    }
    private fun fun1(r_fun1: Any?) {
        val textView: TextView = findViewById(R.id.tvFood)
        textView.setVisibility(View.VISIBLE);
        return
    }



    //#########################FERMIUMS####################################

/*
    override fun onTouchEvent(event: MotionEvent?): Boolean {

        val textView: TextView = findViewById(R.id.tvFood)
        val textView1: TextView = findViewById(R.id.tvDempf)
        val textView2: TextView = findViewById(R.id.tvFoto)

        when (event!!.action) {
            MotionEvent.ACTION_DOWN -> {

                textView.setVisibility(View.VISIBLE);

            }
            MotionEvent.ACTION_CANCEL, MotionEvent.ACTION_UP -> {
                textView1.setVisibility(View.VISIBLE);
            }
            MotionEvent.ACTION_MOVE -> {

                textView2.setVisibility(View.VISIBLE);
            }
        }
        return super.onTouchEvent(event)
    }
    private val gestureDetector: GestureDetector

    override fun onTouch(v: View, event: MotionEvent): Boolean {
        //обработка клика
        return gestureDetector.onTouchEvent(event)
    }

*/

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    override fun onResume() {
        super.onResume()

    }



}

private fun ImageView.setOnTouchListener() {

    TODO("Not yet implemented")
}
