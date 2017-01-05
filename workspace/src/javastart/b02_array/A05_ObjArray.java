package javastart.b02_array;

import java.lang.reflect.Array;
import java.util.Arrays;





class Team{
   //����
   String name;
   //������
   int totGame;
   //�¼�
   int vicCnt;
   //��..
   int defCnt;
   //�·�
   double vicRatio;
   Team(String name, int vicCnt, int defCnt){
      this.name=name;
      this.totGame=vicCnt+defCnt;
      this.vicCnt=vicCnt;
      this.defCnt=defCnt;
   }
   void showCur(){
      vicRatio=vicCnt/(double)totGame;
      System.out.println(name.length());
      System.out.println(name+
    		  (name.length() < 6 ? "\t\t" : "\t")
    		  +totGame+"\t"+vicCnt+"\t"+defCnt+"\t"+vicRatio);
   }
}//class

class Schedule implements Comparable<Schedule>{
	int day;
	int time;
	String toDo;
	int requiredTime;
	int priority;
	
	Schedule(String toDo, int day, int time, int requiredTime){
		this.toDo = toDo;
		this.day = day;
		this.time = time;
		this.requiredTime = requiredTime;
		this.priority = -1;
	}
	
	void showSchedule(){
		System.out.println("�� ��: " + toDo + ", " + day + " / " + time + " �ҿ�ð� : " + requiredTime + "			�켱���� : " + priority);
	}
	
	public int compareTo(Schedule s) {

		if (this.priority < s.priority) {
			return -1;
		} else if (this.priority == s.priority) {
			return 0;
		} else {
			return 1;
		}
	}
}

public class A05_ObjArray {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
//         Team t = new Team("���׷�", 20, 17);
//         t.showCur();
         /*
          * ��ü �迭
          * 1. ��ü
          *    ��ü [] ��ü�迭�� =new ��ü[�迭ũ��];
          *  ex) Person[]p =new Person[5]; //5�� Person ��ü�� �� �� �ִ� �迭..
          * 2. ��ü�迭 ����, �Ҵ�
          *    ex) Person[]p ={new Person("���̸�1"),new Person("���̸�2"),new Person("���̸�3")} ;
          * 3. ��ü �迭�� �̿��� �޼��� Ȱ��.
          *  for(int idx =0; idx<p.length; idx++){
          *  p[idx].printAll(); // Ư�� �迭��ü ���ο� �ִ� ��ü�Ѱ��� �޼��� Ȱ��.. ==>  p.printAll();
          *  }
          *  for(Person ps: p){
          *  ps.printAll();
          *  }
          *   
          */
//            Team[] tArray01 = new Team[3];
//            tArray01[0] = new Team("�λ꺣����", 21, 18);
//            tArray01[1] = new Team("�ؼ��������", 19, 18);
//            tArray01[2] = new Team("�Ｚ���̿���", 17, 14);
//            
//            for(Team tm:tArray01){
//            	tm.showCur();
//            }
//            
//            Team[] tArray02 = {
//            		new Team("�Ե����̾�Ʈ", 22 ,21),
//            		new Team("sk���̹���", 22 ,21),
//            		new Team("LA������", 23 ,19)
//            };
//            
//            for(int i=0; i<tArray02.length; i++){
//            	tArray02[i].showCur();
//            }
         
	   	Schedule[] s = new Schedule[5];
         
		s[0] = new Schedule("û��", 1, 2, 1);
		s[1] = new Schedule("����", 1, 4, 3);
		s[2] = new Schedule("����", 1, 6, 5);
		s[3] = new Schedule("��", 1, 8, 3);
		s[4] = new Schedule("����", 1, 10, 2);
		
//		for (Schedule ts : s) {
//			ts.showSchedule();
//		}

		s[0].priority = 3;
		s[1].priority = 2;
		s[2].priority = 1;
		s[3].priority = 7;
		s[4].priority = 100;
		
		Schedule[] temp = s;
		
		Arrays.sort(temp);
		
		for (Schedule t : temp) {
			t.showSchedule();
		}
		
		
		
		
		
		
		
		
		
            
            
   }//main

}