public class Notepad {
    public static void main(String[] args) {
        printIdea(new Idea());
        printIdea(new Idea());
    }
    //напишите тут ваш код
    public static class Idea{

        public String getDescription(){
            return "sdf";
        }
    }
    public static void printIdea(Idea idea){
        System.out.println(idea.getDescription());
    }
}

