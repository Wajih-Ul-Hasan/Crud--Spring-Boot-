package com.example.todolist.controller;

import com.example.todolist.entities.Task;
import com.example.todolist.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class TaskController {

    @Autowired
    TaskService taskservice;

    @PostMapping("/task")
    public void creteTask(@RequestBody Task task){

        taskservice.createTask(task);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Task>> getTasks(@PathVariable("id") Integer id)
    {
        return ResponseEntity.ok(taskservice.getTask(id));
    }

    @GetMapping("/")
    public ResponseEntity<List<Task>> getAllTasks() {
        return ResponseEntity.ok(taskservice.getAllTask());
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTaskById(@PathVariable("id") Integer id){ taskservice.deleteTaskById(id);}



    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Integer id, @RequestBody Task task) {
        return taskservice.updateTask(taskservice.updateTask(task));
    }



}
