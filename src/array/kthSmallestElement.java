package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

/**
 * Created by nitish.jain on 04/07/19.
 */
public class kthSmallestElement {
    private static void kthSmallest(int[] arr, int n, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

        for (int i = 0; i < n; i++) {
            minHeap.add(arr[i]);
        }
        for (int i = 0; i < (k-1); i++) {
            minHeap.poll();
        }
        System.out.println(minHeap.peek());
    }
    public static void main (String[] args)  throws IOException {
        //code
        int t;
        int n, k;
        String line;
        String[] stringsInLine;
        int[] arr;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());


        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());
            line = br.readLine();
            stringsInLine = line.trim().split(" ");
            arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(stringsInLine[i]);
            }
            k = Integer.parseInt(br.readLine());

            kthSmallest(arr, n, k);
        }

    }
}
