package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.List;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import virtualfitnesstrainer.Cardio;
import virtualfitnesstrainer.CardioWorkout;
import virtualfitnesstrainer.DurationInputWindow;
import virtualfitnesstrainer.Endurance;
import virtualfitnesstrainer.EnduranceWorkout;
import virtualfitnesstrainer.Exercise;
import virtualfitnesstrainer.Strength;
import virtualfitnesstrainer.StrengthWorkout;
import virtualfitnesstrainer.Workout;

class GenerateExercisesTests {

	@Test
	void testStrengthExerciseCreation() {
		String name = ""; 
		int duration = 0;
		int numOfReps = 0;
		String[] equipment = {"", ""}; 
		Strength s = new Strength(name, duration, numOfReps, equipment);
		assertTrue(true);
	}

	@Test
	void testEnduranceExerciseCreation() {
		String name = ""; 
		int duration = 0;
		String[] equipment = {"", ""}; 
		Endurance e = new Endurance(name, duration, equipment);
		assertTrue(true);
	}

	@Test
	void testCardioExerciseCreation() {
		String name = ""; 
		int duration = 0;
		String[] equipment = {"", ""}; 
		Cardio c = new Cardio(name, duration, equipment);
		assertTrue(true);
	}

	@Test
	void testStrengthWorkoutCreation() {
		StrengthWorkout sw = new StrengthWorkout();
		assertTrue(true);
	}

	@Test
	void testEnduranceWorkoutCreation() {
		EnduranceWorkout ew = new EnduranceWorkout();
		assertTrue(true);
	}

	@Test
	void testCardioWorkoutCreation() {
		CardioWorkout cw = new CardioWorkout();
		assertTrue(true);
	}

	@Test
	void testAddEquipment() {
		EnduranceWorkout eu = new EnduranceWorkout();
		ArrayList<String> equipment = new ArrayList<String>();
		equipment.add("bike");
		equipment.add("dumbbells");
		eu.addEquipment(equipment);
		assertTrue(true);
	}

//	@Test
//	void testSetDuration() {
//		EnduranceWorkout ew = new EnduranceWorkout();
//		DurationInputWindow w = new DurationInputWindow(ew);
//		w.setDurationBoxText("5");
//		w.checkValidDurationBoxInput();
//		if(Integer.parseInt(w.getDurationBoxText()) >= 10) {
//			assertTrue(true);
//		}
//		else {
//			assertFalse(true);
//		}
//	}

	@Test
	void testGenerateCardioWorkoutList() {
		ArrayList<Exercise> exercises = new ArrayList<Exercise>();
		String name = "Exercise 1"; 
		int duration = 10;
		Cardio c = new Cardio(name, duration, new String[0]);
		exercises.add(c);		
		CardioWorkout cw = new CardioWorkout();
		cw.setDuration(10);
		cw.setExercises(exercises);
		if(cw.generateWorkout().get(0) == c) {
			assertTrue(true);
		}
		else {
			assertFalse(true);
		}

	}

	@Test
	void testGenerateCardioWorkoutListWithTimeRestrictions() {
		ArrayList<Exercise> exercises = new ArrayList<Exercise>();
		String name1 = "Exercise 1"; 
		int duration1 = 20;
		Cardio c1 = new Cardio(name1, duration1, new String[0]);
		exercises.add(c1);	
		String name2 = "Exercise 2"; 
		int duration2 = 10;
		Cardio c2 = new Cardio(name2, duration2, new String[0]);
		exercises.add(c2);	
		CardioWorkout cw = new CardioWorkout();
		cw.setDuration(10);
		cw.setExercises(exercises);
		if(cw.generateWorkout().get(0) == c2) {
			assertTrue(true);
		}
		else {
			assertFalse(true);
		}
	}

	@Test
	void testGenerateEnduranceWorkoutList() {
		ArrayList<Exercise> exercises = new ArrayList<Exercise>();
		String name = "Exercise 1"; 
		int duration = 10;
		Endurance e = new Endurance(name, duration, new String[0]);
		exercises.add(e);		
		EnduranceWorkout ew = new EnduranceWorkout();
		ew.setDuration(10);
		ew.setExercises(exercises);
		if(ew.generateWorkout().get(0) == e) {
			assertTrue(true);
		}
		else {
			assertFalse(true);
		}
	}

	@Test
	void testGenerateEnduranceWorkoutListWithTimeRestrictions() {
		ArrayList<Exercise> exercises = new ArrayList<Exercise>();
		String name1 = "Exercise 1"; 
		int duration1 = 20;
		Endurance e1 = new Endurance(name1, duration1, new String[0]);
		exercises.add(e1);	
		String name2 = "Exercise 2"; 
		int duration2 = 10;
		Endurance e2 = new Endurance(name2, duration2, new String[0]);
		exercises.add(e2);	
		CardioWorkout cw = new CardioWorkout();
		cw.setDuration(10);
		cw.setExercises(exercises);
		if(cw.generateWorkout().get(0) == e2) {
			assertTrue(true);
		}
		else {
			assertFalse(true);
		}	
	}

