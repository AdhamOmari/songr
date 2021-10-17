package com.example.songr.repo;

import com.example.songr.albumModel.Albummodel;
import com.example.songr.albumModel.Song;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface SongRepository extends JpaRepository<Song, Long> {

}
