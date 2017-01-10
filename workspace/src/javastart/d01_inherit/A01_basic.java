package javastart.d01_inherit;

/*
상속 : is a 관계로 상위 클래스를 하위 클래스가 접근제어자 범위 안에서 재활용하게 한다
cf) 접근제어자 범위가 벗어나면 쓸 수 없게 된다
	  has a 관계 : 클래스내에서 다른 클래스 호출하여 포함 관계를 의미한다
 */
class Father {
	private String name;
	int age;
	
	public void setDate(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void show() {
		System.out.println("아버지  클래스");
		System.out.println("이름 : " + name + ", 나이 : " + age);
	}
}

// class 객체 extends 상속할 상위 클래스
class Son extends Father {
	String location;
	public void setLocation(String loc) {
		location = loc;
		// name과 age가 선언되어 있지 않지만 활용할 수 있다
		// (접근제어자 범위 안에서)
		//System.out.println(name);
		System.out.println(age);
		show();
		System.out.println("사는 곳은 " + location + "입니다");
	}
}



class Job {
	protected String name;
	
	public Job() {}
	
	public Job(String name) {
		this.name = name;
	}
	
	public void working() {
		System.out.println(name + "가 일을 한다");
	}
}

class PoliceMan extends Job {
	//private String kind = "경찰";
	
	public PoliceMan(String name) {
		this.name = name;
	}
	public void working() {
		System.out.println("경찰인 " + name + "가 도둑을 잡았다");
	}
}

class FireMan extends Job {
	public FireMan(String name) {
		this.name = name;
	}	
	public void working() {
		System.out.println("소방관인 " + name + "가 불을 끕니다");
	}
}

public class A01_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Son s1 = new Son();
//		s1.setDate("홍길동", 25);
//		s1.show();
//		s1.setLocation("서울");
		
		// 상속관계에 있는 현재클래스는 접근제어자가 package간에 접근이
		// 가능 하기에 age변수는 활용할 수 있다.
//		s1.age = 10;
//		System.out.println(s1.age);
		// 상속관계에 있지만, name의 접근제어자는 private이기에 바로
		// 쓸 수는 없다
		// System.out.println(s1.name);
		
		PoliceMan p = new PoliceMan("찰관이");
		p.working();
		
		FireMan f = new FireMan("방관이");
		f.working();
		
		

	}

}
