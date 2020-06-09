package study.techno;

public class Ex19 {
    private int j;
    void showJ(){
        while(j <= 5){
            for(int j = 1; j <= 5;){
                System.out.print(j+" ");
                j++;
            }
            j++;
        }
    }
    public static void main(String[] args) {
        new Ex19().showJ();
    }
}
