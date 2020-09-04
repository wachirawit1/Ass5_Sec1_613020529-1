package com.example.lab5intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.activity_second.emailEDT
import kotlinx.android.synthetic.main.activity_second.nameEDT
import kotlinx.android.synthetic.main.activity_second.radio_gender
import kotlinx.android.synthetic.main.activity_main.salaryEDT as salaryEDT1

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var data = intent.extras
        var newEmployee = data?.getParcelable<Employee>("empData")
        nameEDT.text =  "Employee Name : ${newEmployee?.name}"
        radio_gender.text = "Gender : ${newEmployee?.gender}"
        emailEDT.text = "E-mail : ${newEmployee?.email}"
        salaryEDT.text = "Salary : ${newEmployee?.salary}"
    }
    fun onClickClose(view: View){
        finish()
    }

}