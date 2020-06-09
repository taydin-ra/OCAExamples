package CrazyQuestion;

public class JustLooping {
//    private int j;
//    void showJ(){
//        while(j <= 5){
//            for(int j = 1; j <= 5;){
//                System.out.print(j+" ");
//                j++;
//            }
//            j++;
//        }
//    }
//    public static void main(String[] args) {
//        new JustLooping().showJ();
public static void main(String[] args) {


    int i = 0 ;
    int[] iA = {10, 20} ;
    iA[i] = i = 30 ;
System.out.println(""+ iA[ 0 ] + " " + iA[ 1 ] + " "+i) ;
}
}

