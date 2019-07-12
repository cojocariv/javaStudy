package Zmeika;

import java.util.ArrayList;
import java.util.regex.Matcher;

public class Room {
    private int width, height;
    private Snake snake;
    private Mouse mouse;
    public static Room game;

    public Room(int width, int height, Snake snake) {
        this.width = width;
        this.height = height;
        this.snake = snake;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Snake getSnake() {
        return snake;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    void run() {

    }

    void print() {
        int[][] matrix = new int[height][width];
        int headX = snake.getSections().get(0).getX();
        int headY = snake.getSections().get(0).getY();
        int mouseX = mouse.getX();
        int mouseY = mouse.getY();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {

                if (i == (headY) && j == (headX)) { //HEAD
                    matrix[i][j] = 2;
                }

                for (int k = 1; k < snake.getSections().size(); k++) {
                    int elemX = snake.getSections().get(k).getX();
                    int elemY = snake.getSections().get(k).getY();

                    if (i == (elemY) && j == (elemX)) { //ELEM
                        matrix[i][j] = 1;
                    }
                }

                if (i == (mouseY) && j == (mouseX)) { //MOUSE
                    matrix[i][j] = 3;
                }

            }

        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (matrix[i][j] == 1) {
                    System.out.print('x');
                } else if (matrix[i][j] == 2) {
                    System.out.print('X');
                } else if (matrix[i][j] == 3) {
                    System.out.print('^');
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }


    }

    public void createMouse() {
        int x = (int) (Math.random() * width);
        int y = (int) (Math.random() * height);

        mouse = new Mouse(x, y);
    }

    public void eatMouse() {
        createMouse();
    }

    public void sleep() throws InterruptedException {
        if (snake.getSections().size() > 15) {
            Thread.sleep(200);
        } else {
            Thread.sleep(520 - (20 * snake.getSections().size()));
        }
    }

    public static void main(String[] args) {
        Snake snake = new Snake(2, 3);
        game = new Room(3, 4, snake);
        snake.setDirection(SnakeDirection.DOWN);
        game.createMouse();
        game.run();
    }
}