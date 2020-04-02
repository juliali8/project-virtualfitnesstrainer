package virtualfitnesstrainer;

import java.util.List;

public class EnduranceWorkout implements Workout {

	List<Exercise> allExercises; 
	int desiredTime; 

	public int getTotalTimeOfWorkout() {
		int totalSum = 0;
		for(Exercise e : allExercises) {
			totalSum += e.getDurationInMinute();
		}
		return totalSum; 
	}
	
	public boolean addExercise(Exercise e) {
		if(getTotalTimeOfWorkout() + e.getDurationInMinute() <= desiredTime) {
			return allExercises.add(e);
		}
		else {
			return false;
		}
	}

	public boolean removeExercise(Exercise e) {
		return allExercises.remove(e); 
	}

}
