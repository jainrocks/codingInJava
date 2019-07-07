package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by nitish.jain on 07/07/19.
 */
public class IsAnagram {

    private static void isAnagram(String s1, String s2) {

        Map<Character, Integer> hm = new HashMap<Character, Integer>();
        Iterator<Map.Entry<Character, Integer>> itr = hm.entrySet().iterator();
        int count;

        if (s1.length() != s2.length()) {
            System.out.println("NO");
            return;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (hm.containsKey(s1.charAt(i))) {
                count = hm.get(s1.charAt(i));
                hm.put(s1.charAt(i), count+1);
            } else {
                hm.put(s1.charAt(i), 1);
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            if (hm.containsKey(s2.charAt(i))) {
                count = hm.get(s2.charAt(i));
                hm.put(s2.charAt(i), count-1);
            } else {
                System.out.println("NO");
                return;
            }
        }

        while (itr.hasNext()) {
            Map.Entry<Character, Integer> entry = itr.next();
            if (entry.getValue() != 0) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

    public static void main (String[] args) throws IOException {
        //code
        int t;
        String s1, s2;
        String line;
        String[] stringsInLine;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());
        while (t > 0) {
            line = br.readLine();
            stringsInLine = line.trim().split(" ");
            s1 = stringsInLine[0];
            s2 = stringsInLine[1];


            isAnagram(s1, s2);
            t--;
        }

    }
}
