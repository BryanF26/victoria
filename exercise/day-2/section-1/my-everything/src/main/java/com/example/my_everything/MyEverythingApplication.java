package com.example.my_Everything;

import com.example.my_Everything.request.CreateTaskRequest;
import com.example.my_Everything.response.TaskResponse;
import com.example.my_Everything.request.PutTaskRequest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@SpringBootApplication
public class MyEverythingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyEverythingApplication.class, args);
	}

	private ArrayList<TaskResponse> tasks = new ArrayList<>();

	@PostMapping("/tasks")
	public ResponseEntity<ArrayList<TaskResponse>> createTask(
			@RequestBody CreateTaskRequest request
	){
		if(request.getName() != null && request.getStatus() != null && request.getDescription() != null){
			Long id = tasks.isEmpty() ? 1 : tasks.get(tasks.size()-1).getId()+1;
			tasks.add(TaskResponse.builder().id(id).name(request.getName()).status(request.getStatus()).description(request.getDescription()).build());
		}
		return new ResponseEntity<>(tasks, HttpStatus.CREATED);
	}

	@GetMapping("/tasks")
	public ResponseEntity<List<TaskResponse>> getAllTask(
			@RequestParam(name = "page") int page,
			@RequestParam(name = "size") int size
	){
        int start = (page-1) * size;
        int end = Math.min(tasks.size(), start+size);
        if(tasks.size() <= start){
            return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(tasks.subList(start, end), HttpStatus.OK);
	}

	@GetMapping("/tasks/{id}")
	public ResponseEntity<TaskResponse> getTaskById(
			@PathVariable("id") Long id
	){
		for(TaskResponse task : tasks){
			if(task.getId().equals(id)){
				return new ResponseEntity<>(task, HttpStatus.OK);
			}
		}
		return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
	}

	@PutMapping("/tasks/{id}")
	public ResponseEntity<TaskResponse> updateTask(
			@PathVariable("id") Long id,
			@RequestBody PutTaskRequest request
	){
		for(TaskResponse task : tasks){
			if(task.getId().equals(id)){
				task.setName(request.getName());
				task.setStatus(request.getStatus());
				task.setDescription(request.getDescription());
				return new ResponseEntity<>(task, HttpStatus.OK);
			}
		}
		return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
	}

	@DeleteMapping("/tasks/{id}")
	public ResponseEntity<TaskResponse> deleteTask(
			@PathVariable("id") Long id
	){
		for(TaskResponse task : tasks){
			if(task.getId().equals(id)){
				tasks.remove(task);
				return new ResponseEntity<>(task, HttpStatus.OK);
			}
		}
		return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
	}


}
