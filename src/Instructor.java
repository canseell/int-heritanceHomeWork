
public class Instructor extends User{
	
	private String professionalField;
	private String courseName;
	private String experienceYears;
	private int studentNumber;
	private String instructorSystemNumber;
	private int totalCourseHour;
	private int instructorNumber;
	
	
	public int getInstructorNumber() {
		return instructorNumber;
	}

	public void setInstructorNumber(int instructorNumber) {
		this.instructorNumber = instructorNumber;
	}

	public int getTotalCourseHour() {
		return totalCourseHour;
	}

	public void setTotalCourseHour(int totalCourseHour) {
		this.totalCourseHour = totalCourseHour;
	}

	User user= new User();
	
	public Instructor(){
		
	}
	
	public String getProfessionalField() {
		return professionalField;
	}
	
	public void setProfessionalField(String professionalField) {
		this.professionalField = professionalField;
	    System.out.println("Dear " + user.getFirstName() + " " + user.getLastName() + "'s professional field is Java programming language");	
	    }
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public String getExperienceYears() {
		return experienceYears;
	}
	
	public void setExperienceYears(String experienceYears) {
		this.experienceYears = experienceYears;
	}
	
	public int getStudentNumber() {
		return studentNumber;
	}
	
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	public String getInstructorSystemNumber() {
		return instructorSystemNumber;
	}
	
	public void setInstructorSystemNumber(String instructorSystemNumber) {
		this.instructorSystemNumber = instructorSystemNumber;
	}
	

}
