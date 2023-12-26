package id.ac.undiksha.ais.organizations;

public class StudyProgram implements Department {

    private String studyProgramId;
    private String studyProgramName;

    public String getStudyProgramId() {
        return studyProgramId;
    }

    public void setStudyProgramId(String studyProgramId) {
        this.studyProgramId = studyProgramId;
    }

    public String getStudyProgramName() {
        return studyProgramName;
    }

    public void setStudyProgramName(String studyProgramName) {
        this.studyProgramName = studyProgramName;
    }

	@Override
	public void setDepartmentName(String deparmentName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDeparmentID(String departmentID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getDepertmentID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDepartmentName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void SetFacultyCode(String facultyCode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getFacultyCode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void SetFacultyName(String facultyName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getFacultyName() {
		// TODO Auto-generated method stub
		return null;
	}
}
