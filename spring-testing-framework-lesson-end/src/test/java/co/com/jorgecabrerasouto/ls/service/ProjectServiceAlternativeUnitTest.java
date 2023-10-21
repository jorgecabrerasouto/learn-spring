package co.com.jorgecabrerasouto.ls.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import co.com.jorgecabrerasouto.ls.persistence.model.Project;
import co.com.jorgecabrerasouto.ls.persistence.repository.IProjectRepository;
import co.com.jorgecabrerasouto.ls.service.impl.ProjectServiceImpl;

@ExtendWith(MockitoExtension.class)
public class ProjectServiceAlternativeUnitTest {

    @Mock
    IProjectRepository projectRepository;

    @InjectMocks
    ProjectServiceImpl projectService;

    @Test
    public void whenSavingProject_thenOK() {
        Project project = new Project("name", LocalDate.now());
        when(projectRepository.save(project)).thenReturn(project);

        Project savedProject = projectService.save(project);

        assertNotNull(savedProject);
    }
}
