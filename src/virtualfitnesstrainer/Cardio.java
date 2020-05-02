package virtualfitnesstrainer;

public class Cardio implements Exercise{
	
	String name; 
	int duration;
	String[] equipment; 
	String imagePath;
	
	public Cardio(String name, int duration, String[] equipment) {
		this.name = name; 
		this.duration = duration; 
		this.equipment = equipment;
		this.imagePath = "./images/cardio/" + name + ".jpg";
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
