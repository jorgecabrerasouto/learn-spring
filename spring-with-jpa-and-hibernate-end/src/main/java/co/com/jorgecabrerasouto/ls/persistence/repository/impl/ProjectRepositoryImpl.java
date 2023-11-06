package co.com.jorgecabrerasouto.ls.persistence.repository.impl;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import co.com.jorgecabrerasouto.ls.persistence.model.Project;
import co.com.jorgecabrerasouto.ls.persistence.repository.IProjectRepository;

@Repository
public class ProjectRepositoryImpl implements IProjectRepository {

    @Override
    public Optional<Project> findById(Long id) {
        return null;
    }

    @Override
    public Project save(Project project) {
        return null;
    }

}
