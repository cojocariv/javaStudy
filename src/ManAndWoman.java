/**
 * 1. Внутри класса Solution создай public static классы Man и Woman.
 * <p/>
 * 2. У классов должны быть поля: name (String), age (int), address (String).
 * <p/>
 * 3. Создай конструкторы, в которые передаются все возможные параметры.
 * <p/>
 * 4. Создай по два объекта каждого класса со всеми данными используя конструктор.
 * <p/>
 * 5. Объекты выведи на экран в таком формате: name + " " + age + " " + address
 */
public class ManAndWoman {
    public static void main(String[] args) {

        Man man1 = new Man("Valera", 32, "Chisinau");
        Man man2 = new Man("Ion", 20, "Nisporeni");

        Woman women1 = new Woman("Tatiana", 27, "Chisinau");
        Woman women2 = new Woman("Frasina", 32, "Varzaresti");

        System.out.println(man1.toString());
        System.out.println(man2.toString());
        System.out.println(women1.toString());
        System.out.println(women2.toString());
        Woman woman3 = new Woman("Vera");
        System.out.println(woman3.propozitia());

    }

    public static class Man {
        protected String name;
        protected int age;
        protected String address;

        Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        Man(String name) {
            this.name = name;
        }

        public String propozitia() {
            return name;
        }

        public String toString() {
            return name + " " + age + " " + address;
        }

    }


    public static class Woman extends Man {

        public Woman(String name, int age, String address) {
            super(name, age, address);
        }

        Woman(String name) {
            super(name);
        }
    }
}

