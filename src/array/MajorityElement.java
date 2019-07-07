package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by nitish.jain on 26/06/19.
 */
public class MajorityElement {

    private static int findMajorityElement(int[] a, int n) {
        int majorityElementIndex = 0;
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (a[majorityElementIndex] == a[i]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                majorityElementIndex = i;
                count = 1;
            }
        }

        count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == a[majorityElementIndex]) {
                count++;
            }
        }

        if (count > n/2) {
            return a[majorityElementIndex];
        } else {
            return -1;
        }
    }

    public static void main (String[] args) throws IOException {
        //code
        int t;
        int n;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());
            int[] a = new int[n];

            String line = br.readLine();
            String[] strs = line.trim().split("\\s+");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(strs[i]);
            }

            System.out.println(findMajorityElement(a, n));
        }
    }
}
