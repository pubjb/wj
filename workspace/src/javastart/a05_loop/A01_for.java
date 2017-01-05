package javastart.a05_loop;

public class A01_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for (int i = 5; i <= 20; i++){
			System.out.print(i + "\t");
		}
		
		System.out.println();
		
		for (int i = 30; i <= 100; i+=5)
			System.out.print(i + "\t");
		
		System.out.println();
		
		for (int i = 1000; i >= 900; i-=2)
			System.out.print(i + "\t");
		
		
		System.out.println();
		
		
		for ( int i = 2; i <= 9; i++){
			System.out.print(i + "´Ü\t");
		}
		
		System.out.println();
		for (int i = 1; i <= 9; i++){
			for (int j = 2; j <= 9; j++){
				System.out.print(j+"*"+i+"="+(j*i)+"\t");				
			}
			
			System.out.println();
		}

	}
}




