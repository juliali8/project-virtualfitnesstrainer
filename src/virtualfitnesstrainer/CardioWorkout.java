package virtualfitnesstrainer;

import java.util.*;

public class CardioWorkout implements Workout {
	
	List<Exercise> exercises;
	int desiredTime;
	int totalTime;
	List<String> equipment;
	List<Exercise> workout;
	
	public CardioWorkout() {
		this.desiredTime = 0;
		this.totalTime = 0;
		this.exercises = new ArrayList<Exercise>();
		// FIXME: Fill exercises with exercises
		exercises.add(new Cardio("Run", 20, new String[0]));
		exercises.add(new Cardio("Jumping Jacks", 5, new String[0]));
		exercises.add(new Cardio("Mountain Climbers", 5, new String[0]));
		exercises.add(new Cardio("Sprint", 5, new String[0]));
		exercises.add(new Cardio("Burpees", 5, new String[0]));
		
		this.workout = new ArrayList<Exercise>();
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
		return workout;
	}
	
	public boolean addExercise(Exercise e) {
		if(totalTime + e.getDuration() <= desiredTime && equipmentOwned(e)) {
			totalTime += e.getDuration();
			return workout.add(e);
		}
		else {
			return false;
		}
	}
	
	public boolean equipmentOwned(Exercise e) {
		for (String equipmentNeeded : e.getEquipment()) {
			if (!equipment.contains(equipmentNeeded)) {
				return false;
			}
		}
		return true;
	}

	public boolean removeExercise(Exercise e) {
		return workout.remove(e); 
	}

}
