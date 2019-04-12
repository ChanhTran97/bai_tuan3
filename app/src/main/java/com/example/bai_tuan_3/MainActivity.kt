package com.example.bai_tuan_3

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View.OnClickListener
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*



@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnbackground.setOnClickListener(gotoBackground)

        //val bitmap = this.intent.getParcelableExtra<Bitmap>("Bitmap")

        //val viewBitmap = findViewById<ImageView>(R.id.Logo)

            //viewBitmap.setImageBitmap((bitmap))




    }


    val gotoBackground= OnClickListener {

//        val ima = findViewById<ImageView>(R.id.Logo)
//        val data = intent
//        val img = data.getIntExtra("haha",0)
//        ima.setImageResource(img)

        val intent = Intent(this, BackGround::class.java)
            //intent.putExtra("haha",0)
        startActivityForResult(intent,REQUEST_CODE)
    }

    companion object {
        const val REQUEST_CODE = 1099
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_CODE && resultCode == Activity.RESULT_OK){

            val ima = findViewById<ImageView>(R.id.Logo)
            //val data = intent
            val img = intent.getIntExtra("haha",0)
            ima.setImageResource(img)

            //val hihi = data?.getIntExtra("haha", img)
            //ima.setImageResource(hihi)

        }
    }
}
