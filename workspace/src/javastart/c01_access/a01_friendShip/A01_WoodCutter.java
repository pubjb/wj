package javastart.c01_access.a01_friendShip;

import javastart.c01_access.*;

public class A01_WoodCutter {
	
	// ��� ���� ��
	String cacheDeer = "���һ���";
	// �������� ���� ��
	private String cacheClothe = "�޵��� ������";
	
	void call(){
		// A02_Deer �� ���� package�� �ְ�,
		// class ���� �����ڰ� public�̶� ����
		// ���� package�� �ִ� ��Ű���� ���� ������ ����
		A02_Deer d;
		
		// �ٸ� package�� ���� ���� ��Ű������� ȣ���ؾ� �Ѵ�
		javastart.c01_access.A01_Hunter h;
		
		// �ٸ� package�� ���������ڰ� public�̰�,
		// import�� �ش� Ŭ������ ������ �����ϸ� package���� ���� ����
		A01_Hunter h2 = null;
		// �⺻ �����ڵ� ���������ڰ� public�̱⿡ �����ϴ�
		h2 = new A01_Hunter();
		
		
		A02_Deer dd = new A02_Deer();
	}
}
