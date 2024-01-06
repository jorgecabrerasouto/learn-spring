package co.com.jorgecabrerasouto.ls.service;

import java.util.List;
import java.util.Optional;

import co.com.jorgecabrerasouto.ls.persistence.model.Project;
import co.com.jorgecabrerasouto.ls.persistence.model.Task;

public interface IProjectService {
    Optional<Project> findById(Long id);

    Project save(Project project);

    Iterable<Project> findAll();

    Project addTasks(Project project, List<Task> tasks);
}
