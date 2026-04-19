package academy.crm.controller;

import academy.crm.dto.StudentDTO;
import academy.crm.entity.Student;
import academy.crm.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<Student> create(@Valid @RequestBody StudentDTO dto) {
        Student createdStudent = studentService.create(dto);
        return new ResponseEntity<>(createdStudent, HttpStatus.CREATED);
    }
}
