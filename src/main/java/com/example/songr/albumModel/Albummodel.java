package com.example.songr.albumModel;



import javax.persistence.*;
import java.util.List;


@Entity
public class Albummodel  {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @OneToMany(mappedBy = "album")

    private List<Song> songs;
    private String title;
        private String artist;
        private int songCount;
        private int length;
        private String imageUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Albummodel(String title, String artist, int songCount, int length, String imageUrl) {
            this.title = title;
            this.artist = artist;
            this.songCount = songCount;
            this.length = length;
            this.imageUrl = imageUrl;
        }



        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getArtist() {
            return artist;
        }

        public void setArtist(String artist) {
            this.artist = artist;
        }

        public int getSongCount() {
            return songCount;
        }

        public void setSongCount(int songCount) {
            this.songCount = songCount;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

    @Override
    public String toString() {
        return "Albummodel{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", songCount=" + songCount +
                ", length=" + length +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }

}


