package javastart.b02_array;

import java.util.Random;

public class A01_Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] prodCnts = new int[5];
		prodCnts[0] = 5;
		prodCnts[1] = 8;
		prodCnts[2] = 9;
		prodCnts[3] = 5;
		prodCnts[4] = 3;
		//prodCnts[5] = 2;
		
//		for (int i = 0; i < prodCnts.length; i++) {
//			System.out.println(prodCnts[i]);
//		}
		
		String[] menu = new String[4];
		int[] price = new int[4];
		
		menu[0] = "�ݶ�";
		price[0] = 1000;
		menu[1] = "���̴�";
		price[1] = 500;
		menu[2] = "ȯŸ";
		price[2] = 700;
		menu[3] = "����ƾ��";
		price[3] = 1000;
		
//		for (int i = 0; i < price.length; i++) {
//			System.out.println(menu[i]+" ���� : " + price[i]);
//		}
		
		int[] p = new int[4];
		
		Random random = new Random();
		
		int max = 0;
		
		for (int i = 0; i < p.length; i++) {
			p[i] = random.nextInt(51);
			System.out.print((i+1)+": " + p[i]*100+ ", ");
			
			if (p[i] > max){
				max = p[i];
			}
		}
		
		System.out.println("");
		System.out.println("���� ū �ݾ��� : " + max*100);
		
		

	}

}
