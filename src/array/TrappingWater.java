package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by nitish.jain on 06/07/19.
 */
public class TrappingWater {
    static int trappingWater(int arr[], int n) {

        // Your code here
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        int result = 0;

        leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            if (leftMax[i-1] > arr[i]) {
                leftMax[i] = leftMax[i-1];
            } else {
                leftMax[i] = arr[i];
            }
        }

        rightMax[n-1] = arr[n-1];
        for (int i = n-2; i >= 0; i--) {
            if (rightMax[i+1] > arr[i]) {
                rightMax[i] = rightMax[i+1];
            } else {
                rightMax[i] = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            result = result + Math.min(leftMax[i], rightMax[i]) - arr[i];
        }

        return result;
    }

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(trappingWater(arr, n));
        }
    }
}
