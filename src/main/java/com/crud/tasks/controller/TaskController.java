package com.crud.tasks.controller;

import java.util.ArrayList;
import java.util.List;

import com.crud.tasks.domain.TaskDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/tasks")
public class TaskController {

    @GetMapping
    public List<TaskDto> getTasks() {
        return new ArrayList<>();
    }

    @GetMapping
    public TaskDto getTask(Long taskId) {
        return new TaskDto(1L, "test title", "test description");
    }

    @DeleteMapping
    public void deleteTask(Long taskId) {

    }

    @PutMapping
    public TaskDto updateTask(TaskDto task) {
        return new TaskDto(1L, "Edited title", "Edited description");
    }

    @PostMapping
    public void createTask(TaskDto task) {

    }
}
