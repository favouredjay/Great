import java.util.Scanner;

public class Cylinder{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

double area;
double volume;
double length;
double radius;
double pi = 3.142;

System.out.print("Enter the radius of the cylinder  ");
radius = input.nextFloat();

System.out.print("Enter the length of the cylinder  ");
length = input.nextFloat();

area = radius*radius*pi;

volume = area*length;

System.out.print("area is: " + area + "\n");

System.out.print("volume is: " + volume +"\n");

  }

}	