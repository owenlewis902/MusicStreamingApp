package net.voteowen.MusicService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MusicServiceApplicationConfiguration {
    @Bean
    public RestTemplate getRestTemplateForMockLib() {
        return new RestTemplate();
    }
}
