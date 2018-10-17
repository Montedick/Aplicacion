package com.example.montelongo.proyecto;

import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class intrumentos extends AppCompatActivity {

    VideoView videoView_instrumento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intrumentos);
         videoView_instrumento = (VideoView) findViewById(R.id.videoView_intrumento);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        Uri path = Uri.parse("android.resource://com.example.montelongo.proyecto/"
                + R.raw.instrumentos);


        //AMPLIACIÓN
        MediaController mc = new MediaController(this);
        videoView_instrumento.setMediaController(mc);

        videoView_instrumento.setVideoURI(path);
        videoView_instrumento.start();
    }
}
