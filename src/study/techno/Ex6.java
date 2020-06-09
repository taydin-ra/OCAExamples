package study.techno;

public class Ex6 {
    public static void main(String[] args) {


        int[][] arr = new int[2][];

        arr[0] = new int[2];

        arr[1] = new int[5];

        int number = 97;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = number;
                number++;


                System.out.println(arr[i][j]);
            }
        }
    }
}