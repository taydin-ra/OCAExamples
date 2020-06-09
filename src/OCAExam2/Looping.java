package OCAExam2;

public class Looping {
    public static void main(String[] args) {


//        int i = 0, j = 5;
//        lab1:
//        for (; ; i++) {
//            for (; ; --j)
//                if (i > j) break lab1;
//        }
//        System.out.println(" i = " + i + ", j = " + j);
//
//        String str1 = "one";
//        String str2 = "two";
//        System.out.println(str1.equals(str1 = str2));


    }


    int[][] matrix = new int[2][3];
    int a[] = {1, 2, 3};
    int b[] = {4, 5, 6};

    public int compute(int x, int y) {
//1 : Insert Line of Code here
        return a[x]*b[y];
    }

    public void loadMatrix() {
        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix[x].length; y++) {
//2: Insert Line of Code here
                matrix[x][y] = compute(x, y);
            }
        }
    }
}

