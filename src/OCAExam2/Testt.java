package OCAExam2;

import javax.smartcardio.Card;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemAlreadyExistsException;

public class Testt {

    int x;
    int y;

    public Testt(int x, int y){

      initialize(x,y);
    }


    public void initialize(int x, int y){

        this.x=x;
        this.y=y;

    }
//    void readCard (int CardNo) throws Exception {
//        System.out.println("Reading card");
//    } void checkCard(int CardNo) throws RuntimeException{
//        System.out.println("Checking card");
//    }

    public static void main(String[] args) throws Exception {

        int x=3;
        int y=5;

        Testt ex=new Testt(x,y);


        System.out.println(x+" "+ y);


//        int CardNo=1234;
//        ex.checkCard(CardNo);
//        ex.readCard(CardNo);
    }
}
