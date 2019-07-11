package Serializatia;

import Wine.Wine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Formatter;
import java.util.HashSet;

/*
Определяем адрес сети
1. Даны IP-адрес и маска подсети, необходимо вычислить адрес сети — реализуй метод getNetAddress.
Используйте операцию поразрядной конъюнкции (логическое И).
Пример:
IP-адрес: 11000000 10101000 00000001 00000010 (192.168.1.2)
Маска подсети: 11111111 11111111 11111110 00000000 (255.255.254.0)
Адрес сети: 11000000 10101000 00000000 00000000 (192.168.0.0)
2. Реализовать метод print, который выведет в консоль данные в двоичном коде. Для IP-адреса(192.168.1.2)
должна быть выведена строка «11000000 10101000 00000001 00000010»
3. Метод main не участвует в тестировании
Требования:
1. Метод getNetAddress должен вычислять и возвращать адрес сети согласно переданным параметрам
(IP-адрес и маска подсети).
2. Метод getNetAddress должен быть статическим и публичным.
3. Метод print должен быть статическим и публичным.
4. Метод print должен преобразовывать переданный ему IP адрес в двоичный код и выводить на экран(как в условии).
*/
public class Solution {
    int a;
    public Solution(int a){
        this.a = a;
    }
    public static void main(String[] args) throws IOException {
     /*   int classModifiers = Solution.class.getModifiers();
        System.out.println(isModifierSet(classModifiers, Modifier.PUBLIC));   //true
        System.out.println(isModifierSet(classModifiers, Modifier.STATIC));   //false

        int methodModifiers = getMainMethod().getModifiers();
        System.out.println(isModifierSet(methodModifiers, Modifier.STATIC));   */   //true
        HashSet<Solution> set = new HashSet<>();
        Solution s1 = new Solution(5);
        Solution s2 = new Solution(6);
set.add(s1);
set.add(s2);



    }

    public static boolean isModifierSet(int allModifiers, int specificModifier) {
        return false;
    }

    private static Method getMainMethod() {
        Method[] methods = Solution.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().equalsIgnoreCase("main")) return method;
        }

        return null;
    }
}