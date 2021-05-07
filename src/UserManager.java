
public class UserManager {

	
	public void defineStudentId(Student[] students) {
	
		for (Student student : students) {
			
		System.out.println("Student " + student.getFirstName() + " " + student.getLastName() + "'s id number is " + student.getId());
		
		}
	}
	
    public void defineInstructorId(Instructor[] instructors) {
		
		for (Instructor instructor : instructors) {
			
		System.out.println("Instructor " + instructor.getFirstName() + " " + instructor.getLastName() + "'s id number is " + instructor.getId());
		
		}
	}
}