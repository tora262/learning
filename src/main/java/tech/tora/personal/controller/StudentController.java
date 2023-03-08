package tech.tora.personal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.tora.personal.entity.Student;
import tech.tora.personal.repo.StudenRedisRepository;

@RestController
@RequestMapping("/api/v1")
public class StudentController {
    @Autowired
    private StudenRedisRepository redisRepository;

    @GetMapping
    public ResponseEntity<Student> getStudents() {
        Student student = new Student("123", "Hieu", Student.Gender.MALE);
        redisRepository.save(student);
        return ResponseEntity.ok(redisRepository.findById("123").orElse(new Student("", "", null)));
    }
}
