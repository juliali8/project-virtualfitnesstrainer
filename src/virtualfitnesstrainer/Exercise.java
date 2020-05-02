package virtualfitnesstrainer;

public interface Exercise {
	public String getName(); 
	
	public int getDuration();
	
	public int getReps();
	
	public String[] getEquipment();
	
	public String getImage();
	
	public String toString();
}
