package com.crud.tasks;

import com.crud.tasks.domain.TaskDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TasksApplication {

	public static void main(String[] args) {
		TaskDto taskDto = new TaskDto(
				(long)1,
				"Test title",
				"My new task"
		);

		Long id = taskDto.getId();
		String title = taskDto.getTitle();
		String description = taskDto.getDescription();

		System.out.println(id + " " + title + " " + description);

//		SpringApplication.run(TasksApplication.class, args);
	}

}
