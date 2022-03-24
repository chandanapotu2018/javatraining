package arithmeticcalculator;

import java.io.*;
import java.util.Scanner;

public class arithmeticcalculatorusingswitch {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double num1,num2;
		char op;
		
		System.out.println("enter the operation(+,-,*,/) :");
        op = scanner.next().charAt(0);
        
        System.out.println("enter first number");
        num1 = scanner.nextDouble();
        
        System.out.println("enter the second number");
        num2 = scanner.nextDouble();
        
     
        switch(op){
        case '+' :
        	System.out.println("sum of "+num1+" and "+num2+" : "+(num1+num2));
        	break;
        case '-' :
        	System.out.println("sub of "+num1+" and "+num2+" : "+(num1-num2));
        	break;
        case '*' :
        	System.out.println("multiplication of "+num1+" and "+num2+" : "+(num1*num2));
        	break;
        case '/' :
        	System.out.println("division of "+num1+" and "+num2+" : "+(num1/num2));
        	 break;
        default:
        	System.out.println("invalid operator");
        }
	}

}


