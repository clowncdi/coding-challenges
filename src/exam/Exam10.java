package exam;

import java.util.Scanner;

/*
* 가위바위보 게임
* 비김 - 가위(1) : 가위(1), 바위(2) : 바위(2), 보(3) : 보(3) = 0
* 패 - 가위(1) : 바위(2), 바위(2) : 보(3), 보(3) : 가위(1) = -1, 2
* 승 - 가위(1) : 보(3), 바위(2) : 가위(1), 보(3) : 바위(2) = -2, 1
*/
public class Exam10 {
  public static void main(String[] args) {
    // 가위(1), 바위(2), 보(3)
    Scanner sc = new Scanner(System.in);
    while (true) {
      int myNum = sc.nextInt();
      int comNum = (int) (Math.random() * 3 + 1);
      String result = "";

      if (myNum < 1 || myNum > 3) {
        System.out.println("종료합니다.");
        break;
      } else if (myNum == comNum) {
        result = "비겼습니다.";
      }

      int resultInt = myNum - comNum;
      if (resultInt == -1 || resultInt == 2) {
        result = "졌습니다.";
      } else if (resultInt == -2 || resultInt == 1) {
        result = "이겼습니다.";
      }

      System.out.printf(result + " %s : %s\n", translate(myNum), translate(comNum));
    }
  }

  private static String translate(int num) {
    return num == 1 ? "가위" : num == 2 ? "바위" : "보";
  }
}
