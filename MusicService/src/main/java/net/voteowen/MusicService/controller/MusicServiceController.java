package net.voteowen.MusicService.controller;

import java.util.List;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import net.voteowen.MusicService.dto.SongInfo;
import net.voteowen.MusicService.service.SongInfoService;

@AllArgsConstructor
@RestController
public class MusicServiceController {

    private SongInfoService songInfoService;

    @GetMapping(value="/song", produces="application/json")
    public ResponseEntity<SongInfo> getSong() {
        var song = songInfoService.getSong();
        return new ResponseEntity<>(song, HttpStatus.OK);
    }

    @GetMapping(value="/songs", produces="application/json")
    public ResponseEntity<List<SongInfo>> getSongs() {
        var songs = songInfoService.getSongs();
        return new ResponseEntity<>(songs, HttpStatus.OK);
    }
}
