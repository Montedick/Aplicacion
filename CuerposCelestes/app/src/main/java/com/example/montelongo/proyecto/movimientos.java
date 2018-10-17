package com.example.montelongo.proyecto;

import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import java.io.InputStream;

import pl.droidsonroids.gif.GifImageView;

public class movimientos extends AppCompatActivity {

    VideoView videoView_instrumento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movimientos);

        videoView_instrumento = (VideoView) findViewById(R.id.videoView_movimiento);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        Uri path = Uri.parse("android.resource://com.example.montelongo.proyecto/"
                + R.raw.moviemiento);


        //AMPLIACIÓN
        MediaController mc = new MediaController(this);
        videoView_instrumento.setMediaController(mc);

        videoView_instrumento.setVideoURI(path);
        videoView_instrumento.start();

    }
}
