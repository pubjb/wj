package javastart.a05_loop;

public class A04_loopHomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 데이터 args로 아래와 같은 데이터가 있다.
 * 급여 3000000 0 마트 0 100000 옷구매 0 50000 알바 100000 0
 * 
 * 1) 수입 / 지출 항목을 출력하세요.
 * 2) 총수입액을 출력하세요.
 * 
 * 2
 * 위 데이터를 아래의 형식을 출력하세요.
 * 가계부
 * no	항목		수입액	지출액	현잔액
 * 1	급여		3000000		0	3000000
 * 2	마트		0		100000	2900000
 * 
 * 3
 * 급여 3000000	수입		마트		100000	지출		옷구매		50000	지출
 */
		// 1
		for (int i=0; i<args.length; i++){
			if (i%3 == 0)
				System.out.print(args[i]+"\t");
		}
		
		System.out.println();
		
		int sum = 0;
		for (int i=0; i<args.length; i++){
			if (i%3 == 1){
				sum += Integer.parseInt(args[i]);
			}				
		}
		System.out.println("총수입액 : " + sum);
		
		// 2
		int no = 0;
		int tot = 0;
		int income = 0;
		int expenditure = 0;
		
		System.out.println("no\t항목\t수입액\t지출액\t현잔액");
		
		for (int i=0; i<args.length/3; i++){
			income = Integer.parseInt(args[i*3+1]);
			expenditure = Integer.parseInt(args[i*3+2]);
			
			tot += income;
			tot -= expenditure;
			
			System.out.println((i+1)+"\t"+args[i*3]+"\t"+income+"\t"+expenditure+"\t"+tot);			
		}
		
		// 3
		for (int i=0; i<args.length/3; i++){
			income = Integer.parseInt(args[i*3+1]);
			expenditure = Integer.parseInt(args[i*3+2]);
			
			if (income > 0 && expenditure == 0){
				System.out.print(args[i*3]+" "+income+" "+"수입\t");
			} else if (income == 0 && expenditure > 0){
				System.out.print(args[i*3]+" "+expenditure+" " +"지출\t");
			}
		}
		
	}

}
