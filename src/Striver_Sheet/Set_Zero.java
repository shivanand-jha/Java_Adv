package Striver_Sheet;

public class Set_Zero {
    public static void main(String[] args) {
        int[][] ar= {{1,1,1},{1,0,1},{1,1,1}};
        for (int a[] : set(ar)) {
            for (int b: a)
            {
                System.out.print(b+" ");
            }
        }
    }
    public static int[][] set(int[][] a)
    {
        boolean fr=false,fc=false;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <a[0].length ; j++) {
                if (a[i][j]==0)
                {
                    if(i==0) fr=true;
                    if (j==0) fc=true;
                    a[i][0]=0;
                    a[0][j]=0;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                    if(a[0][j]==0 || a[i][0]==0)
                    {
                        a[i][j]=0;
                    }
            }
        }
        if (fr)
        {
            for(int j=1; j<a[0].length; j++)
            {
                a[0][j]=0;
            }
        }
        if(fc)
        {
            for (int i = 0; i < a.length; i++) {
                a[i][0]=0;
            }
        }
        return a;
    }
}
