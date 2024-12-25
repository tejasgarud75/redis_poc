package com.redis_poc.controller;

import com.redis_poc.entity.Student;
import com.redis_poc.service.StudentService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

  private final StudentService studentService;

  public StudentController(StudentService studentService) {
    this.studentService = studentService;
  }

  @PostMapping
  public Student createStudent(@RequestBody Student student) {
    return studentService.saveStudent(student);
  }

  @GetMapping
  public List<Student> getAllStudents() {
    return studentService.getAllStudentsCache();
  }

  @GetMapping("/{id}")
  public Student getStudentById(@PathVariable("id") Long id) {
    return studentService.getStudentByIdCas(id);
  }
}
