package teamMemberProgram;

public class TeamMember {
	private String name;
	private Integer employeeNo;
	private String division;
	
	public String toString() {
		String projectDetails = new String();
		projectDetails += "Name" + "\t" + "\t" + "\t" + this.name + "\n"
				+ "Employee number" + "\t" + "\t" + this.employeeNo + "\n"
				+ "Division" + "\t" + "\t" + this.division;
		return projectDetails;
	}
	
	public TeamMember (String name, Integer employeeNo, String division) {
		this.name = name;
		this.employeeNo = employeeNo;
		this.division = division;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getEmployeeNo() {
		return employeeNo;
	}
	
	public void setEmployeeNo(Integer employeeNo) {
		this.employeeNo = employeeNo;
	}
	
	public String getDivision() {
		return division;
	}
	
	public void setDivision(String division) {
		this.division = division;
	}
}
