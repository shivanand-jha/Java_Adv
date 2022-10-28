package Project_Euler;

public class P6 {
    public static void main(String[] args) {
        int n=100;
        int a=sum(n)*sum(n);
        System.out.println(a-sqrSum(n));
    }
    static int sum(int n)
    {
        int ans=0;
        for (int i =1; i <=n; i++) {
            ans +=i;
        }
        return ans;
    }
    static int sqrSum(int n)
    {
        int ans=0;
        for (int i = 1; i <=n; i++) {
            ans += i*i;
        }
        return ans;
    }
}
