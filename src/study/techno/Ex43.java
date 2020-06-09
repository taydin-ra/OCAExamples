package study.techno;

public class Ex43 {

    static int number = 8; //10
    public static void setInt(int a){
        a = number;
    }
    public static void main(String[] args) {
        Ex43 a = null;
        a.number = 10;
        Ex43.setInt(20);
        System.out.println(number);
    }
}
