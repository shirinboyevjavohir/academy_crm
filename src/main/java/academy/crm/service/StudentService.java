package academy.crm.service;

import academy.crm.dto.StudentDTO;
import academy.crm.entity.Student;
import academy.crm.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student create(StudentDTO dto) {
        Student student = new Student();
        student.setFirstName(dto.getFirstName());
        student.setLastName(dto.getLastName());
        student.setPhoneNumber(dto.getPhoneNumber());
        student.setAge(dto.getAge());
        student.setAddress(dto.getAddress());

        return studentRepository.save(student);
    }
}

