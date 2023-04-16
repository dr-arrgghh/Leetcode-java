package contests;

import java.util.Scanner;
import java.util.HashMap;


public class Solution {
  //add keyvalue (colour, value)

  public StringBuilder solve(String s) {
    StringBuilder builder = new StringBuilder();
    int timeNow = Integer.parseInt(s.substring(0, 2));
    if (s.charAt(8) == 'P' && timeNow < 12) {
      int curr = timeNow;
      curr += 12;
      String res = Integer.toString(curr);
      builder.append(res);
      builder.append(s, 2, 8);
    } else if (s.substring(0, 2).equals("12") && s.charAt(8) == 'A') {
      int curr = Integer.parseInt("12");
      curr -= 12;
      String res = Integer.toString(curr);
      builder.append("0");
      builder.append(res);
      builder.append(s.substring(2, 8));
    } else {
      builder.append(s.substring(0, 8));
    }
    return builder;

  }

  public static void main(String[] args) throws Exception {
    Solution solution = new Solution();
    Scanner in = new Scanner(System.in);
    String noOfTestCases = in.nextLine();
    StringBuilder output = new StringBuilder();
    for (int i = 1; i <= Integer.parseInt(noOfTestCases); i++) {
      String input = in.nextLine();
      output.append("Case #" + i + ": " + solution.solve(input) + "\n");
    }
    System.out.print(output); // prints output to System.out
  }
}
