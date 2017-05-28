package demo;

import java.util.Random;

public class OffensivePlayer extends NFLPlayer{

	private int passingTouchdowns;
	private int interceptionsThrown;
	private int passAttempts;
	private int passCompletions;
	private double completionPercent = 0;
	private int passingYards;
	private int rushingYards;
	private int rushingAttempts;
	private double yardsPerCarry = 0;
	private int rushingTouchdowns;
	private int fumbles;
	private int receivingYards;
	private int receptions;
	private double yardsPerCatch;
	private int receivingTouchdowns;


	
	public OffensivePlayer(String name, String position, int age, int number, int weight, 
			int passingTouchdowns, int interceptionsThrown, int passAttempts, int passCompletions, 
			double completionPercent, int passingYards, int rushingYards, int rushingAttempts,
			double yardsPerCarry, int rushingTouchdowns, int fumbles, int receivingYards, int receptions,
			double yardsPerCatch, int receivingTouchdowns) {
		this.setName(name);
		this.setPosition(position);
		this.setAge(age);
		this.setNumber(number);
		this.setWeight(weight);
		this.setPassingTouchdowns(passingTouchdowns);
		this.setInterceptionsThrown(interceptionsThrown);
		this.setPassAttempts(passAttempts);
		this.setPassCompletions(passCompletions);
		this.setCompletionPercent(completionPercent);
		this.setPassingYards(passingYards);
		this.setRushingYards(rushingYards);
		this.setRushingAttempts(rushingAttempts);
		this.setYardsPerCarry(yardsPerCarry);
		this.setRushingTouchdowns(rushingTouchdowns);
		this.setFumbles(fumbles);
		this.setReceivingYards(receivingYards);
		this.setReceptions(receptions);
		this.setYardsPerCatch(yardsPerCatch);
		this.setReceivingTouchdowns(receivingTouchdowns);
		
	}
	
	public OffensivePlayer() {
		super();
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
	
	public void setCompletionPercent(double completionPercent) {
		this.completionPercent = completionPercent;
	}
	
	public double getCompletionPercent() {
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
	
	public void setYardsPerCarry(double yardsPerCarry) {
		this.yardsPerCarry = yardsPerCarry;
	}
	
	public double getYardsPerCarry() {
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
	

	@Override
	public String celebrate() {
		int c = (int)(Math.random() * 7);
		if (c > 4){
			return " This offense just got a LOT better!";
		}
		return CELEBRATIONS[c];
		
		
	}
	
}
