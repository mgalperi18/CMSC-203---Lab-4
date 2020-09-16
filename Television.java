/*
 * The purpose of this class is to model a television
 * Mira Galperina 9/15/2020
 */

public class Television {
	final String MANUFACTURER; //the brand of the TV
	final int SCREEN_SIZE; //the screen size of the tv
	boolean powerOn; //shows if the tv is on or off
	int channel, volume; //holds the value of the channel and the tv volume
	
	//constructor method to declare the tv variables
	public Television(String brand, int size){
		MANUFACTURER = brand;
		SCREEN_SIZE = size;
		powerOn = false;
		volume = 20;
		channel = 2;	
	}
	
	//getters
	//gets the value for the channel variable
	public int getChannel() {
		return channel;
	}	
	//gets the volume value
	public int getVolume() {
		return volume;
	}
	//gets the manufacturer name
	public String getManufacturer() {
		return MANUFACTURER;
	}
	//gets the size of the screen
	public int getScreenSize() {
		return SCREEN_SIZE;
	}
	
	//setters
	//accepts a value for the channel field
	public void setChannel(int station) {
		channel = station;
	}
	//changes the state from true to false or from false to true
	public void power() {
		if(powerOn = !powerOn)
			powerOn = true;
		else
			powerOn = false;
	}
	//change the volume
	public void increaseVolume() {
		volume += 1;
	}
	public void decreaseVolume() {
		volume -= 1;
	}
	
}
