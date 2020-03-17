package teamMemberProgram;

public class TeamMemberTest {

	public static void main(String[] args) {
		String nameMember, division;
		Integer employeeNo, option;
		Project teamMembers = new Project("Project Test 1", "Project Test 2", "Project Test 3");
		boolean operate = true;
		do {
			while (true) {
				try {
					option = Input.getInteger("1) Add a team member\n" +
							"2) Find a team member\n" + "3) Remove a team member\n" +
							"4) Display all team members\n" + "9) Quit\n" + "Option: ");
								if (option != 1 && option != 2 && option != 3 && option != 4 && option != 9) {
									System.out.println("Please, enter a valid option from the menu");
								}
								break;
							} catch (Exception e) {
								System.out.println("Invalid value entered");
							}
				}
			switch (option) {
			case 1:
				nameMember = Input.getString("Team member name: ");
				if (teamMembers.findTeamMember(nameMember) == null) {
					employeeNo = Input.getInteger("Team member employee number: ");
					division = Input.getString("Team member division: ");
					teamMembers.addTeamMember(new TeamMember(nameMember, employeeNo, division));
					System.out.println("The team member " + nameMember + " has been added");
				} else {
					System.out.println("The team member " + nameMember + " already exists");
				}				
				break;
			case 2:
				nameMember = Input.getString("Team member name: ");
				TeamMember check = teamMembers.findTeamMember(nameMember);
				if (teamMembers.findTeamMember(nameMember) == null) {
					System.out.println("The team member " + nameMember + " could not be found");
				} else {
					System.out.println("The team member " + nameMember + " has been found");
					System.out.println(check);
				}
				break;
			case 3:
				nameMember = Input.getString("Team member name: ");
				if (teamMembers.removeTeamMember(teamMembers.findTeamMember(nameMember))) {
					System.out.println("The team member " + nameMember + " has been removed");
				} else {
					System.out.println("The team member " + nameMember + " could not be found");
				}
				break;
			case 4:
				teamMembers.displayTeamMembers();
				break;
			case 9:
				if (Input.getString("Are you sure? (Y/N): ").equalsIgnoreCase("Y")) {
					System.out.println("Confirmed. Quitting program.");
					operate = false;
				}
				break;
			}
		} while (operate);
	}

}
