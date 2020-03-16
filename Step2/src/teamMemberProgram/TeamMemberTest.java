package teamMemberProgram;

public class TeamMemberTest {

	public static void main(String[] args) {
		String nameMember, division;
		Integer employeeNo, option;
		Project teamMembers = new Project("Project Test 1", "Project Test 2", "Project Test 3");
		do {
			System.out.println("0: Quit");
			System.out.println("1: Add a team member");
			System.out.println("2: Find a team member");
			System.out.println("3: Remove a team member");
			System.out.println("4: Display all team members");
			
			option = Input.getInteger("Option: ");
			switch (option) {
			case 0:
				System.out.println("Quitting program");
				break;
			case 1:
				nameMember = Input.getString("Team member name: ");
				employeeNo = Input.getInteger("Team member employee number: ");
				division = Input.getString("Team member division: ");
				teamMembers.addTeamMember(new TeamMember(nameMember, employeeNo, division));
				break;
			case 2:
				nameMember = Input.getString("Team member name: ");
				teamMembers.findAndDisplay(nameMember.toLowerCase());
				break;
			case 3:
				nameMember = Input.getString("Team member name: ");
				teamMembers.removeTeamMember(teamMembers.findTeamMember(nameMember));
				break;
			case 4:
				teamMembers.displayTeamMembers();
				break;
			default:
				System.out.println("Invalid option");
			}
		} while (option != 0);
	}

}
