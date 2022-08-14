package Striver_Sheet;

import java.text.DecimalFormat;

public class Bin {
    public static void main(String[] args) {
        String a="11";
        String b="1";
        int s =  Integer.parseInt(a,2);
        int k =Integer.parseInt(b,2);
        int t= s+k;
        String q = ""+Integer.toBinaryString(t);
        System.out.println(q);
    }
}
