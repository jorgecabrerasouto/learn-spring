package co.com.jorgecabrerasout.ls.service;

import java.util.Optional;

import co.com.jorgecabrerasout.ls.persistence.model.Project;

public interface IProjectService {
    Optional<Project> findById(Long id);

    Project save(Project project);
}
