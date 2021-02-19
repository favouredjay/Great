import java.util.Scanner;
 	
public class Fahrenheit{

	public static void main(String[] args){

	Scanner ini = new Scanner(System.in);

	double fahrenheit;
	double celsius;
	
	System.out.print ("Enter degree in celsius: ");
	celsius = ini.nextDouble();

        fahrenheit = (9.0 / 5) * celsius + 32;

	System.out.print (fahrenheit);

}





}