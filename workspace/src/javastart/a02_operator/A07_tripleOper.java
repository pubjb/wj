package javastart.a02_operator;

public class A07_tripleOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*
 * 90�̻� A,
 * 80~89 B,
 * 70~79 C,
 * 60~69 D,
 * 60�̸� F
 * 
 * ȹ������ : @@@
 * ������� : ###
 */
		
		int point = 99;
		char grade = 'F';
		
		if (point >= 90){
			grade = 'A';
		} else if (point >= 80){
			grade = 'B';
		} else if (point >= 70){
			grade = 'C';
		} else if (point >= 60){
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.println("ȹ�� ���� : " + point);
		System.out.println("���� ��� : " + grade);
		
			

	}

}
