package study.techno;

import com.sun.tools.javac.resources.javac;

public class Ex2 {
    protected int t=5;
    public static void main(String[] args) {


        int x = 1;
        int a = 0;

        if (++x > ++a) {
            System.out.println("Hello");
        } else {
            System.out.println("Welcome");
        }
    }
}