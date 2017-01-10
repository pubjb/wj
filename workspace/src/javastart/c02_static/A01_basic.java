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
		System.out.println(name + "�� ����� ���̺� ����" + addApple + " ���� �߰� �Ͽ����ϴ�");
		restCnt();
	}
	
	public void eatApple() {
		eatCnt++;
		restCnt--;
		System.out.println(name + "����� ���� " + eatCnt + "�� �Ծ����ϴ�");
		restCnt();
	}
	
	public void restCnt() {
		System.out.println("���� ���� ����� " + restCnt + "�� �Դϴ�");
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
 * static : ������ �޼��忡 �ַ� ���̴� Ű�����
 * 			�ش� ������ �޼��带 ��ü ������ ������ ���� �ʰ�,
 * 			��ü�� ���� �޸� �������� ó���Ǿ�,
 * 			��ü �� �����ϴ� ������ �޼��忡�� �ַ� Ȱ�� �ȴ�
 */
		
//		Child c1 = new Child("�����");
//		Child c2 = new Child("Ȳ�ֿ�");
//		Child c3 = new Child("������");
//		
//		c1.restoreApple(20);
//		c1.eatApple();
//		c1.eatApple();
//		c2.eatApple();
//		c3.eatApple();
		
		
		
	}

}
