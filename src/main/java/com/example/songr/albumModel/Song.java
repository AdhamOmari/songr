package com.example.songr.albumModel;

import javax.persistence.*;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private int length;
    private int trackNumber;


    @ManyToOne
    private Albummodel album;

    public Song(){}

    public Song(String title, int length, int trackNumber , Albummodel album) {
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
        this.album = album;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    public Albummodel getAlbum() {
        return album;
    }

    public void setAlbum(Albummodel album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", length=" + length +
                ", trackNumber=" + trackNumber +
                '}';
    }
}
