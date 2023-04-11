package com.example.aplikacjadwieaktywnosci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv2,tv4;
    int par = 0;
    int kod = 1010;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        GridView mGrid = (GridView) findViewById(R.id.GridView);

        mGrid.setAdapter(new ImageAdapter(MainActivity.this));

        mGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int t, long l) {
                
              //  Toast.makeText(MainActivity.this," "+t, Toast.LENGTH_SHORT).show();

                par=t;
                Intent j = new Intent(MainActivity.this, DrugaAktywnosc.class);
                j.putExtra("par", par);



                startActivityForResult(j,kod);


            }
        });

    }
}