package virtualfitnesstrainer;

public class Endurance implements Exercise {
	
	String name; 
	int duration; 
	String[] equipment;
	String imagePath;
	
	public Endurance(String name, int duration, String[] equipment) {
		this.name = name; 
		this.duration = duration; 
		this.equipment = equipment;
		this.imagePath = "./images/endurance/" + name + ".jpg";
	}
	
	public String getName() {
		return name;
	}

	public int getDuration() {
		return duration;
	}

	public int getReps() {
		return 0;
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
