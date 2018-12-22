package com.andalus.abomed7at.mediaplayer;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.button);

        final MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.audio);

        AudioManager audioManager = (AudioManager)getSystemService(AUDIO_SERVICE);

        final int result = audioManager.requestAudioFocus(new AudioManager.OnAudioFocusChangeListener() {
            @Override
            public void onAudioFocusChange(int focusChange) {
                if(focusChange == AudioManager.AUDIOFOCUS_GAIN){
                    Toast.makeText(getBaseContext(),"AUDIOFOCUS_GAIN",Toast.LENGTH_SHORT).show();
                    mediaPlayer.start();
                }else if(focusChange == AudioManager.AUDIOFOCUS_GAIN_TRANSIENT){
                    Toast.makeText(getBaseContext(),"AUDIOFOCUS_GAIN_TRANSIENT",Toast.LENGTH_SHORT).show();
                }else if(focusChange == AudioManager.AUDIOFOCUS_LOSS){
                    Toast.makeText(getBaseContext(),"AUDIOFOCUS_LOSS",Toast.LENGTH_SHORT).show();
                }else if(focusChange == AudioManager.AUDIOFOCUS_GAIN_TRANSIENT_EXCLUSIVE){
                    Toast.makeText(getBaseContext(),"AUDIOFOCUS_GAIN_TRANSIENT_EXCLUSIVE",Toast.LENGTH_SHORT).show();
                }else if(focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT){
                    mediaPlayer.pause();
                    Toast.makeText(getBaseContext(),"AUDIOFOCUS_LOSS_TRANSIENT",Toast.LENGTH_SHORT).show();

                }else if(focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK){
                    mediaPlayer.pause();
                    Toast.makeText(getBaseContext(),"AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK",Toast.LENGTH_SHORT).show();
                }
            }
        },AudioManager.STREAM_MUSIC,AudioManager.AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED){
                    mediaPlayer.start();
                }

            }
        });
    }
}
