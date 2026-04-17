package academy.crm.repository;

import academy.crm.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findByPhoneNumber(String phoneNumber);

    List<Student> findAllByFirstName(String firstName);

    // Ismi yoki familiyasi ichida ma'lum bir harflar qatnashganlarni topish (Search uchun)
    List<Student> findAllByFirstNameContainingIgnoreCaseOrLastNameContainingIgnoreCase(String firstName, String lastName);

    // Yoshi bo'yicha filtrlash (masalan, 18 dan kattalar)
    List<Student> findAllByAgeGreaterThanEqual(Integer age);
}
