
public class Main {

	public static void main(String[] args) {
		
		User user = new User();
		
		Instructor engin = new Instructor();
		engin.setId(100);
		engin.setFirstName("Engin");
		engin.setLastName("Demiroð");
		engin.setUserName("engindemirog");
		engin.setInstructorNumber(1);
		engin.setCourseName("java");
		engin.setTotalCourseHour(10);
		
		Instructor cansel = new Instructor();
		cansel.setId(101);
		cansel.setFirstName("Cansel");
		cansel.setLastName("Cömertpay");
		cansel.setUserName("canselcomertpay");
		cansel.setInstructorNumber(2);
		cansel.setCourseName("C#");
		cansel.setTotalCourseHour(8);
		
		
	    Instructor nihal = new Instructor();
	    nihal.setId(102);
		nihal.setFirstName("Nihal");
		nihal.setLastName("Turðut");
		nihal.setUserName("nihalturgut");
		nihal.setInstructorNumber(3);
		nihal.setCourseName("python");
		nihal.setTotalCourseHour(12);

	
		
	    Student yucel = new Student();
	    yucel.setId(200);
		yucel.setFirstName("Yücel");
		yucel.setLastName("Cömertpay");
		yucel.setUserName("yucelcomertpay");
		yucel.setTotalWatchedCourseHour(7);
		yucel.setChooseInstructorId(0);
		yucel.setStudentNumber("10");
		
		Student leyla = new Student();
		leyla.setId(202);
		leyla.setFirstName("Leyla");
		leyla.setLastName("Cömertpay");
		leyla.setUserName("leylacomertpay");
		leyla.setTotalWatchedCourseHour(5);
		leyla.setChooseInstructorId(1);
		leyla.setStudentNumber("20");
	    
			
	    Student mehmet = new Student();
		mehmet.setId(203);
		mehmet.setFirstName("Mehmet");
		mehmet.setLastName("Cömertpay");
		mehmet.setUserName("mehmetcomertpay");
		mehmet.setTotalWatchedCourseHour(10);
		mehmet.setChooseInstructorId(2);
		mehmet.setStudentNumber("30");
	  
		Instructor[] instructors = {engin , cansel , nihal};
	    Student[] students = {yucel , leyla , mehmet};
	    
	    
	    UserManager userManager = new UserManager();
	   
	    InstructorManager instructorManager = new InstructorManager();
	   
	    StudentManager studentManager = new StudentManager();
	   
	    userManager.defineInstructorId(instructors);
	    instructorManager.instructorRegistration(instructors);
	   
	    userManager.defineStudentId(students);
	    studentManager.studentRegistration(students);
	    studentManager.chooseInstructor(students, instructors);
	    studentManager.courseSituation(students);
	   
	    
	    
	   
	  
	}
}
