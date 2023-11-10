package co.com.jorgecabrerasouto.ls.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import co.com.jorgecabrerasouto.ls.persistence.model.Project;
import co.com.jorgecabrerasouto.ls.service.IProjectService;

@RestController
@RequestMapping(value = "/projects")
public class ProjectController {
    
    private IProjectService projectService;

    public ProjectController(IProjectService projectService) {
        super();
        this.projectService = projectService;
    }

    @GetMapping(value = "/{id}")
    public Project findOne(@PathVariable Long id) {
        return projectService.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
    
    @PostMapping
    public void create(@RequestBody Project project) {
        projectService.save(project);
    }

}
