package teamMemberProgram;

import java.util.ArrayList;

public class Project {
	private String title;
	private String startDate;
	private String endDate;
	
	ArrayList<TeamMember> teamMembers = new ArrayList<TeamMember>();
	
	public Project (String title, String startDate, String endDate) {
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public void addTeamMember (TeamMember teamMember) {
		this.teamMembers.add(teamMember);
		System.out.println(teamMember.getName() + " added");
	}
	
	public void findAndDisplay (String s) {
		TeamMember teamMember = findTeamMember(s);
		System.out.println(teamMember!=null?(teamMember.toString()):teamMember + " not found");
	}
	
	public TeamMember findTeamMember (String s) {
		for (TeamMember teamMember: teamMembers) {
			if (teamMember.getName().equalsIgnoreCase(s)) 
				return teamMember;
		}
		return null;
	}
	
	public boolean removeTeamMember (TeamMember teamMember) {
		if (this.teamMembers.remove(teamMember)) {
			System.out.println(teamMember.getName() + " remove");
			return true;
		} else {
			System.out.println(teamMember.getName() + " not found");
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

}
