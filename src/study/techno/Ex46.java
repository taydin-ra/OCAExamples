package study.techno;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Ex46 {

    //    public int a = 100;
//    static int b = 200;
    public static void main(String[] args) {
        List colors = new ArrayList();

        colors.add("green");
        colors.add("yellow");
        colors.add("blue");
        colors.add("red");
        colors.remove(2);
        colors.add(3, "cyan");
        System.out.println(colors);
    }
}