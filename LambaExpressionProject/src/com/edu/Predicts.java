package com.edu;

import java.util.function.Predicate;

public class Predicts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> gt=(i)->i>10;
		System.out.println("my number is than"+gt.test(20));
		boolean b =gt.test(20);
		if(b)
		{
			System.out.println("geater than 10");
			
		}
		else
		{
			System.out.println("lesser than 10");
		}

	}

}
