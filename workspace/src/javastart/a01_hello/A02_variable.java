package javastart.a01_hello;

public class A02_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*���� : Ư���� �����Ϳ� ���� ������� �ٸ��� ó���� ��,
 * 		����ϴ� ����������
 * 
 * 		ũ�� ���ڿ��� �����ϴ� ������ : String
 * 		���ڸ� �����ϴ� ������ : int
 * 
 * */
		
/*
 * ���α׷� ����
 * �Է��� �̸��� ���̸� �Ʒ� �������� ����ϼ���v
 * 
 * ===========
 * �̸� : @@@@
 * ���� : @@@@
 * ===========
 */
//������ type���� �� ������ �̸��� ���ϸ�,
//Ư�� data�� �Ҵ��Ѵ�.
// type�� �����Ǹ� �Ҵ��� �� �ִ� �����͸� �־�� �ȴ�.
// ������ ������ �����ϰ�, ��Ȱ���� �� �� �ִ�.
		
		
		String name = "ȫ�浿";
		int age = 24;
		
		System.out.println("===========");
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("===========");
		
		name = "�ű浿";
		
		System.out.println("===========");
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("===========");
		

		
/*
 * Ȯ�� ����
 * ������ Ȱ���Ͽ�,
 * ��°�, ���������� �Ʒ� �������� ����ϼ���.
 * 
 * --------------------------------
 * ���� ��� ���� @@@@ �̸�,
 * �̸��� @@@�Դϴ�.
 * �����з� ���������� @@@@�⵵ �Դϴ�.
 * -------------------------------- * 
 */
		String location = "����";
		String myName = "������";
		int year = 1234;
		
		System.out.println("--------------------------------");
		System.out.println("���� ��� ���� : " + location + "�̸�,");
		System.out.println("�̸���  : " + myName + "�Դϴ�.");
		System.out.println("�����з� ����������  : " + year + "�� �Դϴ�.");
		System.out.println("--------------------------------");
		
		
	}	// main

}
