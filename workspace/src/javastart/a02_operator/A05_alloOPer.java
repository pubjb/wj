package javastart.a02_operator;

public class A05_alloOPer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
/*
 * 곰돌이 3마리에게 현재 오렌지 3, 5, 6 개를 초기에 나누어 주었다.
 * 3회 7개씩 나누어 준 후, 곰돌이 3마리가 가지고 있는 총 오렌지 개수를
 * 계산하는 프로그램을 만들어 보세요.
 * 출력
 * 			곰돌이1		곰돌이2		곰돌이3		계
 * 1회		@@@			@@@			@@@			@@@
 * 2회		@@@			@@@			@@@			@@@
 * 3회		@@@			@@@			@@@			@@@
 * 		
 */
		
		int bear1 = 3;
		int bear2 = 5;
		int bear3 = 6;
		
		System.out.println("\t곰돌이1\t곰돌이2\t곰돌이3\t계");
		
		bear1 += 7;
		bear2 += 7;
		bear3 += 7;
		
		System.out.println("1회\t"+bear1+"\t"+bear2+"\t"+bear3+"\t"+(bear1+bear2+bear3));
		
		bear1 += 7;
		bear2 += 7;
		bear3 += 7;
		
		System.out.println("2회\t"+bear1+"\t"+bear2+"\t"+bear3+"\t"+(bear1+bear2+bear3));
		
		bear1 += 7;
		bear2 += 7;
		bear3 += 7;
		
		System.out.println("3회\t"+bear1+"\t"+bear2+"\t"+bear3+"\t"+(bear1+bear2+bear3));

	}

}
