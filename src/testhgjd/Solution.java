package testhgjd;


import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Solution {
    public static void main(String[] args) {
       /* Animal cat = new Animal("Oriental", 7, 25, 5000);
        Animal dog = new Animal("Labrador", 3, 25, 5000);
        Animal bird = new Animal("King penguin", 73, 25, 5000);
        Animal[] c = {cat, dog, bird};
        Arrays.sort(c);

        for (Animal tmp : c) {
            System.out.println(tmp);
        }*/

        SimpleComparableStudent[] students = {
                new SimpleComparableStudent("Evghenii", 144),
                new SimpleComparableStudent("Andrew", 222),
                new SimpleComparableStudent("Igor", 44)
        };
        Arrays.sort(students);
        for (SimpleComparableStudent student : students) {
            System.out.println(student);
        }

    }
}

class Animal implements Comparable<Animal> {
    String breed;
    int weight;
    int speed;
    int price;

    public Animal(String breed, int weight, int speed, int price) {
        this.breed = breed;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Animal o) {
       /* int tmp = this.speed - o.speed;
        int tmp1 = this.price - o.price;
        int tmp2 = this.weight - o.weight;*/
        if ((this.speed - o.speed) == 0 && (this.price - o.price) == 0) {
            return this.weight - o.weight;
        } else {
            return this.speed - o.speed;
        }

    }
    class ComparatorByWeight implements Comparator{

        @Override
        public int compare(Object o1, Object o2) {
            return
        }
    }
}

class SimpleComparableStudent implements Comparable<SimpleComparableStudent> {

    private String firstName;
    private int group;

    public SimpleComparableStudent(String firstName, int group) {
        this.firstName = firstName;
        this.group = group;
    }

    @Override
    public String toString() {
        return firstName + "  " + group;
    }

    @Override
    public int compareTo(SimpleComparableStudent o) {
        if (this.group > o.group) {
            return 1;
        } else if (this.group < o.group) {
            return -1;
        } else {
            return 0;
        }
    }
}