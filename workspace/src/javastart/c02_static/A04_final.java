package javastart.c02_static;

/*
1. final
	1. ������ �ƴ� ��� ��, �����͸� �������� ���� �޸𸮸� ������ �� Ȱ���Ѵ�
		�빮�ڷ� �����Ѵ�
		final int MONY = 40;
	2. �޼��� �տ� ���� ���� ��Ӱ��� overriding���� ���ϰ� ó��
		����Ŭ�������� ������ ���� ���ϰ�
	3. Ŭ������ �տ� ���� ���� ��ӵ��� ���ϰ� ó��
		public final class Person {}
 */

class Memo {
	final String ETERNAL_PROMISE = "��ġ �ʴ� ���";
	final private String ETERNAL_PROMISE2 = "��ġ �ʴ� ���";
//	public void setPromise(String inDate) {
//		this.ETERNAL_PROMISE2 = inDate;
//	}
}

public class A04_final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Memo m = new Memo();
		// m.ETERNAL_PROMISE = "���ϴ� ���";

	}

}
