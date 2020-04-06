package virtualfitnesstrainer;

import java.util.*;

public class EnduranceWorkout implements Workout {

	List<Exercise> exercises; 
	int desiredTime;
	int totalTime;
	List<String> equipment;
	List<Exercise> workout;

	public EnduranceWorkout() {
		this.desiredTime = 0;
		this.totalTime = 0;
		this.exercises = new ArrayList<Exercise>();
		// FIXME: Fill exercises with exercises
		exercises.add(new Endurance("Bike", 10, new String[]{"Bike"}));
		exercises.add(new Endurance("Run", 10, new String[0]));
		exercises.add(new Endurance("Jog", 20, new String[0]));
		
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
