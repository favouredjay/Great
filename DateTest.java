public class DateTest{

 public static void main (String[] args){

	Date ourDate;
	ourDate = new Date(29, 06, 2302);

	ourDate.setYear(2302);

	int ourDateYear = ourDate.getYear();

	System.out.printf("The year is %d%n", ourDateYear);
        
        ourDate.setMonth(06);

        int ourDateMonth = ourDate.getMonth();

        System.out.printf("The month is %d%n", ourDateMonth);

        ourDate.setDay(29);
        
        int ourDateDay = ourDate.getDay();
     
        System.out.printf("The day is %d%n", ourDateDay);

        System.out.print(ourDate.displayDate());

	

        

       

       


}

        
}