package kh.consumer;

import java.util.function.Consumer;

public class ConsumerMain {

	public static void main(String[] args) throws InterruptedException {
		Thread T = new Thread();
		//인터페이스 -> 구현클래스 -> 구현객체 -> 부자관계 -> 부.추상메소드
		//Consumer X -> x ->구현객체(부자관계) -> 부.추상메소드
		/*
		 * Consumer<String>con = t-> System.out.printf("%s 님 환영합니다\n",t);
		 * con.accept("홍길동"); con.accept("구길동"); con.accept("저길동");
		 */
		System.out.println("=======================");
		Consumer<Integer>mt =  t -> {
			
			for(int i =0;i < 10;i++) {
				System.out.printf("%d * % d = %d\n",t ,i ,t*i);
			
		
		
			}
		};
		
		mt.accept(1);
		T.sleep(1000);
		mt.accept(2);
		T.sleep(1000);
		mt.accept(3);
		T.sleep(1000);
		mt.accept(4);
		T.sleep(1000);
		mt.accept(5);
		T.sleep(1000);
		mt.accept(6);
		T.sleep(1000);
		mt.accept(7);
		T.sleep(1000);
		mt.accept(8);
		T.sleep(1000);
		mt.accept(9);
		System.out.println("The end");
	}
}
