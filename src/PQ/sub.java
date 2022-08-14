package PQ;

//import java.util.Scanner;

public class sub {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
        String a="100100010101";
        String b ="10101";
        int c=b.length();
//        System.out.println(a.compareTo(b));
//        System.out.println(a.strip());
        for (int i = 0; i <= a.length()-b.length() ; i++) {
            String s=a.substring(i,c);
            if(b.equals(s)) {
                System.out.println(1);
                System.exit(0);
            }

            c++;
        }
        System.out.println(0);
    }
}
