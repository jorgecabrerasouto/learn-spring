package co.com.jorgecabrerasouto.ls.service;

import java.util.Optional;

import co.com.jorgecabrerasouto.ls.exception.TaskNotSavedException;
import co.com.jorgecabrerasouto.ls.persistence.model.Project;

public interface IProjectService {
    Iterable<Project> findAll();

    Optional<Project> findById(Long id);

    Project save(Project project);
    
    void CreateProjectWithTasks () throws TaskNotSavedException;
}
