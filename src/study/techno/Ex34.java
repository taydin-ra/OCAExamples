package study.techno;

public class Ex34 {

    class User {
        Bandwidth bw = new Bandwidth();

        public void consume(int bytesUsed) {
            bw.addUsage(bytesUsed);
        }
//... other irrelevant code
    }

    class Bandwidth {
        private int totalUsage;
        private double totalBill;
        private double costPerByte;

        public void addUsage(int bytesUsed) {
            if (bytesUsed > 0) {
                totalUsage += bytesUsed;
                totalBill = totalBill+totalUsage * costPerByte;
            }
//add your code here
//...other irrelevant code
        }
   /* Your goal is to implement a method addUsage (and other methods, if required) in Bandwidth
    class such that all the bandwidth used by a User is reflected by the totalUsage field and
            totalBill is always equal to totalUsage*costPerByte. Further, that a User should not be able
    to tamper with the totalBill value and is also not able to reduce it.*/
    }
}