package javastart.b01_object;

class Calcu{
	int num01;
	int num02;
	String cal;
	int sum;
	
	int plus(int n01, int n02){
		cal = "+";
		sum = n01 + n02;
		return sum;
	}
	int minus(int n01, int n02){
		cal = "-";
		sum = n01 - n02;
		return sum;
	}
	int multi(int n01, int n02){
		cal = "*";
		sum = n01 * n02;
		return sum;
	}
	int div(int n01, int n02){
		cal = "/";
		sum = n01 / n02;
		return sum;
	}
	void print(int num01, int num02, String cal){
		this.cal = cal;
		
		if (cal.equals("+")){
			sum = plus(num01, num02);
		} else if (cal.equals("-")){
			sum = minus(num01, num02);
		} else if (cal.equals("*")){
			sum = multi(num01, num02);
		} else if (cal.equals("/")){
			sum = div(num01, num02);
		}
		
		System.out.println(num01 + " " + cal + " " + num02 + " = " + sum);
		
	}
	
}


class BookStore{
	String bookName;
	int price;
	int count;
	int total;
	
	int buyBook(String bookName, int price, int count){
		return price * count;
	}
	
	void showCalcu(String bookName, int price, int count){
		System.out.println(bookName + "´Ü°¡ : " + price + " " + count + "±Ç" + "ÃÑ : ");
	}
}


public class A04_MethodFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calcu c01 = new Calcu();
		
		int num01 = 4;
		int num02 = 5;
		
		//System.out.println(num01 + " + " + num02 + " = " + c01.plus(num01, num02));
		c01.print(num01, num02, "-");

	}

}





















