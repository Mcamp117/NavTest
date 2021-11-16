package com.example.navapp;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button graphicBTN;
    Button button29;
    Button button30;
    Button button31;
    Button button32;
    Button button33;
    Button button34;
    Button button35;
    Button button36;
    Button button37;
    Button button38;
    Button button39;
    Button button40;
    Button button41;
    Button button42;
    Button button43;
    Button button44;
    Button button45;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        graphicBTN=findViewByTd(R.id.button27);
        Button findViewByTd(R.id.button29);
        Button findViewByTd(R.id.button30);
        Button findViewByTd(R.id.button31);
        Button findViewByTd(R.id.button32);
        Button findViewByTd(R.id.button33);
        Button findViewByTd(R.id.button34);
        Button findViewByTd(R.id.button35);
        Button findViewByTd(R.id.button36);
        Button findViewByTd(R.id.button37);
        Button findViewByTd(R.id.button38);
        Button findViewByTd(R.id.button39);
        Button findViewByTd(R.id.button40);
        Button findViewByTd(R.id.button41);
        Button findViewByTd(R.id.button42);
        Button findViewByTd(R.id.button43);
        Button findViewByTd(R.id.button44);
        Button findViewByTd(R.id.button45);

    }
    View.OnClickListener buttonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(isPressed)
                button.setBackgroundResource(R.drawable.icon1);
            else
                button.setBackgroundResource(R.drawable.icon2);

            isPressed = !isPressed;
        }
    };
}