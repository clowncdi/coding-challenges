package programmers;

/**
 * 최소직사각형
 */
public class Solution043 {
  public static void main(String[] args) {
    int[][] sizes = {{60, 50},{30, 70},{60, 30},{80, 40}};
    int width = 0;
    int height = 0;

    for (int[] size : sizes) {
      width = Math.max(width, Math.max(size[0], size[1]));
      height = Math.max(height, Math.min(size[0], size[1]));
    }

    System.out.println(width*height);
  }
}
