package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest {
   
   public String addRoot(String url) {
      return "/app" + url;
   }
   
   public boolean checkOdd(int number) {
      return number % 2 != 0;
   }
   
   public static void main(String[] args) {
      
//      IntStream
      IntStream.range(0, 10)
      IntStream.rangeClosed(0, 9)
      
//      forEach()
      IntStream.range(0, 10).forEach(num -> {System.out.println(num);});
      IntStream.rangeClosed(0, 9).forEach(num -> {System.out.println(num + 1);});
      
      ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
      datas.forEach(number -> {System.out.println(number);});
      datas.forEach(System.out::println);
      
      ArrayList<Integer> datas= new ArrayList<Integer>();
      IntStream.rangeClosed(1, 10).forEach(datas::add);
      System.out.println(datas);
      
//      10~1까지 ArrayList에 담고 출력
      ArrayList<Integer> datas = new ArrayList<Integer>();
      IntStream.rangeClosed(0, 9).forEach(data -> {datas.add(10 - data);});
      System.out.println(datas);
      
//      인덱스 0부터 4까지 삭제
      IntStream.range(0, 5).forEach(data -> datas.remove(0));

      System.out.println(datas);
      
//      chars(): 문자열을 IntStream으로 변환
      String data = "ABC";
      data.chars().forEach(System.out::println);
      data.chars().forEach(c -> {System.out.println((char)c);});
      
//      map(): 기존 값을 다른 값으로 변경
      String data = "ABC";
      data.chars().map(c -> c + 4).forEach(c -> {System.out.println((char)c);});
      
      User user1 = new User(1, "김개똥", 20, "개발자");
      User user2 = new User(2, "아무개", 20, "소방관");
      User user3 = new User(3, "강해린", 20, "가수");
      User user4 = new User(4, "김민지", 20, "댄서");
      User user5 = new User(5, "하니", 20, "연예인");

      ArrayList<User> users = new ArrayList<User>();

      users.add(user1);
      users.add(user2);
      users.add(user3);
      users.add(user4);
      users.add(user5);

      users.stream().map(User::getJob).forEach(System.out::println);
      users.stream().map(User::getJob).map(job -> "����: " + job).forEach(System.out::println);
      
//      아래의 4개 URL을 List에 담은 후 모든 경로 앞에 /app을 붙여준다.
//      /news, /game, /brand, /ranking
      StreamTest streamTest = new StreamTest();
      ArrayList<String> urls = new ArrayList<String>(Arrays.asList("/news", "/game", "/brand", "/ranking"));
      urls.stream().map(streamTest::addRoot).forEach(url -> System.out.println(url));
      
//      sorted()
      ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(1, 6, 3, 2, 7));
      datas.stream().sorted().forEach(System.out::print);
      System.out.println();
      datas.stream().sorted(Collections.reverseOrder()).forEach(System.out::print);
      
//      collect(): 결과를 다양한 타입으로 리턴한다. - Intstream.
      ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(1, 6, 3, 2, 7));
      List<Integer> sortedDatas = datas.stream().sorted().collect(Collectors.toList());
      System.out.println(sortedDatas);
      
      String data = datas.stream().sorted().map(String::valueOf).collect(Collectors.joining(":"));
      System.out.println(data);
      
//      filter(): 리턴이 true일 때에만 다음으로 전달
      StreamTest streamTest = new StreamTest();
      ArrayList<Integer> datas = new ArrayList<Integer>();
      IntStream.range(0, 10).filter(data -> data % 2 == 0).forEach(System.out::print);
      IntStream.range(0, 10).filter(streamTest::checkOdd).forEach(datas::add);
      System.out.println(datas);
   }
}



