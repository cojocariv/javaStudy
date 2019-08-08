package testhgjd;

import java.io.*;
import java.nio.file.FileSystemException;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;


public class Solution {
    public static void main(String[] args) {

        long count = IntStream.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5).filter(w -> w > 0).count();
        System.out.println(count);

    }
}

