package oops;

public class studToString {
	String name;
	String  age;
	String rollNumber;
	String house;
	
	public studToString(String name, String age , String rollNumber , String house) {
		this.name = name;
		this.age = age;
		this.rollNumber = rollNumber;
		this.house = house;
	}
	
	public String toString() {
		return "Student Details:{name:" + name + ", age:" + age +", Roll Number:" + rollNumber 
				+", house:" + house + "}";
	}
	
	public static void main(String[] args) {
		studToString stud = new studToString("Brijdev" , " 21" , "322089" ,"001");
		System.out.print(stud);
		
	}

}
