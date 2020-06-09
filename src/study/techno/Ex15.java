package study.techno;

public class Ex15 {
    int a = 0;
    static int b;

    public int Lol(int sum) {
        while (a < 5) {
            b++;
            a++;
        }
        return b;
    }

    public static void main(String[] args) {
        Ex15 exam1 = new Ex15();
        exam1.Lol(2);
        Ex15 exam2 = new Ex15();
        exam2.Lol(3);
        System.out.println(exam1.b + " " + exam2.b);
    }
}