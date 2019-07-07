package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by nitish.jain on 02/07/19.
 */
public class inversionCount {
    private static int merge(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left, j = mid + 1, k = left;
        int inversionCount = 0;

        while ((i <= mid) && (j <= right)) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                inversionCount += (mid - i + 1);
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }

        return inversionCount;
    }

    private static long mergeSort(int[] arr, int[] temp, int left, int right) {
        long inversionCount = 0;
        int mid;
        if (right > left) {
            mid = left + (right-left)/2;
            inversionCount += mergeSort(arr, temp, left, mid);
            inversionCount += mergeSort(arr, temp, mid + 1, right);

            inversionCount += merge(arr, temp, left, mid, right);
        }
        return inversionCount;
    }

    private static long inversionCount(int[] arr, int n) {
        int left = 0;
        int right = n-1;
        int[] temp = new int[n];

        return mergeSort(arr, temp, left, right);

    }

    public static void main (String[] args)  throws IOException {
        //code
        int t;
        int n;
        String line;
        String[] stringsInLine;
        int[] arr;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());


        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());
            line = br.readLine();
            stringsInLine = line.trim().split(" ");
            arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(stringsInLine[i]);
            }

            System.out.println(inversionCount(arr, n));
        }

    }
}
