package study.techno;

public class Ex12 {
    //  public static void main(String[] args) {



    public void initData(String[] arr) {
        int ind = 0;
        for (String str : arr) {
            str.concat(str + " " + ind);
//str+=" "+ind;
            ind++;
        }
    }

    public void printData(String[] arr) {
        for (String str : arr) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        Ex12 ot = new Ex12();
        String[] arr = new String[2];
        ot.initData(arr);
        ot.printData(arr);
    }
}