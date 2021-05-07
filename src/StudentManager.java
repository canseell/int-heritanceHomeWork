
public class StudentManager {
	
	User user = new User();
	
	Instructor instructor = new Instructor();
	
	Student student = new Student();
	

	public void studentRegistration(Student[] students) 
	{
		
	    for (Student student : students) 
	    {
		
		  System.out.println("Great " + student.getFirstName() + " " + student.getLastName() + "..." + " Your registration is finished..");
	    
		  System.out.println("You can use this user name to login: " + student.getUserName());
		
		  System.out.println("Your student number: " + student.getStudentNumber());
	    
		
	    }		
		
	}
	
	
	public void chooseInstructor(Student[] students , Instructor[] instructors) 
	
	{
		    for (Student student : students) 
		    {
		           int i = student.getChooseInstructorId();	
		           System.out.println("Dear " + student.getFirstName() +" " + student.getLastName() + ", You chosed " + instructors[i].getFirstName() + " " + instructors[i].getLastName() + "...");
		   
	        } 
	}
	
	
	public void courseSituation(Student[] students) 
	{
		
		for (Student student : students) 
		{
		
		   if( student.getPercentage() < 80)
		   {
			
			  System.out.println("Sorry..." + "Your course situaton: " + student.getPercentage() + "Your course situation is not enough for getting course certificate..");
		   }
		
		   else 
		   {
			
			System.out.println("Great..." + "Your course situaton: " + student.getPercentage() + "Your course situation is enough for getting course certificate..Congratulations");
			
		   }
	  
		}
	}
	    
}
