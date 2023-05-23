package programmers;

/**
 * 키패드 누르기
 */
public class Solution069 {
  public static void main(String[] args) {
    int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
    String hand = "right";
    String solution = solution(numbers, hand);
    System.out.println(solution);
  }

  public static String solution(int[] numbers, String hand) {
    StringBuilder sb = new StringBuilder();
    String defaultHand = hand.substring(0, 1).toUpperCase();
    char result;
    int left = 10;
    int right = 12;
    for (int n : numbers) {
      if ((n-1) % 3 == 0) { // 1,4,7 일 때
        left = n;
        result = 'L';
      } else if (n % 3 == 0) { // 3,6,9 일 때
        right = n;
        result = 'R';
      } else { // 2,5,8,10(0) 일 때
        String matched = getMatchedResult(n, left, right);
        if (matched.equals("LR")) {
          if ("L".equals(defaultHand)) {
            left = n;
          } else {
            right = n;
          }
          result = defaultHand.charAt(0);
        } else if ("L".equals(matched)) {
          left = n;
          result = matched.charAt(0);
        } else {
          right = n;
          result = matched.charAt(0);
        }
      }
      sb.append(result);

    }
    return sb.toString();
  }

  private static String getMatchedResult(int n, int left, int right) {
    int leftDistance = Math.abs(left % 3) + Math.abs(n / 3);
    int rightDistance = Math.abs(right % 3) + Math.abs(n / 3);
    return leftDistance == rightDistance ? "LR" : leftDistance > rightDistance ? "L" : "R";
  }

}
