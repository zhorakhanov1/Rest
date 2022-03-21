package com.RestWeb.Rest.Controller;

 import com.RestWeb.Rest.Model.Task;
 import com.RestWeb.Rest.Service.TaskService;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.validation.annotation.Validated;
 import org.springframework.web.bind.annotation.*;

 import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {


    public TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/{id}")
    public Task getById(@PathVariable("id") Long id){
        return taskService.getById(id);
    }

    @PostMapping("")
    public void create(@RequestBody @Validated Task task){
        taskService.createTask(task);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id){
        taskService.deleteById(id);
    }
    @PutMapping("")
    public void updateById(@RequestBody @Validated Task task){
        taskService.updateById(task);
    }
    @GetMapping("")
    public List<Task> getAll(){

        return taskService.getAll();
    }
    @PutMapping("/{id}")
    public void done(@PathVariable("id") Long id){
        taskService.done(id);
    }


}