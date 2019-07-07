package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by nitish.jain on 06/07/19.
 */
public class BooleanMatrix {

    public static void main (String[] args) throws IOException {
        //code
        int t;
        int n, m;
        String line;
        String[] stringsInLine;
        int[][] arr;
        int[] rows;
        int[] cols;
        StringBuilder sb;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());

        while (t > 0) {
            line = br.readLine();
            stringsInLine = line.trim().split("\\s+");
            n = Integer.parseInt(stringsInLine[0]);
            m = Integer.parseInt(stringsInLine[1]);
            arr = new int[n][m];

            rows = new int[n];
            cols = new int[m];

            for (int i = 0; i < n; i++) {
                line = br.readLine();
                stringsInLine = line.trim().split("\\s+");
                for (int j = 0; j < m; j++) {
                    arr[i][j] = Integer.parseInt(stringsInLine[j]);
                    if (arr[i][j] == 1) {
                        rows[i] = 1;
                        cols[j] = 1;
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                sb = new StringBuilder();
                for (int j = 0; j < m; j++) {
                    if (rows[i] == 1 || cols[j] == 1) {
                        arr[i][j] = 1;
                    } else {
                        arr[i][j] = 0;
                    }
                    sb.append(arr[i][j]);
                    sb.append(' ');
                }
                System.out.print(sb);
                System.out.println();
            }

            t--;
        }

        return;
    }
}
