package Search;

public class CountOcurrance {
    public static void main(String[] args) {
        int[] a = {2,4,5,6,7,7,7,7,8};
        System.out.println(lastIndex(a,7)-indexOfFirst(a,7)+1);
    }
    private static int indexOfFirst(int[] a, int i) {
        int l=0; int h=a.length;
        while(l<=h)
        {
            int mid = l+(h-l)/2;
            if (a[mid]>i)
            {
                h=mid-1;
            }
            else if(a[mid]<i)
            {
                l=mid+1;
            }
            else {
                if(mid==0 || a[mid-1]!=a[mid])
                    return mid;
                else
                    h=mid-1;
            }
        }
        return -1;
    }
    private static int lastIndex(int[] a, int i)
    {
        int l=0; int h=a.length;
        while(l<=h)
        {
            int mid = l+(h-l)/2;
            if (a[mid]>i)
            {
                h=mid-1;
            }
            else if(a[mid]<i)
            {
                l=mid+1;
            }
            else {
                if(mid==0 || a[mid+1]!=a[mid])
                    return mid;
                else
                    l=mid+1;
            }
        }
        return -1;
    }
}

