package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by nitish.jain on 26/06/19.
 */
public class MaxLengthSubArrayContainingEqualZerosAndOnes {

    private static int maxLen(int[] arr)
    {
        // Your code here
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int n = arr.length;
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + (arr[i] == 0 ? -1 : 1);

            if (sum == 0) {
                maxLen = i + 1;
            }

            if (hm.containsKey(sum + n)) {
                if (maxLen < i - hm.get(sum + n)) {
                    maxLen = i - hm.get(sum + n);
                }
            } else {
                hm.put(sum + n, i);
            }
        }

        return maxLen;
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

            System.out.println(maxLen(a));
        }
    }
}
