package OcaPrep;

import java.util.ArrayList;

public class StringTrimEx {
    public static void main(String[] args) {
//        String str=" ";
//        str.trim();
//        System.out.println(str.equals("")+ " "+ str.isEmpty());
//
//        int i=10;
//        int j=20;
//        int k=(j+i)/5;
//
//        System.out.println(k+""+j+" "+ i);

        ArrayList<String> stringList= new ArrayList<>();

        stringList.add("Ankara");
        stringList.add("Istanbul");
        stringList.add("bursa");
        stringList.add("Ankara");

        for(int i=0;i<stringList.size();i++){
            for(int j=i+1;j<stringList.size();j++){

                if(!(stringList.get(i) ==stringList.get(j)) && i!=j){

                }
            }

        System.out.println(stringList.get(i));

    }

}
    }

