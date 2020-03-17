package teamMemberProgram;

import java.util.ArrayList;

public class Project {
	private String title;
	private String startDate;
	private String endDate;
	
	ArrayList<TeamMember> teamMembers = new ArrayList<>();
	
	public Project (String title, String startDate, String endDate) {
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public void addTeamMember (TeamMember teamMember) {
		this.teamMembers.add(teamMember);
	}
	
	public TeamMember findTeamMember (String s) {
		for (TeamMember teamMember: teamMembers) {
			if (teamMember.getName().equalsIgnoreCase(s)) 
				return teamMember;
		}
		return null;
	}
	
	public Boolean removeTeamMember (TeamMember teamMember) {
		if (this.teamMembers.remove(teamMember)) {
			return true;
		} else {
			return false;
		}
	}
	
	public void displayTeamMember(TeamMember teamMember) {
		System.out.println(teamMember.toString());
	}
	
	public void displayTeamMembers() {
		if (teamMembers.isEmpty()) {
			System.out.println("Team members list is empty");
		} else {
			for (TeamMember teamMember: teamMembers)
				System.out.println(teamMember.toString());
		}
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getStartDate() {
		return startDate;
	}
	
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	
	public String getEndDate() {
		return endDate;
	}
	
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	public ArrayList<TeamMember> getTeamMembers() {
		return teamMembers;
	}
	
	public void setTeamMembers (ArrayList<TeamMember> teamMembers) {
		this.teamMembers = teamMembers;
	}
	

}
