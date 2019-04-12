package com.example.bai_tuan_3

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.View.OnClickListener
import android.widget.ImageView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_back_ground.*


@Suppress("DEPRECATION")
class BackGround : AppCompatActivity() {

     var a: Int = R.id.iviewchange

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_back_ground)

        image1.setOnClickListener(hinh1)
        image2.setOnClickListener(hinh2)
        image3.setOnClickListener(hinh3)
        image4.setOnClickListener(hinh4)
        image5.setOnClickListener(hinh5)
        image6.setOnClickListener(hinh6)

        save.setOnClickListener(luuhinh)

        val im = findViewById<ImageView>(R.id.iviewchange)
        val data = intent
        val img = data.getIntExtra("iviewchange",0)
        im.setImageResource(img)


    }


     val luuhinh = View.OnClickListener {

        //val bitmap = BitmapFactory.decodeResource(resources,R.drawable.image)
        val quaylai : Intent = Intent(this.applicationContext, MainActivity::class.java)

        //quaylai.putExtra("hinh1",1)
        //quaylai.putExtra("hinh2",2)
        //quaylai.putExtra("hinh3",3)
        //quaylai.putExtra("hinh4",4)
        //quaylai.putExtra("hinh5",5)
        //quaylai.putExtra("hinh6",6)

        //quaylai.putExtra("Bitmap", bitmap)

         quaylai.putExtra("haha",a)
         setResult(Activity.RESULT_OK,quaylai)
         finish()

         //val ima = findViewById<ImageView>(R.id.Logo)
         //val data = intent
         //val img = data.getIntExtra("haha",0)
         //ima.setImageResource(img)
    }






    private  val hinh1 = OnClickListener {
       // Picasso.get().load("https://kotlinexpertise.com/wp-content/uploads/2018/04/pCfEzr6L_400x400.png").into(iviewchange)
        Picasso.get().load(R.drawable.image1).into(iviewchange)
        a = R.drawable.image1
    }

    private  val hinh2 = OnClickListener {
       // Picasso.get().load("http://pngimg.com/uploads/android_logo/android_logo_PNG27.png").into(iviewchange)
        Picasso.get().load(R.drawable.image2).into(iviewchange)
        a = R.drawable.image2
    }

    private  val hinh3 = OnClickListener {
       // Picasso.get().load("https://pngimage.net/wp-content/uploads/2018/06/ruby-logo-png-2.png").into(iviewchange)
        Picasso.get().load(R.drawable.image3).into(iviewchange)
        a = R.drawable.image3
    }

    private  val hinh4 = OnClickListener {
       // Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e4/Visual_Studio_2013_Logo.svg/232px-Visual_Studio_2013_Logo.svg.png").into(iviewchange)
        Picasso.get().load(R.drawable.image4).into(iviewchange)
        a = R.drawable.image4
    }

    private  val hinh5 = OnClickListener {
       // Picasso.get().load("http://www.pngall.com/wp-content/uploads/2016/05/Python-Logo-Free-PNG-Image.png").into(iviewchange)
        Picasso.get().load(R.drawable.image5).into(iviewchange)
        a = R.drawable.image5
    }

    private  val hinh6 = OnClickListener {
       //Picasso.get().load("https://cau28xhp.files.wordpress.com/2011/08/javaicon.png").into(iviewchange)
        Picasso.get().load(R.drawable.image6).into(iviewchange)
        a = R.drawable.image6
    }

}
