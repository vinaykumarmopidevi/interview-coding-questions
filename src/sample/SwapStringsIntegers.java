package sample;

/*
 * A java program to swap strings without using the third variable.
 */
public class SwapStringsIntegers {

    public static void main(String[] args) {

        String fs = "vinay";
        String ss = "ram";

        System.out.println("Before swapping....");
        System.out.println("The first String  = " + fs);
        System.out.println("The second String = " + ss);

        fs=fs+ss;
        ss=fs.substring(0,(fs.length()-ss.length()));
        fs=fs.substring(ss.length());
  

        System.out.println("\nAfter swapping....");
        System.out.println("The first String  = " + fs);
        System.out.println("The second String = " + ss);
        
        System.out.println("-------------------");
        System.out.println("----Swap Integer----");
        int a=20;
        int b=30;
        System.out.println("a value:"+a+" b value: "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a value:"+a+" b value: "+b);

    }

}