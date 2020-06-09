package OCAExam2;

public class Testttt {

    public static int stVar = 100;

    public int var = 200;

    public String toString() {

        return var + ":" + stVar;
    }

    public static void main(String[] args) {

        Testttt t1 = new Testttt();

        t1.var = 300;


        System.out.println("t1: " + t1);

        Testttt t2 = new Testttt();


        t2.stVar = 300;

        System.out.println("t2: " + t2);
    }
}
