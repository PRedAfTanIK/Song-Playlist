package com.example.SongPlaylist.Artist;

import java.util.List;

public class Artist {
    private int id;
    private String name;
    private int numberOfAlbums;
    private int numberOfLikes;
    private String mostLikedSong;
    private List<String> biodata; /* Each element is one line*/

    public Artist() {}

    public Artist(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Artist(int id, String name, int numberOfAlbums, int numberOfLikes, String mostLikedSong, List<String> biodata) {
        this.id = id;
        this.name = name;
        this.numberOfAlbums = numberOfAlbums;
        this.numberOfLikes = numberOfLikes;
        this.mostLikedSong = mostLikedSong;
        this.biodata = biodata;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfAlbums() {
        return numberOfAlbums;
    }

    public void setNumberOfAlbums(int numberOfAlbums) {
        this.numberOfAlbums = numberOfAlbums;
    }

    public int getNumberOfLikes() {
        return numberOfLikes;
    }

    public void setNumberOfLikes(int numberOfLikes) {
        this.numberOfLikes = numberOfLikes;
    }

    public String getMostLikedSong() {
        return mostLikedSong;
    }

    public void setMostLikedSong(String mostLikedSong) {
        this.mostLikedSong = mostLikedSong;
    }

    public List<String> getBiodata() {
        return biodata;
    }

    public void setBiodata(List<String> biodata) {
        this.biodata = biodata;
    }
}
