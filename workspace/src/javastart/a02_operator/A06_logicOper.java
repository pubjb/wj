package javastart.a02_operator;


public class A06_logicOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int kor = 99;
		int eng = 99;
		int math = 40;
		int avg = (kor + eng + math) / 3;
		boolean isPassed = false;
		
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + math);
		System.out.println("��� : " + avg);
		
		isPassed = (avg >= 70 && kor >= 40 && eng >= 40 && math >= 40);
		
		System.out.println("�԰� ���� : " + isPassed);
		

		
//		byte[] bb = {'J', 'A', 'V', 'A'};
//		System.out.write(bb);
		


	}

}
