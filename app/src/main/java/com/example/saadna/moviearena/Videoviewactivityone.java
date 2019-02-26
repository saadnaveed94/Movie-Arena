package com.example.saadna.moviearena;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class Videoviewactivityone extends YouTubeBaseActivity
{

    YouTubePlayerView youTubePlayerView;
    Button button1;
    Button button2;
    TextView textView;
    YouTubePlayer.OnInitializedListener onInitializedListener;
protected String val,label;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the layout from video_main.xml
        setContentView(R.layout.activity_videoviewactivityone);
        Bundle extras = getIntent().getExtras();
        val = extras.getString("Url");

        button1= (Button) findViewById(R.id.mb);
        button2 =(Button)findViewById(R.id.back);
       textView  = (TextView)findViewById(R.id.textView8);
       label = extras.getString("name");
        textView.setText(label);

        youTubePlayerView = (YouTubePlayerView)findViewById(R.id.youtubeplayer);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

                youTubePlayer.loadVideo(val);

            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                youTubePlayerView.initialize(config.API_Key,onInitializedListener);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Videoviewactivityone.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
