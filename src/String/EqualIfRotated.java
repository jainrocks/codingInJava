package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by nitish.jain on 07/07/19.
 */
public class EqualIfRotated {

    private static void equalIfRotated(String s1, String s2) {
        if (s1.length() != s2.length() || s1.length() < 2 || s2.length() < 2) {
            System.out.println(0);
            return;
        }
        int len = s2.length();

        if (s1.charAt(0) == s2.charAt(len -2) && s1.charAt(1) == s2.charAt(len - 1)) {
            System.out.println(1);
        } else if (s2.charAt(0) == s1.charAt(len -2) && s2.charAt(1) == s1.charAt(len - 1)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    public static void main (String[] args) throws IOException {
        //code
        int t;
        String s1, s2;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());
        while (t > 0) {
            s1 = br.readLine();
            s2 = br.readLine();
            equalIfRotated(s1, s2);
            t--;
        }

    }
}
