package javastart.a04_switch;

public class A01_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		int orderNum = 2;
//		
//		switch (orderNum) {
//		case 1:
//			System.out.println("새우버거");
//			break;
//		case 2:
//			System.out.println("불고기버거");
//			break;
//		case 3:
//			System.out.println("치즈버거");
//
//		default:
//			System.out.println("안 팜");
//			break;
//		}
		
		int kor = 100;
		int eng = 100;
		int math = 100;		
		
		int avg = (kor + eng +  math) / 3;
		
		
		switch (avg / 10) {
		case 10:
		case 9:
			System.out.println("A");			
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;
		}
		
		
		

	}

}
