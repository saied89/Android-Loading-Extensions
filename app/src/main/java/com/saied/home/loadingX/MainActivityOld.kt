package com.saied.home.loadingX

import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.saied.home.androidloadingexts.loadX
import com.saied.home.loadingexts.R
import kotlinx.android.synthetic.main.activity_main_old.*
import kotlinx.android.synthetic.main.layout_all_layouts.*

class MainActivityOld : AppCompatActivity() {
    val viewModel: MainViewModel by lazy {
        ViewModelProviders.of(this).get(MainViewModel::class.java)
    }
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_old)
        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayShowTitleEnabled(false)

//        chooseColorButton.setOnClickListener {
//            ColorPickerDialog.newBuilder()
//                    .show(this)
//        }

//        loadButtonLinearNegMargin.setOnClickListener {
//         it.loadX(true)
//        }

//        loadButtonConstraint.setOnClickListener {
//            it.loadingV2(true)
//        }
//        constraintLayout.setOnClickListener {
//            loadButtonConstraint.loadingV2(false)
//        }
    }

//    override fun onColorSelected(dialogId: Int, color: Int) {
//        chooseColorButton.setBackgroundColor(color)
//        viewModel.loadingParamsViewModel.value = viewModel.loadingParamsViewModel.value!!.copy(color = color)
//    }
//
//    override fun onDialogDismissed(dialogId: Int) {
//    }

    private fun setupLoadingViews() {
        loadButtonRelative.setOnClickListener {
            it.loadX(true)
        }
        relativeLayout.setOnClickListener {
            loadButtonRelative.loadX(false)
        }
        loadButtonLinear.setOnClickListener {
            it.loadX(true)
        }
        linearLayoutVertical.setOnClickListener {
            loadButtonLinear.loadX(false)
        }
        loadButtonLinearHorizontal.setOnClickListener {
            it.loadX(true)
        }
        linearLayoutHorizonal.setOnClickListener {
            loadButtonLinearHorizontal.loadX(false)
        }
        loadButtonConstraintLayout.setOnClickListener {
            it.loadX(true)
        }
        constraintLayout.setOnClickListener {
            loadButtonConstraintLayout.loadX(false)
        }

        testTV.setOnClickListener {
            it.loadX(true)
        }
        testTV2.setOnClickListener {
            it.loadX(true)
        }
    }


}
