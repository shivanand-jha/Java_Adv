package Project_Euler;

public class Largest_Palindrome {
    public static void main(String[] args) {
//
        for (int i =999; i > 99; i--) {
            for (int j = 999; j > 99; j--) {
                if(palindromic(i*j))
                {
                    System.out.println(i+" "+j);
                }
            }

        }
    }
    static boolean palindromic(int n)
    {
        int s=0;
        int t=n;
        while(n>0)
        {
            s =s*10+n%10;
            n /=10;
        }
        return t == s;
    }
}
