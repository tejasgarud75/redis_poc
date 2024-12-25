package com.redis_poc.service;

import com.redis_poc.entity.Student;
import com.redis_poc.repo.StudentRepo;
import java.util.List;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

  private final StudentRepo studentRepository;

  public StudentService(StudentRepo studentRepository) {
    this.studentRepository = studentRepository;
  }

  public Student saveStudent(Student student) {
    return studentRepository.save(student);
  }

  @Cacheable(value = "students")
  public List<Student> getAllStudentsCache() {
    return studentRepository.findAll();
  }

  @Cacheable(value = "student", key = "#id")
  public Student getStudentByIdCas(Long id) {
    return studentRepository.findById(id).get();
  }

}
