package special;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {

        int[] myNum = {2, 7, 11, 15};
        int[] response = twoSum(myNum, 9);

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];

        for (int i = 0; i < nums.length - 1; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }

        return ans;
    }
}
