//Chocolate Distributin Problem: GFG

import java.util.*;

public class ChocolateDistribution {
    public static int findMinDiff(int[] arr, int n, int m){
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;

        for(int i = 0; i+ m -1 < n; i++){
            int diff = arr[i + m -1] - arr[i];
            if(diff < min){
                min = diff;
            }
        }
        return min;

    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 9, 56, 7, 9, 12};
        int N = arr.length;
        int M = 5;

        System.out.println(findMinDiff(arr, N, M));
    }
}