import com.sun.deploy.util.ArrayUtil;
import sun.util.BuddhistCalendar;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.rmi.RemoteException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestClass {
    String name;
    boolean isCollarPutOn;
    boolean isLeashPutOn;
    boolean isMuzzlePutOn;

    public TestClass(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        TestClass test5 = new TestClass("muhtar");
        test5.putCollar();
        test5.putMuzzle();
        test5.putLeash();
        try {
            test5.walk();
        } catch (DogIsNotReadyException e){
            System.out.println(e);
            System.out.println("Проверяем снаряжение! Ошейник надет? " + test5.isCollarPutOn + "\r\n Поводок надет? "
                    + test5.isLeashPutOn + "\r\n Намордник надет? " + test5.isMuzzlePutOn);
        }

    }

    public void putCollar() {
        System.out.println("Osheinik odet");
        this.isCollarPutOn = true;
    }

    public void putLeash() {
        System.out.println("Povodok nadet");
        this.isLeashPutOn = true;
    }

    public void putMuzzle() {
        System.out.println("Namordnik nadet");
        this.isMuzzlePutOn = true;
    }

    public void walk() throws DogIsNotReadyException {
        System.out.println("Sobiraemsia na progulku");
        if (isCollarPutOn && isLeashPutOn && isMuzzlePutOn) {
            System.out.println("Ura idem guleati " + name + " Ocheni rad!");
        } else {
            throw new DogIsNotReadyException("the dog " + name + " is not ready to walk");
        }
    }

    public class DogIsNotReadyException extends Exception {
        public DogIsNotReadyException(String message) {
            super(message);
        }
    }
}

