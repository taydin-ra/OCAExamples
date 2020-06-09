package study.techno;

public class Ex30 {

    char c;
    public void m1() {
        char[ ] cA = { 'a' , 'b'};
        m2(c, cA);
        System.out.println( ( (int)c) + "," + cA[1] );
    }
    public void m2(char c, char[ ] cA) {
        c = 'b';
        cA[1] = cA[0] = 'm';
    }
    public static void main(String args[]){
        new Ex30().m1();
    }
}
