package testhgjd;


public class Solution {
    private static String name;

    Solution(String name) {
        this.name = name;
    }

    private static String getName() {
        return name;
    }

    private void sout() {
        new Solution("The Darkside Hacker") {
            void printName() {
                System.out.println(getName());
            }
        }.printName();
    }

    public static void main(String[] args) {
        new Solution("Риша").sout();
    }
}

