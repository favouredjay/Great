public class TelevisionTest{

	public static void main (String[] args){

Television joysTelevision;
 	joysTelevision = new Television ("Semicolon",true, 1, 5);

 joysTelevision.setBrandName();
 joysTelevision.setVolume();
 joysTelevision.setBrightness();
 

	String joysTelevisionBrandName = joysTelevision.getBrandName();
	int joysTelevisionVolume = joysTelevision.getVolume();
	int joysTelevisionBrightness = joysTelevision.getBrightness();
	

	System.out.printf("THE BRAND NAME IS %s%n", joysTelevisionBrandName);

	System.out.printf("Volume is: %d%n", joysTelevisionVolume);

	System.out.printf( "Brightness is: %d%n", joysTelevisionBrightness);


}
}