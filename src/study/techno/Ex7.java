package study.techno;

public class Ex7 {
    public static void main(String[] args) {


        String days[] = {"mon", "tue", "wed", "thur", "fri", "sat", "sun"};
        int i = 0;
        for (String d : days) {
            i--;
            switch (d) {
                case "mon":
                    --i;
                case "wed":
                    --i;
                    break;
                case "sun":
                    i++;
                    break;
                case "thur":
                    i++;
                    break;
            }
            System.out.println(i);
        }
    }
}