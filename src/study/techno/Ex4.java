package study.techno;

public class Ex4 {
    public static void main(String[] args) {

        String [] ar= {"A","B","C"};
        for(int i=0; i<ar.length;i++){
            System.out.println(ar[i]+ " ");
            if(ar[i].equals("C")){
                continue;
            }
            System.out.println("work done");
            break;
        }
    }
}
