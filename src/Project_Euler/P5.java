package Project_Euler;

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans=1;
        for (int i = 1; i <= n; i++) {
            ans = (ans * i) / (gcd(ans,i));
        }
        System.out.println(ans);
    }
    static long gcd(long a, long b)
    {
        if(a%b!=0)
        return gcd(b,a%b);
        else
            return b;
    }
}
