package programmers;

/**
 * [1차] 다트 게임
 */
public class Solution061 {

  public static void main(String[] args) {
    String dartResult = "10D10T*10S";
    int solution = solution(dartResult);
    System.out.println(solution);
  }
  
  private static int getPowNum(String s) {
    return "D".equals(s) ? 2 : "T".equals(s) ? 3 : 1;
  }

  public static int solution(String dartResult) {
    String[] dart = dartResult.split("[SDT][*#]?");

    int aNum = Integer.parseInt(dart[0]);
    int bNum = Integer.parseInt(dart[1]);
    int cNum = Integer.parseInt(dart[2]);

    int aIndex = dartResult.indexOf(dart[0]) + dart[0].length();
    int bIndex = dartResult.indexOf(dart[1], aIndex) + dart[1].length();
    int cIndex = dartResult.indexOf(dart[2], bIndex) + dart[2].length();

    String aPow = dartResult.substring(aIndex, aIndex+1);
    String bPow = dartResult.substring(bIndex, bIndex+1);
    String cPow = dartResult.substring(cIndex, cIndex+1);

    String aMulti = dartResult.substring(aIndex + 1, aIndex + 2);
    String bMulti = dartResult.substring(bIndex + 1, bIndex + 2);
    String cMulti = dartResult.substring(cIndex + 1);

    int a = (int) Math.pow(aNum, getPowNum(aPow));
    int b = (int) Math.pow(bNum, getPowNum(bPow));
    int c = (int) Math.pow(cNum, getPowNum(cPow));

    // System.out.printf("%d %d %d\n", aNum, bNum, cNum);
    // System.out.printf("%s %s %s\n", aPow, bPow, cPow);
    // System.out.printf("%s %s %s\n", aMulti, bMulti, cMulti);
    // System.out.printf("%d %d %d\n", a, b, c);

    if (aMulti.equals("*")) {
      a *= 2;
    } else if (aMulti.equals("#")) {
      a *= -1;
    }

    if (bMulti.equals("*")) {
      a *= 2;
      b *= 2;
    } else if (bMulti.equals("#")) {
      b *= -1;
    }

    if (cMulti.equals("*")) {
      b *= 2;
      c *= 2;
    } else if (cMulti.equals("#")) {
      c *= -1;
    }

    return a + b + c;
  }
}
