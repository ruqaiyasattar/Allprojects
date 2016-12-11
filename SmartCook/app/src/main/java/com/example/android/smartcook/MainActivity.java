package com.example.android.smartcook;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class MainActivity extends YouTubeBaseActivity {
Button b;
    private YouTubePlayerView youtubeplayerview;
    private YouTubePlayer.OnInitializedListener oninitializedlistner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        youtubeplayerview =(YouTubePlayerView) findViewById(R.id.view);
        oninitializedlistner = new YouTubePlayer.OnInitializedListener(){
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("UVZQEBhmRr8");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
    };
        b=(Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                youtubeplayerview.initialize("AIzaSyBC-9NFuKcAM-asZ7BqtMeQUk3AAKFgfoA",oninitializedlistner);
            }

        });
        }
}
