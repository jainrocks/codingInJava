package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by nitish.jain on 07/07/19.
 */
public class LongestDistinctCharacters {

    private static void longestDistinctCharacters(String s) {
        Map<Character, Integer> hm = new HashMap<Character, Integer>();
        int maxLen = 0;
        int prevIndex;
        int currLen = 0;

        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {
                prevIndex = hm.get(s.charAt(i));
                if (i - currLen > prevIndex) {
                    currLen++;
                } else {
                    currLen = i - prevIndex;
                }
            } else {
                currLen++;
            }
            hm.put(s.charAt(i), i);
            if (currLen > maxLen) {
                maxLen = currLen;
            }
        }
        System.out.println(maxLen);
    }

    public static void main (String[] args) throws IOException {
        //code
        int t;
        String s;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());
        while (t > 0) {
            s = br.readLine();
            longestDistinctCharacters(s);
            t--;
        }

    }
}
