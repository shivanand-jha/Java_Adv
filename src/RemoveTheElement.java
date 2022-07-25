
import java.util.Arrays;

public class RemoveTheElement {
    public static void main(String[] args) {
        int[] n = {2, 3, 2, 4, 3};
        for (int s :
                removeTheElement(n, 3)) {
            System.out.print(s+" ");
        }
    }

    public static int[] removeTheElement(int[] arr, int index) {
        if (arr == null || index < 0
                || index >= arr.length) {

            return arr;
        }
        int[] anotherArray = new int[arr.length - 1];
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            anotherArray[k++] = arr[i];
        }
        return anotherArray;
    }
}