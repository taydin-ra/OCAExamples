package study.techno;

public class Ex44 {
    public static void main(String[] args) {


        int n1 = 188;
        int[][] n2 = {{1, 2, 3, 4, 5}, {6, 7}};
        for (int k1 = 0; k1 < n2.length; k1++) {
            for (int k2 = 0; k2 < n2[k1].length; k2++) {
                n2[k1][k2] = n1;
            }
        }
        for (int[] n3 : n2) {
            for (int n4 : n3) {
                System.out.println(n4);
            }
        }
    }
}