package javastart.a02_operator;

public class A05_alloOPer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
/*
 * ������ 3�������� ���� ������ 3, 5, 6 ���� �ʱ⿡ ������ �־���.
 * 3ȸ 7���� ������ �� ��, ������ 3������ ������ �ִ� �� ������ ������
 * ����ϴ� ���α׷��� ����� ������.
 * ���
 * 			������1		������2		������3		��
 * 1ȸ		@@@			@@@			@@@			@@@
 * 2ȸ		@@@			@@@			@@@			@@@
 * 3ȸ		@@@			@@@			@@@			@@@
 * 		
 */
		
		int bear1 = 3;
		int bear2 = 5;
		int bear3 = 6;
		
		System.out.println("\t������1\t������2\t������3\t��");
		
		bear1 += 7;
		bear2 += 7;
		bear3 += 7;
		
		System.out.println("1ȸ\t"+bear1+"\t"+bear2+"\t"+bear3+"\t"+(bear1+bear2+bear3));
		
		bear1 += 7;
		bear2 += 7;
		bear3 += 7;
		
		System.out.println("2ȸ\t"+bear1+"\t"+bear2+"\t"+bear3+"\t"+(bear1+bear2+bear3));
		
		bear1 += 7;
		bear2 += 7;
		bear3 += 7;
		
		System.out.println("3ȸ\t"+bear1+"\t"+bear2+"\t"+bear3+"\t"+(bear1+bear2+bear3));

	}

}
