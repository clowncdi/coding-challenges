package exam;

import java.util.Arrays;

/*
* 배열의 요소들을 지그재그 재배열
* 1,2,3
* 6,5,4
* 7,8,9
*  , ,10
*/
public class Exam12 {
  public static void main(String[] args) {
    final int LASTNUM = 10;
    final int MAXCOLCOUNT = 3;
    int maxCount = LASTNUM / MAXCOLCOUNT + (LASTNUM % MAXCOLCOUNT > 0 ? 1 : 0);
    Integer[] data = new Integer[LASTNUM];
    for (int i = 0; i < LASTNUM; i++) {
      data[i] = i + 1;
    }
    Integer[][] result = new Integer[maxCount][MAXCOLCOUNT];
    int idx = 0;
    for (int i = 0; i < maxCount; i++) {
      if (i % 2 == 0) {
        for (int j = 0; j < MAXCOLCOUNT; j++) {
          if (idx < LASTNUM) {
            result[i][j] = data[idx++];
          }
        }
      } else {
        for (int j = MAXCOLCOUNT - 1; j >= 0 ; j--) {
          if (idx < LASTNUM) {
            result[i][j] = data[idx++];
          }
        }
      }
    }
    System.out.println(Arrays.deepToString(result));
  }
}
