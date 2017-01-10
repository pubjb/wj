package javastart.c02_static;

/*
1. final
	1. 변수가 아닌 상수 즉, 데이터를 변경하지 못할 메모리를 설정할 때 활용한다
		대문자로 선언한다
		final int MONY = 40;
	2. 메서드 앞에 쓰일 때는 상속관계 overriding되지 못하게 처리
		하위클래스에서 재정의 못지 못하게
	3. 클래스명 앞에 쓰일 때는 상속되지 못하게 처리
		public final class Person {}
 */

class Memo {
	final String ETERNAL_PROMISE = "변치 않는 약속";
	final private String ETERNAL_PROMISE2 = "변치 않는 약속";
//	public void setPromise(String inDate) {
//		this.ETERNAL_PROMISE2 = inDate;
//	}
}

public class A04_final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Memo m = new Memo();
		// m.ETERNAL_PROMISE = "변하는 약속";

	}

}
