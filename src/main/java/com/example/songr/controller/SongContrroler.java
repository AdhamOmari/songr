package com.example.songr.controller;


import com.example.songr.albumModel.Albummodel;
import com.example.songr.albumModel.Song;
import com.example.songr.repo.AlbumRepository;
import com.example.songr.repo.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;


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
