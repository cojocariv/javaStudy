package InterfacesEx;

public class Solution {
    //добавьте классы Goose и Dragon тут

    public static void main(String[] args) {
        Dragon drag = new Dragon();
        String s = drag.getSize();
        System.out.println(s);
        Goose gus = new Goose();
        System.out.println(gus.getSize());
    }

    public static class BigAnimal {
        protected String getSize() {
            return "как динозавр";
        }

    }

    public static class SmallAnimal {
        String getSize() {
            return "как кошка";
        }
    }

    public static class Goose extends SmallAnimal {
        @Override
        public String getSize() {
            return "Гусь маленький, " + super.getSize();
        }
    }

    public static class Dragon extends BigAnimal {
        @Override
        public String getSize() {
            return "Дракон большой, " + super.getSize();
        }
    }
}

