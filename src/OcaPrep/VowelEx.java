package OcaPrep;

public class VowelEx {
    static char var;

    public static void main(String[] args) {

        char var1='a';
        char var2= var1;
        var2='e';

        VowelEx obj1= new VowelEx();
        VowelEx obj2=new VowelEx();

        obj2.var='o';
        obj1.var='i';

        System.out.println(var1+" ,"+ var2);
        System.out.println(obj1.var+ " , "+ obj2.var);
    }
}
