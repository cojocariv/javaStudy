package JavaBiblioteca;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
    private static int nextID = 1;
    private String name;
    private double salary;
    private int id;
    private Date hireDay;

    public Employee(String n, double s) {
        name = n;
        salary = s;
        id = 0;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        id = nextID;
        nextID++;
    }

    public static int getNextID() {
        return nextID;
    }

    public static void main(String[] args) {
        Employee e = new Employee("Harry", 50000);
        System.out.println(e.getName() + " " + e.getSalary());


    }
}
