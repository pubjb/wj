package javastart.c01_access;

import javastart.c01_access.a01_friendShip.A01_WoodCutter;

public class A01_Hunter {
	public A01_Hunter(){
		A01_WoodCutter d = new A01_WoodCutter();
		// cacheDeer가 default접근 제어자이기 때문에 호출 가능
		// System.out.println(d.cacheDeer);
	}
}
