package OCAExam2;

public class Q119 {
    public static void main(String[] args) {
//        int x=5;
//
//        while(isAvailable(x)){
//            System.out.println(x);
//            x--;
//        }
//    }
//
//    public static boolean isAvailable(int x){
//       return  x-- > 0 ? true: false;
//    }

        int[] arr = {10, 20, 30, 40, 50};

        int x = arr.length;

        while (x > 0) {
            System.out.println(arr[--x]);
        }
    }
}
