package javastart.a01_hello;

public class A04_inputData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int apple = Integer.parseInt(args[0]);
		int banana = Integer.parseInt(args[1]);
		int strawberry = Integer.parseInt(args[2]);
		
		System.out.println("과일의 개수");
		System.out.println("사과 개수 : " + apple);
		System.out.println("바나나 개수 : " + banana);
		System.out.println("딸기 개수 : " + strawberry);
		System.out.println("총 개수 : " + (apple + banana + strawberry));
				
		

	}

}
