package com.example.android.playlistapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;


public class SongAdapter extends ArrayAdapter<Song> {
    private static final String LOG_TAG = SongAdapter.class.getSimpleName();

    public SongAdapter(Activity context, ArrayList<Song> newSong) {
        super(context, 0, newSong);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // get the item's positions
        Song currentSong = getItem(position);

        // find views so we can set title and artist for each item
        TextView songTitleTextView = (TextView) listItemView.findViewById(R.id.song_title);
        songTitleTextView.setText(currentSong.getSongTitle());

        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist);
        artistTextView.setText(currentSong.getArtist());

        return listItemView;
    }

}

