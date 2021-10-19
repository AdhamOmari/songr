package com.example.songr.albumModel;

import javax.persistence.*;
import java.util.Optional;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;


    private String title;
    private int length;
    private int trackNumber;

    @ManyToOne
    @JoinColumn(name = "album_id")
    private Albummodel album;


    public void setAlbum(Albummodel album) {
        this.album = album;
    }

    public Song() {

    }

    public Song(String title, int length, int trackNumber) {
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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




}


