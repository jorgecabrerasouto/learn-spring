package co.com.jorgecabrerasouto.ls.persitence.repository;

import java.util.Optional;

import co.com.jorgecabrerasouto.ls.persistence.model.Project;

public interface IProjectRepository {

    Optional<Project> findById(Long id);

    Project save(Project project);
}
