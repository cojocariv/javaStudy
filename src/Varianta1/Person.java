package Varianta1;

import java.util.Random;

public class Person {
    private int age;
    private String status;
    private int salary;
    Random r = new Random();

    Person() {
        age = r.nextInt(100) + 1;
    }

    private void setFieldStatus() {
        if (age < 6) {
            status = "child";
        } else if (age > 6 && age < 19) {
            status = "Schoolchild";
        } else if (age > 19 && age < 25) {
            status = "Student";
        } else if (age > 26 && age < 65) {
            status = "Employee";
        } else {
            status = "Pensioner";
        }
    }

    private void setFieldSalary(String status) {
        if (status.equals("Employee")) {
            salary = r.nextInt((15000 - 5000) + 1) + 5000;
        } else {
            salary = 0;
        }
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        setFieldStatus();
        setFieldSalary(status);
        return String.format("Status: %5s, age: %d, salary: %d", status, age, salary);
    }


}
