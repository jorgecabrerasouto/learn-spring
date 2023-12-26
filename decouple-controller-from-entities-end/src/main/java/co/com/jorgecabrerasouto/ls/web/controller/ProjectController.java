package co.com.jorgecabrerasouto.ls.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import co.com.jorgecabrerasouto.ls.persistence.model.Project;
import co.com.jorgecabrerasouto.ls.service.IProjectService;
import co.com.jorgecabrerasouto.ls.web.dto.ProjectDto;

@RestController
@RequestMapping(value = "/projects")
public class ProjectController {

    private IProjectService projectService;

    public ProjectController(IProjectService projectService) {
        this.projectService = projectService;
    }

    //

    @GetMapping(value = "/{id}")
    public ProjectDto findOne(@PathVariable Long id) {
        Project entity = projectService.findById(id)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return convertToDto(entity);
    }

    @PostMapping
    public void create(@RequestBody ProjectDto newProject) {
        this.projectService.save(convertToEntity(newProject));
    }
    
    private ProjectDto convertToDto(Project entity) {
//        return new ProjectDto(entity.getId(), entity.getName(), entity.getDateCreated());
        return new ProjectDto(entity.getId(), entity.getName());
    }
    
    private Project convertToEntity(ProjectDto dto) {
        //Project project = new Project(dto.getName(), dto.getDateCreated());
        Project project = new Project(dto.getName(), null);
        
        if(!StringUtils.hasLength(Long.toString(dto.getId()))) {
            project.setId(dto.getId());
        }
        return project;
    }

}
