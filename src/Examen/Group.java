package Examen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Group {
    private String groupCode; //name of group;
    private int quantityStud; //kolichestvo studentov
    private int quantityExam; //kolichestvo examenov
    private Student[] st;     //ssilka na massiv studentov
    private double[] avScore; //ssilka na massiv uspevaemosti po distipline;

    public Group() throws IOException {
        readGroupCode();
        readQtyStud();
        readQtyExam();
        createArrayStudents();
        calcArrayScore();
    }

    private void readGroupCode() throws IOException{
        System.out.println("\nInsert the group code");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        groupCode = reader.readLine();
    }

    private void readQtyStud() throws IOException{
        System.out.println("Insert quantity of students: ");
        quantityStud = Get.Int(3, 23);
    }

    private void readQtyExam(){
        System.out.println("Insert quantity of exams: ");
        quantityExam = Get.Int();
    }

    private void createArrayStudents(){

    }

    private void calcArrayScore(){

    }

    private void clearScreen(){
        System.out.print("\u000c");
    }

    public void showGroup(){
        clearScreen();
        System.out.println();

    }
}
