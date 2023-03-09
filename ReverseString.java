import java.util.Arrays;

public class ReverseString {

  public void reverseString(char[] s) {
    int i = 0;
    int j = s.length - 1;
    char[] temp = new char[1];
    while (i < j) {
      temp[0] = s[i];
      s[i] = s[j];
      s[j] = temp[0];
      ++i;
      --j;
    }
  }

  public static void main(String[] args) {
    char[] s = new char[] {'h', 'e', 'l', 'l', 'o'};
    ReverseString rs = new ReverseString();
    rs.reverseString(s);
    System.out.println(Arrays.toString(s));
  }

}
