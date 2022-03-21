package com.RestWeb.Rest.Controller;

import com.RestWeb.Rest.Model.Project;
import com.RestWeb.Rest.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/projects")
//To create RESTful Web Service we need RestController class
public class ProjectController {

    public ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/{id}")
    public Project getById(@PathVariable("id") Long id){
        return projectService.getById(id);
    }

    @PostMapping("")
    public void create(@RequestBody @Validated Project project){
        projectService.createProject(project);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id){
        projectService.deleteById(id);
    }

    @PutMapping("")
    public void update(@RequestBody @Validated Project project){
        projectService.update(project);
    }

    @GetMapping("")
    public List<Project> getAll(){
        return projectService.getAll();
    }

}
