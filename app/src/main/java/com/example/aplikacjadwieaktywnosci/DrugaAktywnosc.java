package com.example.aplikacjadwieaktywnosci;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.sql.Ref;

public class DrugaAktywnosc extends Activity {

    int x = 5;
    int i = 0;
    int licznik=0;
    int par = -2;


    int Zdj[] = {R.drawable.pic1,R.drawable.pic2,R.drawable.pic3,R.drawable.pic4,R.drawable.pic5,
            R.drawable.pic6,R.drawable.pic7,R.drawable.pic8};






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.druga_akt);





        Button tyl = (Button) findViewById(R.id.button);
        Button wyj = (Button) findViewById(R.id.button2);
        Button prz = (Button) findViewById(R.id.button3);






        //Odbieranie pakietu i ustawianie zdjęcia początkowego


        ImageView okno = (ImageView) findViewById(R.id.imageView);

            Intent j =getIntent();
            par = j.getIntExtra("par", par);

        Bitmap foto = BitmapFactory.decodeResource(getResources(),Zdj[Math.abs(par% Zdj.length)]);
        Bitmap foto1 = Bitmap.createScaledBitmap(foto, 700, 500, false);

        okno.setImageBitmap(foto1);













        tyl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                licznik++;

                ImageView okno = (ImageView) findViewById(R.id.imageView);
                if (i==0)
                    i = Zdj.length-1;
                else
                    --i;

                Bitmap foto = BitmapFactory.decodeResource(getResources(),Zdj[Math.abs(i% Zdj.length)]);
                Bitmap foto1 = Bitmap.createScaledBitmap(foto, 700, 500, false);
                okno.setImageBitmap(foto1);


            }
        });


        wyj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Toast.makeText(DrugaAktywnosc.this,"Wyswietlono "+licznik+" zdjec", Toast.LENGTH_SHORT).show();


                finish();
            }
        });

        prz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                licznik++;

                ImageView okno = (ImageView) findViewById(R.id.imageView);
                if (i == Zdj.length-1)
                    i = 0;
                else
                    ++i;

                Bitmap foto = BitmapFactory.decodeResource(getResources(),Zdj[Math.abs(i% Zdj.length)]);
                Bitmap foto1 = Bitmap.createScaledBitmap(foto, 700, 500, false);
                okno.setImageBitmap(foto1);
            }
        });

    }

}