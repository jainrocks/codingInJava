package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by nitish.jain on 04/07/19.
 */
public class countPairs {
    private static int countPairs(int x, int[] yarr, int[] yLessThanFive, int m) {
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return yLessThanFive[0];
        }

        int ans = 0;
        int idx = Arrays.binarySearch(yarr, x);

        if (idx < 0) {
            idx = Math.abs(idx + 1);
            ans = yarr.length - idx;
        } else {
            while (idx < m && yarr[idx] == x) {
                idx++;
            }
            ans = yarr.length - idx;
        }

        ans = ans + yLessThanFive[0] + yLessThanFive[1];
        if (x == 2) {
            ans = ans - (yLessThanFive[3] + yLessThanFive[4]);
        }

        if (x == 3) {
            ans = ans + yLessThanFive[2];
        }

        return ans;
    }

    private static void findPairs(int[] xarr, int[] yarr, int n, int m) {
        int[] yLessThanFive = new int[5];
        StringBuilder sb = new StringBuilder();
        long count = 0;
        for (int i = 0; i < m; i++) {
            if (yarr[i] < 5) {
                yLessThanFive[yarr[i]]++;
            }
        }

        Arrays.sort(yarr);
        for (int i = 0; i < n; i++) {
            count += countPairs(xarr[i], yarr, yLessThanFive, m);
        }
        sb.append(count);
        System.out.println(sb);
    }

    public static void main (String[] args)  throws IOException {
        //code
        int t;
        int n, m;
        String line;
        String[] stringsInLine;
        int[] xarr;
        int[] yarr;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());


        while (t-- > 0) {
            line = br.readLine();
            stringsInLine = line.trim().split(" ");
            n = Integer.parseInt(stringsInLine[0]);
            m = Integer.parseInt(stringsInLine[1]);

            line = br.readLine();
            stringsInLine = line.trim().split(" ");
            xarr = new int[n];

            for (int i = 0; i < n; i++) {
                xarr[i] = Integer.parseInt(stringsInLine[i]);
            }

            line = br.readLine();
            stringsInLine = line.trim().split(" ");
            yarr = new int[m];

            for (int i = 0; i < m; i++) {
                yarr[i] = Integer.parseInt(stringsInLine[i]);
            }

            findPairs(xarr, yarr, n, m);
        }

    }
}
