package com.example.assemalturifi.piano;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;


    SoundPool mSoundPool;
    MediaPlayer song8;
    MediaPlayer song9;
    int soundId1;
    int soundId2;
    int soundId3;
    int soundId4;
    int soundId5;
    int soundId6;
    int soundId7;
    Button soundId8;
    Button soundId9;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        upView();



    }
    public void upView(){
        mSoundPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC, 0);

        soundId1=mSoundPool.load(getApplicationContext(),R.raw.note1_c,1);
        soundId2=mSoundPool.load(getApplicationContext(),R.raw.note2_d,1);
        soundId3=mSoundPool.load(getApplicationContext(),R.raw.note3_e,1);
        soundId4=mSoundPool.load(getApplicationContext(),R.raw.note4_f,1);
        soundId5=mSoundPool.load(getApplicationContext(),R.raw.note5_g,1);
        soundId6=mSoundPool.load(getApplicationContext(),R.raw.note6_a,1);
        soundId7=mSoundPool.load(getApplicationContext(),R.raw.note7_b,1);
        song8 =MediaPlayer.create(this,R.raw.mozart_rondoalla);
        song9 =MediaPlayer.create(this,R.raw.mozart_lacrimosa);
    }


    public void play1(View view) {
        mSoundPool.play(soundId1, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void play2(View view) {
        mSoundPool.play(soundId2, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void play3(View view) {
        mSoundPool.play(soundId3, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void play4(View view) {
        mSoundPool.play(soundId4, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void play5(View view) {
        mSoundPool.play(soundId5, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void play6(View view) {
        mSoundPool.play(soundId6, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void play7(View view) {
        mSoundPool.play(soundId7, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void play8(View view) {
        if(song9.isPlaying()){
            song9.pause();

        }
        song8.start();
    }

    public void play9(View view) {
        if(song8.isPlaying()){
            song8.pause();
        }
        song9.start();
    }
}
