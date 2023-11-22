package id.ac.undiksha.ais.people;
import java.time.LocalDate;
import java.time.Period;

public class Lecturer {
	private String name;
    private String employeeId;
    private String department;
    private int yearsOfExperience;
    private String birthDate;
    private boolean gender;
//    System.out.println(this.name)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public boolean isGender() {
		return gender;
	}
	
	public String getGender() {
		if(isGender()) {
			return "male";
		}
		else {
			return "female";
		}
		
	}
	
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	public void printall() {
		System.out.println("Name: " + this.name);
		System.out.println("Department: " + this.department);
		System.out.println("Employee ID: " + this.employeeId);
		System.out.print("Gender: ");
		if(isGender()) {
			System.out.println("Male");
		}
		else {
			System.out.println("Female");
		}
		System.out.println("Birthdate: " + this.birthDate);
        System.out.println("Age: " + calculateAge() + " years");
		System.out.println("Years of Experience: "+ this.yearsOfExperience);
		
	}
    
	private int calculateAge() {
        LocalDate currentDate = LocalDate.now();
        LocalDate birthdate = LocalDate.parse(this.birthDate);
        Period age = Period.between(birthdate, currentDate);
        return age.getYears();
    }
    
}
