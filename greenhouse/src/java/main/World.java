package main;
import Zone.*;
import java.awt.Rectangle;
import java.util.HashMap;
import java.util.Map;

public class World {
	static private Map<Rectangle,Zone> Zones=new HashMap<Rectangle,Zone>();
	
	
	static public void AddZone(Rectangle rect,Zone zone) {
		Zones.put(rect,zone);
	}
	static public void DeleteZone(Rectangle rect) {
		Zones.remove(rect);
	}
	static public Zone getZone(Rectangle rect) {
		return Zones.get(rect);
	}
	
	
	
}
