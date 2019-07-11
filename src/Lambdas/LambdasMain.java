package Lambdas;

import java.util.Arrays;

public class LambdasMain {
    public static void main(String[] args) {

        String[] colours = {"green", "brown", "black", "blue", "pink", "grey"};

        Player player1 = new Player("Alex", 100);
        Player player2 = new Player("Igor", 300);
        Player player3 = new Player("John", 200);

        Arrays.sort(colours, (String s1, String s2) -> s1.charAt(s1.length()-1) - s2.charAt(s2.length()-1));
        for (int i = 0; i < colours.length; i++) {
            System.out.println(colours[i]);
        }


    }

    private static class Player {
        private String name;
        private int score;

        public Player(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public int getScore() {
            return score;
        }
    }


}

