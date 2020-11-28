package com.example.persistentsave

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.example.myapplication.R
import com.example.persistentsave.bean.Student
import kotlinx.android.synthetic.main.activity_receive_value.*

/**
 * @author 李阳(liyang073)
 * @date 2020/11/27 10:40
 * @desc
 */
class ReceiveValueActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receive_value)
        val student = intent?.getParcelableExtra<Student>("nihao")
        tv_content.text = student.toString()
        tv_set_result.setOnClickListener {
            student?.let {
                student.age += 1
                val intent = Intent()
                intent.putExtra("niyehao", student)
                setResult(RESULT_OK, intent)
                finish()
            }
        }
    }
}