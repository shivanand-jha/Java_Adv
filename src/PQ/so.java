package PQ;

import java.util.Scanner;

public class so {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int c=0;
            for(int i=1; i<n; i++)
            {
                for(int j=1; j<n; j++)
                {
                    if((2*i)+(2*j)+(i*j)==n)
                    {
                        System.out.println("YES");
                        c++;
                    }
                }
            }
            if(c==0)
            {
                System.out.println("NO");
            }
        }
    }
}
