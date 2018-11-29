package com.example.assemalturifi.piano;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;

    private MediaPlayer song1;
    private MediaPlayer song2;
    private MediaPlayer song3;
    private MediaPlayer song4;
    private MediaPlayer song5;
    private MediaPlayer song6;
    private MediaPlayer song7;
    private MediaPlayer song8;
    private MediaPlayer song9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        upView();

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                song1.start();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                song2.start();

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                song3.start();

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                song4.start();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                song5.start();
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                song6.start();
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                song7.start();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(song9.isPlaying()){
                    song9.pause();

                }
                song8.start();


            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(song8.isPlaying()){
                    song8.pause();
                }

                song9.start();



            }
        });



    }

    public void upView(){
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        song1 = MediaPlayer.create(this, R.raw.note1_c);
        song2 = MediaPlayer.create(this, R.raw.note2_d);
        song3 = MediaPlayer.create(this, R.raw.note3_e);
        song4 = MediaPlayer.create(this, R.raw.note4_f);
        song5 = MediaPlayer.create(this, R.raw.note5_g);
        song6 = MediaPlayer.create(this, R.raw.note6_a);
        song7 = MediaPlayer.create(this, R.raw.note7_b);
        song8 = MediaPlayer.create(this, R.raw.mozart_lacrimosa);
        song9 = MediaPlayer.create(this, R.raw.mozart_rondoalla);


    }
}
