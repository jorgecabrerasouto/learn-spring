package co.com.jorgecabrerasouto.ls;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import co.com.jorgecabrerasouto.ls.service.IProjectService;
import co.com.jorgecabrerasouto.ls.service.ITaskService;
import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class LsApp {

    public static void main(final String... args) {
        SpringApplication.run(LsApp.class, args);
    }
    private static final Logger LOG = LoggerFactory.getLogger(LsApp.class);

    @Autowired
    IProjectService projectService;

    @Autowired
    ITaskService taskService;

    @PostConstruct
    public void postConstruct() {
        try {
            projectService.CreateProjectWithTasks();
        } catch (Exception e) {
            LOG.error("Error occurred in creating project with tasks", e);
        }

        LOG.info("Fetching all Projects");
        projectService.findAll()
            .forEach(p -> LOG.info(p.toString()));

        LOG.info("Fetching all tasks");
        taskService.findAll()
            .forEach(t -> LOG.info(t.toString()));
    }
}
