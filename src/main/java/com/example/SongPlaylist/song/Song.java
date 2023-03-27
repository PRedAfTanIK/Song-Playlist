package com.example.SongPlaylist.song;

import java.util.List;

public class Song {
    private int id;
    private String name;
    private int durationInMinutes;
    private String artist;
    private int views;
    private int likes;
    private String language;
    private int releaseYear;
    private List<String> lyrics; /*each element is one line of lyrics*/

    public Song() {}

    public Song(int id, String name, int durationInMinutes) {
        this.id = id;
        this.name = name;
        this.durationInMinutes = durationInMinutes;
    }

    public Song(int id, String name, int durationInMinutes, String artist) {
        this.id = id;
        this.name = name;
        this.durationInMinutes = durationInMinutes;
        this.artist = artist;
    }

    public Song(int id, String name, int durationInMinutes, String artist, int views, int likes, String language, int releaseYear) {
        this.id = id;
        this.name = name;
        this.durationInMinutes = durationInMinutes;
        this.artist = artist;
        this.views = views;
        this.likes = likes;
        this.language = language;
        this.releaseYear = releaseYear;
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

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public List<String> getLyrics() {
        return lyrics;
    }

    public void setLyrics(List<String> lyrics) {
        this.lyrics = lyrics;
    }
}
