package javastart.a05_loop;

import java.util.Scanner;

public class A06_break_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println("continue");
//		for (int cnt = 1; cnt <= 9; cnt++){
//			
//			if ( cnt == 5)
//				continue;
//			
//			System.out.println(3 + " * " + cnt + "  =  " + (3*cnt));
//		}
		
/*
 * 1
 * ������ Ư�� �������� �ܼ��� �Է¹��� ��,
 * ex) int grade = 5, // args������ ����
 * �ߴ��ؾ� �� 5 * 7 = 25		7  // args������ ����
 * 
 * 
 */
//		int grade = Integer.parseInt(args[0]);
//		int breakPoint = Integer.parseInt(args[1]);
//		
//		for (int i=1; i<=9; i++){
//			if (i == breakPoint)
//				break;
//			
//			System.out.println(grade + " * " + i + " = " + (grade * i));
//		}
		
		Scanner s = new Scanner(System.in);
		int menu = 0;
		
//		while (true){
//			System.out.println("�޴��� �����ϼ���.");
//			System.out.println("1. �ѽ�");
//			System.out.println("2. �Ͻ�");
//			System.out.println("3. �߽�");
//			System.out.println("0. ������");
//			
//			try {
//				menu = s.nextInt();
//			} catch (java.util.InputMismatchException e){
//				s.nextLine();
//			}
//			
//			
//			if (menu == 1)
//				System.out.println("�ѽ��ֹ�");
//			else if (menu == 2)
//				System.out.println("�Ͻ��ֹ�");
//			else if (menu == 3)
//				System.out.println("�߽��ֹ�");
//			else if (menu == 0){
//				System.out.println("�ֹ��Ϸ�");
//				break;				
//			}
//			else {
//				System.out.println("�ֹ���ȣ�� �����ϴ�.");
//			}
//		}	
		
//		for (int i=2; i<=9; i++){
//			for (int j=1; j<=9; j++){
//				System.out.println(""+i+"*"+j+"="+(i*j));
//			}				
//		}
		
	      for (int cnt = 1; cnt <= 9; cnt++) { // ī��Ʈ
	          for (int grade = 2; grade <= 9; grade++) { // �ܼ�
	             if (grade >= 5 && cnt > 7 || grade >= 6)
	            	 continue;
	             
	             System.out.print(grade + "*" + cnt + "=" + grade * cnt + "\t");
	          }
	          	System.out.println();
	       }

	}

}
