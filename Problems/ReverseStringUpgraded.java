package Problems;

public class ReverseStringUpgraded {
  public String reverseWords(String s) {
    String[] initial;
    initial = s.split(" ");
    String[] output = new String[initial.length];
    int index = 0;
    for (String str : initial) {
      char[] c = str.toCharArray();
      int i = 0;
      int j = c.length - 1;
      char[] temp = new char[1];
      while (i < j) {
        temp[0] = c[i];
        c[i] = c[j];
        c[j] = temp[0];
        i++;
        j--;
      }
      output[index] = new String(c);
      index++;

    }
    return String.join(" ", output);
  }

  public static void main(String[] args) {
    String s = "Let's take LeetCode contest";
    ReverseStringUpgraded reverseStringUpgraded = new ReverseStringUpgraded();
    System.out.println(reverseStringUpgraded.reverseWords(s));
  }
}
