package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by nitish.jain on 16/07/19.
 */
public class RomanToNumber {
    private static void getInteger(String s) {
        int res = 0;
        int len = s.length();
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        Character lastChar = s.charAt(len - 1);
        Character presentChar;
        res += hm.get(lastChar);

        for (int i = len - 2; i >= 0; i--) {
            presentChar = s.charAt(i);
            if (hm.get(presentChar) < hm.get(lastChar)) {
                res = res - hm.get(presentChar);
            } else {
                res += hm.get(presentChar);
                lastChar = presentChar;
            }
        }

        System.out.println(res);
    }

    public static void main (String[] args) throws IOException {
        //code
        int t;
        String s;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());
        while (t > 0) {
            s = br.readLine();
            getInteger(s);
            t--;
        }

    }
}
