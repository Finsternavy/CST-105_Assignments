package demo;

abstract class NFLPlayer implements Celebrator {

	protected String name = "name";
	protected String position = "position";
	protected int age = 23;
	protected int number = 00;
	protected int weight = 200;
	boolean isDrafted = false;
	
	
	
	public NFLPlayer () {
		
	}
	
	public NFLPlayer (String position, String name, int age, int weight) {
	
	}	
	
	public NFLPlayer (String position, String name) {
		this.position = position;
		this.name = name;
	
	}
	
	public static final String[] CELEBRATIONS = {" Dang! Do I have to play for them?",
			" I can't believe I got drafted!", " Casually accepts his fate.", " Sobs uncontrollably.",
			" Raises hands to God in thanks!"};
	
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
	
	public void isDrafted(boolean isDrafted){
		this.isDrafted= true;
		System.out.println(this.getName() + celebrate());
		
	}
	
	public String celebrate() {
		String playerDrafted = "Yay!!!";
		return playerDrafted;
	}
	
}