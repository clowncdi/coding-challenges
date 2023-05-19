package exam;

import java.util.Scanner;

/**
 * 1부터 입력받은 숫자까지 소수만 출력하기
 */
public class Exam15 {
  public static void main(String[] args) {
    int num = new Scanner(System.in).nextInt();
    for (int i = 2; i <= num; i++) {
      if (isPrime(i)) {
        System.out.println(i);
      }
    }
  }

  private static boolean isPrime(int num) {
    if (num < 2) {
      return false;
    }

    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}