package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by nitish.jain on 04/07/19.
 */
public class StockBuyAndSell {
    private static class Interval {
        int start;
        int end;
    }

    private static void stockBuyAndSell(int[] arr, int n) {
        Interval[] intervalArray = new Interval[n/2];
        StringBuilder sb = new StringBuilder();
        int count = 0;
        int i = 0;

        if (n < 2) {
            return;
        }

        while (i < (n-1)) {
            while (i < (n-1) && arr[i+1] <= arr[i]) {
                i++;
            }
            if (i == (n-1)) {
                break;
            }
            intervalArray[count] = new Interval();
            intervalArray[count].start = i++;

            while (i<n && arr[i] >= arr[i-1]) {
                i++;
            }
            intervalArray[count].end = i - 1;
            count++;
        }

        for (i = 0; i < count; i++) {
            sb.append("(" + intervalArray[i].start + " " + intervalArray[i].end + ") ");
        }
        if (count == 0) {
            sb.append("No Profit");
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
            stringsInLine = line.trim().split(" ");
            arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(stringsInLine[i]);
            }

            stockBuyAndSell(arr, n);
        }

    }
}
