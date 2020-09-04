package com.example.lab5intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClickShowDetail(v:View){
        var radioSelectedID = radio_gender.checkedRadioButtonId
        var radioSelected = findViewById<RadioButton>(radioSelectedID)
        val intent = Intent(this,SecondActivity::class.java)
        intent.putExtra("empData", Employee(nameEDT.text.toString(), radioSelected.text.toString() ,
        emailEDT.text.toString(), salaryEDT.text.toString().toInt()))
        startActivity(intent)
    }
    fun reset(v: View){
        nameEDT.text.clear()
        radio_gender.clearCheck()
        emailEDT.text.clear()
        salaryEDT.text.clear()
    }
}