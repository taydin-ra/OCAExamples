package study.techno;

public class Ex11 {
    public static void main(String[] args) {
        String myStr = "good";
        char[] myCharArr = {'g', 'o', 'o', 'd'};
        String newStr = null; //FALSE REASON THIS LINE MAKES NULL THAN ==FAULSE.
        // AND EQUALS FALSE
        for (char ch : myCharArr) {
            newStr = newStr + ch;
        }System.out.println((newStr == myStr) + " " + (newStr.equals(myStr)));
        }
    }

