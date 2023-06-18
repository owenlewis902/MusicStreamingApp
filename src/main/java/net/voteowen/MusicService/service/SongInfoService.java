package net.voteowen.MusicService.service;

import net.voteowen.MusicService.dto.SongInfo;

import java.util.List;

public interface SongInfoService {
    SongInfo getSong();
    List<SongInfo> getSongs();
}
