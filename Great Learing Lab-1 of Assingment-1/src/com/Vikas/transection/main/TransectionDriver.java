package com.Vikas.transection.main;

import java.util.Scanner;

import com.Vikas.transection.service.TransectionService;

public class TransectionDriver {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of transection array");
		int n=sc.nextInt();
		int [] a=new int[n];
		System.out.println("Enter the values of the array");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the value of target that you need to be achived ");
		int targetNo = sc.nextInt();
		TransectionService transectionService = new TransectionService();
		TransectionService.checkTransection(a,targetNo);
		sc.close();
	}
}
