package com.edu;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionInterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String,Integer> len=(str)->str.length();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		int la=len.apply(s);
		System.out.println("length of string="+la);
	}

}
