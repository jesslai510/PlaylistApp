package com.example.android.playlistapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.example.android.playlistapp.R;
import com.example.android.playlistapp.Song;
import com.example.android.playlistapp.SongAdapter;

import java.util.ArrayList;

public class SongActivity extends AppCompatActivity {

    public static final String SONG_TITLE = "SONG_TITLE";
    public static final String SONG_ARTIST = "SONG_ARTIST";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // new arraylist that holds all our songs
        final ArrayList<Song> newSong = new ArrayList<Song>();

        newSong.add(new Song("Titanium", "David Guetta"));
        newSong.add(new Song("Killshot", "Eminem"));
        newSong.add(new Song("I Like It", "Cardi B, Bad Bunny & J Balvin"));
        newSong.add(new Song("I Love It", "Kanye West & Lil Pump"));
        newSong.add(new Song("Youngblood", "5 Seconds Of Summer"));
        newSong.add(new Song("Natural", "Imagine Dragons"));
        newSong.add(new Song("Happier", "Marshmello & Bastille"));
        newSong.add(new Song("Yes Indeed", "Lil Baby & Drake"));
        newSong.add(new Song("Perfect", "Ed Sheeran"));
        newSong.add(new Song("Nice For What", "Drake"));
        newSong.add(new Song("Simple", "Florida Georgia Line"));
        newSong.add(new Song("Hotel Key", "Old Dominion"));


        final SongAdapter adapter = new SongAdapter(this, newSong);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);

        // set onitemclicklistener on the list item views so we can start an intent for each item when clicked.
        // also contains song and artist context needed for the next activity
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Song item = (Song) adapter.getItem(position);
                Intent currentSongActivityStart = new Intent(SongActivity.this, CurrentSongActivity.class);
                currentSongActivityStart.putExtra(SONG_TITLE, item.getSongTitle());
                currentSongActivityStart.putExtra(SONG_ARTIST, item.getArtist());
                startActivity(currentSongActivityStart);
            }
        });
    }
}

