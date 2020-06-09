package CrazyQuestion;

public class StrEquals {
    public static void main(String[] args) {
//        String str = "java";
//        String[] str2 = {"j", "a", "v", "a"};
//        String str3 = " ";
//        for (String s : str2) {
//            str3 += s;
//        }
//        System.out.println(str3.equals(str)); //false
//        System.out.println(str3 == str); //false
        // System.out.println(str3 == str1);


//        String a="   Hello   ";
//       a=a.concat("b");
//
//       // System.out.println(a);
//
//      //  System.out.println("a"+ new Integer(63));
//        String s= 'b'+63+"a";
//        System.out.println(s);
//        String b= "a"+new Integer(10);
//
//        System.out.println(b);


        String st1="Java";// String literals, they are created in the string pool.
        String str2=new String("Java");  // it is created in the heap memory

        System.out.println("str1: "+st1.hashCode());
        System.out.println("str2: "+str2.hashCode());
        System.out.println(st1==str2);
        System.out.println(st1.equals(str2));
    }
}
     //   public static void main(String[] args) {
//            String str = "java";
//            String[] str2 = { "j", "a", "v", "a" };
//            String str3 = "";
//            for (String s : str2) {
//                str3 += s;
//            }
//            System.out.println(str3 == str); // FALSE
//            System.out.println(str3.equals(str)); // TRUE
//        }}
