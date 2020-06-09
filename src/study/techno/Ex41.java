package study.techno;

public class Ex41 {
    public static void main(String[] args) {


        outer:
        //note that, if outer is not here does not compile
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                if (i == j) {
                    continue outer;
                }
                System.out.println("i=" + i + " , j=" + j);
            }
        }
    }
}