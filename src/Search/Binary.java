package Search;

//import static java.util.Arrays.binarySearch;//in-build function is available for binarySearch

public class Binary {
    public static void main(String[] args) {
        int[] a = {1,3,5,7,9,11};
        System.out.println(binaryRecursive(a,11,0,a.length-1));
    }
    private static int binaryRecursive(int[] a, int target,int l,int h)
    {
        int mid = (l+h)/2;
      if(a[mid]==target)
      {
          return mid;
      }
      else if(a[mid]>target)
      {
          return binaryRecursive(a,target,l,mid-1);
      }
      else
          return binaryRecursive(a,target,mid+1,h);
    }
}
