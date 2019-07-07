package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by nitish.jain on 27/06/19.
 */
public class SortArraysOfZerosOnesAndTwos {

    private static void printSortedArray(int[] arr, int n) {
        int low = 0, mid = 0, high = n-1, temp;
        StringBuilder sb = new StringBuilder();

        while (mid <= high) {
            if (arr[mid] == 0) {
                temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++;
                low++;
            } else if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 2) {
                temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }

        for (int i = 0; i < n; i++) {
            sb.append(arr[i]);
            sb.append(' ');
        }
        System.out.print(sb);
        System.out.println();
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
            stringsInLine = line.trim().split("\\s+");
            arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(stringsInLine[i]);
            }

            printSortedArray(arr, n);
        }

    }
}
