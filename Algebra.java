import java.util.Scanner;

import java.lang.Math;

public class Algebra{
 public static void main (String [] args){

	Scanner frank = new Scanner(System.in);
double a;
double b;
double c;
double firstAnswer;
double secondAnswer;

 System.out.println("a = :" );
  a = frank.nextDouble();

System.out.println("b = :" );
  b = frank.nextDouble();

System.out.println("c = :" );
  c = frank.nextDouble();

 firstAnswer = -b + Math.sqrt (b*b) - (4 * a * c)/ ( 2 * a);

 secondAnswer = -b - Math.sqrt (b*b) - (4 * a * c)/ ( 2 * a);

System.out.println("First Answer " + firstAnswer );
System.out.printf("second Answer " + secondAnswer);
}
}






