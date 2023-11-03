package co.com.jorgecabrerasouto.ls.persistence.repository;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import co.com.jorgecabrerasouto.ls.persistence.model.Project;

@SpringBootTest
class ProjectRepositoryIntegrationTest {
      
    @Autowired
    private IProjectRepository projectRepository;
    
    @Test
    void whenSavingNewProject_thenSuccess() {
        Project newProject = new Project(randomAlphabetic(6), LocalDate.now());
        
        assertThat(projectRepository.save(newProject), is(notNullValue()));
    }
    
    @Test
    void givenProyect_whenFindById_thenSuccess() {
        Project newProject = new Project(randomAlphabetic(6), LocalDate.now());
        projectRepository.save(newProject);
        
        Optional <Project> retrievedProject = projectRepository.findById(newProject.getId());
        assertThat(retrievedProject.get(), is(equalTo(newProject)));
    }

}
