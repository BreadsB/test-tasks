package com.crud.tasks.controller;

import java.util.ArrayList;
import java.util.List;

import com.crud.tasks.domain.Task;
import com.crud.tasks.domain.TaskDto;
import com.crud.tasks.mapper.TaskMapper;
import com.crud.tasks.service.DbService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/tasks")
@RequiredArgsConstructor
public class TaskController {

    private final DbService service;
    private final TaskMapper mapper;

    @GetMapping
    public List<TaskDto> getTasks() {
        List<Task> taskList = service.getAllTasks();
        return mapper.mapToTaskDtoList(taskList);
    }

    @GetMapping(value = "/{taskId}")
    public TaskDto getTask(@PathVariable Long taskId) throws Exception {

        TaskDto taskDto = new TaskDto(taskId, "error", "error");

        try {
            Task task = service.getTaskById(taskId);
            taskDto = mapper.mapToTaskDto(task);
        } catch (Exception e) {
            System.out.println(e);
        }
        return taskDto;
    }

    @DeleteMapping
    public void deleteTask(Long taskId) {

    }

    @PutMapping
    public TaskDto updateTask(@RequestBody TaskDto task) {
        return new TaskDto(1L, "Edited title", "Edited description");
    }

    @PostMapping(path = "/newtask", consumes = {"application/json"})
    public void createTask(@RequestBody TaskDto taskDto) {
    }
}