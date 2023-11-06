package co.com.jorgecabrerasouto.ls.persistence.repository.impl;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import co.com.jorgecabrerasouto.ls.persistence.model.Project;
import co.com.jorgecabrerasouto.ls.persistence.repository.IProjectRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
public class ProjectRepositoryImpl implements IProjectRepository {
    
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public Optional<Project> findById(Long id) {
        Project entity = entityManager.find(Project.class, id);
        return Optional.ofNullable(entity);
    }

    @Override
    @Transactional
    public Project save(Project project) {
        entityManager.persist(project);
        return project;
    }

}
