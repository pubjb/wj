package javastart.b01_object;

class Student{
	String name;
	int kor;
	
	Student() {
		name = "�̸��� �Էµ��� �ʾҽ��ϴ�.";
		kor = 59;
//		System.out.println("����Ʈ ������ ȣ��");
//		System.out.println("name : " + name);
//		System.out.println("�������� : " + kor);
	}
	Student(String s, int kor){
		name = s;
		this.kor = kor;
//		System.out.println("�Է°� �ΰ� �ִ� ������ ȣ��");
//		System.out.println("name : " + name);
//		System.out.println("�������� : " + kor);
	}
	
	void print(){
		System.out.println("�̸� : " + name);
		System.out.println("�������� : " + kor);
	}
	
}


class CoffeeShop{
	String menu;
	int cnt;
	int price;
	
	CoffeeShop(){
		menu = "�Ƹ޸�ī��";
		cnt = 1;
	}
	
	CoffeeShop(String menu){
		this.menu = menu;
		cnt = 1;
	}
	CoffeeShop(String menu, int cnt){
		this.menu = menu;
		this.cnt = cnt;
	}
	void print(){
		System.out.print("�޴� : " + menu + " ");
		System.out.println(cnt + "��");
	}
	int calcu(String menu, int cnt){
		int total = 0;
		switch(menu){
		case "�Ƹ޸�ī��":
			total = 3000 * cnt;
			break;
		case "īǪġ��":
			total = 4000 * cnt;
			break;
		case "��" :
			total = 4500 * cnt;
			break;
		}
		
		return total;
	}
	
	void dis10(String menu, int price, int cnt){
		this.menu = menu;
		this.price = price;
		this.cnt = cnt;
		
		int dis = calcu(menu, cnt);
		dis -= dis*0.1;
		
		System.out.println(menu + " " + price + " " + cnt + " ���� 10% ���ݾ�  : " + dis);
	}
}
public class B01_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Student s1 = new Student();
//		Student s2 = new Student("hi", 100);
//		
//		s1.print();
//		s2.print();
		
		CoffeeShop c1 = new CoffeeShop();
		CoffeeShop c2 = new CoffeeShop("����");
		CoffeeShop c3 = new CoffeeShop("�Ƹ޸�ī��", 1);
		
//		c1.print();
//		c2.print();
//		c3.print();
		
		c3.dis10("�Ƹ޸�ī��", 3000, 1);
		

	}

}
