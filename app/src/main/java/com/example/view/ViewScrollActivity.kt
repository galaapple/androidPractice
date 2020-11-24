package com.example.view

import android.app.Activity
import android.os.Bundle
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_view_scroll.*

/**
 * @author 李阳(liyang073)
 * @date 2020/11/23 18:13
 * @desc
 */
class ViewScrollActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_scroll)
        scroll_textview.setOnClickListener {
            tv_scroll.smoothScrollTo(0, tv_scroll.scrollY + 50)
        }
    }
}