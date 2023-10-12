package co.com.jorgecabrerasouto.ls;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import co.com.jorgecabrerasouto.ls.config.AppConfig;

@SpringBootApplication
public class LsApp {

    public static void main(final String... args) {
        SpringApplication.run(LsApp.class, args);
    }

}
