package Sorted;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("James",22,8.0));
        students.add(new Student("James",22,9.0));
        students.add(new Student("Mary",21,7.0));
        students.add(new Student("David",18,7.0));
        students.add(new Student("Dave",19,9.0));
        return students;
    }

    static void main() {
        List<Student> students = getStudents();
        List<StudentDTO> studentDTOS =
                students
                        .stream()
                        .filter(student -> student.getScore() > 7.0)
                        .sorted((Comparator.comparing(Student::getName).thenComparing(Student::getAge).reversed()))
                        .map(student -> new StudentDTO(student.getName(), student.getAge(), student.getScore()))
                        .distinct().toList();

        double totalScore = students.stream().map(Student::getScore).reduce(0.0, Double::sum);

        Map<Double, Optional<Student>> groupedStudents = students.stream()
                .collect(Collectors.groupingBy(Student::getScore, Collectors.maxBy(Comparator.comparing(Student::getAge))));

        Map<Double, List<String>> groupedStudentWithName = students.stream()
                .collect(Collectors.groupingBy(Student::getScore, Collectors.mapping(Student::getName, Collectors.toList())));
        System.out.println("Student List:" + groupedStudentWithName);
    }

    public static double sum (double total , Student student2) {
        return total + student2.getScore();
    }
}
