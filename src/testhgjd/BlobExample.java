package testhgjd;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.*;

public class BlobExample {
    public static void main(String[] args) throws SQLException, IOException {
        String url = "jdbc:mysql://localhost:3306/first_lesson";
        String userName = "root";
        String password = "panasonic99";

        try (Connection conn = DriverManager.getConnection(url, userName, password); Statement statement = conn.createStatement()) {
            statement.executeUpdate("create table Images (name varchar(15), d DATE, image BLOB)");
            PreparedStatement preparedStatement = null;
            try {
                BufferedImage image = ImageIO.read(new File("C:\\Users\\cojocari\\Dropbox\\IdeaProjects\\javaStudy\\src\\testhgjd\\smile.png"));
                Blob smile = conn.createBlob();
                try (OutputStream outputStream = smile.setBinaryStream(1)) {
                    ImageIO.write(image, "png", outputStream);
                }
                preparedStatement = conn.prepareStatement("insert into Images (name, d, image) values(?,{d ?},?)");
                preparedStatement.setString(1, "Smile");
                preparedStatement.setDate(2, Date.valueOf("2018-14-17"));
                preparedStatement.setBlob(3, smile);
                preparedStatement.execute();

                ResultSet resultSet = null;
                try {
                    resultSet = preparedStatement.executeQuery("select * from images");
                    while (resultSet.next()) {
                        Blob newSmile = resultSet.getBlob("image");
                        BufferedImage image1 = ImageIO.read(newSmile.getBinaryStream());
                        File outputFile = new File("saved.png");
                        ImageIO.write(image1, "png", outputFile);
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                    if (resultSet != null) {
                        resultSet.close();
                    } else {
                        System.err.println("Error in read from DB");
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                preparedStatement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
