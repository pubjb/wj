package javastart.a02_operator;

public class A01_calcu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
/*
 * 산술연산자 : +, -, *, /, %
 * % : 나머지 연산자 : 해당 데이터의 몺을 제외한 나머지 부분 처리
 */
		//System.out.println("20 % 7 = " + 20 % 7 );
		
/*
 * 사과 50개를 3명에게 나누어 주기로 했습니다.
 * 1명당 몇개를 나누어 주고, 나머지 @@개가 남는 것을 프로그램할려고 한다.
 * 이때, 과일 종료와 총 개수 나누어 줘야할 사람수를 args를 받아서
 * 변동적으로 처리하는 프로그램을 만든다면...		
 */
		
//		String fruit = args[0];
//		int fruitCnt = Integer.parseInt(args[1]);
//		int peopleCnt = Integer.parseInt(args[2]);
//		
//		System.out.println("과일 종류 : " + fruit);
//		System.out.println("과일 개수 : " + fruitCnt);
//		System.out.println("나누어줄 인원 : " + peopleCnt);
//		System.out.println("1명당 과일 개수 : " + (fruitCnt / peopleCnt));
//		System.out.println("나머지 개수 : " + (fruitCnt % peopleCnt));
		
/*
 * 아래 형식의 내용을 args 값으로 받아서 처리하세요
 * 
 * 
 * @@@: args 변수를 받아서 처리
 * ###: 연산처리해서 나타나는 부분
 * 
 * 
 * 성적관리 프로그램
 * 					반 : @@@		ex) 3-4반, 영어영문학과
 * NO	이름		국어		수학		영어		총점		평균(실수)
 * ##	@@@		@@@		@@@		@@@		###		###
 * ##	@@@		@@@		@@@		@@@		###		###		
 * 		
 */
		
		int recordCnt = 0;		
		String className = args[0];
		
		String name1 = args[1];
		int korean1 = Integer.parseInt(args[2]);
		int math1 = Integer.parseInt(args[3]);
		int eng1 = Integer.parseInt(args[4]);
		
		String name2 = args[5];
		int korean2 = Integer.parseInt(args[6]);
		int math2 = Integer.parseInt(args[7]);
		int eng2 = Integer.parseInt(args[8]);
		
		int tot1 = korean1 + math1 + eng1;
		int tot2 = korean2 + math2 + eng2;
		
		double avg1 = tot1 / 3.0;
		double avg2 = tot2 / 3.0;
		
		System.out.println("성적관리 프로그램");
		System.out.println("\t\t\t반 : " + className);
		System.out.println("NO\t이름\t국어\t수학\t영어\t총점\t평균");
		System.out.println(recordCnt+1 + "\t" + name1 + "\t" + korean1 + "\t" + math1 + "\t" + eng1 + "\t" + tot1 + "\t" + avg1);
		System.out.println(recordCnt+2 + "\t" + name2 + "\t" + korean2 + "\t" + math2 + "\t" + eng2 + "\t" + tot2 + "\t" + avg2);
		
		
	}

}
