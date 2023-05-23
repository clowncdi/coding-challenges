package programmers;

import java.util.*;

public class Solution078 {
  public static void main(String[] args) {
    String[] id_list = {"muzi", "frodo", "apeach", "neo"};
    String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
    int k = 2; //result : 2,1,1,0
//    String[] id_list = {"con", "ryan"};
//    String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
//    int k = 3; //result : 0,0
    int[] solution = solution(id_list, report, k);
    System.out.println(Arrays.toString(solution));
  }

  // 내가 신고 받은 숫자와 나를 신고한 사람들 수집 ex) muzi { 1, report["a","b"] } ...
  // 신고 제한 숫자인 k 숫자 이상 받은 사람의 reporters 에게 메일 보내기
  // id_list 순서대로 결과 메일 받은 숫자 출력
  public static int[] solution(String[] id_list, String[] report, int k) {
    // map 객체에 리스트 담기
    Map<String, Report> map = new LinkedHashMap<>();
    Arrays.stream(id_list).forEach(s -> map.put(s, new Report()));

    // set으로 신고 중복 제거하고 신고된 건수 확인
    Set<String> set = new HashSet<>(Arrays.asList(report));

    // reporter 등록
    set.forEach(s -> map.get(s.split(" ")[1]).addReporter(s.split(" ")[0]));

    // reporter들에게 mail 발송
    map.values().forEach(v -> v.sendMail(k, map));

    // id_list 순서대로 최종 메일 수신 결과 리턴
    return map.values().stream().map(Report::getReceiveMail).mapToInt(Integer::intValue).toArray();
  }

  private static class Report {
    private List<String> reporters;
    private int receiveMail;

    public Report() {
      this.reporters = new ArrayList<>();
      this.receiveMail = 0;
    }

    public void addReporter(String reporter) {
      this.reporters.add(reporter);
    }

    public void sendMail(int k, Map<String, Report> map) {
      if (reporters.size() >= k) {
        reporters.forEach(reporter -> map.get(reporter).addReceiveMail());
      }
    }

    public void addReceiveMail() {
      this.receiveMail++;
    }

    public int getReceiveMail() {
      return receiveMail;
    }
  }

}
