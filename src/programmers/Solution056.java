package programmers;

/**
 * 소수 만들기
 */
public class Solution056 {
  public static void main(String[] args) {
    int[] nums = {1,2,7,6,4};
    int answer = 0;

    for (int i = 0; i < nums.length; i++) {
      for (int j = i+1; j < nums.length; j++) {
        for (int k = j+1; k < nums.length; k++) {
          answer += isPrime(nums[i]+nums[j]+nums[k]) ? 1 : 0;
        }
      }
    }

    System.out.println(answer);
  }

  private static boolean isPrime(int n) {
    if (n < 2) return false;
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) return false;
    }
    return true;
  }
}
