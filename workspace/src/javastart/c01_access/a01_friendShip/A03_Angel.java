package javastart.c01_access.a01_friendShip;

public class A03_Angel {
	public A03_Angel(){
		A01_WoodCutter w = new A01_WoodCutter();
		System.out.println(w.cacheDeer);
		// private 변수라서 접근 불가
		// System.out.println(w.cacheClothe);
	}
}
