package com.create;
import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
	    
	    int choose;
		double num1,num2,cal;
		
   Scanner in = new Scanner(System.in);
      
   System.out.println("Choose your Operator");
   System.out.println("1 For Addition");
   System.out.println("2 For Division");
   System.out.println("3 For Modulo");
   System.out.println("4 For Subtraction");
   System.out.println("5 For Multiplication");
   
   
   choose = in.nextInt();
   
  System.out.println("Enter First Number");
  num1=in.nextDouble();
  
  System.out.println("Enter Second Number");
  num2=in.nextDouble();
  
  if(choose == 1 ) {
	  cal=num1+num2;
	  System.out.println("The answer is:"+cal);
  }
  else if(choose == 2) {
	  cal=num1/num2;
	  System.out.println("The answer is:"+cal);
  }
  else if(choose == 3) {
	  cal=num1%num2;
	  System.out.println("The answer is:"+cal);
  }
  else if(choose == 4) {
	  cal=num1-num2;
	  System.out.println("The answer is:"+cal);
  }
  else if(choose == 5) {
	  cal=num1*num2;
	  System.out.println("The answer is:"+cal);
	  
  }
  else {
	  System.out.println("You are out of range");
  }
   
   
   in.close();
}
}

