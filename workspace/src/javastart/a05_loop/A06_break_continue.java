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
 * 변수로 특정 구구단의 단수를 입력받은 후,
 * ex) int grade = 5, // args값으로 받음
 * 중단해야 할 5 * 7 = 25		7  // args값으로 받음
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
//			System.out.println("메뉴를 선택하세요.");
//			System.out.println("1. 한식");
//			System.out.println("2. 일식");
//			System.out.println("3. 중식");
//			System.out.println("0. 끝내기");
//			
//			try {
//				menu = s.nextInt();
//			} catch (java.util.InputMismatchException e){
//				s.nextLine();
//			}
//			
//			
//			if (menu == 1)
//				System.out.println("한식주문");
//			else if (menu == 2)
//				System.out.println("일식주문");
//			else if (menu == 3)
//				System.out.println("중식주문");
//			else if (menu == 0){
//				System.out.println("주문완료");
//				break;				
//			}
//			else {
//				System.out.println("주문번호가 없습니다.");
//			}
//		}	
		
//		for (int i=2; i<=9; i++){
//			for (int j=1; j<=9; j++){
//				System.out.println(""+i+"*"+j+"="+(i*j));
//			}				
//		}
		
	      for (int cnt = 1; cnt <= 9; cnt++) { // 카운트
	          for (int grade = 2; grade <= 9; grade++) { // 단수
	             if (grade >= 5 && cnt > 7 || grade >= 6)
	            	 continue;
	             
	             System.out.print(grade + "*" + cnt + "=" + grade * cnt + "\t");
	          }
	          	System.out.println();
	       }

	}

}
