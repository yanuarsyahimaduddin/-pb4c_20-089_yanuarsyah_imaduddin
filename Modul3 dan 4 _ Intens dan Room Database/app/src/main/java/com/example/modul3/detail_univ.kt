package com.example.modul3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class detail_univ : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_univ)
        val actionbar = supportActionBar
        actionbar!!.title = "Detail University"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val tvSetName: TextView = findViewById(R.id.tv_set_name)

        val tName  = intent.getStringExtra(EXTRA_NAME)


        tvSetName.text = tName

    }

    companion object {
        const val EXTRA_NAME = "extra_name"

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
