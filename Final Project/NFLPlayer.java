package demo;

public class NFLPlayer {

	private String name = "name";
	private String college = "college";
	private String position = "position";
	private int age = 23;
	private int number = 00;
	private int weight = 200;
	private int passingTouchdowns;
	private int interceptionsThrown;
	private int passAttempts;
	private int passCompletions;
	private int passingYards;
	private int rushingYards;
	private int rushingAttempts;
	private float yardsPerCarry = 0;
	private int rushingTouchdowns;
	private int fumbles;
	private int receivingYards;
	private int receptions;
	private double yardsPerCatch;
	private int receivingTouchdowns;
	private int tackles;
	private int sacks;
	private int interceptions;
	private int fieldgoalAttempts;
	private int fieldgoalsMade;
	private int punts;
	private int puntYards;
	private double puntAverage = 0;
	private float completionPercent = 0;
	private float fieldgoalPercent = 0;
	
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
	
	public void setPassingTouchdowns(int passingTouchdowns) {
		this.passingTouchdowns = passingTouchdowns;
	}
	
	public int getPassingTouchdowns() {
		return this.passingTouchdowns;
	}
	
	public void setInterceptionsThrown(int interceptionsThrown) {
		this.interceptionsThrown = interceptionsThrown;
	}
	
	public int getInterceptionsThrown() {
		return this.interceptionsThrown;
	}
	
	public void setPassAttempts(int passAttempts) {
		this.passAttempts = passAttempts;
	}
	
	public int getPassAttempts() {
		return this.passAttempts;
	}
	
	public void setPassCompletions(int passCompletions) {
		this.passCompletions = passCompletions;
	}
	
	public int getPassCompletions() {
		return this.passCompletions;
	}
	
	public void setCompletionPercent(float completionPercent) {
		this.completionPercent = (passCompletions * 100 / passAttempts);
	}
	
	public float getCompletionPercent() {
		return completionPercent;
	}
	
	public void setRushingYards(int rushingYards) {
		this.rushingYards = rushingYards;
	}
	
	public int getRushingYards() {
		return this.rushingYards;
	}
	
	public void setRushingAttempts(int rushingAttempts) {
		this.rushingAttempts = rushingAttempts;
	}
	
	public int getRushingAttempts() {
		return rushingAttempts;
	}
	
	public void setYardsPerCarry(float yardsPerCarry) {
		this.yardsPerCarry = yardsPerCarry;
	}
	
	public float getYardsPerCarry() {
		return yardsPerCarry;
	}
	
	public void setPassingYards(int passingYards) {
		this.passingYards = passingYards;
	}
	
	public int getPassingYards() {
		return this.passingYards;
	}
	
	public void setRushingTouchdowns(int rushingTouchdowns) {
		this.rushingTouchdowns = rushingTouchdowns;
	}
	
	public int getRushingTouchdowns() {
		return this.rushingTouchdowns;
	}
	
	public void setFumbles(int fumbles) {
		this.fumbles = fumbles;
	}
	
	public int getFumbles() {
		return this.fumbles;
	}
	
	public void setReceivingYards(int receivingYards) {
		this.receivingYards = receivingYards;
	}
	
	public int getReceivingYards() {
		return this.receivingYards;
	}
	
	public void setReceptions(int receptions) {
		this.receptions = receptions;
	}
	
	public int getReceptions() {
		return this.receptions;
	}
	
	public void setYardsPerCatch(double yardsPerCatch) {
		this.yardsPerCatch = yardsPerCatch;
	}
	
	public double getYardsPerCatch () {
		return yardsPerCatch;
	}
	
	public void setReceivingTouchdowns(int receivingTouchdowns) {
		this.receivingTouchdowns = receivingTouchdowns;
	}
	
	public int getReceivingTouchdowns() {
		return this.receivingTouchdowns;
	}
	
	public void setTackles(int tackles) {
		this.tackles = tackles;
	}
	
	public int getTackles() {
		return this.tackles;
	}
	
	public void setSacks(int sacks) {
		this.sacks = sacks;
	}
	
	public int getSacks() {
		return this.sacks;
	}
	
	public void setInterceptions(int interceptions) {
		this.interceptions = interceptions;
	}
	
	public int getInterceptions() {
		return this.interceptions;
	}
	
	public void setFieldgoalAttempts(int fieldgoalsAttempted) {
		this.fieldgoalAttempts = fieldgoalsAttempted;
	}
	
	public int getFieldgoalAttempts() {
		return this.fieldgoalAttempts;
	}
	
	public void setFieldgoalsMade(int fieldgoalsMade) {
		this.fieldgoalsMade = fieldgoalsMade;
	}
	
	public int getFieldgoalsMade() {
		return this.fieldgoalsMade;
	}
	
	public void setFieldgoalPercent(float fieldgoalPercent) {
		this.fieldgoalPercent = fieldgoalsMade * 100 / fieldgoalAttempts;
	}
	
	public float getFieldgoalPercent() {
		return fieldgoalPercent;
	}
	
	public void setPunts(int punts) {
		this.punts = punts;
	}
	
	public int getPunts() {
		return this.punts;
	}
	
	public void setPuntYards(int puntYards) {
		this.puntYards = puntYards;
	}
	
	public int getPuntYards() {
		return this.puntYards;
	}
	
	public void setPuntAverage(double puntAverage) {
		this.puntAverage = puntYards / punts;
	}
	
	public double getPuntAverage() {
		return puntAverage;
	}
	
}
