package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by nitish.jain on 07/07/19.
 */
public class ReverseWords {
    private static void reverseWords(String s) {

        String[] stringsInLine = s.split("\\.");
        int len = stringsInLine.length;

        for (int i = len -1; i>= 0; i--) {
            System.out.print(stringsInLine[i]);
            if (i != 0) {
                System.out.print(".");
            }
        }
        System.out.println();
    }

    public static void main (String[] args) throws IOException {
        //code
        int t;
        String s;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());
        while (t > 0) {
            s = br.readLine();
            reverseWords(s);
            t--;
        }

    }
}
