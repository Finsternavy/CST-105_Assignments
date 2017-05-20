package demo;

abstract class NFLPlayer {

	protected String name = "name";
	protected String position = "position";
	protected int age = 23;
	protected int number = 00;
	protected int weight = 200;
	
	public NFLPlayer () {
		
	}
	
	public NFLPlayer (String position, String name, int age, int weight) {
	
	}	
	
	public NFLPlayer (String position, String name) {
		this.position = position;
		this.name = name;
	
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
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
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public String getPosition(){
		return this.position;
	}
	
}