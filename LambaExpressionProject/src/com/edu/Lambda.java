package com.edu;
import java.util.ArrayList;
@FunctionalInterface
interface Drawable{   
	void draw();
}
interface sayable{
	void say(String s);
	
}
@FunctionalInterface
interface SayableReturn{
	String sayHello();  //function with no arg and with return type
}

@FunctionalInterface
interface Addition{
	int add(int a, int b); //function with arg and with return type
}

public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable dob=()->{
			System.out.println("sri");
		};
		dob.draw();
		
		sayable sob=(s)->{
			System.out.println("Hello"+s);
		};
		sob.say("Sri");
		
		SayableReturn sr=()->{
			return "yhoo";
		};
		System.out.println(sr.sayHello());
		
		Addition aob=(i,j)->(i+j);
		System.out.println(aob.add(2,6));
		
		
		
		ArrayList<Integer>l=new ArrayList<Integer>();
		l.add(8);
		l.add(7);
		l.add(5);
		l.add(6);
		
		l.forEach((n)->System.out.println(n));//Iterating list elements using Lambda
	  
	}

}
