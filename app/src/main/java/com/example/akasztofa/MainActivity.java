package com.example.akasztofa;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button btnMinusz;
    private Button btnPlusz;
    private Button btnTipp;
    private TextView betu;
    private TextView szo;
    private ImageView kep;
    private ImageView[] kepek;
    private ArrayList<String> szavak = new ArrayList<String>();
    private String gondoltSzo;
    private Random rnd = new Random();
    private ArrayList <String> betuk = new ArrayList<String>();
    private ArrayList <String> voltBetuk = new ArrayList<String>();
    private int index;
    private String tippBetu;
    private int hibak;

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
                tippeles();
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
        hibak = 0;
    }

    private void setSzo(){
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
        gondoltSzo = szavak.get(r).toUpperCase();
        // Also vonalak:
        for (int i = 0; i < gondoltSzo.length(); i++) {
            szo.append("_");
        }
        szo.append(gondoltSzo);
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

    private void tippeles(){
        //TODO: win condition
        StringBuilder sb = new StringBuilder(szo.getText());
        CharSequence tippBetu = betu.getText();
        if (gondoltSzo.contains(tippBetu)){
            for (int i = 0; i < gondoltSzo.length(); i++) {
                if (gondoltSzo.charAt(i) == tippBetu.charAt(0)){
                    char ch = tippBetu.charAt(0);
                    sb.setCharAt(i, ch);
                }
            }
            szo.setText(sb);
        }else {
            hibak++;
            switch (hibak) {
                case 1:
                    kep.setImageResource(R.drawable.akasztofa01);
                    break;
                case 2:
                    kep.setImageResource(R.drawable.akasztofa02);
                    break;
                case 3:
                    kep.setImageResource(R.drawable.akasztofa03);
                    break;
                case 4:
                    kep.setImageResource(R.drawable.akasztofa04);
                    break;
                case 5:
                    kep.setImageResource(R.drawable.akasztofa05);
                    break;
                case 6:
                    kep.setImageResource(R.drawable.akasztofa06);
                    break;
                case 7:
                    kep.setImageResource(R.drawable.akasztofa07);
                    break;
                case 8:
                    kep.setImageResource(R.drawable.akasztofa08);
                    break;
                case 9:
                    kep.setImageResource(R.drawable.akasztofa09);
                    break;
                case 10:
                    kep.setImageResource(R.drawable.akasztofa10);
                    break;
                case 11:
                    kep.setImageResource(R.drawable.akasztofa11);
                    break;
                case 12:
                    kep.setImageResource(R.drawable.akasztofa12);
                    break;
                case 13:
                    kep.setImageResource(R.drawable.akasztofa13);
                    //TODO: vereség
                    break;
            }
        }
        voltBetuk.add(betu.toString());
    }
}