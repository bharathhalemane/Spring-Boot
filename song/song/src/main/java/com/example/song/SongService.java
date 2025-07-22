/*

 * You can use the following import statements
  
 * import org.springframework.http.HttpStatus;
 * import org.springframework.web.server.ResponseStatusException;

 */

package com.example.song;

import java.util.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
import com.example.song.Song;
import com.example.song.SongRepository;

// Don't modify the below code
public class SongService implements SongRepository {
    private static HashMap<Integer, Song> playlist = new HashMap<>();

    public SongService() {
        playlist.put(1, new Song(1, "Butta Bomma", "Ramajogayya Sastry", "Armaan Malik", "Thaman S"));
        playlist.put(2, new Song(2, "Kathari Poovazhagi", "Vijay", "Benny Dayal, Swetha Mohan", "A.R. Rahman"));
        playlist.put(3, new Song(3, "Tum Hi Ho", "Mithoon", "Arijit Singh", "Mithoon"));
        playlist.put(4, new Song(4, "Vizhiyil", "Vairamuthu", "Unni Menon", "A.R. Rahman"));
        playlist.put(5, new Song(5, "Nenjame", "Panchu Arunachalam", "S.P.Balasubrahmanyam", "Ilaiyaraaja"));
    }

    // Don't modify the above code

    // Write your code here
    int uniqueId = 6;

    @Override
    public ArrayList<Song> getSongs(){
        Collection<Song> songCollection = playlist.values();
        ArrayList<Song> songs=new ArrayList<>(songCollection);  
        return songs;
    }

    @Override
    public Song addSong(Song song){
        song.setSongId(uniqueId);
        playlist.put(uniqueId, song);
        uniqueId++;
        return playlist.get(song.getSongId());
    }

    @Override
    public Song getSong(int id){
        Song song = playlist.get(id);
        if(song == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return song;
    }

    @Override
    public Song updateSong(int id, Song song){
        Song newSong = playlist.get(id);
        if(newSong == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        if(song.getSongName() != null){
            newSong.setSongName(song.getSongName());
        }
        if(song.getLyricist() != null){
            newSong.setLyricist(song.getLyricist());
        }
        if(song.getSinger() != null){
            newSong.setSinger(song.getSinger());
        }
        if(song.getMusicDirector() != null){
            newSong.setMusicDirector(song.getMusicDirector());
        }
        return newSong;
    }

    @Override
    public void deleteSong(int id){
        Song song = playlist.get(id);
        if(song == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }else{
            playlist.remove(id);
            throw new ResponseStatusException(HttpStatus.NO_CONTENT);
        }
    }

}