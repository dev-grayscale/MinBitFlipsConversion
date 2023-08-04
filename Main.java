/**
 * A bit flip of a number x is choosing a bit in the binary representation of x and flipping it from either 0 to 1 or 1 to 0.
 *
 * For example, for x = 7, the binary representation is 111, and we may choose any bit (including any leading zeros not shown) and flip it.
 * We can flip the first bit from the right to get 110, flip the second bit from the right to get 101,
 * flip the fifth bit from the right (a leading zero) to get 10111, etc.
 * Given two integers start and goal, return the minimum number of bit flips to convert start to goal.
 *
 * Input: start = 10, goal = 7
 * Output: 3
 * Explanation: The binary representation of 10 and 7 are 1010 and 0111 respectively. We can convert 10 to 7 in 3 steps:
 * - Flip the first bit from the right: 1010 -> 1011.
 * - Flip the third bit from the right: 1011 -> 1111.
 * - Flip the fourth bit from the right: 1111 -> 0111.
 *
 * https://leetcode.com/problems/minimum-bit-flips-to-convert-number/
 */
public class Main {

  /**
   * In other words, our task is to flip the bits until both numbers become equal.
   *
   * One approach could be to repeatedly check the bits at 0th position in both operands (check NumberOf1Bits#count1s for a better example why this works)
   * and increment the counter by 1 when they are different (a flip should take place). After each check, we shift all the bits with 1
   * position to the right, discarding the checked ones and repeat the process until the numbers are not equal.
   */
  public static int minBitFlips(int start, int goal) {
    int steps = 0;

    while (start != goal) {
      if ((start & 1) != (goal & 1)) {
        steps++;
      }

      start >>= 1;
      goal >>= 1;
    }

    return steps;
  }

  /**
   * Another solution could be achieved by applying xOR on both operands, producing
   * a result with 1s where the bits are different and flipping the bits there will make
   * the numbers equal. All we have to do is count the 1s (just like we did here: NumberOf1Bits#count1sV3) to get the minimum bits we need to flip.
   */
  public static int minBitFlipsV2(int start, int goal) {
    int steps = 0;

    int bits = start ^ goal;

    while (bits != 0) {
      steps++;
      bits = (bits & (bits - 1));
    }

    return steps;
  }
}
