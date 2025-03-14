package org.example.taskservice.Controller;

import org.example.taskservice.Service.TaskService;
import org.example.taskservice.Service.UserService;
import org.example.taskservice.modal.Task;
import org.example.taskservice.modal.TaskStatus;
import org.example.taskservice.modal.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class HomeController {

    @RequestMapping("/tasks")
    public ResponseEntity<String> HomeController(){
        return new ResponseEntity<>("Welcome to task service", HttpStatus.OK);
    }
}
