package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn=findViewById<Button>(R.id.btn_4)

        var fnum=findViewById<EditText>(R.id.ed1_4)

        var snum=findViewById<EditText>(R.id.ed2_4)

        var spn=findViewById<Spinner>(R.id.spinner_4)

        var res=findViewById<TextView>(R.id.tv_4)

        btn.setOnClickListener(View.OnClickListener {

            var a=fnum.text.toString().toFloat()

            var b=snum.text.toString().toFloat()

            var s=spn.selectedItem.toString()

            when(s){
                "+"-> res.setText("result: "+ add(a,b))
                "-"-> res.setText("result: "+ sub(a,b))
                "*"-> res.setText("result: "+ mul(a,b))
                "/"-> res.setText("result: "+ div(a,b))

            }
        })


    }

    fun add(a:Float,b:Float):Float=a+b
    fun sub(a:Float,b:Float):Float=a-b
    fun mul(a:Float,b:Float):Float=a*b
    fun div(a:Float,b:Float):Float=a/b
}