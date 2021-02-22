import java.util.Scanner;

public class PalindromeExample{

public static void main(String [] args){

Scanner input = new Scanner (System.in);

int firstDigit;
int secondDigit;
int thirdDigit;


System.out.printf("Enter first digit: ");
firstDigit = input.nextInt();
System.out.printf("Enter second digit: ");
secondDigit = input.nextInt();
System.out.printf("Enter third digit: ");
thirdDigit = input.nextInt();

//printf("%d%d%d",firstNumber,secondNumber,thirdNumber);


if (firstDigit == thirdDigit){
System.out.println("this is a palindrome");
}
if (firstDigit != thirdDigit){
System.out.println("this is not a palindrome");
}

}
}
