package Recursion;

public class recursion {
    public static void main(String[] args) {
        int n=5;
        System.out.println(fun(n));
    }
    public static int fun(int n){
        if(n<=0)
            return n;
        return n+fun(n-1);
    }
}
