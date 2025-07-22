/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * 
 */

// Write your code here
package com.example.song;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class SongController{
    SongService songService=new SongService();

    @GetMapping("/songs")
    public ArrayList<Song> getSongs(){
        return songService.getSongs();
    }

    @PostMapping("/songs")
    public Song addSong(@RequestBody Song song){
        return songService.addSong(song);
    }

    @GetMapping("/songs/{songId}")
    public Song getsong(@PathVariable("songId") int id){
        return songService.getSong(id);
    }

    @PutMapping("/songs/{songId}")
    public Song updateSong(@PathVariable("songId") int id, @RequestBody Song song){
        return songService.updateSong(id, song);
    }

    @DeleteMapping("/songs/{songId}")
    public void deleteSong(@PathVariable("songId") int id){
         songService.deleteSong(id);
    }

}