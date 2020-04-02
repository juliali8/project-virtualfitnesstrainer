package virtualfitnesstrainer;

public interface Workout {
	
	public boolean addExercise(Exercise e); 
	
	public boolean removeExercise(Exercise e); 
	
	public int getTotalTimeOfWorkout(); 
}
