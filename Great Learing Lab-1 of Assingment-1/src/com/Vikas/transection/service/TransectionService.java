package com.Vikas.transection.service;

import java.util.Scanner;

public class TransectionService {
	public static void checkTransection(int a[], int target) {
		Scanner sc=new Scanner(System.in);
		int n=a.length;
		int sum2=0;
		int res = 0,sum=0;
		for(int j=0;j<target;j++) {
			System.out.println("Enter the value of target");
			int value=sc.nextInt();
			for(int m=0;m<n;m++) {
				sum=sum+a[m];
				if(m==n-1) {
					res=sum;
				}
			}
			if(res<value) {
				System.out.println("Given target is not achived");
				break;
			}
				
			int i=0;
			while(i<n) {
				sum2=sum2+a[i];
				if(sum2 >= value) {
					System.out.println("Transection achived after "+(i+1)+" transection");
					break;
				}
				i++;
			}
		}
	}
}