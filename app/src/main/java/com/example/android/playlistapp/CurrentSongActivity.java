package com.example.android.playlistapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;




    public class CurrentSongActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.currently_playing);

            //find views so we can set the text on them later
            TextView setSongTitle = findViewById(R.id.current_Title);
            TextView setArtistName = findViewById(R.id.current_artist);

            //get intent & context for song title and artist
            Intent intent = getIntent();
            Bundle bd = intent.getExtras();
            if (bd != null) {
                String songPlaying = (String) bd.get("SONG_TITLE");
                String artistPlaying = (String) bd.get("SONG_ARTIST");
                //set song & artist into the textviews
                setSongTitle.setText(songPlaying);
                setArtistName.setText(artistPlaying);
            }
        }
    }
