package com.RestWeb.Rest.Service;

import com.RestWeb.Rest.Model.Project;
import com.RestWeb.Rest.Repository.ProjectRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;


@Slf4j
@Service

//Is a layer in an application that facilitates communication between the project controller and the project repository
public class ProjectService {

    public ProjectRepository projectRepository;

    @Autowired
    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public Project getById(Long id){
        log.info("IN TaskService getById {}",id);
        return projectRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id){
        log.info("IN TaskService deleteById {}",id);
        projectRepository.deleteById(id);
    }

    public void createProject(Project project){
        log.info("IN TaskService createTask {}",project);
        projectRepository.save(project);
    }

    public void update(Project project){
        log.info("IN TaskService update {}",project);
        projectRepository.save(project);
    }


    public List<Project> getAll(){
        log.info("IN TaskService getAll");
        return projectRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }

}
