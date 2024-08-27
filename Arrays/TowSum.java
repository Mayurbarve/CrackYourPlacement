import java.util.Arrays;
import java.util.HashMap;

public class TowSum {
    public static int[] twoSum(int[] nums, int target){

        HashMap <Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int rem = target - num;
            if(map.containsKey(rem)){
                int index = map.get(rem);
                if(index == i)continue;
                return new int[]{i, index};
            }
        }
        return new int[]{};


        
    }
    public static void main(String[] args) {
        System.out.println("Two Sum");
        int[] nums = {2,7,11,15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums, target)));
        ;
    }
}
