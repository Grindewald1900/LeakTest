package com.example.leaktest

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var innerClass: InnerClass? = null

    init {
        innerClass = InnerClass()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        innerClass?.makeToast()
    }


    inner class InnerClass{
        fun makeToast(){
            Toast.makeText(this@MainActivity, "aaa", Toast.LENGTH_SHORT).show()

        }

    }
}

