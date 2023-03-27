package com.example.SongPlaylist;

import com.example.SongPlaylist.Artist.Artist;
import com.example.SongPlaylist.song.Song;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Set;

@Repository
public class CommonRepository {
    HashMap<Integer,String> idToSongMap = new HashMap<>();
    HashMap<String,Song> songDbMap = new HashMap<>();
    HashMap<Integer,String> idToArtistMap = new HashMap<>();
    HashMap<String,Artist> artistDbMap = new HashMap<>();
    HashMap<String, Set<Integer>> songListOfArtistMap = new HashMap<>();

    public boolean addSong(Song song){
        if(idToSongMap.containsKey(song.getId())){
            Song copy = songDbMap.get(idToSongMap.get(song.getId()));
            if(!copy.equals(song)) return false;
        }
        songDbMap.put(song.getName(),song);
        idToSongMap.put(song.getId(), song.getName());

        return true;
    }

    public boolean addArtist(Artist artist){
        if(idToArtistMap.containsKey(artist.getId())){
            Artist copy = artistDbMap.get(idToArtistMap.get(artist.getId()));
            if(!copy.equals(artist)) return false;
        }
        artistDbMap.put(artist.getName(),artist);
        idToArtistMap.put(artist.getId(), artist.getName());

        return true;
    }
}
