package id.ac.undiksha.ais.people;
import java.time.LocalDate;
import java.time.Period;

public class Student {

    private String studentId;
    private String name;
    private String birthDate;
    private boolean gender; // 0 female, 1 male
    private String address;
    private int smtr;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
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

    public String getGender() {
        if (this.isGender()) {
            return "Male";
        } else {
            return "Female";
        }
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSmtr() {
        return smtr;
    }

    public void setSmtr(int smtr) {
        this.smtr = smtr;
    }

    public void printall() {
        System.out.println("Name: " + this.name);
        System.out.println("Student ID: " + this.studentId);
        System.out.println("Birthdate: " + this.birthDate);
        System.out.println("Gender: " + this.getGender());
        System.out.println("Age: " + calculateAge() + " years");
        System.out.println("Semester: " + this.smtr);
        System.out.println("Address: " + this.address);
    }

    private int calculateAge() {
        LocalDate currentDate = LocalDate.now();
        LocalDate birthdate = LocalDate.parse(this.birthDate);
        Period age = Period.between(birthdate, currentDate);
        return age.getYears();
    }
}