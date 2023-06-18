package net.voteowen.MockLibrary.controller;

import lombok.AllArgsConstructor;
import net.voteowen.MockLibrary.service.SongService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import net.voteowen.MockLibrary.dto.Song;

import java.util.List;

@AllArgsConstructor
@RestController
public class MockLibraryController {

    private SongService songService;

    @GetMapping(value="/song/{title}", produces="application/json")
    public ResponseEntity<Song> getSong(@PathVariable String title) {
        var song = songService.getSong(title);
        return new ResponseEntity<>(song, HttpStatus.OK);
    }

    @GetMapping(value="/songs/{keyword}", produces="application/json")
    public ResponseEntity<List<Song>> getSongsByKeyword(@PathVariable String keyword) {
        var songs = songService.getSongs(keyword);
        return new ResponseEntity<>(songs, HttpStatus.OK);
    }
}