package Timer;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.Timer;

public class TimerTest {
    public static void main(String[] args) {
        ActionListener listener = new TimePrinter();


        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
