package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by nitish.jain on 06/07/19.
 */
public class SortTwoSortedArrays {
    private static void printInDesc(int[] x, int[] y, int n, int m) {
        int[] res = new int[m + n];
        StringBuilder sb = new StringBuilder();
        int k = m + n -1;
        int i = n-1, j = m -1;

        while (i >= 0 && j >= 0 && k >= 0) {
            if (x[i] > y[j]) {
                res[k--] = x[i--];
            } else {
                res[k--] = y[j--];
            }
        }

        while (i >= 0) {
            res[k--] = x[i--];
        }

        while (j >= 0) {
            res[k--] = y[j--];
        }

        for (i = 0; i < m+n; i++) {
            sb.append(res[i] + " ");
        }
        System.out.println(sb);
    }

    public static void main (String[] args) throws IOException {
        //code
        int t;
        int n, m;
        String line;
        String[] stringsInLine;
        int[] x;
        int[] y;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());

        while (t > 0) {
            line = br.readLine();
            stringsInLine = line.trim().split(" ");
            n = Integer.parseInt(stringsInLine[0]);
            m = Integer.parseInt(stringsInLine[1]);

            x = new int[n];
            y = new int[m];

            line = br.readLine();
            stringsInLine = line.trim().split(" ");

            for (int i = 0; i < n; i++) {
                x[i] = Integer.parseInt(stringsInLine[i]);
            }

            line = br.readLine();
            stringsInLine = line.trim().split(" ");
            for (int i = 0; i < m; i++) {
                y[i] = Integer.parseInt(stringsInLine[i]);
            }

            printInDesc(x, y, n, m);
            t--;
        }

        return;
    }
}
