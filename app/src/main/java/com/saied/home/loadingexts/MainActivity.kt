package com.saied.home.loadingexts

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import com.saied.home.androidloadingexts.loadingV2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayShowTitleEnabled(false)
        loadButtonRelative.setOnClickListener {
            it.loadingV2(true)
        }
        relativeLayout.setOnClickListener {
            loadButtonRelative.loadingV2(false)
        }
        loadButtonLinear.setOnClickListener {
            it.loadingV2(true)
        }
        linearLayoutVertical.setOnClickListener {
            loadButtonLinear.loadingV2(false)
        }
        loadButtonLinearHorizontal.setOnClickListener {
            it.loadingV2(true)
        }
        linearLayoutHorizonal.setOnClickListener {
            loadButtonLinearHorizontal.loadingV2(false)
        }
//        loadButtonConstraint.setOnClickListener {
//            it.loadingV2(true)
//        }
//        constraintLayout.setOnClickListener {
//            loadButtonConstraint.loadingV2(false)
//        }
    }
}