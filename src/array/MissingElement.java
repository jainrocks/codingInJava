package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by nitish.jain on 26/06/19.
 */
public class MissingElement {

    public static void main (String[] args) throws IOException {
        //code
        int t;
        int n;
        int result;
        int value;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] stringsInLine = line.trim().split("\\s+");

            result = 0;
            for (int i = 1; i <= n; i++) {
                result = result ^ i;
            }
            for (int i = 0; i < (n-1); i++) {
                value = Integer.parseInt(stringsInLine[i]);
                result = value ^ result;
            }
            System.out.println(result);
        }
    }
}
