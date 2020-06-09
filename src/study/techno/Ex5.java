package study.techno;

public class Ex5 {

    public static void main(String[] args) {
        rom: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i + j > 10)
                    break  rom;
            }
            System.out.println("hello");
        }
    }
}

