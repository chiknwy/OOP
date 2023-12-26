package id.ac.undiksha.ais.people;

public abstract class Human {
	private String name;
    private String birthDate;
    private boolean gender;
    private String address;
    
    
    public Human() {
    	this.name = "Please input your name!";
    	this.birthDate =  "Please input your birthdate!";
    	this.gender = false;
    	this.address = "please input your addresses!";
    }
    
    
    
	public Human(String name, String birthDate, boolean gender, String address) {
		super();
		this.name = name;
		this.birthDate = birthDate;
		this.gender = gender;
		this.address = address;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getGender() {
		if(isGender()) {
			return "male";
		}
		else {
			return "female";
		}
		
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void printall() {
        System.out.println("Name: " + name);
        System.out.println("Birthdate: " + birthDate);
        System.out.println("Gender: " + getGender());
        System.out.println("Address: " + address);
    }
    
}
