package com.example.akasztofa;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button btnMinusz;
    private Button btnPlusz;
    private Button btnTipp;
    private TextView betu;
    private TextView szo;
    private ImageView kep;
    private ArrayList<String> szavak = new ArrayList<String>();
    private String gondoltSzo;
    private Random rnd = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        setSzo();
        btnPlusz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: betu változik z fele.
            }
        });
        btnMinusz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: betu valtozik a fele.
            }
        });
        btnTipp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: tippelés kulon methoddal kellene.
            }
        });
    }

    private void init(){
        szavak.clear();
        btnMinusz = findViewById(R.id.btnMinusz);
        btnPlusz = findViewById(R.id.btnPlusz);
        btnTipp = findViewById(R.id.btnTipp);
        betu = findViewById(R.id.betu);
        betu.setText("A");
        betu.setTextColor(Color.RED);
        szo = findViewById(R.id.szo);
        kep = findViewById(R.id.kep);
    }

    private void setSzo(){
        //TODO: szavakbol random + '_'-ak kirajzolása.
        szavak.add("alma");
        szavak.add("korte");
        szavak.add("banan");
        szavak.add("malna");
        szavak.add("szilva");
        szavak.add("szolo");
        szavak.add("barack");
        szavak.add("eper");
        szavak.add("ribizli");
        szavak.add("afonya");
        int r = rnd.nextInt(10) + 1;
        szo.setText(szavak.get(r));
    }
}