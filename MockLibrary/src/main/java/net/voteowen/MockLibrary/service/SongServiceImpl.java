package net.voteowen.MockLibrary.service;

import net.voteowen.MockLibrary.dto.Song;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements SongService {
    @Override
    public Song getSong(String title) {
        return Song.builder()
                .title(title)
                .artist("artist")
                .album("album")
                .build();
    }

    @Override
    public List<Song> getSongs(String keyword) {
        var s1 = Song.builder()
                .title("song 1")
                .artist(keyword)
                .album("album 1")
                .build();
        var s2 = Song.builder()
                .title("song 2")
                .artist(keyword)
                .album("album 2")
                .build();
        var s3 = Song.builder()
                .title("song 3")
                .artist("artist")
                .album(keyword)
                .build();

        return List.of(s1, s2, s3);
    }
}
