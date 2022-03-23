package org.genesiscode.practice.controller;

import org.genesiscode.practice.entity.Student;
import org.genesiscode.practice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(path = "say/hello")
    public String sayHelloWorld() {
        return "Hello world!!";
    }

    @GetMapping(path = "say/bye")
    public String sayBye() {
        return "Bye Jose Maria";
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

}
