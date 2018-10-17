package com.example.montelongo.proyecto;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.VideoView;

public class video extends AppCompatActivity {

    Button play_pause;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        play_pause=(Button)findViewById(R.id.play_pause);
        mp = MediaPlayer.create(this,R.raw.cancion);
        play_pause.setBackgroundResource(R.drawable.play);

        play_pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp.isPlaying()){
                    mp.pause();
                    play_pause.setBackgroundResource(R.drawable.play);
                    Toast.makeText(video.this,"Pause",Toast.LENGTH_SHORT).show();
                }else{
                    mp.start();
                    play_pause.setBackgroundResource(R.drawable.pause);
                    Toast.makeText(video.this,"Iniciando",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
