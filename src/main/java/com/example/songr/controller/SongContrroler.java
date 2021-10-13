package com.example.songr.controller;


;
import com.example.songr.albumModel.Albummodel;
import com.example.songr.albumModel.Dto;
import com.example.songr.albumModel.Song;
import com.example.songr.repo.AlbumRepository;
import com.example.songr.repo.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

public class SongContrroler {
    @Controller
    public class SongController {

        @Autowired
        SongRepository songRepository;

        @Autowired
        AlbumRepository albumsRepository;

        @PostMapping("/song")
        public RedirectView createNewBlogPost(@ModelAttribute Dto dto) { // modelattribute when working with form data

            Albummodel album = albumsRepository.findAlbumByTitle(dto.getAlbum()).orElseThrow();
            Song newSong = new Song(dto.getTitle(), (int) dto.getLength(), dto.getTrackNumber(),album);
            songRepository.save(newSong);

            return new RedirectView("song");
        }
        @GetMapping("/song")
        public String getSongs(Model model) {
            model.addAttribute("songs", songRepository.findAll());
            return "song";
        }


    }
    @GetMapping("/err")
    public String getNoSong(){
        return "err.html";
    }
}
