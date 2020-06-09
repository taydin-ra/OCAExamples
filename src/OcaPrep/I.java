package OcaPrep;


class C2{
    public void displayC2(){
        System.out.println("C2");
    }

}
public interface I {

    public void displayI();

}

class C1 extends C2 implements I{

    @Override
    public void displayI() {

        System.out.println("C1");

    }


}