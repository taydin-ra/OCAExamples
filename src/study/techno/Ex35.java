package study.techno;

public class Ex35 {
    static int[][] table = new int[2][3];

    public static void init() {
        for (int x = 0; x < table.length; x++) {
            for (int y = 0; y < table[x].length; y++) {

                table [x][y]=x+y;
//insert code to initialize
            }}}
    public static void multiply() {
        for (int x = 0; x < table.length; x++) {
            for (int y = 0; y < table[x].length; y++) {
//insert code to multiply

                table[x][y]=table[x][y]*2;
            }}}
}
