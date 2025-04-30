package kh.lambda;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		//구현 객체를 생성한다.
		TestChild tc = new TestChild();
		
		Test test = tc;
		
		
		//다형성을 구현한다.
	int kor	=test.methodTest("국어");
	System.out.printf("국어점수 = %d \n",kor);
	System.out.println("++++++++++++++++++++++");
	System.out.println("The end");
	
	Test test2 = a-> {

		Scanner scan = new Scanner(System.in);
		System.out.printf("%s 점수요청:",a);
		int value = Integer.parseInt(scan.nextLine());
		return value;
		};
		int eng = test.methodTest("영어");
		System.out.printf("영어점수 = %d \n",eng);
		
		System.out.println("The end");
		
	}

}
