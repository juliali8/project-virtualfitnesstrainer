package virtualfitnesstrainer;

import java.util.List;

public interface Workout {
	
	public void setDuration(int minutes);
	
	public void addEquipment(List<String> equipment);
	
	public List<Exercise> generateWorkout();
	
	public List<Exercise> getWorkout();
	
	public boolean addExercise(Exercise e); 
	
	public boolean removeExercise(Exercise e);
	
}
