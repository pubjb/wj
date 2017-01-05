package javastart.a05_loop;

public class A03_forExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int price = 0;
		int cnt = 0;
		int tot = 0;
		
		for (int idx=0; idx<args.length; idx++){
			System.out.print(args[idx] + "\t");
			
			if (idx % 3 == 1){
				price = Integer.parseInt(args[idx]);
			}
			
			if (idx % 3 == 2){
				cnt = Integer.parseInt(args[idx]);
				
				tot += price*cnt;
				System.out.println(price*cnt);				
				
			}
		}
		
		System.out.println("\t\tÇÕ°è : " +tot);

	}

}
