package Chat.client;

import Chat.Connection;
import Chat.ConsoleHelper;
import Chat.Message;
import Chat.MessageType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Client {
    protected Connection connection;
    private volatile boolean clientConnected = false;

    protected String getServerAddress() throws IOException {
        String serverAddress;
        ConsoleHelper.writeMessage("Enter server address to start");
        serverAddress = ConsoleHelper.readString();
        return serverAddress;
    }

    public static void main(String[] args) throws IOException {
        Client client = new Client();
        client.run();
    }

    protected int getServerPort() throws IOException {
        ConsoleHelper.writeMessage("Enter server port: ");
        return ConsoleHelper.readInt();
    }

    protected String getUserName() throws IOException {
        ConsoleHelper.writeMessage("Enter your name for access to char room: ");
        return ConsoleHelper.readString();
    }

    protected boolean shouldSendTextFromConsole() {
        return true;
    }

    protected SocketThread getSocketThread() {
        return new SocketThread();
    }

    protected void sendTextMessage(String text) {
        try {
            connection.send(new Message(MessageType.TEXT, text));
        } catch (IOException e) {
            ConsoleHelper.writeMessage("A connection fails to send your message");
            clientConnected = false;
        }
    }

    public void run() throws IOException {
        SocketThread socketThread = getSocketThread();
        socketThread.setDaemon(true);
        socketThread.start();
        try {
            synchronized (this) {
                wait();
            }
        } catch (InterruptedException e) {
            ConsoleHelper.writeMessage("Error of stream...");
            System.exit(1);
        }
        if (clientConnected) {
            ConsoleHelper.writeMessage("Connection is established. For exit enter 'exit'");
            while (clientConnected) {
                String message = ConsoleHelper.readString();
                if (message.equalsIgnoreCase("exit")) {
                    break;
                } else {
                    if (shouldSendTextFromConsole()) {
                        sendTextMessage(message);
                    }
                }
            }
        }else {
            ConsoleHelper.writeMessage("Error");
        }

    }

    public class SocketThread extends Thread {

    }
}
