package study.techno;

public class Ex24 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i + j > 10)
                    break;
            }
            System.out.println("hello");
        }
    }
}