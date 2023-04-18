package programmers;

import java.util.Arrays;

/**
 * 숫자 짝꿍
 */
public class Solution066 {
  public static void main(String[] args) {
    String X = "5525";
    String Y = "1255";
    String solution = solution(X, Y);
    System.out.println(solution);
  }

  public static String solution(String X, String Y) {
//    String[] xSplit = X.split("");
//    String rev = reverseToString(Y);
//    String[] ySplit = rev.split("");
//    Map<String, Integer> map = new HashMap<>();
//    for (String s : xSplit) {
//      map.put(s, map.getOrDefault(s, 0) + 1);
//    }
//
//    StringBuilder sb = new StringBuilder();
//    for (String s : ySplit) {
//      if (map.get(s) != null && map.get(s) > 0) {
//        sb.append(s);
//        map.put(s, map.get(s)-1);
//      }
//    }
//    if ("".contentEquals(sb)) {
//      sb.append("-1");
//    }
//    if (sb.charAt(0) == '0') {
//      sb.setLength(0);
//      sb.append("0");
//    }
//    return sb.toString();


    // 아래 방법이 속도나 메모리 효율성 면에서 훨씬 좋음
    StringBuilder answer = new StringBuilder();
    int[] x = {0,0,0,0,0,0,0,0,0,0};
    int[] y = {0,0,0,0,0,0,0,0,0,0};
    for(int i=0; i<X.length();i++){
      x[X.charAt(i)-48] += 1;
    }
    for(int i=0; i<Y.length();i++){
      y[Y.charAt(i)-48] += 1;
    }

    for(int i=9; i >= 0; i--){
      for(int j = 0; j < Math.min(x[i], y[i]); j++){
        answer.append(i);
      }
    }
    if("".equals(answer.toString())){
      return "-1";
    }else if(answer.toString().charAt(0)==48){
      return "0";
    }else {
      return answer.toString();
    }
  }

  private static String reverseToString(String str) {
    char[] charArray = str.toCharArray();
    Arrays.sort(charArray);
    return new StringBuilder(Arrays.toString(charArray)).reverse().toString();
  }
}
