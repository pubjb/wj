package javastart.b01_object;

import java.util.Scanner;

class Person{
	String name;
}

class Product
{
	String name;
	int pcnt;
	int pprice;
	int sum;
}

public class A01_ObjBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Person p1 = new Person();
//		p1.name = "ȫ�浿";
//		
//		Person p2 = new Person();
//		p2.name = "��浿";
//		
//		System.out.println("�̸�1"+p1.name);
//		System.out.println("�̸�2"+p2.name);
		
		
		/*
	       * 2�ܰ�
	       * Scanner ��ü�� �̿��Ͽ�..
	       * ���� �Ļ縦 �ֹ��ϰ�, �ֹ��� ������ ����ó���ϴ� ����
	       * 
	       * ## ��³���..
	       * @@@ �Ĵ翡 ���Ű��� ȯ���մϴ�.
	       * �޴�
	       * 1. ¥��� - 4500
	       * 2. «��   - 6000
	       * 3. ������ - 12000
	       * 0. ����
	       * 
	       * �ֹ� ��ȣ �Է�:
	       * �ֹ� ���� �Է�:
	       * 
	       * 0.�� ������ ��..
	       * ���� �ֹ� ������ list�ϰ�..
	       * �� ��� ���ó��..
	       * 
	       */
		
		//List Lists[] = [list1, list2];
		
		int orderList[] = new int[4];
		int order = -1;
		int orderCnt = 0;
		
		Scanner input = new Scanner(System.in);
		
		while (true)
		{
			System.out.println("������ �Ĵ翡 ���Ű��� ȯ���մϴ�");
			System.out.println("�޴�");
			System.out.println("1. ¥��� - 4500");
			System.out.println("2. «�� - 6000");
			System.out.println("3. ������ - 12000");
			System.out.println("0. ����");
			
			System.out.println("�ֹ� ��ȣ �Է�: ");
			
			try {
				order = input.nextInt();
			} catch (java.util.InputMismatchException e){
				input.nextLine();
			}
			
			if (order == 0){
				System.out.println("¥��� " + orderList[1] + "��");
				System.out.println("«�� " + orderList[2] + "��");
				System.out.println("������ " + orderList[3] + "��");
				
				int tot = orderList[1]*4500 + orderList[2]*6000 + orderList[3]*12000;
				System.out.println("�� ��� :" + tot);
				break;
			} else {
				System.out.println("�ֹ� ���� �Է�: ");
				try {
					orderCnt = input.nextInt();
				} catch (java.util.InputMismatchException e){
					input.nextLine();
				}
				
				orderList[order] = orderCnt;				
			}
		}
		
		input.close();
		
	}

}
