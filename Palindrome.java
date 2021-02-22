import java.util.Scanner;
public class Palindrome{

public static void main (String [] args){

Scanner input = new Scanner (System.in);

int digit;
System.out.print("Enter a Number");
digit = input.nextInt();


int firstNumber = digit/100;
int thirdNumber = digit%10;


if (firstNumber != thirdNumber){
System.out.println("THIS IS NOT A PALINDROME");
	}

if (firstNumber == thirdNumber){
System.out.println("THIS IS A PALINDROME");
	}
	}
}









