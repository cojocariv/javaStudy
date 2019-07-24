package testhgjd;


import java.io.Serializable;
import java.math.BigDecimal;
import java.rmi.Remote;
import java.util.*;

public class Solution {
    public static Map<String, String> map = new HashMap<>();

    public static void main(String[] args) {
        map.put("vasile", "cojocari");
        map.put("ion", "cojocari");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.printf("the key is: %s, the value is: %s", entry.getKey(), entry.getValue());
        }
    }
}
