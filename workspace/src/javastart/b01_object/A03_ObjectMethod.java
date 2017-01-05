package javastart.b01_object;

class Man{
	String name;
	int age;
	
	void printAll(){
		System.out.print("ÀÌ¸§Àº " + name);
		System.out.println(", ³ªÀÌ´Â " + age);
	}
}

class Hope{
	String hope;
	int newYear;
	String orgRnd;
	
	void showMyHope()
	{
		System.out.println(newYear+"³âµµ "+orgRnd+"¶ì »õÇØ¿¡ ³ªÀÇ Èñ¸Á");
		System.out.println(hope);
	}
}

public class A03_ObjectMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Man m1 = new Man();
		m1.name = "ÀÌ°æ±Ô";
		m1.age = 55;
		m1.printAll();
		
		Hope h = new Hope();
		h.hope = "!!";
		h.newYear = 2017;
		h.orgRnd = "´ß¶ì";
		
		h.showMyHope();

	}

}
