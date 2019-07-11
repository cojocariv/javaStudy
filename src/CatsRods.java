import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 Задача: У каждой кошки есть имя и кошка-мама.
 Создать класс, который бы описывал данную ситуацию.
 Создать два объекта: кошку-дочь и кошку-маму.
 Вывести их на экран.

 Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама.
 Изменить класс Cat так, чтобы он мог описать данную ситуацию.
 Создать 6 объектов: дедушку (папин папа), бабушку (мамина мама), папу, маму, сына, дочь.
 Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.
*/
public class CatsRods {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother);

        System.out.println(catMother);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parent;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent) {
            this.name = name;
            this.parent = parent;
        }

        @Override
        public String toString() {
            if (parent == null)
                return "The cat's name is " + name + ", no mother ";
            else
                return "The cat's name is " + name + ", mother is " + parent.name;
        }
    }

}

