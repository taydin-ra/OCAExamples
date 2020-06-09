package OcaPrep;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Constructor {
    public static void main(String[] args) {
        String[] a;
       // a= new [2];

        int[] array= new int[2];
//
//        for (int i = 0; i < a.length; i++) {
//            if (a[i].equals("b")) {
//               break;
//            }
//            System.out.println(a[i]);
//            continue;
//
//        }
//
//        Boolean []a= new Boolean[2];
//         a[0]= new Boolean(Boolean.parseBoolean("false"));
//         a[1]= new Boolean(null);
//
//        System.out.println(a[0]+ " " + a[1]);

        LocalDateTime date=LocalDateTime.of(2014,7,31,1,1);

        date.plusDays(30);
        date.plusMonths(3);
        System.out.println(DateTimeFormatter.ISO_DATE_TIME);


    }

    public Constructor(){

    }

    public Constructor(int a){

    }


}
