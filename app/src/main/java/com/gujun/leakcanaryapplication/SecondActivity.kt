package com.gujun.leakcanaryapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 *    author : gujun
 *    date   : 2020/11/4 16:16
 *    desc   :
 */
class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MainActivity.list.add(this)
    }
}