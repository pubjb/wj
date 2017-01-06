package javastart.b01_object;


/*
 * 
 * ��ü vs ��ü �ι�° �̾߱�
 * 1. ��ü�� �޼��带 ���ؼ� �ѱ��
 * 
 * Man
 * 	�Ӽ� : Friend, �̸�
 * 
 * 
 * Friend
 * 	�Ӽ� : �̸�, ����
 * 
 * 
 * 2. �޼��带 ���ؼ� ��ü �ѱ��
 * 
 * public void setFriend(Friend f)
 * �޼���� �Ϲ������� public ���� �����ڷ� ��� ��ü���� ���� ����
 * 
 * void : ��ȯ���� ����
 * setXXX : 
 * Friend f : �ܺο��� ��ü�� ���� ��, �����ϴ� ��ü ����, ���������� ���ȴ�.
 * 	this.f = f : ��������(this)�� ���������� �Ҵ�ó���ϴ� ����
 * 
 * 
 * 3. Main �޼��带 ���ؼ� ���� ��ü ������ ���� ����
 * 	Man m01 = new Man();
 * 	Friend f = new Friend();
 * 	m01.setFriend(f);
 */

// �ϳ��� ���Ͽ��� public class�� �ϳ��� ������ �Ǳ� ������, �ٸ� Ŭ������ ����ó��
// �Ϲ������� public���� ����� Ŭ������� ���ϸ��� ����
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
		System.out.println("�� �̸��� : " + name + "�Դϴ�");
		System.out.println("�� ģ���� �Ұ��մϴ�.");
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
		System.out.println("�̸��� : " + name + ", ���̴� : " + age);
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
		System.out.println("å �̸�: " + name + " ���� : " + price + " ���� :" + cnt + "�� ����");
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
		System.out.println(name + "������ ����");
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
		System.out.println(name+"��" + pay + "���� �����Ͽ����ϴ�.");
		setMoney(pay);
	}	
	public void setMoney(int money){
		this.money -= money;
	}	
	public void showMoney(){
		System.out.println(name+"�� "+ "���� ������ �ִ� �ݾ� : " + money);
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
		
		System.out.println("�°��� ž���Ͽ����ϴ�.");
		p.rideBus(pay);
		p.showMoney();
		
		passengerCnt++;
		totalMoney += pay;
	}
	
	public void total(){
		System.out.println("�� �°� ��: " + passengerCnt);
		System.out.println("�� �ݾ� : " + totalMoney);
	}
}

public class C03_Obj_SendObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Friend01 f = new Friend01("��ģ��", 28);
//		f.showAll();
//		Man02 m = new Man02();
//		m.setName("ȫ�浿");
//		m.setFriend(f);
//		m.introMyFriend();
		
//		Book book = new Book("�츮����", 3000, 1);
//		BookStore2 bs = new BookStore2();
//		
//		bs.setName("��������");
//		bs.setBook(book);
//		
//		bs.showAll();
		
		Bus b = new Bus(114);		
		
		Passenger p1 = new Passenger("�谳��", 10000);
		p1.showMoney();
		b.pickUpPassenger(p1);
		b.total();
		System.out.println("--------------------------------");
		
		Passenger p2 = new Passenger("��Ҷ�", 5000);
		p2.showMoney();
		b.pickUpPassenger(p2);
		b.total();
		System.out.println("--------------------------------");
	}
}
