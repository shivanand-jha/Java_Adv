package Project_Euler;

import java.util.Scanner;

public class Summ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        System.out.println(sum(n));
    }
    static int sum(int n)
    {
        int s=0;
        for (int i = 1; i < n; i++) {
            if (i%3==0 || i%5==0)
            {
                s +=i;
            }
        }
        return s;
    }
}
