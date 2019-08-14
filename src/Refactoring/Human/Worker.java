package Refactoring.Human;

public class Worker extends Human {
    private double salary;
    private String company;
    private Soldier soldier;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Worker(String name, int age) {
        super(name, age);
    }

    public void live() {
        soldier.live();
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Soldier getSoldier() {
        return soldier;
    }
}
