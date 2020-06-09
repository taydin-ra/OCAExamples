package OcaPrep;

public class Vowel {
    private char var;

    public static void main(String[] args) {
        String name="Tugbaabb";
        char []ch=name.toCharArray();
        int count=0;
        for(char c:ch){

            if(ch.equals(c)){
                count++;
                System.out.println(c+" "+count);
            }
        }
    }
}