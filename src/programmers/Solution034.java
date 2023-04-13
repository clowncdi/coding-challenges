package programmers;

/**
 * 부족한 금액 계산하기
 */
public class Solution034 {
  public static void main(String[] args) {
    int price = 3;
    int money = 20;
    int count = 4;
    long answer = money;

    for (int i = 1; i <= count; i++) {
      answer -= price * i;
    }

    // 등차수열을 이용하는 방법도 있음
    // ((처음 + 끝) * 반복횟수 ) / 2
    // ((3+12)*4)/2 = 30


    System.out.println(answer > 0 ? 0 : answer * 1);

  }
}
