 class change {

    long coin2=0;
    long bill5=0;
    long bill10=0;

}
class Solution{
    static change optimalChange(long s){
        change c=new change();
        if(s%2==0){
            long a=s/2;
            c.coin2=a*2;
        }
        return null;
    }
}