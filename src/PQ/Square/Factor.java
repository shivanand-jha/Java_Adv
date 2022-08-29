package PQ.Square;

import java.util.ArrayList;

public class Factor {
    public static void main(String[] args) {
        factor2(172);
    }
    static void factors(int n)
    {
        for (int i = 1; i<=Math.sqrt(n) ; i++) {
            if (n%i==0)
            {
                if (n/i==i) {
                    System.out.print(i + " ");
                }
                else {
                    System.out.print(i + " " + n / i+" ");
                }
            }
        }
    }
    static void factor2(int n)
    {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 1; i<= Math.sqrt(n) ; i++) {
            if (n%i==0)
            {
                if (n/i==i) {
                    System.out.print(i + " ");
                }
                else {
                    System.out.print(i + " ");
                    a.add(n/i);
                }
                
            }
         }
        for (int i = a.size()-1; i >=0 ; i--) {
            System.out.print(a.get(i)+" ");
        }
        }
    }

