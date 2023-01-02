package Random;

import java.util.Scanner;

public class Weigh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if(t<=2)
        {
            System.out.println("NO");
        }
        else {
            if (t % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
