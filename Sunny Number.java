//package com.example.demo;

import java.util.Scanner;

public class SunnyNumber {

	public static void main(String[] args) {
		int n;
		System.out.print("input number");
		Scanner cn= new Scanner(System.in);
		n = cn.nextInt();
		 int m=n+1;
		 
		 int  p=(int) Math.sqrt(m);
		 
		if((p-Math.floor(p))==0) {
			System.out.println("Sunney NUmber");
			
		}else {
			System.out.println("Not Sunney  NUmber");
		}
		 
		
		System.out.println(p);	
		
		

	}

}
