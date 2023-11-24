package com.example.nickpetproject.controller;

import com.example.nickpetproject.entity.Students;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;


@RestController
@RequestMapping("/api")
public class StudentController {

    @GetMapping("/v1/student")
    public void getGroup() {
        System.out.println("GET");
    }

    @PostMapping( "/v1/student-create")
    public Students createStudent(@RequestBody Students student) {
        System.out.println("New student registered");
        System.out.println(student.getGroup());
        System.out.println(student.getFullName());
        return student;
    }
}
