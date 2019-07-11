package ArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class ListRunner {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        ToDoList list = new ToDoList();
        printOut();
        boolean continueLoop = true;
        do {
            try {
                int param = Integer.parseInt(reader.readLine());
                while (param != 0) {
                    switch (param) {
                        case 1:
                            System.out.println("please enter a task to add");
                            String task1 = reader.readLine();
                            list.addToList(task1);
                            System.out.println("Please choose an action by typing [0-6]");
                            param = Integer.parseInt(reader.readLine());
                            break;
                        case 2:
                            System.out.println("Print out ToDoList");
                            list.printToDoList();
                            System.out.println("Please choose an action by typing [0-6]");
                            param = Integer.parseInt(reader.readLine());
                            break;
                        case 3:
                            System.out.println("Please enter an item to update");
                            int i = Integer.parseInt(reader.readLine());
                            System.out.println("Please enter a new task");
                            String task3 = reader.readLine();
                            list.changeTask(i, task3);
                            System.out.println("Please choose an action by typing [0-6]");
                            param = Integer.parseInt(reader.readLine());
                            break;
                        case 4:
                            System.out.println("Please enter a task to remove");
                            String task4 = reader.readLine();
                            list.removeTask(task4);
                            System.out.println("Please choose an action by typing [0-6]");
                            param = Integer.parseInt(reader.readLine());
                            break;
                        case 5:
                            System.out.println("Please enter a task to get priority");
                            String task5 = reader.readLine();
                            System.out.println("Priority of the task is: " + list.getTaskPriority(task5));
                            System.out.println("Please choose an action by typing [0-6]");
                            param = Integer.parseInt(reader.readLine());
                            break;
                        case 6:
                            System.out.println("Please enter a number of position for the task");
                            int index = Integer.parseInt(reader.readLine());
                            System.out.println("Please enter a new task");
                            String task6 = reader.readLine();
                            list.addToListPosition(index, task6);
                            System.out.println("Please choose an action by typing [0-6]");
                            param = Integer.parseInt(reader.readLine());
                            break;
                        default:
                            param = 0;
                    }
                }
                continueLoop = false;
            } catch (NumberFormatException e) {
                System.out.println("Ati introdus litera");
            }
        } while (continueLoop);
        System.out.println("Try catch block finished");
    }

    public static void printOut() {
        System.out.println("Please choose an action. Press: \n"
                + "1 to add a new item into ToDoList\n"
                + "2 to print out the list\n"
                + "3 to update an existing item\n"
                + "4 to remove an item from the list\n"
                + "5 to get task priority or number in the list\n"
                + "6 to add a new item at specific position\n"
                + "press 0 for exit\n\n"
                + "After choosing an option please press enter");
    }
}
