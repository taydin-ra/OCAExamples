package OcaPrep;

public class StringConcat {
    public static void main(String[] args) {
//        String ta="A";
//        ta=ta.concat("B");
//        String tb="C";
//        ta=ta.concat(tb);
//        ta.replace('C','D');
//        ta=ta.concat(tb);
//        System.out.println(ta);

        String s="Tugba";
        String a= s.substring(5);
        System.out.println(a);

        int[][] arr = {{1, 2}, {3, 4}};
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int y : arr[i]) {


                System.out.println(y);
            }
        }
    }
}