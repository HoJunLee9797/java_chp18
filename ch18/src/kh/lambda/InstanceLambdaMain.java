package kh.lambda;

public class InstanceLambdaMain {

	public static void main(String[] args) {
		// 람다식(함수형 인터페이스 -> 인스턴스메소드 System.out.println()
		C c = p -> System.out.println(p);

		C C2 = System.out::println;
		c.methodC(10);
		C2.methodC(100);
		// =========================================
		System.out.println("=====================");
		A a = () -> Bobject.bcd();
		A a2 =  Bobject::bcd;
		
		a.method();

		System.out.println("The end");
	}

}
