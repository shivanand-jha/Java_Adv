import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char c[]=new char[5];
        for (int i = 0; i < 5; i++) {
            c[i]=sc.next().charAt(0);
        }
        String s=String.valueOf(c);
        System.out.println(s);
    }
}
