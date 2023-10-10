import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentRepoTest {

    @Test
    void getAllStudents() {
    }

    @Test
    void save() {
    }

    @Test
    void findStudentById_StudentFound() {
        // GIVEN
        /*StudentRepo studentRepo = new StudentRepo();

        Student student2 = Student.builder()
                .name("Thomas")
                .subject("Chemie")
                .id("2")
                .build();

        studentRepo.save(student2);

        // WHEN & THEN
        assertThrows(StudentNotFoundException.class, () -> {
            studentRepo.findStudentById("2");
        });*/
    }
    @Test
    void findStudentById_StudentNotFound() {
        // GIVEN
        StudentRepo studentRepo = new StudentRepo();

        Student student2 = Student.builder()
                .name("Thomas")
                .subject("Chemie")
                .id("2")
                .build();

        studentRepo.save(student2);

        // WHEN & THEN
        assertThrows(StudentNotFoundException.class, () -> {
            studentRepo.findStudentById("2"); // Diese ID existiert nicht und sollte eine Exception auslösen
        });
    }
}