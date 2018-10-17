package com.example.montelongo.proyecto;

import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class cuerposCelestes extends AppCompatActivity {

    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuerpos_celestes);
        VideoView videoView = (VideoView) findViewById(R.id.videoView_video);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        Uri path = Uri.parse("android.resource://com.example.montelongo.proyecto/"
                + R.raw.pocoyo);



        //AMPLIACIÓN
        MediaController mc = new MediaController(this);
        videoView.setMediaController(mc);



        videoView.setVideoURI(path);
        videoView.start();
    }
}
