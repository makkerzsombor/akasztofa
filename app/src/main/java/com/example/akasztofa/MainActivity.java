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
    private ArrayList <String> betuk = new ArrayList<String>();
    private ArrayList <String> voltBetuk = new ArrayList<String>();
    private int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        setSzo();
        betukFeltolt();
        btnPlusz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: ha volt a betu szinezze (2.)
                index++;
                if (index > 23){
                    index = 0;
                    betu.setText(betuk.get(index));
                }else {
                    betu.setText(betuk.get(index));
                }
            }
        });
        btnMinusz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: ha volt a betu szinezze (2.)
                index--;
                if (index <= 0){
                    index = 23;
                    betu.setText(betuk.get(index));
                }else {
                    betu.setText(betuk.get(index));
                }
            }
        });
        btnTipp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: tippelés kulon methoddal kellene. (1.)
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
        index = 0;
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
        gondoltSzo = szavak.get(r);
        // Also vonalak:
        for (int i = 0; i < gondoltSzo.length(); i++) {
            szo.append("_");
            szo.append(" ");
        }
    }
    private void betukFeltolt(){
        betuk.clear();
        betuk.add("A");
        betuk.add("B");
        betuk.add("C");
        betuk.add("D");
        betuk.add("E");
        betuk.add("F");
        betuk.add("G");
        betuk.add("H");
        betuk.add("I");
        betuk.add("J");
        betuk.add("K");
        betuk.add("L");
        betuk.add("M");
        betuk.add("N");
        betuk.add("O");
        betuk.add("P");
        betuk.add("R");
        betuk.add("S");
        betuk.add("T");
        betuk.add("V");
        betuk.add("W");
        betuk.add("X");
        betuk.add("Y");
        betuk.add("Z");
    }
}