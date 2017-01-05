package javastart.a02_operator;

public class A04_CompareOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int bananaCnt = 5;
		int strawCnt = 7;
		
		System.out.println("바나나와 딸기 개수가 같은지?" + (bananaCnt == strawCnt));
		
		boolean isEqual = false;
		
		isEqual = bananaCnt != strawCnt;
		
		System.out.println("같지 않지?" + isEqual);

	}

}
