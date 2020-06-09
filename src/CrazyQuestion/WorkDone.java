package CrazyQuestion;

public class WorkDone {
    public static void main(String[] args) {


        String[] str4 = {"A", "B", "C"};

        for (String str5 : str4) {
            System.out.println(str5);

            if (str5.equals("C")){
                continue;
            }
            System.out.println("Work done");
           // break;
        }
    }
}