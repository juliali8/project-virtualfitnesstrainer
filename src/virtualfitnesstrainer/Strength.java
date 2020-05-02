package virtualfitnesstrainer;

public class Strength implements Exercise {
	
	String name; 
	int duration;
	int numOfReps; 
	String[] equipment;
	String imagePath;
	
	public Strength(String name, int duration, int numOfReps, String[] equipment) {
		this.name = name; 
		this.duration = duration;
		this.numOfReps = numOfReps; 
		this.equipment = equipment; 
		this.imagePath = "../images/" + name.replaceAll("\\s", "") + ".jpg";
	}

	public String getName() {
		return name; 
	}

	public int getDuration() {
		return duration; 
	}

	public int getReps() {
		return numOfReps;
	}

	public String[] getEquipment() {
		return equipment; 
	}
	
	public String getImage() {
		return imagePath;
	}
	
	public String toString() {
		return name + " " + duration + " min";
	}

}
