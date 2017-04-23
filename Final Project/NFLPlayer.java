package demo;

public class NFLPlayer {

	private String lastName;
	private String firstName;
	private String college;
	private String position;
	private String experience;
	private String team;
	private String highSchool;
	private int age;
	private int number;
	private int weight;
	
	public NFLPlayer () {
	}	
	
	public NFLPlayer (String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return this.lastName;
	}
	
	public void setFirstName(String firstName) {
		this.lastName = firstName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public void setCollege(String college) {
		this.college = college;
	}
	
	public String getCollege() {
		return this.college;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public String getPosition(){
		return this.position;
	}
	
	public void setExperience(String experience) {
		this.experience = experience;
	}
	
	public String getExperience() {
		return this.experience;
	}
	
	public void setTeam(String team) {
		this.team = team;
	}
	
	public String getTeam() {
		return this.team;
	}
	
	public void setHighSchool(String highSchool) {
		this.highSchool = highSchool;
	}
	
	public String getHighSchool() {
		return this.highSchool;
	}
	
}
