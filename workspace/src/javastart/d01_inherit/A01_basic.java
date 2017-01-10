package javastart.d01_inherit;

/*
��� : is a ����� ���� Ŭ������ ���� Ŭ������ ���������� ���� �ȿ��� ��Ȱ���ϰ� �Ѵ�
cf) ���������� ������ ����� �� �� ���� �ȴ�
	  has a ���� : Ŭ���������� �ٸ� Ŭ���� ȣ���Ͽ� ���� ���踦 �ǹ��Ѵ�
 */
class Father {
	private String name;
	int age;
	
	public void setDate(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void show() {
		System.out.println("�ƹ���  Ŭ����");
		System.out.println("�̸� : " + name + ", ���� : " + age);
	}
}

// class ��ü extends ����� ���� Ŭ����
class Son extends Father {
	String location;
	public void setLocation(String loc) {
		location = loc;
		// name�� age�� ����Ǿ� ���� ������ Ȱ���� �� �ִ�
		// (���������� ���� �ȿ���)
		//System.out.println(name);
		System.out.println(age);
		show();
		System.out.println("��� ���� " + location + "�Դϴ�");
	}
}



class Job {
	protected String name;
	
	public Job() {}
	
	public Job(String name) {
		this.name = name;
	}
	
	public void working() {
		System.out.println(name + "�� ���� �Ѵ�");
	}
}

class PoliceMan extends Job {
	//private String kind = "����";
	
	public PoliceMan(String name) {
		this.name = name;
	}
	public void working() {
		System.out.println("������ " + name + "�� ������ ��Ҵ�");
	}
}

class FireMan extends Job {
	public FireMan(String name) {
		this.name = name;
	}	
	public void working() {
		System.out.println("�ҹ���� " + name + "�� ���� ���ϴ�");
	}
}

public class A01_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Son s1 = new Son();
//		s1.setDate("ȫ�浿", 25);
//		s1.show();
//		s1.setLocation("����");
		
		// ��Ӱ��迡 �ִ� ����Ŭ������ ���������ڰ� package���� ������
		// ���� �ϱ⿡ age������ Ȱ���� �� �ִ�.
//		s1.age = 10;
//		System.out.println(s1.age);
		// ��Ӱ��迡 ������, name�� ���������ڴ� private�̱⿡ �ٷ�
		// �� ���� ����
		// System.out.println(s1.name);
		
		PoliceMan p = new PoliceMan("������");
		p.working();
		
		FireMan f = new FireMan("�����");
		f.working();
		
		

	}

}
