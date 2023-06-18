package net.voteowen.MusicService.service;

import org.springframework.stereotype.Service;

import net.voteowen.MusicService.dto.SongInfo;

import java.util.List;

@Service
public class SongInfoServiceImpl implements SongInfoService {
    @Override
    public SongInfo getSong() {
        return SongInfo.builder()
                .title("We're Going Wrong")
                .artist("Cream")
                .album("Disraeli Gears")
                .length(206)
                .build();
    }

    @Override
    public List<SongInfo> getSongs() {
        var wgw = SongInfo.builder()
                .title("We're Going Wrong")
                .artist("Cream")
                .album("Disraeli Gears")
                .length(206)
                .build();
        var soyl = SongInfo.builder()
                .title("Sunshine Of Your Love")
                .artist("Cream")
                .album("Disraeli Gears")
                .length(250)
                .build();
        var sb = SongInfo.builder()
                .title("Strange Brew")
                .artist("Cream")
                .album("Disraeli Gears")
                .length(165)
                .build();

        return List.of(wgw, soyl, sb);
    }
}
