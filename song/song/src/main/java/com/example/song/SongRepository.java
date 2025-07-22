// Write your code here
package com.example.song;

import java.util.ArrayList;

public interface SongRepository{

    ArrayList<Song> getSongs();
    Song addSong(Song song);
    Song getSong(int id);
    Song updateSong(int id, Song song);
    void deleteSong(int id);
}