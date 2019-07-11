package Examen;

import java.io.IOException;

public class ExecSession {
    public static void main(String[] args)throws IOException {
        Student st = new Student(2);
        st.showStudent();
        Group gr = new Group();
        gr.showGroup();
    }
}
