package demo;

public class DefensivePlayer extends NFLPlayer {

	private int soloTackles;
	private int assistedTackles;
	private int totalTackles;
	private int sacks;
	private int interceptions;
	private int safeties;
	private int passDeflections;
	private int defensiveTDs;
	private int forcedFumbles;
	private int fumbleRecoveries;
	
	
	public DefensivePlayer(String name, String position, int age, int number, int weight,
			int soloTackles, int assistedTackles, int totalTackles, int sacks, int interceptions,
			int safeties, int passDeflections, int defensiveTDs, int forcedFumbles, 
			int fumbleRecoveries) {
		this.setName(name);
		this.setPosition(position);
		this.setAge(age);
		this.setNumber(number);
		this.setWeight(weight);
		this.setSoloTackles(soloTackles);
		this.setAssistedTackles(assistedTackles);
		this.setTotalTackles(totalTackles);
		this.setSacks(sacks);
		this.setInterceptions(interceptions);
		this.setSafeties(safeties);
		this.setPassDeflections(passDeflections);
		this.setDefensiveTDs(defensiveTDs);
		this.setForcedFumbles(forcedFumbles);
		this.setFumbleRecoveries(fumbleRecoveries);
		
	}
	
	public DefensivePlayer() {
		
	}
	
	public void setSoloTackles(int tackles) {
		this.soloTackles = tackles;
	}
	
	public int getSoloTackles() {
		return this.soloTackles;
	}
	
	public void setAssistedTackles(int assistedTackles) {
		this.assistedTackles = assistedTackles;
	}
	
	public int getAssistedTackles() {
		return this.assistedTackles;
	}
	
	public void setTotalTackles(int totalTackles) {
		this.totalTackles = totalTackles;
	}
	
	public int getTotalTackles() {
		return this.totalTackles;
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
	
	public void setSafeties(int safeties) {
		this.safeties = safeties;
	}
	
	public int getSafeties() {
		return this.safeties;
	}
	
	public void setPassDeflections(int passDeflections) {
		this.passDeflections = passDeflections;
	}
	
	public int getPassDeflections() {
		return this.passDeflections;
	}
	
	public void setDefensiveTDs(int defensiveTDs) {
		this.defensiveTDs = defensiveTDs;
	}
	
	public int getDefensiveTDs() {
		return this.defensiveTDs;
	}
	
	public void setForcedFumbles(int forcedFumbles) {
		this.forcedFumbles = forcedFumbles;
	}
	
	public int getForcedFumbles() {
		return this.forcedFumbles;
	}
	
	public void setFumbleRecoveries(int fumbleRecoveries) {
		this.fumbleRecoveries = fumbleRecoveries;
	}
	
	public int getFumbleRecoveries() {
		return this.fumbleRecoveries;
	}
	
	@Override
	public String celebrate() {
		int c = (int)(Math.random() * 5);
		if (c > 4){
			return " This defense just got a LOT better!";
		}
		return CELEBRATIONS[c];
	}
	
}