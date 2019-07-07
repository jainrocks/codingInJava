package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by nitish.jain on 06/07/19.
 */
public class MinimumPlatforms {
    private static void minPlatforms(int[] arr, int dep[], int n) {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int platformsRequired = 1;
        int maxPlatforms = 1;
        int i = 1, j = 0;

        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                platformsRequired++;
                i++;
                if (platformsRequired > maxPlatforms) {
                    maxPlatforms = platformsRequired;
                }
            } else {
                platformsRequired--;
                j++;
            }
        }
        System.out.println(maxPlatforms);
    }

    public static void main (String[] args)  throws IOException {
        //code
        int t;
        int n;
        String line;
        String[] stringsInLine;
        int[] arr;
        int[] dep;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());


        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());
            line = br.readLine();
            stringsInLine = line.trim().split(" ");
            arr = new int[n];
            dep = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(stringsInLine[i]);
            }

            line = br.readLine();
            stringsInLine = line.trim().split(" ");
            for (int i = 0; i < n; i++) {
                dep[i] = Integer.parseInt(stringsInLine[i]);
            }


            minPlatforms(arr, dep, n);
        }

    }
}
