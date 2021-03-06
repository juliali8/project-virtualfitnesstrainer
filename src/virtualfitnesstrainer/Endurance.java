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
		this.imagePath = "../images/" + name.replaceAll("\\s", "") + ".jpg";
	}
	
	public String getName() {
		return name;
	}

	public int getDuration() {
		return duration;
	}

	public String getReps() {
		return "NA";
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
