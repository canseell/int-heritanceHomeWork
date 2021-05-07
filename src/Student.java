
public class Student extends User{
  
	private String studentNumber;
	private String schoolName;
	private String graduateYear;
	private String graduateScore;
	private String courseName;
	private int totalWatchedCourseHour;
	private int percentage;
	private int chooseInstructorId;
	
	Instructor instructor = new Instructor();
	
    public Student() {
		
		
	}
	

	public int getChooseInstructorId() {
		return chooseInstructorId;
	}
	public void setChooseInstructorId(int chooseInstructorId) {
		this.chooseInstructorId = chooseInstructorId;
	}
	
	
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getGraduateYear() {
		return graduateYear;
	}
	public void setGraduateYear(String graduateYear) {
		this.graduateYear = graduateYear;
	}
	public String getGraduateScore() {
		return graduateScore;
	}
	public void setGraduateScore(String graduateScore) {
		this.graduateScore = graduateScore;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getTotalWatchedCourseHour() {
		return totalWatchedCourseHour;
	}
	public void setTotalWatchedCourseHour(int totalWatchedCourseHour) {
		this.totalWatchedCourseHour = totalWatchedCourseHour;
	}
	public int getPercentage() {
	    
		Student student = new Student();
		
		int  a = student.getTotalWatchedCourseHour();	   
		int  percentageValue = ((100*a)/(12));	
	
		return percentageValue;
	   

	}
	
	
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
}
