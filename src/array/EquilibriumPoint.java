package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by nitish.jain on 26/06/19.
 */
public class EquilibriumPoint {


    private static int findEquilibriumPoint(int[] arr, int n) {
        int[] rightSum = new int[n];
        int[] leftSum = new int[n];

        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return -1;
        }

        leftSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftSum[i] = leftSum[i-1] + arr[i];
        }

        rightSum[n-1] = arr[n-1];
        for (int i = n-2; i >= 0; i--) {
            rightSum[i] = rightSum[i+1] + arr[i];
        }

        for (int i = 1; i < n-1; i++) {
            if (leftSum[i-1] == rightSum[i+1]) {
                return (i+1);
            }
        }

        return -1;
    }

    public static void main (String[] args) throws IOException {
        //code
        int t;
        int n;
        String line;
        String[] stringsInLine;
        int[] arr;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());

        while (t > 0) {
            n = Integer.parseInt(br.readLine());
            arr = new int[n];

            line = br.readLine();
            stringsInLine = line.trim().split("\\s+");

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(stringsInLine[i]);
            }

            System.out.println(findEquilibriumPoint(arr, n));
            t--;
        }

        return;
    }
}
