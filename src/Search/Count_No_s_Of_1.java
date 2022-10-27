package Search;

public class Count_No_s_Of_1 {

    public static void main(String[] args) {
        int[] a = {0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1};
        System.out.println(countNo1(a,1));
    }

    private static int countNo1(int[] a, int i) {
            int l = 0;
            int h = a.length;
            while (l <= h) {
                int mid = l + (h - l) / 2;
                if (a[mid] > i) {
                    h = mid - 1;
                } else if (a[mid] < i) {
                    l = mid + 1;
                } else {
                    if (mid == 0 || a[mid - 1] != a[mid])
                        return a.length-mid;
                    else
                        h = mid - 1;
                }
            }
            return -1;
        }
    }

