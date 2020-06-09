package OCAExam2;

public class User {


        Bandwidth bw = new Bandwidth();
        public void consume(int bytesUsed){
            bw.addUsage(bytesUsed);
        }

    }
    class Bandwidth{
        private int totalUsage;
        private double totalBill;
        private double costPerByte;
//add your code here
public void addUsage(int bytesUsed){
    if(bytesUsed>0) {
        totalUsage = totalUsage + bytesUsed;
        totalBill = totalUsage * costPerByte;
    }   }
}
