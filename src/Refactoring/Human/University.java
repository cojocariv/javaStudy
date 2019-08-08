package Refactoring.Human;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class University {
    private String name;
    private int age;
    private List<Student> students = new ArrayList<>();

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

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public University(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student getStudentWithAverageGrade(double averageGrade) {

        for (Student student : students) {
            if (student.getAverageGrade() == averageGrade) {
                return student;
            }
        }
        return null;
    }

    public Student getStudentWithMaxAverageGrade() {
        return Collections.max(students, Comparator.comparingDouble(Student::getAverageGrade));
    }

    Student getStudentWithMinAverageGrade(){
        double minGrade = students.get(0).getAverageGrade();
        for (Student student : students) {
            double currentGrade = student.getAverageGrade();
            if (currentGrade < minGrade) {
                minGrade = currentGrade;
            }
        }
        return getStudentWithAverageGrade(minGrade);
    }

    void expel(Student student){
        students.remove(student);
    }
}