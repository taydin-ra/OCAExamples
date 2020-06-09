package study.techno;

public class Ex21 {
    String a = "x";
    static char b = 'x';
    String c = "x";

    class Inner{
        String a = "y";
        String get(){
            String c = "temp";
// Line 1
           // c = "" + Ex21.b;
           // c=Ex21.this.a;
            c=" "+b;
            return c;
        }
    }
    Ex21() {
        System.out.println( new Inner().get() );
    }
    public static void main(String args[]) {
        new Ex21();
    }
}

