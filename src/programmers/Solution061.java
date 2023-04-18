package programmers;

import java.util.Arrays;

/**
 * [1차] 다트 게임
 */
public class Solution061 {
  
  private static int getPowNum(String s) {
    return "D".equals(s) ? 2 : "T".equals(s) ? 3 : 1;
  }

  public static int solution(String dartResult) {
    int answer = 0;
    int num = 0;
    boolean pivot = false;
    String[] dart = dartResult.split("[SDT][*#]?");
    System.out.println(Arrays.toString(dart));

    int a = Integer.parseInt(dart[0]);
    int b = Integer.parseInt(dart[1]);
    int c = Integer.parseInt(dart[2]);

    int aIndex = dartResult.indexOf(dart[0]) + dart[0].length();
    int bIndex = dartResult.indexOf(dart[1]) + dart[1].length();
    int cIndex = dartResult.indexOf(dart[2]) + dart[2].length();
    String aPow = dartResult.substring(aIndex, aIndex+1);
    String bPow = dartResult.substring(bIndex, bIndex+1);
    String cPow = dartResult.substring(cIndex, cIndex+1);

    int[] multi = {-1,-1,-1};
    int[] minus = {-1,-1,-1};
    for (int i = 0; i < 3; i++) {
      int star = dartResult.indexOf("*");
      if (star > 0) {
        dartResult.replace("*", "");
      }
      int shap = dartResult.indexOf("#");
      if (shap > 0) {
        dartResult.replace("#", "");
      }
    }

    int a1 = a * (int) Math.pow(a, getPowNum(aPow));
    int b1 = b * (int) Math.pow(b, getPowNum(bPow));
    int c1 = c * (int) Math.pow(c, getPowNum(cPow));

    for (int i = 0; i < 3; i++) {
      if (multi[i] > 0) {
        int i1 = multi[i] < 3 ? a1 * 2 : multi[i] < 7 ? (a1 + b1) * 2 : (a1 + b1 + c1) * 2;
      }
    }

    System.out.println(Arrays.toString(multi));
    System.out.println(Arrays.toString(minus));

//    for (String s : dart) {
//      if (s.equals("*")) {
//        answer = answer * 2;
//        pivot = false;
//        continue;
//      } else if (s.equals("#")) {
//        answer = answer * (-1);
//        pivot = false;
//        continue;
//      } else if (s.matches("\\d{1,2}")) {
//        num = Integer.parseInt(s);
//        pivot = true;
//        continue;
//      } else if (s.matches("[SDT]")) {
//        num = s.equals("D") ? (int)Math.pow(num, 2) :
//            s.equals("T") ? (int)Math.pow(num, 3) : num;
//        if (pivot) {
//          answer += num;
//        }
//        continue;
//      }
//    }
    return answer;
  }

  public static void main(String[] args) {
    String dartResult = "1D2S#10S*";
    int solution = solution(dartResult);
    System.out.println(solution);
  }
}
