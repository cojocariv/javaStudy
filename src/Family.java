public class Family {
    public static void main(String[] args) {

Human nina = new Human("Nina", false, 58);
Human gheorghe = new Human("Gheorghe", true, 60);
Human valea = new Human("Valea", false, 55);
Human andrei = new Human("Andrei", false, 56);

Human vasea = new Human("vasea", true, 30, gheorghe, nina);
Human ion = new Human("vasea", true, 30, gheorghe, nina);
Human tanea = new Human("vasea", true, 30, valea, andrei);
Human lena = new Human("vasea", true, 30, valea, andrei);
Human marusea = new Human("vasea", true, 30, valea, andrei);

        System.out.println(nina);
        System.out.println(gheorghe);
        System.out.println(valea);
        System.out.println(andrei);
        System.out.println(vasea);
        System.out.println(ion);
        System.out.println(tanea);
        System.out.println(lena);
        System.out.println(marusea);
    }



    public static class Human {
        // напишите тут ваш код
       private String name;
       private boolean sex;
       private int age;
       private Human father;
       private Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}
