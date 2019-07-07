package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * Created by nitish.jain on 26/06/19.
 */
public class LeaderInArray {

    private static void findLeaders(int[] a, int n) {
        int maxValue = a[n-1];
        Stack<Integer> s = new Stack<>();
        StringBuilder sb = new StringBuilder();

        s.push(maxValue);
        for (int i = n-2; i >= 0; i--) {
            if (maxValue <= a[i]) {
                maxValue = a[i];
                s.push(maxValue);
            }
        }

        while (!s.empty()) {
            sb.append(s.peek());
            sb.append(' ');
            s.pop();
        }

        System.out.print(sb);
        System.out.println();

        return;
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

            findLeaders(arr, n);
        }

    }
}
