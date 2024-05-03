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
		String hangles = "�����̻�����ĥ�ȱ�";
		
		return hangles.indexOf((char)number);
	}
	
	public int changeHangleToNumber2(String string) {
		String hangles = "�����̻�����ĥ�ȱ�";
		return hangles.indexOf(string);
	}
		
	public int changeNumberToHangle(int number) {
		String numbers = "0123456789";
		
		return numbers.indexOf((char)number);
	}
	
	public char changeNumberToHangle2(String string) {
		String hangles = "�����̻�����ĥ�ȱ�";
		return hangles.charAt(Integer.parseInt(string));
	}
	
   public static void main(String[] args) {
	   StreamTask streamTask = new StreamTask();
	   Scanner sc = new Scanner(System.in);
	   
//	   1�� 1~10���� ArrayList�� ��� ��� (IntStream�� Ȱ���Ͽ� ArrayList�� ��ü�� datas�� �� �ε����� ��ȣ�� �߰��ϰ� ArrayLisst�� ����ϴ� ���)
//	   ArrayList<Integer> datas = new ArrayList<Integer>();
//	   IntStream.range(0, 10).forEach(number -> datas.add(number+1));
//	   System.out.println(datas);
	   
//	   1~10���� ArrayList�� ��� ���(Arrays.asList�� Ȱ���Ͽ� ArrayList�� ���� �ְ� size��ŭ �ε��� ��ȣ�� ���)
//	   ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
//	   System.out.println(datas);
	   
//	   2�� ABCDEF�� �� ���ں��� ���
//	   String data = "ABCDEF";
//	   data.chars().forEach(number -> System.out.print((char)number + " "));
	   
//	   ����� �ڵ�
//	   "ABCDEF".chars().forEach(c -> System.out.println((char)c));
	   
//	   3�� 1~100���� �� Ȧ���� ArrayList�� ��� ���
//	   ArrayList<Integer> datas = new ArrayList<Integer>();
////	   ���� ���ǽ� ���� �Է�
//	   IntStream.rangeClosed(1, 100).filter(number -> number % 2 != 0).forEach(datas::add);
////	   ���� ���ǽ� �޼ҵ� Ȱ��
//	   IntStream.rangeClosed(1, 100).filter(streamTask::checkOdd).forEach(datas::add);
////	   50���� �ݺ��ϱ�
//	   IntStream.range(0, 50).map(num -> num * 2 + 1).forEach(datas::add);
//	   
//	   System.out.println(datas);
	   
//	   4�� A~F���� �� D�����ϰ� ArrayList�� ��� ���
//	   String ����Ʈ�� A~F���� ��µ� filter�� D�� ���ܽ�Ű�� ���
//	   String data = "ABCDEF";
//	   ArrayList<String> datas = new ArrayList<String>();
//	   data.chars().filter(streamTask::checkD).forEach(number -> datas.add(String.valueOf((char)number)));
//	   System.out.println(datas);
	   
//	   ����� �ڵ�
//	   ArrayList<Character> datas = new ArrayList<Character>();
//	   IntStream.range('A', 'F').map(number -> number > 67 ? number + 1 : number).forEach(c -> datas.add((char)c));
//	   System.out.println(datas);
	   
//	   5�� 5���� ���ڿ��� ��� �ҹ��ڷ� ����(Black, WHITE, reD, yeLLow, PINk), toLowerCase()
//	   ArrayList<String> datas = new ArrayList<String>(Arrays.asList("Black","WHITE","reD","yeLLow","PINk"));
//	   datas.stream().map(String::toLowerCase).forEach(System.out::println);
	   
////	   ����Ʈ�� ��� ���
//	   List<String> toLowerdatas = datas.stream().map(String::toLowerCase).collect(Collectors.toList());
//	   System.out.println(toLowerdatas);
////	   String���� ���
//	   String stringToLowerdatas = datas.stream().map(String::toLowerCase).collect(Collectors.joining(","));
//	   System.out.println(stringToLowerdatas);
	   
//	   7�� Apple, banana, Melon �� ù ��° ���ڰ� �빮���� ���ڿ� ���
//	   ArrayList<String> datas = new ArrayList<String>(Arrays.asList("Apple","banana","Melon"));
//	   datas.stream().filter(streamTask::checkLarge).forEach(word -> {System.out.println(word);});
////	   ����Ʈ�� ��� ���
//	   List<String> newDatas = datas.stream().filter(streamTask::checkLarge).collect(Collectors.toList());
//	   System.out.println(newDatas);
//	   ����� �ڵ�
//	   ArrayList<String> datas = new ArrayList<String>(Arrays.asList("Apple","banana","Melon"));
//	   datas.stream()
//	   		.filter(data -> data.charAt(0) >= 'A')
//	   			.filter(data -> data.charAt(0) <= 'Z')
//	   				.forEach(System.out::println);
	   
//	   8�� �ѱ��� ������ ����
//	   String hangle = "���ϰ��籸���̻���Ȼ�";
//	   
//	   hangle.chars().forEach(s -> {System.out.print(streamTask.changeHangleToNumber(s));});
	   
//	   ����� �ڵ�
//	   String hangle = "�����̻�����ĥ�ȱ�";
//	   String data = "���ϰ��籸���̻���Ȼ�";
//	   
//	   hangle.chars().map(hangle::indexOf).forEach(System.out::print);
	   
//	   �ѱ��� �Է¹ް� ������ ����
//	   String message = "������ �ѱ۷� �Է��ϼ���. : ", examplemessage = "��) �����̻�����ĥ�ȱ�",
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
////	   ����Ʈ�� ��� ���
//	   List<Integer> numbersList = hanglesList.stream().map(streamTask::changeHangleToNumber2).collect(Collectors.toList());
//	   System.out.println(numbersList);
	   
//	   9�� ������ �ѱ۷� ����
//	   String numbers = "01049124083", hangles = "�����̻�����ĥ�ȱ�";
//	   
//	   numbers.chars().map(streamTask::changeNumberToHangle).forEach(s-> {System.out.print(hangles.charAt(s));});
	   
//	   ������ �Է¹ް� �ѱ۷� ����
//	   String message = "������ �Է��ϼ���. : ", examplemessage = "��) 01049124083",
//			   number = null, hangles = "�����̻�����ĥ�ȱ�";
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
////	   ����Ʈ�� ��Ƽ� ���
//	   List<Character> changeList = numbersList.stream().map(streamTask::changeNumberToHangle2).collect(Collectors.toList());
//	   System.out.println(changeList);
	   
//	   ����� �ڵ�
//	   String hangle = "�����̻�����ĥ�ȱ�";
//	   String number = "01049124083";
//	   
//	   number.chars().map(c -> c - 48).forEach(s->System.out.print(hangle.charAt(s)));
   }
}
