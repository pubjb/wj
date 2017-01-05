package javastart.a03_if;

public class A01_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String inputId = "himan";
//		String password = "787a8";
//		
//		if (inputId.equals("himan") && password.equals("7878")){
//			System.out.println(inputId + "님 환영합니다.");
//		} else {
//			System.out.println(inputId + "님은 인증된 계정이 아닙니다.");
//		}
		
		int applePrice = 40000;
		int grapePrice = 25000;
		int strawPrice = 15000;
		
		int inputNum = Integer.parseInt(args[0]);
		int productCount = Integer.parseInt(args[1]);
		int tot = 0;	
		
		String productName = "";
		
		if (inputNum == 1){
			tot = 40000 * productCount;
			productName = "사과";
		} else if (inputNum == 2){
			tot = 25000 * productCount;
			productName = "포도";
		} else if (inputNum ==3) {
			tot =  15000 * productCount;
			productName = "딸기";
		}
		
		String bonus = "";
		if (tot < 50000){
			bonus = "라면 5개";
		} else if (tot < 100000){
			bonus = "10000 상품권";
		} else if (tot >= 100000){
			bonus = "20000 상품권";
		}
		
		System.out.println("선택한 번호는 " + inputNum + "번 " + productName + "를 선택하셨습니다.");
		System.out.println(productCount + "상자를 주문하셨습니다.");
		System.out.println("사운품은 " + bonus + "입니다.");
	}

}

	