package id.ac.undiksha.ais.people;

public class Lecturer extends Human {
    private String employeeId;
    private String department;
    private int yearsOfExperience;

    public Lecturer() {
        super();
        this.employeeId = "Please input your user ID";
        this.department = "Please input your department";
        this.yearsOfExperience = 0;
    }

    public Lecturer(
    		String name, 
    		String employeeId, 
    		String department, 
    		int yearsOfExperience, 
    		String birthDate, 
    		String address, 
    		boolean gender) 
    {
        super(name, birthDate, gender, address);
        this.employeeId = employeeId;
        this.department = department;
        this.yearsOfExperience = yearsOfExperience;
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

    @Override
    public void printall() {
        super.printall();
        System.out.println("Employee ID: " + this.employeeId);
        System.out.println("Department: " + this.department);
        System.out.println("Years of Experience: " + this.yearsOfExperience);
    }
}
