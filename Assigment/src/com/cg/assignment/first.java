package com.cg.assignment;
import java.util.Scanner;
import java.util.*;

public class first {
	public static void main(String[] args) {
	   int n,salary=0;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the salary");
	   n=sc.nextInt();
	   if(n>1000000)
	   {
		   salary=n*30/100;
	   }
	   else if(n<1000000)
	   {
		   salary=n*20/100; 
	   }
	   else if(n<500000)
	   {
		   salary=n*5/100;
	   }
	   System.out.println("The Salary " + n + " is : " + salary);
}
}
