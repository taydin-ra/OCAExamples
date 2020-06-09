package OCAExam2;

public class Util {
    int x;
    static int y;

    public Util(int a, int b){
        this.x = a;
        b = this.y;

    }

    public void print() {
        System.out.println(x + " :" + y);
    }
}

class Test3 {
    public static void main(String[] args) {
        Util u = new Util(100, 200);
        u.x = 300;
        u.y = 400;
       // u.print();
        Util t = new Util(200, 100);
        t.x = 400;
        t.y = 300;
u.print(); // it would be more trickier
        t.print();
    }

}
