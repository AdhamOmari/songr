package com.example.songr.repo;

import com.example.songr.albumModel.Albummodel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AlbumRepository extends JpaRepository<Albummodel, Long> {

    Optional<Albummodel> findAlbumByTitle(String title);
}
