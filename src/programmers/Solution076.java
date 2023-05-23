package programmers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Solution076 {
  public static void main(String[] args) {
    String today = "2022.05.19";
    String[] terms = {"A 6", "B 12", "C 3"};
    String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
    int[] solution = solution(today, terms, privacies);
    System.out.println(Arrays.toString(solution));
  }

  public static int[] solution(String today, String[] terms, String[] privacies) {
    List<Integer> answer = new ArrayList<>();
    int count = 0;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
    LocalDate currentDate = LocalDate.parse(today, formatter);

    Map<String, Integer> termMap = new HashMap<>();
    for (String term : terms) {
      termMap.put(term.split(" ")[0], Integer.parseInt(term.split(" ")[1]));
    }

    for (String privacy : privacies) {
      count++;
      Integer month = termMap.get(privacy.split(" ")[1]);
      LocalDate expirationDate = LocalDate.parse(privacy.split(" ")[0], formatter).plusMonths(month);
      if (expirationDate.isEqual(currentDate) || expirationDate.isBefore(currentDate)) {
        answer.add(count);
      }
    }

    return answer.stream().sorted().mapToInt(Integer::new).toArray();
  }
}
