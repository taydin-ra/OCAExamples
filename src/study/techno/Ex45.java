package study.techno;

public class Ex45 {

    public static void main(String[] args) {
        int count = 0;
        String[] str = {"2012","2013","2014","2015","2016"};
        for(int i = 0; i < str.length; ){
            i++; // here ArrayIndexOutOfBoundsException happen
            if(str[i] == ("2014")){
                continue;
            }
            count++;
        }
        System.out.println("Count number: " + count);
    } //outp
}
