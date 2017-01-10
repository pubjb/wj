package javastart.c02_static;

class Child {
	private String name;
	private int eatCnt;
	private static int restCnt;
	
	public Child(String name) {
		this.name = name;
	}
	
	public void restoreApple(int addApple) {
		restCnt += addApple;
		System.out.println(name + "가 사과를 테이블 위에" + addApple + " 개를 추가 하였습니다");
		restCnt();
	}
	
	public void eatApple() {
		eatCnt++;
		restCnt--;
		System.out.println(name + "사과를 현재 " + eatCnt + "개 먹었습니다");
		restCnt();
	}
	
	public void restCnt() {
		System.out.println("현재 남은 사과는 " + restCnt + "개 입니다");
	}
}


class Accounts {
	private String name;
	private int money;
	private static int totalMoney;
	
	public Accounts(String name) {
		this.name = name;
	}
	public Accounts(String name, int initMoney) {
		this.name = name;
		this.money = initMoney;
	}
	
	public void save(int money) {
		this.money += money;		
	}	
}



public class A01_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * static : 변수나 메서드에 주로 쓰이는 키워드로
 * 			해당 변수나 메서드를 객체 참조에 범위에 있지 않고,
 * 			객체의 공유 메모리 영역으로 처리되어,
 * 			객체 간 공유하는 변수나 메서드에서 주로 활용 된다
 */
		
//		Child c1 = new Child("김고은");
//		Child c2 = new Child("황주영");
//		Child c3 = new Child("최현욱");
//		
//		c1.restoreApple(20);
//		c1.eatApple();
//		c1.eatApple();
//		c2.eatApple();
//		c3.eatApple();
		
		
		
	}

}
