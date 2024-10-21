package oops;

public class Course {
	static int maxCapcity = 100;
	String courseName;
	int enrollments;
	
	String[] enrolledStudent = new String[maxCapcity];
	Course(String courseName) {
		this.courseName = courseName;
		this.enrollments = 0;
	}
   static void setMaxCapsity(int maxCapcity) {
	   Course.maxCapcity = maxCapcity;
   }
   void enrollStudent(String studentname) {
	   enrolledStudent[enrollments] = studentname;
	   enrollments++;
   }
   void unenrolledStudetn() {
	   System.out.print("Student remove");
	   enrollments--;
   }
}

