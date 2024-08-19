//Set Color LeetCode - 75

import java.util.Arrays;

public class SetColour {
    public static void sortColors(int[] nums){
        boolean swaped;
        for(int i = 0; i < nums.length -1; i++){
            swaped = false;
            for (int j = 0; j < nums.length -i -1; j++) {
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swaped = true;
                }
            }
            if(!swaped){
                break;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Set Color");
        int[] nums = {2,0,2,1,1,0};

        sortColors(nums);
        System.out.println(Arrays.toString(nums));
        


    }
}