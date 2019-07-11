


public class ThreeStaticVariables {
    public static String name;


    public static class Cat {
        public static String name;
    }

    public static class Dog {
        public static String name;
        Dog(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
       Dog bim = new Dog("Bim");
        System.out.println(bim.name);

    }
}