package study.techno;

public class Ex37 {

    public static void doStuff() throws Exception{
        System.out.println("Doing stuff...");
        if(Math.random()>0.4){
            throw new Exception("Too high!");
        }
        System.out.println("Done stuff.");
    }
    public static void main(String[] args) throws Exception {
        doStuff();
        System.out.println("Over");
    }}


