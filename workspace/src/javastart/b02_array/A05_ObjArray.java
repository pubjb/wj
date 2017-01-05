package javastart.b02_array;

import java.lang.reflect.Array;
import java.util.Arrays;





class Team{
   //팀명
   String name;
   //총전적
   int totGame;
   //승수
   int vicCnt;
   //패..
   int defCnt;
   //승률
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
		System.out.println("할 일: " + toDo + ", " + day + " / " + time + " 소요시간 : " + requiredTime + "			우선순위 : " + priority);
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
//         Team t = new Team("빙그레", 20, 17);
//         t.showCur();
         /*
          * 객체 배열
          * 1. 객체
          *    객체 [] 객체배열명 =new 객체[배열크기];
          *  ex) Person[]p =new Person[5]; //5개 Person 객체가 들어갈 수 있는 배열..
          * 2. 객체배열 선언, 할당
          *    ex) Person[]p ={new Person("하이맨1"),new Person("하이맨2"),new Person("하이맨3")} ;
          * 3. 객체 배열을 이용한 메서드 활용.
          *  for(int idx =0; idx<p.length; idx++){
          *  p[idx].printAll(); // 특정 배열객체 내부에 있는 객체한개의 메서드 활용.. ==>  p.printAll();
          *  }
          *  for(Person ps: p){
          *  ps.printAll();
          *  }
          *   
          */
//            Team[] tArray01 = new Team[3];
//            tArray01[0] = new Team("두산베어즈", 21, 18);
//            tArray01[1] = new Team("넥센히어로즈", 19, 18);
//            tArray01[2] = new Team("삼성라이온즈", 17, 14);
//            
//            for(Team tm:tArray01){
//            	tm.showCur();
//            }
//            
//            Team[] tArray02 = {
//            		new Team("롯데자이언트", 22 ,21),
//            		new Team("sk와이번스", 22 ,21),
//            		new Team("LA다저스", 23 ,19)
//            };
//            
//            for(int i=0; i<tArray02.length; i++){
//            	tArray02[i].showCur();
//            }
         
	   	Schedule[] s = new Schedule[5];
         
		s[0] = new Schedule("청소", 1, 2, 1);
		s[1] = new Schedule("공부", 1, 4, 3);
		s[2] = new Schedule("게임", 1, 6, 5);
		s[3] = new Schedule("밥", 1, 8, 3);
		s[4] = new Schedule("공부", 1, 10, 2);
		
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