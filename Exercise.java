import java.util. Scanner;

public class Exercise
{
	public static void main (String[] args)
 {
Scanner input = new Scanner(System.in);

int numberOne, numberTwo, numberThree, sum, average, product, smallestNumber, largestNumber;

System.out.print ("Enter first integer: ");
numberOne = input.nextInt();

System.out.print ("Enter second integer: ");
numberTwo = input.nextInt();

System.out.print ("Enter third integer: ");
numberThree = input.nextInt();

sum = numberOne + numberTwo + numberThree;
average = (numberOne + numberTwo + numberThree)/3;
product = numberOne * numberTwo * numberThree ;


	System.out.printf("sum is:  %d%n ",  sum);
	System.out.printf("product is: %d%n ",  product);
	System.out.printf("average is: %d%n ",  average);

	if (numberOne > numberTwo && numberOne > numberThree){
	System.out.println("largest Number: " + numberOne );
	}

	if (numberTwo > numberOne && numberTwo > numberThree){
	System.out.println("largest Number: " + numberTwo);
	}
	if (numberThree > numberTwo && numberThree > numberOne){
	System.out.println("largest Number: " + numberThree);
	}	

	if (numberOne < numberTwo && numberOne < numberThree){
	System.out.println("smallest Number: " + numberOne );
	}
	if (numberTwo < numberOne && numberTwo < numberThree){
	System.out.println("smallest Number: " + numberTwo );
	}
	if (numberThree < numberTwo && numberThree < numberOne){
	System.out.println("smallest Number: " + numberThree);
	}


	}

	}
