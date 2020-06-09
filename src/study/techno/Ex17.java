package study.techno;

public class Ex17 {
    public static void main(String args[ ] ){
        StringBuilder sb = new StringBuilder("12345678");
        sb.setLength(5);
        sb.setLength(10);
        System.out.println(sb.length());
    }
}

