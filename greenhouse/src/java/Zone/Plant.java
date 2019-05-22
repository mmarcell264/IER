package Zone;

import java.util.ArrayList;
import java.util.List;

public class Plant {
	private String Name;
	///Ranges of acceptable values
	private Range Humidity;
	private Range Temperature;
	private Range Light;
	private Range Water;
	private Range Nutrients;
	private List<String> Pesticides;//Allowed pesticides,not really needed,but we wrote it in
	//the specification
	
	public Plant(String name,Range humidity,Range temperature,Range light,Range water,Range nutrient) {
		Name=name;
		Humidity=humidity;
		Temperature=temperature;
		Light=light;
		Water=water;
		Nutrients=nutrient;
		Pesticides=new ArrayList<String>();
	}
	
	public String getName() {
		return Name;
	}
	public Range getHumidity() {
		return Humidity;
	}
	public Range getTemperature() {
		return Temperature;
	}
	public Range getLight() {
		return Light;
	}
	public Range getWater() {
		return Water;
	}
	public Range getNutrient() {
		return Nutrients;
	}
	public List<String> getPesticides(){
		return Pesticides;
	}
	
	public void setName(String name) {
		Name=name;
	}
	public void setHumidity(Range humidity) {
		Humidity=humidity;
	}
	public void setTemperature(Range temperature) {
		Temperature=temperature;
	}
	public void setLight(Range light) {
		Light=light;
	}
	public void setWater(Range water) {
		Water=water;
	}
	public void setNutrients(Range nutrient) {
		Nutrients=nutrient;
	}
	public void setPesticides(List<String> pes) {
		Pesticides=pes;
	}
	
	
}
