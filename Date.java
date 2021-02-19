public class Date{


 
 private int month;
 private int day;
 private int year;

public Date(int month, int day, int year){
	this.month = month;
	this.day = day;
	this.year = year;
}

 public int getMonth(){
 return month;
}
 public int getDay(){
 return day;
}
 public int getYear(){
 return year;
}
 public void setMonth (int newMonth){
         month = newMonth;

}
 public void setDay (int day){
        this.day = day;
}
 public void setYear (int newYear){
        year = newYear;

}
 public String displayDate(){
  return(day + "/" + month + "/" + year);
}

}
