package com.example.songr.repo;

import com.example.songr.albumModel.Albummodel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends JpaRepository<Albummodel, Long> {

    Albummodel findAlbumByTitle(String title);
}
