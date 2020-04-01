package virtualfitnesstrainer;

public class Endurance implements Exercise {
	
	String name; 
	int duration; 
	String[] equipment; 
	
	public Endurance(String name, int duration, String[] equipment) {
		this.name = name; 
		this.duration = duration; 
		this.equipment = equipment; 
	}
	
	public String getName() {
		return name;
	}

	public int getDurationInMinute() {
		return duration;
	}

	public int getReps() {
		return 0;
	}

	public String[] getEquipment() {
		return equipment; 
	}

}
