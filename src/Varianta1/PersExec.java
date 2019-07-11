package Varianta1;

public class PersExec {
    public static void main(String[] args) {
        Person[] p = new Person[15];
        for (int i = 0; i < p.length; i++) {
            p[i] = new Person();
        }
        showArray(p);
        calcStud(p);
        calcPens(p);
    }

    public static void showArray(Person p[]) {
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }
    }

    public static void calcStud(Person p[]) {
        int count = 0;
        for (int i = 0; i < p.length; i++) {
            if (p[i].getAge() > 19 && p[i].getAge() < 25) {
                count++;
            }
        }
        System.out.println("\nThe quantity of students are: " + count);
    }

    public static void calcPens(Person p[]) {
        int count = 0;
        for (int i = 0; i < p.length; i++) {
            if (p[i].getAge() > 65 && p[i].getAge() < 101) {
                count++;
            }
        }
        System.out.println("\nThe quantity of pensioner are: " + count);
    }


}
