package CrazyQuestion;

public class DaysTest {
    // static String[] days = {"monday", "tuesday", "wednesday", "thursday", "friday",
    //  "saturday", "sunday"};

    public static void main() {
//        int index = 0;
//        for (String day : days) {
//            if (index == 3) {
//                break;
//            } else {
//                //continue;
//            }
//            index++; //because of line,
//            if (days[index].length() > 3) {
//                days[index] = day.substring(0, 3);
//            }
//        }
//        System.out.println(days[index]);
//    }



        rom:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i + j > 10)
                    break rom;
            }
            System.out.println("hello");
        }
    }
}

// Select

