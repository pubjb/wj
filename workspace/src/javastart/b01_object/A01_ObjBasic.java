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
//		p1.name = "홍길동";
//		
//		Person p2 = new Person();
//		p2.name = "김길동";
//		
//		System.out.println("이름1"+p1.name);
//		System.out.println("이름2"+p2.name);
		
		
		/*
	       * 2단계
	       * Scanner 객체를 이용하여..
	       * 점심 식사를 주문하고, 주문된 내용을 결재처리하는 내용
	       * 
	       * ## 출력내용..
	       * @@@ 식당에 오신것을 환영합니다.
	       * 메뉴
	       * 1. 짜장면 - 4500
	       * 2. 짬뽕   - 6000
	       * 3. 탕수육 - 12000
	       * 0. 종료
	       * 
	       * 주문 번호 입력:
	       * 주문 수량 입력:
	       * 
	       * 0.을 눌렀을 때..
	       * 현재 주문 내용을 list하고..
	       * 총 비용 계산처리..
	       * 
	       */
		
		//List Lists[] = [list1, list2];
		
		int orderList[] = new int[4];
		int order = -1;
		int orderCnt = 0;
		
		Scanner input = new Scanner(System.in);
		
		while (true)
		{
			System.out.println("에이콘 식당에 오신것을 환영합니다");
			System.out.println("메뉴");
			System.out.println("1. 짜장면 - 4500");
			System.out.println("2. 짬뽕 - 6000");
			System.out.println("3. 탕수육 - 12000");
			System.out.println("0. 종료");
			
			System.out.println("주문 번호 입력: ");
			
			try {
				order = input.nextInt();
			} catch (java.util.InputMismatchException e){
				input.nextLine();
			}
			
			if (order == 0){
				System.out.println("짜장면 " + orderList[1] + "개");
				System.out.println("짬뽕 " + orderList[2] + "개");
				System.out.println("탕수육 " + orderList[3] + "개");
				
				int tot = orderList[1]*4500 + orderList[2]*6000 + orderList[3]*12000;
				System.out.println("총 비용 :" + tot);
				break;
			} else {
				System.out.println("주문 수량 입력: ");
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
