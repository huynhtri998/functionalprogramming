package Sorted;

import java.util.Objects;

public class StudentDTO {
    private String name;
    private int age;
    private double score;

    StudentDTO() {}

    public StudentDTO(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return  "StudentDTO{" + "name=" + name + ", age=" + age + ", score=" + score + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (! (obj instanceof StudentDTO))
            return false;
        StudentDTO studentDTO = (StudentDTO) obj;

        return age == studentDTO.age && score == studentDTO.score && name.equals(studentDTO.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, score);
    }
}
