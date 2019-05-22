package Zone;

public class Zone{
	private Plant Cultivated;
	private int Humidity;
	private int Temperature;
	private int Light;
	private int Water;
	private int Nutrient;
	private String Pesticide;
	
	public Zone(Plant plant,int humidity,int temperature,int light,int water,int nutrient) {
		Cultivated=plant;
		Humidity=humidity;
		Temperature=temperature;
		Light=light;
		Water=water;
		Nutrient=nutrient;
	}
	
	public void ChangePesticide(String pest) {
		Pesticide=pest;
		CheckPesticide();
	}
	public void ChangePlant(Plant p) {
		Cultivated=p;
		CheckPesticide();
	}
	public void CheckPesticide() {
		if(!Cultivated.getPesticides().contains(Pesticide)) {
			System.out.println(Cultivated.getClass()+" died,becouse of deadly pesticide");
		}
	}
	
	public int HumidityCorretion() {
		return Cultivated.getHumidity().Correction(Humidity);
	}
	public int TemperatureCorretion() {
		return Cultivated.getTemperature().Correction(Temperature);
	}
	public int LightCorretion() {
		return Cultivated.getLight().Correction(Light);
	}
	public int WaterCorretion() {
		return Cultivated.getWater().Correction(Water);
	}
	public int NutrientCorretion() {
		return Cultivated.getNutrient().Correction(Nutrient);
	}
	
	public int getHumidity() {
		return Humidity;
	}
	public int getTemperature() {
		return Temperature;
	}
	public int getLight() {
		return Light;
	}
	public int getWater() {
		return Water;
	}
	public int getNutrient() {
		return Nutrient;
	}
	public Plant getPlant() {
		return Cultivated;
	}
	
	public void setHumidity(int humidity) {
		Humidity=humidity;
	}
	public void setTemperature(int temperature) {
		Temperature=temperature;
	}
	public void setLight(int light) {
		Light=light;
	}
	public void setWater(int water) {
		Water=water;
	}
	public void setNutrient(int n) {
		Nutrient=n;
	}
	public void setPlant(Plant p) {
		Cultivated=p;
	}
}
