package javastart.b01_object;


/*
 * 
 * 객체 vs 객체 두번째 이야기
 * 1. 객체를 메서드를 통해서 넘기기
 * 
 * Man
 * 	속성 : Friend, 이름
 * 
 * 
 * Friend
 * 	속성 : 이름, 나이
 * 
 * 
 * 2. 메서드를 통해서 객체 넘기기
 * 
 * public void setFriend(Friend f)
 * 메서드는 일반적으로 public 접근 제어자로 모든 객체에서 접근 가능
 * 
 * void : 반환값이 없음
 * setXXX : 
 * Friend f : 외부에서 객체가 들어올 때, 저장하는 객체 단위, 지역변수로 사용된다.
 * 	this.f = f : 전역변수(this)에 지역변수를 할당처리하는 내용
 * 
 * 
 * 3. Main 메서드를 통해서 실제 객체 생성을 통한 전달
 * 	Man m01 = new Man();
 * 	Friend f = new Friend();
 * 	m01.setFriend(f);
 */

// 하나의 파일에는 public class는 하나만 만들어야 되기 때문에, 다른 클래스는 생략처리
// 일반적으로 public으로 선언된 클래스명과 파일명이 동일
class Man02{
	private String name;
	private Friend01 friend;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setFriend(Friend01 friend) {
		this.friend = friend;
	}
	public void introMyFriend(){
		System.out.println("내 이름은 : " + name + "입니다");
		System.out.println("내 친구를 소개합니다.");
		friend.showAll();
	}
}

class Friend01{
	private String name;
	private int age;
	
	
	public Friend01() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Friend01(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void showAll(){
		System.out.println("이름은 : " + name + ", 나이는 : " + age);
	}	
}

class Book{
	private String name;
	private int price;
	private int cnt;
	
	public Book(String name, int price, int cnt) {
		super();
		this.name = name;
		this.price = price;
		this.cnt = cnt;
	}
	
	public void showAll(){
		System.out.println("책 이름: " + name + " 가격 : " + price + " 개수 :" + cnt + "를 구매");
	}
	
}
class BookStore2{
	private String name;
	private Book book;
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setBook(Book book){
		this.book = book;
	}
	
	public void showAll(){
		System.out.println(name + "서점에 가서");
		book.showAll();
	}
}



class Passenger{
	private String name;
	private int money;
	
	public Passenger(String name, int money){
		this.name = name;
		this.money = money;
	}
	public void rideBus(int pay){
		System.out.println(name+"이" + pay + "원을 지불하였습니다.");
		setMoney(pay);
	}	
	public void setMoney(int money){
		this.money -= money;
	}	
	public void showMoney(){
		System.out.println(name+"이 "+ "현재 가지고 있는 금액 : " + money);
	}
}

class Bus{
	private int num;
	private Passenger p;
	
	private int passengerCnt;
	private int totalMoney;
	private int pay;
	
	public Bus(int num){
		this.num = num;
		passengerCnt = 0;
		totalMoney = 0;
		pay = 1400;
	}
	
	public void setPassenger(Passenger p){
		this.p = p;
	}
	
	public void pickUpPassenger(Passenger p){
		setPassenger(p);
		
		System.out.println("승객이 탑승하였습니다.");
		p.rideBus(pay);
		p.showMoney();
		
		passengerCnt++;
		totalMoney += pay;
	}
	
	public void total(){
		System.out.println("총 승객 수: " + passengerCnt);
		System.out.println("총 금액 : " + totalMoney);
	}
}

public class C03_Obj_SendObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Friend01 f = new Friend01("박친구", 28);
//		f.showAll();
//		Man02 m = new Man02();
//		m.setName("홍길동");
//		m.setFriend(f);
//		m.introMyFriend();
		
//		Book book = new Book("헤리포터", 3000, 1);
//		BookStore2 bs = new BookStore2();
//		
//		bs.setName("교보문고");
//		bs.setBook(book);
//		
//		bs.showAll();
		
		Bus b = new Bus(114);		
		
		Passenger p1 = new Passenger("김개똥", 10000);
		p1.showMoney();
		b.pickUpPassenger(p1);
		b.total();
		System.out.println("--------------------------------");
		
		Passenger p2 = new Passenger("김소똥", 5000);
		p2.showMoney();
		b.pickUpPassenger(p2);
		b.total();
		System.out.println("--------------------------------");
	}
}
