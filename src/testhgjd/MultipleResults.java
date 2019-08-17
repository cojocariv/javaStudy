package testhgjd;

import java.sql.*;

public class MultipleResults {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/first_lesson";
        String userName = "root";
        String password = "panasonic99";
        Class.forName("com.mysql.jdbc.Driver");

        try (Connection conn = DriverManager.getConnection(url, userName, password)) {
            CallableStatement callableStatement = null;
            try {
                callableStatement = conn.prepareCall("{call  tablesCount}");
                boolean hasResults = callableStatement.execute();
                ResultSet resultSet = null;
                try {
                    while (hasResults) {
                        resultSet = callableStatement.getResultSet();
                        while (resultSet.next()) {
                            System.out.println("Cantitatea inregistrarilor in tabel: " + resultSet.getInt(1));
                        }
                        hasResults = callableStatement.getMoreResults();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                    if (resultSet != null) {
                        resultSet.close();
                    } else {
                        System.err.println("Read error from DB");
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                callableStatement.close();
            }
        }
    }
}
