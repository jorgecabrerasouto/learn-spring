package co.com.jorgecabrerasouto.ls.persistence.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import co.com.jorgecabrerasouto.ls.persistence.model.Project;
import co.com.jorgecabrerasouto.ls.persistence.repository.IProjectRepository;

@SpringBootTest
public class ProjectRepositoryIntegrationTest {

    @Autowired
    IProjectRepository projectRepository;

    @Test
    public void givenNewProject_whenSave_thenSuccess() {
        Project newProject = new Project("First Project", LocalDate.now());
        assertThat(projectRepository.save(newProject)).isNotNull();
    }

    @Test
    public void givenProject_whenFindById_thenSuccess() {
        Project newProject = new Project("First Project", LocalDate.now());
        projectRepository.save(newProject);

        Optional<Project> retreivedProject = projectRepository.findById(newProject.getId());
        assertThat(retreivedProject.get()).isEqualTo(newProject);
    }
}