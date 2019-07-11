package Level8Lesson11;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {


    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        //напишите тут ваш код. step 3 - пункт 3
        cats.remove(cats.toArray()[0]);


        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<>();
        Cat cat = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        cats.add(cat);
        cats.add(cat2);
        cats.add(cat3);
        return cats;

    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for (Cat c : cats) {
            System.out.println(c.toString());
        }
    }

    public static class Cat {

    }

    // step 1 - пункт 1
}
