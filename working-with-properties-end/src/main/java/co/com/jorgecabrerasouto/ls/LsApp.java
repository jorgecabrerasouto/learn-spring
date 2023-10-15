package co.com.jorgecabrerasouto.ls;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import co.com.jorgecabrerasouto.ls.persistence.model.Project;
import co.com.jorgecabrerasouto.ls.service.IProjectService;
import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class LsApp {
    
    @Autowired
    IProjectService projectService;

    public static void main(final String... args) {
        SpringApplication.run(LsApp.class, args);
    }

    @PostConstruct
    public void postConstruct() {        
        projectService.save(new Project(1L, "My First project", LocalDate.now()));
    }
}
