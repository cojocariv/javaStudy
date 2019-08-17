package testhgjd;

import java.lang.reflect.Type;
import java.sql.*;

public class MainLess {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/first_lesson";
        String userName = "root";
        String password = "panasonic99";

        try (Connection conn = DriverManager.getConnection(url, userName, password)) {
            PreparedStatement prepStat = null;
            try {
                prepStat = conn.prepareStatement("insert into books (name, price) values (?,?)");
                prepStat.setString(1, "Schinder's list");
                prepStat.setDouble(2, 32.5);
                prepStat.execute();
                ResultSet rs = null;
                try {
                    rs = prepStat.executeQuery("select * from books");
                    while (rs.next()) {
                        int id = rs.getInt(1);
                        String name = rs.getString(2);
                        Double price = rs.getDouble(3);
                        System.out.println("Id = " + id + " name = " + name + " price = " + price);
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                    if (rs != null) {
                        rs.close();
                    } else {
                        System.err.println("Error from read DB");
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                prepStat.close();
            }
            CallableStatement callStat = null;
            try {
                callStat = conn.prepareCall("{call booksCount(?)}");
                callStat.registerOutParameter(1, Types.INTEGER);
                callStat.execute();
                System.out.println("Cantitatea de inregistrari in tabel: " + callStat.getInt(1));
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                callStat.close();
            }
        }
    }
}
