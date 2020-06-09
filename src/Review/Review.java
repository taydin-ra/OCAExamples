package Review;

import java.util.Scanner;

public class Review {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("What do you want?");

        String answer=sc.nextLine();

        for(int i=0;i<3;i++) {

            if (answer.equals(answer)) {
                System.out.println("What else");
                sc.nextLine();
                if(answer.equals("Yes")){
                    System.out.println("drink?");

                }else{
                    System.out.println("nope");
                }
            }else{
                System.out.println("bye");
            }



        }



    }

}
