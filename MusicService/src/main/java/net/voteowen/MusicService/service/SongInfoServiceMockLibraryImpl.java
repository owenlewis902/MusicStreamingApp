package net.voteowen.MusicService.service;

import lombok.AllArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import net.voteowen.MusicService.dto.SongInfo;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@AllArgsConstructor
public class SongInfoServiceMockLibraryImpl implements SongInfoService {

    private RestTemplate restTemplate;
    private static final String URL = "http://localhost:8090/";

    @Override
    public SongInfo getSong(String title) {
        return restTemplate.getForObject(URL + "song/" + title, SongInfo.class);
    }

    @Override
    public List<SongInfo> getSongs(String keyword) {
        var response = restTemplate.exchange(
                URL + "songs/" + keyword,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<SongInfo>>() {}
        );
        return response.getBody();
    }
}
