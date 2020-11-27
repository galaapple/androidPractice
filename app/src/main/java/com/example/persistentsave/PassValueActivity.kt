package com.example.persistentsave

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.example.myapplication.R
import com.example.persistentsave.bean.Student
import kotlinx.android.synthetic.main.activity_pass_value.*

/**
 * @author 李阳(liyang073)
 * @date 2020/11/27 10:39
 * @desc
 */
class PassValueActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pass_value)
        val student = Student("xiaoming", "23")
        tv_jump.setOnClickListener {
            val intent = Intent(this, ReceiveValueActivity::class.java)
            intent.putExtra("nihao", student)
        }
    }
}