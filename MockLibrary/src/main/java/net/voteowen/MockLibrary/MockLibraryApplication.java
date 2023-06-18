package net.voteowen.MockLibrary;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class MockLibraryApplication {

    public static void main(String[] args) {
        LOGGER.info("Starting Mock Library");
        SpringApplication.run(MockLibraryApplication.class, args);
    }

}
