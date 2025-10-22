package Sorted;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    private static List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("James",20,8.0));
        students.add(new Student("Anne",22,9.0));
        students.add(new Student("Mary",21,5.0));
        students.add(new Student("David",18,7.0));
        students.add(new Student("Dave",19,6.0));
        return students;
    }

    static void main() {
        List<Student> students = getStudents();
        List<Student> fillteredStudent =
                students
                        .stream()
                        .filter(student -> student.getScore() > 7.0)
                        .sorted((Comparator.comparing(Student::getName).thenComparing(Student::getAge).reversed()))
                        .toList();
        System.out.println("Student List:" + fillteredStudent);
    }
}
