package Hippodrome;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Hippodrome {
    private List<Horse> horses;
    static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public static void main(String[] args) {
        game = new Hippodrome(new ArrayList<Horse>());
        game.getHorses().add(new Horse("horse1", 3, 0));
        game.getHorses().add(new Horse("horse2", 3, 0));
        game.getHorses().add(new Horse("horse3", 3, 0));
        game.run();
        game.printWinner();


    }

    public void run() {
        for (int i = 1; i <= 100; i++) {
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void move() {
        for (int i = 0; i < getHorses().size(); i++) {
            getHorses().get(i).move();
        }
    }

    public void print() {
        for (int i = 0; i < getHorses().size(); i++) {
            getHorses().get(i).print();
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println();
        }
    }

    public Horse getWinner() {
        return horses.stream().max(Comparator.comparing(Horse::getDistance)).orElse(null);
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }
}
