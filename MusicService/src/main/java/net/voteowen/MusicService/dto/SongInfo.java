package net.voteowen.MusicService.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class SongInfo {
    String title;
    String artist;
    String album;
}
