package com.example.songr.controller;


import com.example.songr.repo.AlbumRepository;
import com.example.songr.repo.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



public class SongContrroler {
    @Controller
    public class SongController {

        @Autowired
        SongRepository songRepository;

        @Autowired
        AlbumRepository albumsRepository;


        @GetMapping("/song")
        public String getAllSongs(Model model) {
            model.addAttribute("song", songRepository.findAll());
            return "song.html";
        }


    }
    @GetMapping("/err")
    public String getNoSong(){
        return "err.html";
    }
}
