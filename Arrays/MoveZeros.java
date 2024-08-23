//Move Zeros in the end of the array: leetCode - 283

import java.util.Arrays;

public class MoveZeros {
    public static void moveZeroes(int[] nums) {
        int addPosition = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[addPosition] = nums[i];
                addPosition++;
            }
        }

        while (addPosition < nums.length) {
            nums[addPosition++] = 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Move Zeros");
        int[] arr = { 0, 1, 0, 3, 12 };

        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}