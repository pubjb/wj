package javastart.a02_operator;

public class A01_calcu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
/*
 * ��������� : +, -, *, /, %
 * % : ������ ������ : �ش� �������� ���� ������ ������ �κ� ó��
 */
		//System.out.println("20 % 7 = " + 20 % 7 );
		
/*
 * ��� 50���� 3���� ������ �ֱ�� �߽��ϴ�.
 * 1��� ��� ������ �ְ�, ������ @@���� ���� ���� ���α׷��ҷ��� �Ѵ�.
 * �̶�, ���� ����� �� ���� ������ ����� ������� args�� �޾Ƽ�
 * ���������� ó���ϴ� ���α׷��� ����ٸ�...		
 */
		
//		String fruit = args[0];
//		int fruitCnt = Integer.parseInt(args[1]);
//		int peopleCnt = Integer.parseInt(args[2]);
//		
//		System.out.println("���� ���� : " + fruit);
//		System.out.println("���� ���� : " + fruitCnt);
//		System.out.println("�������� �ο� : " + peopleCnt);
//		System.out.println("1��� ���� ���� : " + (fruitCnt / peopleCnt));
//		System.out.println("������ ���� : " + (fruitCnt % peopleCnt));
		
/*
 * �Ʒ� ������ ������ args ������ �޾Ƽ� ó���ϼ���
 * 
 * 
 * @@@: args ������ �޾Ƽ� ó��
 * ###: ����ó���ؼ� ��Ÿ���� �κ�
 * 
 * 
 * �������� ���α׷�
 * 					�� : @@@		ex) 3-4��, ������а�
 * NO	�̸�		����		����		����		����		���(�Ǽ�)
 * ##	@@@		@@@		@@@		@@@		###		###
 * ##	@@@		@@@		@@@		@@@		###		###		
 * 		
 */
		
		int recordCnt = 0;		
		String className = args[0];
		
		String name1 = args[1];
		int korean1 = Integer.parseInt(args[2]);
		int math1 = Integer.parseInt(args[3]);
		int eng1 = Integer.parseInt(args[4]);
		
		String name2 = args[5];
		int korean2 = Integer.parseInt(args[6]);
		int math2 = Integer.parseInt(args[7]);
		int eng2 = Integer.parseInt(args[8]);
		
		int tot1 = korean1 + math1 + eng1;
		int tot2 = korean2 + math2 + eng2;
		
		double avg1 = tot1 / 3.0;
		double avg2 = tot2 / 3.0;
		
		System.out.println("�������� ���α׷�");
		System.out.println("\t\t\t�� : " + className);
		System.out.println("NO\t�̸�\t����\t����\t����\t����\t���");
		System.out.println(recordCnt+1 + "\t" + name1 + "\t" + korean1 + "\t" + math1 + "\t" + eng1 + "\t" + tot1 + "\t" + avg1);
		System.out.println(recordCnt+2 + "\t" + name2 + "\t" + korean2 + "\t" + math2 + "\t" + eng2 + "\t" + tot2 + "\t" + avg2);
		
		
	}

}
