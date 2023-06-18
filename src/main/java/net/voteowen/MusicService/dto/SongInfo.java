package net.voteowen.MusicService.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class SongInfo {
    @NonNull
    String title;
    @NonNull
    String artist;
    @NonNull
    String album;
    @NonNull
    int length;
}
