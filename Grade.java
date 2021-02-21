import java.util.Scanner;

public class Grade{

public static void main(String[] args){


Scanner input = new Scanner (System.in);

double studentGrade;

System.out.printf("Enter your score");
studentGrade = input.nextDouble();

if (studentGrade <40){
System.out.printf("Student has failed");
}
if (studentGrade >=40){
System.out.printf("Student has passed");
}
}
}




