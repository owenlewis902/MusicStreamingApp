package net.voteowen.MockLibrary.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class Song {
    @NonNull
    private String title;
    @NonNull
    private String artist;
    @NonNull
    private String album;
}