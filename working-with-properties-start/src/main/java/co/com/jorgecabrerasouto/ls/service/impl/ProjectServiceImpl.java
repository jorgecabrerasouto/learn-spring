package co.com.jorgecabrerasouto.ls.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.jorgecabrerasouto.ls.persistence.model.Project;
import co.com.jorgecabrerasouto.ls.persistence.repository.IProjectRepository;
import co.com.jorgecabrerasouto.ls.service.IProjectService;

@Service
public class ProjectServiceImpl implements IProjectService {

    @Autowired
    private IProjectRepository projectRepository;

    @Override
    public Optional<Project> findById(Long id) {
        return projectRepository.findById(id);
    }

    @Override
    public Project save(Project project) {
        return projectRepository.save(project);
    }

}
