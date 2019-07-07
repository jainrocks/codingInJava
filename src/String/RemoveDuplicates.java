package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by nitish.jain on 07/07/19.
 */
public class RemoveDuplicates {
    private static void removeDuplicate(String s) {
        int counter = 0;
        int x;
        for (int i = 0; i < s.length(); i++) {
            x = s.charAt(i) - 97;
            if ((counter & (1 << x)) == 0) {
                System.out.print(s.charAt(i));
                counter = counter | (1 << x);
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
            removeDuplicate(s);
            t--;
        }

    }
}
