package PQ;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  s = sc.next();
        int i=0;
        int c=0;
        while(s.charAt(i) == 'z')
        {
            c++;
            i++;
        }
        if(s.length() ==(3*c))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }

    }
}