package com.example.todolist.service;

import com.example.todolist.entities.Task;
import com.example.todolist.repository.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepo taskrepo;


    public void createTask(Task task){
        taskrepo.save(task);
    }

    public Optional<Task> getTask(Integer id){ return taskrepo.findById(id); }
    public List<Task> getAllTask() {
        return taskrepo.findAll();
    }

    public void deleteTaskById(Integer id){ taskrepo.deleteById(id);}

    public Task updateTask(Task task){

        return taskrepo.save(task);
    }


}
