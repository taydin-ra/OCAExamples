package OCAExam2;

public class ConcatElement {
    public static void main(String[] args) {

        String[] strs= new String[2];

       strs= new String[]{"a", "b"};

        int idx=0;

        for(String s:strs){

            strs[idx].concat("element"+ idx);
            idx++;
        }
        for(idx=0;idx<strs.length;idx++){

            System.out.println(strs[idx]);
        }
    }
}
