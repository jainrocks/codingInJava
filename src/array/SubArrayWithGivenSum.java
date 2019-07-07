package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by nitish.jain on 27/06/19.
 */
public class SubArrayWithGivenSum {

    private static void findSubArrayWithGivenSum(int[] arr, int n, int sum) {
        int currentSum = arr[0];
        int startIndex = 0;

        for (int i = 1; i <= n; i++) {
            while (currentSum > sum && startIndex < (i-1)) {
                currentSum -= arr[startIndex];
                startIndex++;
            }

            if (currentSum == sum) {
                System.out.println((startIndex+1) + " " + i);
                return;
            }
            if (i < n) {
                currentSum += arr[i];
            }
        }
        System.out.println(-1);
        return;
    }

    public static void main (String[] args)  throws IOException {
        //code
        int t, n, s;
        String line;
        String[] stringsInLine;
        int[] arr;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            line = br.readLine();
            stringsInLine = line.trim().split("\\s+");

            n = Integer.parseInt(stringsInLine[0]);
            s = Integer.parseInt(stringsInLine[1]);

            line = br.readLine();
            stringsInLine = line.trim().split("\\s+");
            arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(stringsInLine[i]);
            }

            findSubArrayWithGivenSum(arr, n, s);
        }

    }
}
