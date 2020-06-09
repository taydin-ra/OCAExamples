package OCAExam2;

import java.util.ArrayList;
import java.util.List;

public class SubList {

    public static void main(String args[]){
        List s1 = new ArrayList( );
        s1.add("a");
        s1.add("b");
        s1.add(1, "c");
        List s2 = new ArrayList( s1.subList(1, 1) );
        s1.addAll(s2);
        System.out.println(s1);


        int i = 0 ;
        int[] iA = {10, 20} ;
        iA[i] = i = 30 ;
        System.out.println(""+ iA[ 0 ] + " " + iA[ 1 ] + " "+i) ;
    }
}



