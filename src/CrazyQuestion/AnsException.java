package CrazyQuestion;

import java.io.IOException;

public class AnsException {

    // public void name(String filename) throws IOException{


    public static void main(String[] args) {
        int ans = 0;

        try {
            int a = 5;
            int b = 0;
            ans = a / b;
        } catch (NullPointerException e) {
            ans = 7;
        } catch (Exception e) {
            System.out.println("he");
        }
        System.out.println(ans);
    }
}
