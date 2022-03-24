package addition;

import java.util.Scanner;

public class simpleadd {

   public static void main(String[] args) {
	
	   Scanner sc=new Scanner(System.in);
	   
	 int num1,num2;
	 System.out.println("enter the first number");
	 num1=sc.nextInt();
	 System.out.println("enter the second number");
	 num2=sc.nextInt();
	 
	 int result =num1+num2;
	 System.out.println("result is: "+result);
   }
  

}
