package javastart.b01_object;

class Student{
	String name;
	int kor;
	
	Student() {
		name = "이름이 입력되지 않았습니다.";
		kor = 59;
//		System.out.println("디폴트 생성자 호출");
//		System.out.println("name : " + name);
//		System.out.println("국어점수 : " + kor);
	}
	Student(String s, int kor){
		name = s;
		this.kor = kor;
//		System.out.println("입력값 두개 있는 생성자 호출");
//		System.out.println("name : " + name);
//		System.out.println("국어점수 : " + kor);
	}
	
	void print(){
		System.out.println("이름 : " + name);
		System.out.println("국어점수 : " + kor);
	}
	
}


class CoffeeShop{
	String menu;
	int cnt;
	int price;
	
	CoffeeShop(){
		menu = "아메리카노";
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
		System.out.print("메뉴 : " + menu + " ");
		System.out.println(cnt + "잔");
	}
	int calcu(String menu, int cnt){
		int total = 0;
		switch(menu){
		case "아메리카노":
			total = 3000 * cnt;
			break;
		case "카푸치노":
			total = 4000 * cnt;
			break;
		case "라떼" :
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
		
		System.out.println(menu + " " + price + " " + cnt + " 할인 10% 계산금액  : " + dis);
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
		CoffeeShop c2 = new CoffeeShop("우유");
		CoffeeShop c3 = new CoffeeShop("아메리카노", 1);
		
//		c1.print();
//		c2.print();
//		c3.print();
		
		c3.dis10("아메리카노", 3000, 1);
		

	}

}
