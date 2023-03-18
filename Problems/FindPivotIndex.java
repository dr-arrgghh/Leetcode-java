package Problems;

public class FindPivotIndex {

  public int pivotIndex(int[] nums) {
    int sum = 0;
    int leftsum = 0;
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
    }
    int index = 0;
    while (index < nums.length) {
      if (sum - leftsum - nums[index] == leftsum) {
        return index;
      } else {
        leftsum += nums[index];
        index++;
      }

    }
    return -1;

  }

  public static void main(String[] args) {
    int[] testcase = new int[] {1,7,3,6,5,6};
    FindPivotIndex findPivotIndex = new FindPivotIndex();
    System.out.println(findPivotIndex.pivotIndex(testcase));
  }

}