	@Test
	void testGenerateStrengthWorkoutList() {
		ArrayList<Exercise> exercises = new ArrayList<Exercise>();
		String name = "Exercise 1"; 
		int duration = 10;
		int reps = 10;
		Strength s = new Strength(name, duration, reps, new String[0]);
		exercises.add(s);		
		StrengthWorkout sw = new StrengthWorkout();
		sw.setDuration(10);
		sw.setExercises(exercises);
		if(sw.generateWorkout().get(0) == s) {
			assertTrue(true);
		}
		else {
			assertFalse(true);
		}
	}

	@Test
	void testGenerateStrengthWorkoutListWithTimeRestrictions() {
		ArrayList<Exercise> exercises = new ArrayList<Exercise>();
		String name1 = "Exercise 1"; 
		int duration1 = 20;
		int reps1 = 10;
		Strength e1 = new Strength(name1, duration1, reps1, new String[0]);
		exercises.add(e1);	
		String name2 = "Exercise 2"; 
		int duration2 = 10;
		int reps2 = 10;
		Strength e2 = new Strength(name2, duration2, reps2, new String[0]);
		exercises.add(e2);	
		StrengthWorkout cw = new StrengthWorkout();
		cw.setDuration(10);
		cw.setExercises(exercises);
		if(cw.generateWorkout().get(0) == e2) {
			assertTrue(true);
		}
		else {
			assertFalse(true);
		}
	}

	@Test
	void testGenerateCardioWorkoutListWithEquipmentRestrictions() {
		ArrayList<Exercise> exercises = new ArrayList<Exercise>();
		ArrayList<String> equipment = new ArrayList<String>();
		equipment.add("Treadmill");
		String name1 = "Exercise 1"; 
		int duration1 = 10;
		Cardio c1 = new Cardio(name1, duration1, new String[] {"Bike"});
		exercises.add(c1);	

		String name2 = "Exercise 2"; 
		int duration2 = 10;
		Cardio c2 = new Cardio(name2, duration2, new String[] {"Treadmill"});
		exercises.add(c2);	

		CardioWorkout cw = new CardioWorkout();
		cw.setDuration(10);
		cw.setExercises(exercises);
		cw.addEquipment(equipment);

		if(cw.generateWorkout().get(0) == c2) {
			assertTrue(true);
		}
		else {
			assertFalse(true);
		}
	}

	@Test
	void testGenerateEnduranceWorkoutListWithEquipmentRestrictions() {
		ArrayList<Exercise> exercises = new ArrayList<Exercise>();
		ArrayList<String> equipment = new ArrayList<String>();
		equipment.add("Treadmill");
		String name1 = "Exercise 1"; 
		int duration1 = 20;
		Endurance e1 = new Endurance(name1, duration1, new String[]{"Bike"});
		exercises.add(e1);	
		String name2 = "Exercise 2"; 
		int duration2 = 10;
		Endurance e2 = new Endurance(name2, duration2, new String[]{"Treadmill"});
		exercises.add(e2);	
		CardioWorkout cw = new CardioWorkout();
		cw.setDuration(10);
		cw.setExercises(exercises);
		cw.addEquipment(equipment);

		if(cw.generateWorkout().get(0) == e2) {
			assertTrue(true);
		}
		else {
			assertFalse(true);
		}	
	}

	@Test
	void testGenerateStrengthWorkoutListWithEquipmentRestrictions() {
		ArrayList<Exercise> exercises = new ArrayList<Exercise>();
		ArrayList<String> equipment = new ArrayList<String>();
		equipment.add("Dumbbells");
		String name1 = "Exercise 1"; 
		int duration1 = 20;
		int reps1 = 10;
		Strength s1 = new Strength(name1, duration1, reps1, new String[] {"Resistance Band"});
		exercises.add(s1);	
		String name2 = "Exercise 2"; 
		int duration2 = 10;
		int reps2 = 10;
		Strength s2 = new Strength(name2, duration2, reps2, new String[] {"Dumbbells"});
		exercises.add(s2);	
		StrengthWorkout cw = new StrengthWorkout();
		cw.setDuration(10);
		cw.setExercises(exercises);
		cw.addEquipment(equipment);

		if(cw.generateWorkout().get(0) == s2) {
			assertTrue(true);
		}
		else {
			assertFalse(true);
		}
	}

} 