package com.example.navapp;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean isPressed=false;


    Button graphicBTN;
    Button culinaryBTN;
    Button dieselBTN;
    Button automotiveBTN;
    Button veterinaryBTN;
    Button collisionBTN;
    Button radioBTN;
    Button weldingBTN;
    Button engineeringBTN;
    Button csBTN;
    Button cnBTN;
    Button hvacBTN;
    Button safetyBTN;
    Button precisionBTN;
    Button manufacturingBTN;
    Button electricityBTN;
    Button constructionBTN;
    Button healthBTN;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        graphicBTN=findViewById(R.id.button27);
        graphicBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                graphicMap();
            }
        });
        culinaryBTN=findViewById(R.id.button29);
        dieselBTN=findViewById(R.id.button30);
        automotiveBTN=findViewById(R.id.button31);
        veterinaryBTN=findViewById(R.id.button32);
        collisionBTN=findViewById(R.id.button33);
        radioBTN=findViewById(R.id.button34);
        weldingBTN=findViewById(R.id.button35);
        engineeringBTN=findViewById(R.id.button36);
        csBTN=findViewById(R.id.button37);
        cnBTN=findViewById(R.id.button38);
        hvacBTN=findViewById(R.id.button39);
        safetyBTN=findViewById(R.id.button40);
        precisionBTN=findViewById(R.id.button41);
        manufacturingBTN=findViewById(R.id.button42);
        electricityBTN=findViewById(R.id.button43);
        constructionBTN=findViewById(R.id.button44);
        healthBTN=findViewById(R.id.button45);
        image=findViewById(R.id.imageView);

    }
    private void graphicMap(){
        image.setImageResource(R.drawable.graphicmap);
    }
    private void collisionMap(){
        image.setImageResource(R.drawable.graphicmap);
    }
    private void csMap(){
        image.setImageResource(R.drawable.graphicmap);
    }
    private void culinaryMap(){
        image.setImageResource(R.drawable.graphicmap);
    }
    private void dieselMap(){
        image.setImageResource(R.drawable.graphicmap);
    }
    private void electricityMap(){
        image.setImageResource(R.drawable.graphicmap);
    }
    private void engineeringMap(){
        image.setImageResource(R.drawable.graphicmap);
    }
    private void healthScienceMap(){
        image.setImageResource(R.drawable.graphicmap);
    }
    private void hvacMap(){
        image.setImageResource(R.drawable.graphicmap);
    }
    private void matinenceMap(){
        image.setImageResource(R.drawable.graphicmap);
    }
    private void networkMap(){
        image.setImageResource(R.drawable.graphicmap);
    }
    private void precisionMap(){
        image.setImageResource(R.drawable.graphicmap);
    }
    private void publicSafetyMap(){
        image.setImageResource(R.drawable.graphicmap);
    }
    private void radioMapMap(){
        image.setImageResource(R.drawable.graphicmap);
    }
    private void weldingMap(){
        image.setImageResource(R.drawable.graphicmap);
    }
    private void buildingTradesMap(){
        image.setImageResource(R.drawable.graphicmap);
    }
    private void graphicMap(){
        image.setImageResource(R.drawable.graphicmap);
    }
    private void graphicMap(){
        image.setImageResource(R.drawable.graphicmap);
    }

}