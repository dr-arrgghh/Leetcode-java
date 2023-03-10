package Problems;

import java.util.Arrays;

public class StoneGame {

  /**
   * A game to see which player wins.
   *
   * @param piles pile of stones given
   * @return true if ALice wins, false if Bob wins
   */
  public boolean stoneGame(int[] piles) {
    int length = piles.length;
    int[] alice = new int[length/2];
    int[] bob = new int[length/2];
    int indexA = 0;
    int indexB = 0;
    boolean turnA = true;
    int left = 0;
    int right = length - 1;
    while (left <= right) {
      System.out.println(left);
      if (turnA) {
        if (piles[left] == piles[right]) {
          int leftA = left++;
          int rightA = right--;
          if (piles[leftA] < piles[rightA]) {
            alice[indexA] = piles[left];
            indexA++;
            left++;
            turnA = false;
          } else {
            alice[indexA] = piles[right];
            indexA++;
            right--;
            turnA = false;
          }
        } else if (piles[left] < piles[right]) {
          alice[indexA] = piles[right];
          indexA++;
          right--;
          turnA = false;

        } else {
          alice[indexA] = piles[left];
          indexA++;
          left++;
          turnA = false;

        }
      } else {
        if (piles[left] == piles[right]) {
          int leftB = left++;
          int rightB = right--;
          if (piles[leftB] < piles[rightB]) {
            bob[indexB] = piles[left];
            indexB++;
            left++;
            turnA = true;
          } else {
            bob[indexB] = piles[right];
            indexB++;
            right--;
            turnA = true;
          }
        } else if (piles[left] <= piles[right]) {
          bob[indexB] = piles[right];
          indexB++;
          right--;
          turnA = true;

        } else {
          bob[indexB] = piles[left];
          indexB++;
          left++;
          turnA = true;
        }
      }
    }
    System.out.println(Arrays.toString(alice));
    System.out.println(Arrays.toString(bob));
    int valueA = 0;
    int valueB = 0;
    for (int k : alice) {
      valueA += k;
    }

    for (int i : bob) {
      valueB += i;
    }

    return valueA > valueB;
  }

  public static void main(String[] args) {
    int[] piles = new int[] {3,7,2,3};
    StoneGame stoneGame = new StoneGame();
    System.out.println(stoneGame.stoneGame(piles));
  }
}
