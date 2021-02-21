public class Television{

	private String brandName;
	private boolean isOn;
	private int volume;
        private int channels;
	private int brightness;
	private boolean setOn;


	public Television(String brandName, boolean isOn, int brightness, int volume){
		this.brandName = brandName;
		this.isOn = isOn;
		this.volume = volume;
		this.channels = channels;
		this.brightness = brightness;
				
}
	public void setBrandName (){
		this.brandName = brandName;
}
	public String getBrandName (){
		return brandName;
}
	public void setOn (){
		setOn = true;
}
	public boolean isOn (){
		return isOn;
}
	public void setBrightness (){
		this.brightness = brightness;
}
	public int getBrightness (){
		if (brightness >= 1 && brightness < 10)
			brightness ++;
		if (brightness <=10 && brightness > 1)
			brightness --;
			return brightness;
}
	public void setVolume (){
		this.volume = volume;
}
	public int getVolume (){
		if (volume >= 1 && volume < 20)
			volume ++;
		if (volume <=20 && volume > 1)
			volume --;
			return volume;
}
	public void setChannels (){
		this.channels = channels;
}
	public int getchannels (){
		if (channels >= 1 && channels <100)
			channels ++;
		if (channels <=100 && channels >1)
			channels--;
			return channels;
}
}
