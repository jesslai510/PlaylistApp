package com.example.android.playlistapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // find the view that we will be setting an onclicklistener onto later
        ImageButton songs = (ImageButton) findViewById(R.id.songs);

        // Set a click listener on the image button to send an intent to next activity
        songs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the song View is clicked on.
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(MainActivity.this, SongActivity.class);
                startActivity(songsIntent);
            }
        });
    }
}
