package com.example.android.cooking;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.VideoView;

public class Main3Activity extends AppCompatActivity {
    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        VideoView  videoview= (VideoView)findViewById(R.id.VideoView);
        videoview.setVideoURI(Uri.parse(""));
      //  videoview.start();
    }
}
