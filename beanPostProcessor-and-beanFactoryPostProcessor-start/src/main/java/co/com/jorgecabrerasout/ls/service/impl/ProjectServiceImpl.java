package co.com.jorgecabrerasout.ls.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import co.com.jorgecabrerasout.ls.persistence.model.Project;
import co.com.jorgecabrerasout.ls.persistence.repository.IProjectRepository;
import co.com.jorgecabrerasout.ls.service.IProjectService;

@Service
public class ProjectServiceImpl implements IProjectService {

    private IProjectRepository projectRepository;

    public ProjectServiceImpl(IProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public Optional<Project> findById(Long id) {
        return projectRepository.findById(id);
    }

    @Override
    public Project save(Project project) {
        return projectRepository.save(project);
    }

}
