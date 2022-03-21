package com.RestWeb.Rest.Service;

import com.RestWeb.Rest.Model.Task;
import com.RestWeb.Rest.Repository.ProjectRepository;
import com.RestWeb.Rest.Repository.TaskRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service

//Is a layer in an application that facilitates communication between the task controller and the task repository
public class TaskService{

    public TaskRepository taskRepository;
    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task getById(Long id){
        log.info("IN TaskService getById {}",id);
        return taskRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id){
        log.info("IN TaskService deleteById {}",id);
        taskRepository.deleteById(id);
    }

    public void createTask(Task task){
        log.info("IN TaskService createTask {}",task);
        taskRepository.save(task);
    }

    public void update(Task task){
        log.info("IN TaskService update {}",task);
        taskRepository.save(task);
    }

    public void done(Long id){
        Task old = taskRepository.getById(id);
        log.info("Task Status : {}" ,old.getStatus());
    }

    public List<Task> getAll(){
        log.info("IN TaskService getAll");
        return taskRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }


}