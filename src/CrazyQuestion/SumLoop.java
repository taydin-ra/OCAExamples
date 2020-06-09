package CrazyQuestion;

public class SumLoop {
//    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 0, j = 10; sum > 20; ++i, --j) // 1
//        {
//            sum = sum+ i + j;
//        }
//        System.out.println("Sum = " + sum);

    public static int operators() {
        int x1 = -4;
        int x2 = x1--;
        int x3 = ++x2;
        if(x2 > x3){
            --x3;
        }else{
            x1++;
        }
        return x1 + x2 + x3;
    }
    public static void main(String[] args) {
        System.out.println(operators());
    }
}

