package com.example.android.playlistapp;

public class Song {
    /** song title */
    private String mSongTitle;
    /** song artist */
    private String mSongArtist;
    /**
     * Create a new song object.
     *
     * @param songTitle is the title of the song
     * @param songArtist is the artist for the song
     */
    public Song(String songTitle, String songArtist) {
        mSongTitle = songTitle;
        mSongArtist = songArtist;
    }
    /**
     * Get the song title.
     */
    public String getSongTitle() {
        return mSongTitle;
    }
    /**
     * Get the artist for the song.
     */
    public String getArtist() {
        return mSongArtist;
    }

}
