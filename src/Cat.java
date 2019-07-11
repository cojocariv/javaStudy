import com.sun.deploy.panel.AbstractRadioPropertyGroup;

import java.util.ArrayList;


public class Cat {
    //напишите тут ваш код
    public static ArrayList<Cat> cats = new ArrayList<>();
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            cats.add(new Cat("asd" + i));
            System.out.println(cats);
        }




        //напишите тут ваш код
        //cats = new ArrayList<Cat>();


//        Cat cat2 = new Cat();
//        cats.add(cat2);
//
//        Cat cat3 = new Cat();
//        cats.add(cat3);
//
//        Cat cat4 = new Cat();
//        cats.add(cat4);
//
//        Cat cat5 = new Cat();
//        cats.add(cat5);
//
//        Cat cat6 = new Cat();
//        cats.add(cat6);
//
//        Cat cat7 = new Cat();
//        cats.add(cat7);
//
//        Cat cat8 = new Cat();
//        cats.add(cat8);
//
//        Cat cat9 = new Cat();
//        cats.add(cat9);
//
//        Cat cat10 = new Cat();
//        cats.add(cat10);


    }

    public static void printCats() {
        //напишите тут ваш код


    }
}



