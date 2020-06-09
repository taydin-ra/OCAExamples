package OcaPrep;


import study.techno.Ex2;

import java.time.LocalDate;


class Alpha{
    int ns;
    static int s;

    Alpha(int ns){
        if (s<ns){
            s=ns;
            this.ns=ns;
        }
    }

    void doPrint(){
        System.out.println("ns"+ ns+ "s"+ s);
    }
}
public class StringEx extends Ex2 {
    public static void main(String[] args) {

        Alpha ref= new Alpha(50);
        Alpha ref1= new Alpha(125);

        Alpha ref2= new Alpha(100);

        ref.doPrint();
        ref1.doPrint();
        ref2.doPrint();





    }

//        String[] a = new String[2];
//        int idx=0;
//
//        for (String s : a) {
//
//            a[idx].concat("He"+ idx);
//            idx++;
//
//        }
//
//        for(idx=0; idx<a.length;idx++)
//        System.out.println(a[idx]);
    }
