package virtualfitnesstrainer;

import java.util.*;

public class StrengthWorkout implements Workout {

	List<Exercise> exercises; 
	int desiredTime;
	int totalTime;
	List<String> equipment;
	List<Exercise> workout;
	
	public StrengthWorkout() {
		this.desiredTime = 0;
		this.totalTime = 0;
		this.exercises = new ArrayList<Exercise>();
		// FIXME: Fill exercises with exercises
	}
	
	public void setDuration(int minutes) {
		this.desiredTime = minutes;
	}
	
	public void addEquipment(List<String> equipment) {
		this.equipment = equipment;
	}
	
	public List<Exercise> generateWorkout() {
		while (totalTime < desiredTime) {
			addExercise(exercises.get((int)(Math.random() * exercises.size())));
		}
		return exercises;
	}
	
	public boolean addExercise(Exercise e) {
		if(totalTime + e.getDuration() <= desiredTime) {
			totalTime += e.getDuration();
			return exercises.add(e);
		}
		else {
			return false;
		}
	}

	public boolean removeExercise(Exercise e) {
		return exercises.remove(e); 
	}

}
