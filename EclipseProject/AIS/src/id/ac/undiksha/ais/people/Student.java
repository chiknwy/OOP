package id.ac.undiksha.ais.people;

import id.ac.undiksha.ais.organizations.StudyProgram;
 

public class Student extends Human{

    private String studentId;
//    private String name;
//    private String birthDate;
//    private boolean gender; // 0 female, 1 male
//    private String address;
    private int smtr;

    public Student() {
    	this.studentId = "Please input your user ID";
    	this.smtr = 0;
    }
    
    
    
 
//    public Student(String studentId, int smtr) {
//		super();
//		this.studentId = studentId;
//		this.smtr = smtr;
//	}
    
    
	public Student(
			String name, 
			String birthDate, 
			boolean gender, 
			String address
			)
	{
		super(name, birthDate, gender, address);
		// TODO Auto-generated constructor stub
		
	}
	
	




	public Student(String name, 
			String birthDate, 
			boolean gender, 
			String address, 
			String studentId, 
			int smtr) 
	{
		super(name, birthDate, gender, address);
		this.studentId = studentId;
		this.smtr = smtr;
	}




	public String getStudentId() {
		return studentId;
	}



	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}



	public int getSmtr() {
		return smtr;
	}



	public void setSmtr(int smtr) {
		this.smtr = smtr;
	}
	
	


	@Override
	public void printall() {
	    super.printall();
	    System.out.println("Student ID: " + this.studentId);
	    System.out.println("Semester: " + this.smtr);
	}

	
	public StudyProgram prodi = new StudyProgram();
   
	
	
}
