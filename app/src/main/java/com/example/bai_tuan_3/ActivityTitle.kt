

package com.example.bai_tuan_3
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_back_ground.*
class ActivityTitle : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_title)

        image1.setOnClickListener(Red)


    }


    private val Red = View.OnClickListener{
        val maudo = Intent(this, ActivityTitle::class.java)

    }
}
