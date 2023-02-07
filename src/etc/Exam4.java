package etc;

/**
 * 다이아몬드 별 찍기
 */
public class Exam4 {
  public static void main(String[] args) {
    int line = 11; // 홀수
    for (int i = 0; i < line; i++) {
      // 공백
      int spaces = Math.abs(line / 2 - i);
      for (int j = 0; j < spaces; j++) {
        System.out.print(" ");
      }
      // 별
      int stars = line - spaces * 2;
      for (int j = 0; j < stars; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
