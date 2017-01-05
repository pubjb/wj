package javastart.a05_loop;

public class A04_loopHomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * ������ args�� �Ʒ��� ���� �����Ͱ� �ִ�.
 * �޿� 3000000 0 ��Ʈ 0 100000 �ʱ��� 0 50000 �˹� 100000 0
 * 
 * 1) ���� / ���� �׸��� ����ϼ���.
 * 2) �Ѽ��Ծ��� ����ϼ���.
 * 
 * 2
 * �� �����͸� �Ʒ��� ������ ����ϼ���.
 * �����
 * no	�׸�		���Ծ�	�����	���ܾ�
 * 1	�޿�		3000000		0	3000000
 * 2	��Ʈ		0		100000	2900000
 * 
 * 3
 * �޿� 3000000	����		��Ʈ		100000	����		�ʱ���		50000	����
 */
		// 1
		for (int i=0; i<args.length; i++){
			if (i%3 == 0)
				System.out.print(args[i]+"\t");
		}
		
		System.out.println();
		
		int sum = 0;
		for (int i=0; i<args.length; i++){
			if (i%3 == 1){
				sum += Integer.parseInt(args[i]);
			}				
		}
		System.out.println("�Ѽ��Ծ� : " + sum);
		
		// 2
		int no = 0;
		int tot = 0;
		int income = 0;
		int expenditure = 0;
		
		System.out.println("no\t�׸�\t���Ծ�\t�����\t���ܾ�");
		
		for (int i=0; i<args.length/3; i++){
			income = Integer.parseInt(args[i*3+1]);
			expenditure = Integer.parseInt(args[i*3+2]);
			
			tot += income;
			tot -= expenditure;
			
			System.out.println((i+1)+"\t"+args[i*3]+"\t"+income+"\t"+expenditure+"\t"+tot);			
		}
		
		// 3
		for (int i=0; i<args.length/3; i++){
			income = Integer.parseInt(args[i*3+1]);
			expenditure = Integer.parseInt(args[i*3+2]);
			
			if (income > 0 && expenditure == 0){
				System.out.print(args[i*3]+" "+income+" "+"����\t");
			} else if (income == 0 && expenditure > 0){
				System.out.print(args[i*3]+" "+expenditure+" " +"����\t");
			}
		}
		
	}

}
