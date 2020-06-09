package OCAExam2;

import java.util.ArrayList;

public class ProductQ {
//    String myStr = "7007";
//
//    public void doStuff(String str) {
//        int myNum = 0;
//        try {
//            String myStr = str;
//            myNum = Integer.parseInt(myStr);
//        } catch (NumberFormatException ne) {
//            System.err.println("Error");
//        }
//        System.err.println("myStr: " + myStr + ", myNum: " + myNum);
//    }
//    public static void main(String[] args) {
//        ProductQ obj = new ProductQ();
//        obj.doStuff("9009");
//    }
public static void main(String[] args) {


        ArrayList<Integer> points = new ArrayList<>();
        points.add(1);
        points.add(2);
        points.add(3);
        points.add(4);
        points.add(null);
        points.remove(2);
        points.remove(null);
        System.out.print(points);
    }
}


