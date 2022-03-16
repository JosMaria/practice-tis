package org.genesiscode.practice.controller;

import org.genesiscode.practice.entity.Student;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final static List<Student> STUDENT = List.of(
            new Student(1L, "Jose Maria", "Aguilar Chambi", LocalDate.now()),
            new Student(2L, "Cidar", "Parra Merida", LocalDate.of(1998, Month.JANUARY, 17)),
            new Student(3L, "Diego", "Placido", LocalDate.of(2001, Month.APRIL, 17)),
            new Student(4L, "Carlos", "Torrico", LocalDate.of(2010, Month.DECEMBER, 25)));

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
        return STUDENT;
    }

}
