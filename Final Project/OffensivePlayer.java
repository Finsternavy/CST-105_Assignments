package demo;

public class OffensivePlayer extends NFLPlayer{

	private int passingTouchdowns;
	private int interceptionsThrown;
	private int passAttempts;
	private int passCompletions;
	private float completionPercent = 0;
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
	private int fieldgoalAttempts;
	private int fieldgoalsMade;
	private float fieldgoalPercent = 0;
	private int punts;
	private int puntYards;
	private double puntAverage = 0;
	
	public OffensivePlayer() {
		
	}
	
	public OffensivePlayer(String position, String name, int age, int weight) {
		
	}	
	
	public OffensivePlayer(String position, String name) {
		this.position = position;
		this.name = name;
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

	@Override
	public String celebrate() {
		int c = (int)(Math.random() * 7);
		if (c > 4){
			return " This offense just got a LOT better!";
		}
		return CELEBRATIONS[c];
		
		
	}
	
}
