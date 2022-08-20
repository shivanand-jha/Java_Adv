package Project_Euler;

import java.util.Scanner;

public class Fib_Even_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s=0;
        for (int i = 3; i < n; i=i+3) {
            int q=fib(i);
            if((q & 1)==0)
            {
                s += q;
            }
        }
        System.out.println(s);
    }
    static int fib(int n)
    {
        if( n<=1)
        {
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}
