package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by nitish.jain on 28/06/19.
 */
public class Kadane {
    private static void findMaxSum(int[] arr, int n) {
        int maxSumHere = arr[0];
        int maxSumSoFar = arr[0];
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < n; i++) {
            maxSumHere = Math.max(arr[i], maxSumHere + arr[i]);
            maxSumSoFar = Math.max(maxSumSoFar, maxSumHere);
        }

        sb.append(maxSumSoFar);
        System.out.println(sb);
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

            findMaxSum(arr, n);
        }

    }
}
