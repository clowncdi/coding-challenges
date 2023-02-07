package etc;

/**
 * 다음과 같은 형태로 패턴이 이어질 때 60번째의 배열값을 얻어보세요.
 * {"", "☆", "", "○", "", "□", "", "☆", "", "○"};
 * {"●", "☆", "", "○", "★", "□", "", "☆", "■", "○"};
 * {"●", "☆", "■", "○", "★", "□", "●", "☆", "■", "○"};
 */
public class Exam5 {
  public static void main(String[] args) {
    // 60번 반복
    // 동그라미, 별, 네모
    // 짝수: 색칠, 홀수: 안색칠
    final int loops = 60;
    String shape = "";
    for (int i = 0; i < loops; i++) {
      if (i % 3 == 0) {
        if (i % 2 == 0) {
          shape = "●";
        } else {
          shape = "○";
        }
      } else if (i % 3 == 1) {
        if (i % 2 == 0) {
          shape = "★";
        } else {
          shape = "☆";
        }
      } else if (i % 3 == 2) {
        if (i % 2 == 0) {
          shape = "■";
        } else {
          shape = "□";
        }
      }
      // 2, 3, 1, 3
      int[] count = {2, 3, 1, 3};
      System.out.println((i+1) + " " + (count[i % 4] > 2 ? shape : ""));
      System.out.println((i+1) + " " + (count[i % 4] > 1 ? shape : ""));
      System.out.println((i+1) + " " + (count[i % 4] > 0 ? shape : ""));
    }
  }
}
