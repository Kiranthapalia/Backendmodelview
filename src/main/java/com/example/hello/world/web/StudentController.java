package com.example.hello.world.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.hello.world.domain.Student;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    @GetMapping("/hello")
    public String hello(Model model) {
        // Create a list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student("Kate", "Cole"));
        students.add(new Student("Dan", "Brown"));
        students.add(new Student("Mike", "Mars"));

        // Add the list of students to the model
        model.addAttribute("students", students);


        return "studentlist";
    }
}