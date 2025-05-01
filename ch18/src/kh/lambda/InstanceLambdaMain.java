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
		
		Atest atest = ( b,k)-> b.bcd(k);
		Atest atest2 = BObject2::bcd;
		
		atest.abc(new BObject2(),10);
		atest2.abc(new BObject2(), 20000);

		System.out.println("The end");
	}

}
