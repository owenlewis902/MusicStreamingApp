package net.voteowen.MusicService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class MusicServiceApplication {

	public static void main(String[] args) {
		LOGGER.info("Starting Music Service");
		SpringApplication.run(MusicServiceApplication.class, args);
	}

}