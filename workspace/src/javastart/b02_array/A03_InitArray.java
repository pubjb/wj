package javastart.b02_array;

import java.util.Iterator;

public class A03_InitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*
 * �迭 ����� �ʱ� ������ �Ҵ�
 * 
 * �ڹٽ�ũ��Ʈ 	{} : ��ü 	[] : �迭
 * �ڹ�						{} : �迭
 * 
 * ���� = {data1, data2, data3, ...};
 * 
 */
//		String[] stdudents = {"ȫ�浿", "��浿"};
//		for (int i = 0; i < stdudents.length; i++) {
//			System.out.println(stdudents[i]);
//		}
//		
//		System.out.println("for(������ü ��������:�迭��ü");
//		for (String student : stdudents) {
//			System.out.println(student);
//		}
//		for (int i = 0; i < stdudents.length; i++) {
//			String string = stdudents[i];			
//		}
		
		
		
		int avg = 0;
		int index = -1;
		int lowestPoint = 0;
		
		String[] subjects = {"����", "����", "����"};
		int[] points = {80, 90, 70};
		
		System.out.print("����� :\t");
		for (String subject : subjects) {
			System.out.print(subject+"\t");			
		}
		
		System.out.println();
		System.out.print("���� :\t");
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
		
		System.out.println("�������� : " + points[index] + " - ����� : "+ subjects[index]);
		
		
		


	}

}
