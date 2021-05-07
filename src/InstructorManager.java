
public class InstructorManager {
	
    public void instructorRegistration(Instructor[] instructors) {
	
	   for (Instructor instructor : instructors) {
		   
		System.out.println("Great " + instructor.getFirstName() + " " + instructor.getLastName() + "..." + " Your registration is finished..");
	    
		System.out.println("You can use this user name to login: " + instructor.getUserName());
		
		System.out.println("Your instructor number: " + instructor.getInstructorNumber());
	    
	   
	   }
		
    }

}
