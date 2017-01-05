package javastart.b02_array;

import java.util.Iterator;

public class A03_InitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*
 * 배열 선언과 초기 데이터 할당
 * 
 * 자바스크립트 	{} : 객체 	[] : 배열
 * 자바						{} : 배열
 * 
 * 선언 = {data1, data2, data3, ...};
 * 
 */
//		String[] stdudents = {"홍길동", "김길동"};
//		for (int i = 0; i < stdudents.length; i++) {
//			System.out.println(stdudents[i]);
//		}
//		
//		System.out.println("for(단위객체 참조변수:배열객체");
//		for (String student : stdudents) {
//			System.out.println(student);
//		}
//		for (int i = 0; i < stdudents.length; i++) {
//			String string = stdudents[i];			
//		}
		
		
		
		int avg = 0;
		int index = -1;
		int lowestPoint = 0;
		
		String[] subjects = {"국어", "영어", "수학"};
		int[] points = {80, 90, 70};
		
		System.out.print("과목명 :\t");
		for (String subject : subjects) {
			System.out.print(subject+"\t");			
		}
		
		System.out.println();
		System.out.print("점수 :\t");
		for (int point : points) {
			System.out.print(point+"\t");
		}
		
		lowestPoint = points[0];		
		for (int i = 0; i < points.length; i++) {
			if(points[i] < lowestPoint){
				lowestPoint = points[i];
				index = i;
			}
		}
		System.out.println();
		
		System.out.println("최저점수 : " + points[index] + " - 과목명 : "+ subjects[index]);
		
		
		


	}

}
