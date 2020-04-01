package virtualfitnesstrainer;

public class Strength implements Exercise {
	String name; 
	int duration;
	int numOfReps; 
	String[] equipment; 
	
	public Strength(String name, int duration, int numOfReps, String[] equipment) {
		this.name = name; 
		this.duration = duration;
		this.numOfReps = numOfReps; 
		this.equipment = equipment; 
	}

	public String getName() {
		return name; 
	}

	public int getDurationInMinute() {
		return duration; 
	}

	public int getReps() {
		return numOfReps;
	}

	public String[] getEquipment() {
		return equipment; 
	}

}
