package Problems;

import java.util.Arrays;

public class RunningSumOf1DArray {

  public int[] runningSum(int[] nums) {
    int[] ans = new int[nums.length];
    ans[0] = nums[0];
    for(int i=1; i<nums.length; i++) {
      ans[i] = ans[i-1] + nums[i];
    }
    return ans;
  }

  public static void main(String[] args) {
    RunningSumOf1DArray runningSumOf1DArray = new RunningSumOf1DArray();
    int[] testcase = new int[] {1, 2, 3, 4, 5};
    System.out.println(Arrays.toString(runningSumOf1DArray.runningSum(testcase)));
  }

}
