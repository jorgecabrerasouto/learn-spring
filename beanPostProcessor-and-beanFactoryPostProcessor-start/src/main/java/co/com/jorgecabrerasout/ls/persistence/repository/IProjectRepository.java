package co.com.jorgecabrerasout.ls.persistence.repository;

import java.util.Optional;

import co.com.jorgecabrerasout.ls.persistence.model.Project;

public interface IProjectRepository {

    Optional<Project> findById(Long id);

    Project save(Project project);
}
