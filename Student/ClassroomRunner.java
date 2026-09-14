package Student;

import java.util.Random;

public class ClassroomRunner {
	public static void main(String[] args){
		Classroom classroom = new Classroom();

		String[] firstNames = {"John", "Jane", "Terrance", "Quinn", "Cameron", "Kevin", "Urkle", "Frank", "Yugo", "Yasmine"};
		String[] lastNames = {"Doe", "Fitzpatrick", "Pleasant", "Nicholson", "Anderson", "Xavier", "Lawrence", "Otto", "Zartler", "Earl"};

		// randomly creates some number of students
		// Can toggle to number of students made
		// In the classroom file, change where the sort call happens to see how slow the code can get
		// if placed poorly
		for(int i = 0; i < 500; i++){
			__ rng = new __();
			String first = firstNames[rng.__(firstNames.__)];
			String last = lastNames[rng.__(lastNames.__)];
			classroom.__(new Student(__, __));
		}

		// We time here to demonstrate how intelligent usage of sorting in the classroom class affects code speed
		long start = System.nanoTime();
		classroom.__();
		long end = System.nanoTime();

		System.out.println((end-start)/1000000);

	}
}
