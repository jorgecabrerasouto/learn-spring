package co.com.jorgecabrerasouto.ls.persistence.repository;

import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;

import co.com.jorgecabrerasouto.ls.persistence.model.Project;

@SpringBootTest
public class ProjectRepositoryIntegrationTest {

    @Autowired
    IProjectRepository projectRepository;
    public ProjectRepositoryIntegrationTest() {
        // TODO Auto-generated constructor stub
    
    }
    
    @Test
    public void givenDataCreated_whenFindAllPaginated_thenSucsess () {
        
        Page<Project> retrievedProjects = projectRepository.findAll(PageRequest.of(0, 02));
        assertThat(retrievedProjects.getContent(), hasSize(2));
    } 
    
    @Test
    public void givenDataCreated_whenFindAllSorted_thenSucsess () {
        
        List<Project> retrievedProjects = (List<Project>) projectRepository.findAll(Sort.by(Order.asc("name")));
     
        List<Project> sortedProjects = retrievedProjects.stream().collect(Collectors.toList());
        sortedProjects.sort(Comparator.comparing(Project::getName));
        
        assertEquals(sortedProjects, retrievedProjects);
        
    } 
    
    @Test
    public void givenDataCreated_whenFindAllPaginatedAndSorted_thenSucsess () {
        
        Page<Project> retrievedProjects = projectRepository.findAll(PageRequest.of(0, 02, Sort.by(Order.asc("name"))));
        assertThat(retrievedProjects.getContent(), hasSize(2));
    }
}