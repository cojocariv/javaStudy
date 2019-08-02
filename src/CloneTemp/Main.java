package CloneTemp;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        BigObject bigObject = new BigObject(1, 2);
        ByteArrayOutputStream writeBuffer = new ByteArrayOutputStream();
        ObjectOutputStream outputStream = new ObjectOutputStream(writeBuffer);
        outputStream.writeObject(bigObject);
        outputStream.close();

        byte[] buffer = writeBuffer.toByteArray();
        ByteArrayInputStream readBuffer = new ByteArrayInputStream(buffer);
        ObjectInputStream inputStream = new ObjectInputStream(readBuffer);

        BigObject objectCopy = (BigObject) inputStream.readObject();

    }
}
