import java.util.*;
import java.lang.Math;

class Time{
	private int hour;
	private int min;
	private int second;

	int gethour(){
		return hour;
	}
	int getmin(){
		return min;
	}
	int getsecond(){
		return second;
	}


	Time add(Time t1, Time t2){
		int h1=t1.gethour();
		int h2=t2.gethour();
		int m1=t1.getmin();
		int m2=t2.getmin();
		int s1=t1.getsecond();
		int s2=t2.getsecond();
		int totaltime1=h1*60*60+m1*60+s1;
		int totaltime2=h2*60*60+m2*60+s2;
		int totaltime=totaltime1+totaltime2;
		int h=totaltime/3600;
		System.out.println(h);
		totaltime=totaltime%3600;
		int m=totaltime/60;
		System.out.println(m);
		totaltime=totaltime%60;
		int s=totaltime;
		System.out.println(s);
		/*if(s>=60){
			s=s%60;
			m++;
			if(m>=60){
				m=m%60;
				h++;
			}
		}
		if(m>=60){
			m=m%60;
			h++;
		}*/
		Time t = new Time(h,m,s);
		return t;

	}

	Time(int h, int m, int s){
		hour=h;
		min=m;
		second=s;
	}
	void Display(){
		System.out.println(hour+ " Hours, "+min+" Minutes, "+second+" Second ");
	}
}

public class Lab5_4{
	public static void main(String args[]){
		Time t1=new Time(3,2,30);
		Time t2=new Time(2,45,31);
		Time t = new Time(0,0,0);
		t=t.add(t1,t2);
		t.Display();
	}
}