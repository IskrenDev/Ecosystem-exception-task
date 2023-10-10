public class Main {

    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        Student newStudent = Student.builder()
                .name("Florian")
                .subject("Geschichte")
                .build();

        Student student2 = Student.builder()
                .name("Thomas")
                .subject("Chemie")
                .id("2")
                .build();

        Student savedStudent = studentService.addNewStudent(newStudent);
        Student savedStudent2 = studentService.addNewStudent(student2);


        System.out.println("Student saved: " + savedStudent);

        StudentRepo studentRepo = new StudentRepo();

        studentRepo.save(student2);

        System.out.println(studentRepo.findStudentById("2"));
    }
}
