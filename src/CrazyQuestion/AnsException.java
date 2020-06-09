package CrazyQuestion;

import java.io.IOException;

public class AnsException {

   // public void name(String filename) throws IOException{


    public static void main(String[] args) {
        int ans=0;
        int a=5;
        try{

            int b=0;
            int c=a/b;
        } catch (ArithmeticException e){
            ans = 7;
        } catch (Exception e){
            System.out.println("he");
        }
        System.out.println(ans);
    }
}
