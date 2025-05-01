package kh.lambda;

public class LambdaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//임시객체 부 = new 자식()
		//입력없다, 출력 없다 => 람다식
		//A a =()->  System.out.println("입력없고 출력없다");
		
		//부모 추상메소드를 불러주면 -> 자식의 오버라이딩 함수가 작동이된다.
		//a.method();
		//System.out.println("================");
		//D d =(a,b)-> a+b; 
		//double value = d.methodD(10, 20.5);
		//System.out.printf("d.methodD(10, 20.5) = %.2F",value);
		
		B b =()-> 42;
		int value = b.methodB();
		System.out.printf("b.methodB(42)" + value);
		
	}	
	}
	
		// 자식 임시객체 자식이 부모 오버라이딩
		
	


