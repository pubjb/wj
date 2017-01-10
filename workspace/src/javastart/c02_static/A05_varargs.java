package javastart.c02_static;

/*
�������� ó��
javascript
	function call()
		arguments : �迭�� �޾Ƽ� ó��
java : java 1.4, 1.5�� �ȵ� 1.6���� ����
	void call(String ...names)
		names : �迭�� �޾Ƽ� ó��
 */


class Greet {
	public void sayHello(String ...names) {
		System.out.println("�Է¹��� ������ �Ǽ� : " + names.length);
		for (String name : names) {
			System.out.println(name + "��");
		}
		System.out.println("ȯ���մϴ�");
	}
}

public class A05_varargs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Greet g = new Greet();
		g.sayHello("ȫ�浿", "��浿", "���浿");
	}

}