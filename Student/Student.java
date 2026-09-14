package Student;

// This Student class is to show an example of using the Comparable interface
// and uses static variables to toggle the method of sorting
public class Student { // FIXME - Will need something here later for comparison
	// Our instance variables
	private String firstName;
	private String lastName;
	private int UID;

	// Our class variables
	// private static boolean idSort = false;
	private __ int enrollment = 1;

	public Student(String f, String l){
		firstName = __;
		lastName = __;
		// Have UID auto made based on the enrollment count
		UID = __;
		__++;
	}

	// A static setter method
	// Gets called at the class level and affects all objects
	// public static void setIDSort(boolean flag){
	// 	idSort = flag;
	// }


	// Out getter functions
	// Needed for the sorting functions later
	public String __() {
		return firstName;
	}

	public String __() {
		return lastName;
	}

	public int __() {
		return UID;
	}

	// The toString function in Java allows us to make a string representation
	// of our object. This is implicitly called when we use an instance in a function
	// that uses a String.
	// NOTE - we can still explicitly call this function
	public String toString(){
		return String.format("%d :: %s %s", __, __, __);
	}

	// Implementation of the compareTo function since we implement the Comparable interface
	// @Override
	// public int compareTo(Student otherStudent) {
	// 	// We check the flag to know how we want to sort
	// 	// NOTE - idSort is a static boolean, so we alter this at the class level
	// 	// NOT the instance level
	// 	if(idSort){
	// 		return sortByID(otherStudent);
	// 	}
	// 	return sortByName(otherStudent);
	// }

	// // function for the compareTo method to sort by last name then first name
	// private int sortByName(Student otherStudent){
	// 	// Attempts to compare last names to sort by first
	// 	if(lastName.__(otherStudent.getLastName()) _ 0){
	// 		return 1;
	// 	}
	// 	else if(lastName.__(otherStudent.getLastName()) _ 0){
	// 		return -1;
	// 	}

	// 	// if the last names are equal, the first names are compared
	// 	if(firstName.__(otherStudent.getFirstName()) _ 0){
	// 		return 1;
	// 	}
	// 	else if(firstName.__(otherStudent.getFirstName()) _ 0){
	// 		return -1;
	// 	}

	// 	// if both last name and first names are equal, they are equal
	// 	return 0;
	// }

	// // function for the compareTo method to sort by ID
	// private int sortByID(Student otherStudent){
	// 	if(UID _ otherStudent.__()){
	// 		return -1;
	// 	}
	// 	else if (UID _ otherStudent.__()){
	// 		return 1;
	// 	}
	// 	return 0;
	// }

}
