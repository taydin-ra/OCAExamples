package study.techno;

public class Ex14 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = x++;
        int a = --y;
        int b = z--;
        b += ++z;

        System.out.println(b);
    }
}