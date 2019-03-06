package com.sample.kartollika.islandnavigationbar

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.sample.kartollika.islandnavigationbar.activities.MenuIslandBarActivity
import com.sample.kartollika.islandnavigationbar.activities.XmlIslandBarActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initListeners()
    }

    private fun initListeners() {
        findViewById<View>(R.id.bottom_bar_using_menu).setOnClickListener {
            startActivity(Intent(this, MenuIslandBarActivity::class.java))
        }

        findViewById<View>(R.id.bottom_bar_using_xml).setOnClickListener {
            startActivity(Intent(this, XmlIslandBarActivity::class.java))
        }
    }
}

