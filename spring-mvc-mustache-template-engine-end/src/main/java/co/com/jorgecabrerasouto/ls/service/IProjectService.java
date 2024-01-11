package co.com.jorgecabrerasouto.ls.service;

import java.util.Optional;

import co.com.jorgecabrerasouto.ls.persistence.model.Project;

public interface IProjectService {
    Optional<Project> findById(Long id);

    Iterable<Project> findAll();

    Project save(Project project);
}
