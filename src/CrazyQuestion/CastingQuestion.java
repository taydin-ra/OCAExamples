package CrazyQuestion;

class Crazy {

}

class C2 implements I {
    public void displayC2() {
        System.out.println("C1");
    }

    public void displayI() {
        System.out.println("smt");
    }
}

class C1 extends C2 implements I {

    @Override
    public void displayI() {
        System.out.println("c1");

    }

    public void displayC1() {

    }
}

class calling {
    public static void main(String[] args) {
        C2 obj1 = new C1();
        I obj2 = new C1();
        C2 s = obj1;
        I t = obj2;
        s.displayC2();
        t.displayI();


    }
}