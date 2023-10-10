import java.util.*;

public class StudentRepo {

    private final Map<String, Student> students = new HashMap<>();

    public List<Student> getAllStudents() {
        return new ArrayList<>(students.values());
    }

    public Student save(Student student) {
        students.put(student.id(), student);
        return student;
    }

    public Student findStudentById(String id) {
        if (students.get(id) == null) {
            throw new StudentNotFoundException("Student Id not found!");
        }
        return students.get(id);
    }
}
