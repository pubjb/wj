package javastart.c01_access.a01_friendShip;

import javastart.c01_access.*;

public class A01_WoodCutter {
	
	// 사숨 숨은 곳
	String cacheDeer = "덤불사이";
	// 날개옷을 숨긴 곳
	private String cacheClothe = "뒷동산 바위밑";
	
	void call(){
		// A02_Deer 가 같은 package에 있고,
		// class 접근 제어자가 public이라 가능
		// 같은 package에 있는 패키지명에 대한 선언은 생략
		A02_Deer d;
		
		// 다른 package에 있을 때는 패키지명까지 호출해야 한다
		javastart.c01_access.A01_Hunter h;
		
		// 다른 package라도 접근제어자가 public이고,
		// import로 해당 클래스를 상위에 선언하면 package명을 생략 가능
		A01_Hunter h2 = null;
		// 기본 생성자도 접근제어자가 public이기에 가능하다
		h2 = new A01_Hunter();
		
		
		A02_Deer dd = new A02_Deer();
	}
}
