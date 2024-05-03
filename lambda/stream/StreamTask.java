package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class StreamTask {
	public boolean checkOdd(int number) {
		return number % 2 != 0;
	}
	
	public boolean checkD(int number) {
		return number != 68;
	}
	
	public boolean checkLarge(String string) {
			return string.charAt(0) >= 65 && string.charAt(0) <= 90;
	}
	
	public boolean checkStringD(String string) {
		return "D".equals(string);
	}
	
	public int changeHangleToNumber(int number) {
		String hangles = "공일이삼사오육칠팔구";
		
		return hangles.indexOf((char)number);
	}
	
	public int changeHangleToNumber2(String string) {
		String hangles = "공일이삼사오육칠팔구";
		return hangles.indexOf(string);
	}
		
	public int changeNumberToHangle(int number) {
		String numbers = "0123456789";
		
		return numbers.indexOf((char)number);
	}
	
	public char changeNumberToHangle2(String string) {
		String hangles = "공일이삼사오육칠팔구";
		return hangles.charAt(Integer.parseInt(string));
	}
	
   public static void main(String[] args) {
	   StreamTask streamTask = new StreamTask();
	   Scanner sc = new Scanner(System.in);
	   
//	   1번 1~10까지 ArrayList에 담고 출력 (IntStream을 활용하여 ArrayList의 객체인 datas의 각 인덱스에 번호를 추가하고 ArrayLisst를 출력하는 방식)
//	   ArrayList<Integer> datas = new ArrayList<Integer>();
//	   IntStream.range(0, 10).forEach(number -> datas.add(number+1));
//	   System.out.println(datas);
	   
//	   1~10까지 ArrayList에 담고 출력(Arrays.asList를 활용하여 ArrayList에 직접 넣고 size만큼 인덱스 번호로 출력)
//	   ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
//	   System.out.println(datas);
	   
//	   2번 ABCDEF를 각 문자별로 출력
//	   String data = "ABCDEF";
//	   data.chars().forEach(number -> System.out.print((char)number + " "));
	   
//	   강사님 코드
//	   "ABCDEF".chars().forEach(c -> System.out.println((char)c));
	   
//	   3번 1~100까지 중 홀수만 ArrayList에 담고 출력
//	   ArrayList<Integer> datas = new ArrayList<Integer>();
////	   필터 조건식 직접 입력
//	   IntStream.rangeClosed(1, 100).filter(number -> number % 2 != 0).forEach(datas::add);
////	   필터 조건식 메소드 활용
//	   IntStream.rangeClosed(1, 100).filter(streamTask::checkOdd).forEach(datas::add);
////	   50번만 반복하기
//	   IntStream.range(0, 50).map(num -> num * 2 + 1).forEach(datas::add);
//	   
//	   System.out.println(datas);
	   
//	   4번 A~F까지 중 D제외하고 ArrayList에 담고 출력
//	   String 리스트에 A~F까지 담는데 filter로 D만 제외시키고 담기
//	   String data = "ABCDEF";
//	   ArrayList<String> datas = new ArrayList<String>();
//	   data.chars().filter(streamTask::checkD).forEach(number -> datas.add(String.valueOf((char)number)));
//	   System.out.println(datas);
	   
//	   강사님 코드
//	   ArrayList<Character> datas = new ArrayList<Character>();
//	   IntStream.range('A', 'F').map(number -> number > 67 ? number + 1 : number).forEach(c -> datas.add((char)c));
//	   System.out.println(datas);
	   
//	   5번 5개의 문자열을 모두 소문자로 변경(Black, WHITE, reD, yeLLow, PINk), toLowerCase()
//	   ArrayList<String> datas = new ArrayList<String>(Arrays.asList("Black","WHITE","reD","yeLLow","PINk"));
//	   datas.stream().map(String::toLowerCase).forEach(System.out::println);
	   
////	   리스트에 담고 출력
//	   List<String> toLowerdatas = datas.stream().map(String::toLowerCase).collect(Collectors.toList());
//	   System.out.println(toLowerdatas);
////	   String으로 출력
//	   String stringToLowerdatas = datas.stream().map(String::toLowerCase).collect(Collectors.joining(","));
//	   System.out.println(stringToLowerdatas);
	   
//	   7번 Apple, banana, Melon 중 첫 번째 문자가 대문자인 문자열 출력
//	   ArrayList<String> datas = new ArrayList<String>(Arrays.asList("Apple","banana","Melon"));
//	   datas.stream().filter(streamTask::checkLarge).forEach(word -> {System.out.println(word);});
////	   리스트에 담고 출력
//	   List<String> newDatas = datas.stream().filter(streamTask::checkLarge).collect(Collectors.toList());
//	   System.out.println(newDatas);
//	   강사님 코드
//	   ArrayList<String> datas = new ArrayList<String>(Arrays.asList("Apple","banana","Melon"));
//	   datas.stream()
//	   		.filter(data -> data.charAt(0) >= 'A')
//	   			.filter(data -> data.charAt(0) <= 'Z')
//	   				.forEach(System.out::println);
	   
//	   8번 한글을 정수로 변경
//	   String hangle = "공일공사구일이사공팔삼";
//	   
//	   hangle.chars().forEach(s -> {System.out.print(streamTask.changeHangleToNumber(s));});
	   
//	   강사님 코드
//	   String hangle = "공일이삼사오육칠팔구";
//	   String data = "공일공사구일이사공팔삼";
//	   
//	   hangle.chars().map(hangle::indexOf).forEach(System.out::print);
	   
//	   한글을 입력받고 정수로 변경
//	   String message = "정수를 한글로 입력하세요. : ", examplemessage = "예) 공일이삼사오육칠팔구",
//			   hangle = null, numbers = "0123456789";
//	   String[] hangles = null;
//			   
//	   System.out.println(message);
//	   System.out.println(examplemessage);
//	   hangle = sc.nextLine();
//	   hangle = hangle.trim();
//	   hangle = hangle.replaceAll(" ", "");
//	   hangles = hangle.split("");
//	   
//	   ArrayList<String> hanglesList = new ArrayList<String>(Arrays.asList(hangles));
//	   hanglesList.stream().map(streamTask::changeHangleToNumber2).forEach(num -> {System.out.print(numbers.charAt(num));});
//	   System.out.println();
////	   리스트에 담고 출력
//	   List<Integer> numbersList = hanglesList.stream().map(streamTask::changeHangleToNumber2).collect(Collectors.toList());
//	   System.out.println(numbersList);
	   
//	   9번 정수를 한글로 변경
//	   String numbers = "01049124083", hangles = "공일이삼사오육칠팔구";
//	   
//	   numbers.chars().map(streamTask::changeNumberToHangle).forEach(s-> {System.out.print(hangles.charAt(s));});
	   
//	   정수를 입력받고 한글로 변경
//	   String message = "정수를 입력하세요. : ", examplemessage = "예) 01049124083",
//			   number = null, hangles = "공일이삼사오육칠팔구";
//	   String[] numbers = null;
//			   
//	   System.out.println(message);
//	   System.out.println(examplemessage);
//	   number = sc.nextLine();
//	   number = number.trim();
//	   number = number.replaceAll(" ", "");
//	   
//	   numbers = number.split("");
//	   ArrayList<String> numbersList = new ArrayList<String>(Arrays.asList(numbers));
//	   
//	   numbersList.stream().map(streamTask::changeNumberToHangle2).forEach(System.out::print);
//	   System.out.println();
////	   리스트에 담아서 출력
//	   List<Character> changeList = numbersList.stream().map(streamTask::changeNumberToHangle2).collect(Collectors.toList());
//	   System.out.println(changeList);
	   
//	   강사님 코드
//	   String hangle = "공일이삼사오육칠팔구";
//	   String number = "01049124083";
//	   
//	   number.chars().map(c -> c - 48).forEach(s->System.out.print(hangle.charAt(s)));
   }
}
