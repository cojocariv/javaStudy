package testhgjd;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class Solution {
/*
    public static void main(String[] args) throws SQLException, IOException {
        read();*/
      /*  String url = "jdbc:mysql://localhost:3306/first_lesson";
        String userName = "root";
        String password = "panasonic99";

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Nu exista baza de date");
        }*/

        /*

        try (Connection conn = DriverManager.getConnection(url, userName, password);
             BufferedReader sqlFile = new BufferedReader(new FileReader("C:\\Users\\cojocari\\Dropbox\\IdeaProjects\\javaStudy\\src\\testhgjd\\books"));
             Scanner scan = new Scanner(sqlFile);
             Statement statement = conn.createStatement()) {

            String line = "";

            while (scan.hasNextLine()) {
                line = scan.nextLine();
                if (line.endsWith(";")) {
                    line = line.substring(0, line.length() - 1);
                }
                statement.executeUpdate(line);
            }
            ResultSet rs = null;

            try {
                rs = statement.executeQuery("SELECT * FROM Books");
                while (rs.next()) {
                    int id = rs.getInt(1);
                    String name = rs.getString(2);
                    double price = rs.getDouble(3);
                    System.out.println("Id = " + id + " name= " + name + " price= " + price);
                }
            } catch (SQLException ex) {
                System.err.println("SQLException message: " + ex.getMessage());
                System.err.println("SQLException SQL state: " + ex.getSQLState());
                System.err.println("SQLException error code: " + ex.getErrorCode());
            } finally {
                if (rs != null) {
                    rs.close();
                }else {
                    System.err.println("Error read data from DB");
                }
            }

        }
        */
/*
    }
    public static void read() throws SQLException, FileNotFoundException {
        String url = "jdbc:mysql://localhost:3306/first_lesson";
        String userName = "root";
        String password = "panasonic99";

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Nu exista baza de date");
        }
        Connection conn = DriverManager.getConnection(url, userName, password);
        BufferedReader sqlFile = new BufferedReader(new FileReader("C:\\Users\\cojocari\\Dropbox\\IdeaProjects\\javaStudy\\src\\testhgjd\\books"));
        Scanner scan = new Scanner(sqlFile);
        Statement statement = conn.createStatement();
        ResultSet rs = null;

        try {
            rs = statement.executeQuery("SELECT * FROM Books");
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                double price = rs.getDouble(3);
                System.out.println("Id = " + id + " name= " + name + " price= " + price);
            }
        } catch (SQLException ex) {
            System.err.println("SQLException message: " + ex.getMessage());
            System.err.println("SQLException SQL state: " + ex.getSQLState());
            System.err.println("SQLException error code: " + ex.getErrorCode());
        } finally {
            if (rs != null) {
                rs.close();
            }else {
                System.err.println("Error read data from DB");
            }
        }
    }
}
*/
}