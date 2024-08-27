//974. Subarray Sums Divisible by K
import java.util.*;

public class SubarrayDivK {
    public static int subarrayDivByK(int[] nums, int k){
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        int rem = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            rem = sum % k;
            if(rem < 0){
                rem += k;
            }
            if(map.containsKey(rem)){
                ans += map.get(rem);
                map.put(rem, map.get(rem)+ 1);
            }
            else{
                map.put(rem ,1);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Subarray Sums Divisible by k");

        int[] nums = {4,5,0,-2,-3,1};
        int k = 5;

        System.out.println(subarrayDivByK(nums, k));
    }
    
}