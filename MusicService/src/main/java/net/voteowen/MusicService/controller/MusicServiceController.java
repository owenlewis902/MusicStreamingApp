package net.voteowen.MusicService.controller;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import net.voteowen.MusicService.dto.SongInfo;
import net.voteowen.MusicService.service.SongInfoService;

@AllArgsConstructor
@RestController
@Slf4j
public class MusicServiceController {

    private SongInfoService songInfoService;

    @GetMapping(value="/songInfo/{title}", produces="application/json")
    public ResponseEntity<SongInfo> getSong(@PathVariable String title) {
        LOGGER.info("Getting song: {}", title);
        var song = songInfoService.getSong(title);
        return new ResponseEntity<>(song, HttpStatus.OK);
    }

    @GetMapping(value="/songsInfo/{keyword}", produces="application/json")
    public ResponseEntity<List<SongInfo>> getSongs(@PathVariable String keyword) {
        LOGGER.info("Getting songs to match: {}", keyword);
        var songs = songInfoService.getSongs(keyword);
        return new ResponseEntity<>(songs, HttpStatus.OK);
    }
}