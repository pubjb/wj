package javastart.a03_if;

public class A01_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String inputId = "himan";
//		String password = "787a8";
//		
//		if (inputId.equals("himan") && password.equals("7878")){
//			System.out.println(inputId + "�� ȯ���մϴ�.");
//		} else {
//			System.out.println(inputId + "���� ������ ������ �ƴմϴ�.");
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
			productName = "���";
		} else if (inputNum == 2){
			tot = 25000 * productCount;
			productName = "����";
		} else if (inputNum ==3) {
			tot =  15000 * productCount;
			productName = "����";
		}
		
		String bonus = "";
		if (tot < 50000){
			bonus = "��� 5��";
		} else if (tot < 100000){
			bonus = "10000 ��ǰ��";
		} else if (tot >= 100000){
			bonus = "20000 ��ǰ��";
		}
		
		System.out.println("������ ��ȣ�� " + inputNum + "�� " + productName + "�� �����ϼ̽��ϴ�.");
		System.out.println(productCount + "���ڸ� �ֹ��ϼ̽��ϴ�.");
		System.out.println("���ǰ�� " + bonus + "�Դϴ�.");
	}

}

	