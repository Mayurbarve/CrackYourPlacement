//Find the Duplicate Number : leetCode- 287

import java.util.HashSet;

public class DuplicateNumber {
    public static int findDuplicate(int[] nums){
        HashSet<Integer> set = new HashSet<>();

        int DuplicateNum = -1;
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])){
               DuplicateNum = nums[i]; 
            }
            else{
                set.add(nums[i]);
            }
        }
        return DuplicateNum;
    }
    public static void main(String[] args) {
        System.out.println("Count of Duplicate Numbers");

        int[] nums = {3,3,3,3,3};

        System.out.println(findDuplicate(nums));
        
    }
    
}
