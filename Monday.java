import java.util.Scanner;

public class Monday{

public static void main(String [] args){

Scanner scam = new Scanner (System.in);

double studentScore;

System.out.printf("Enter Student score");
studentScore = scam.nextDouble();

if (studentScore >= 90) {
System.out.print ("Student has A");
}

else if (studentScore >=80 &&  studentScore< 90) {
System.out.print ("Student has B");
}

else if (studentScore >=70 && studentScore< 80) {
System.out.print ("Student has C");
}

else if (studentScore <= 69) {
System.out.print ("Student has F");
		}

	}

} 

