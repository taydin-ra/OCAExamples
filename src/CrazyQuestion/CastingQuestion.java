package CrazyQuestion;

class Crazy {

}

class C2 {
    public void displayC2() {
        System.out.println("C1");
    }

}

class C1 extends C2 implements I {

    @Override
    public void displayI() {
        System.out.println("C1");

    }

}

class calling {
    public static void main(String[] args) {
        C2 obj1 = new C1();  // polymorphism
        I obj2 = new C1();

        C2 s = obj2;  // you can't create an object from the interface
        I t = obj2;    // it is pointing  the same thing whatever C1 points
        s.displayC2();
        t.displayI();


    }
}