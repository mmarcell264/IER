package Zone;

public class Range{
	private int Min,Max;
	
	public Range(int min,int max) {
		Min=min;
		Max=max;
	}
	
	public int getMin() {
		return Min;
	}
	public void setMin(int min) {
		Min=min;
	}
	public int getMax() {
		return Max;
	}
	public void setMax(int max) {
		Max=max;
	}
	
	public int Correction(int value) {
		if(value < Min) {
			return Min-value;
		}
		else if(value>Max) {
			return value-Max;
		}
		else return 0;
		
	}
}

