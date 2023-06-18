package net.voteowen.MockLibrary.service;

import net.voteowen.MockLibrary.dto.Song;

import java.util.List;

public interface SongService {
    Song getSong(String title);
    List<Song> getSongs(String keyword);
}
