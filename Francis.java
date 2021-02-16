import java.util.Scanner;
public class Francis
{
public static void main(String[] args)
  {
Scanner ntoka = new Scanner(System.in);
int number1;
int number2;
System.out.print("Enter first integer:");
number1 = ntoka.nextInt();

System.out.print("Enter second integer:");
number2 = ntoka.nextInt();

if (number1 == number2)
System.out.printf("%d == %d%n",number1, number2);

if (number1!= number2)
System.out.printf("%d != %d%n",number1, number2);

if (number1 < number2)
System.out.printf("%d < %d%n", number1, number2);
 }
}