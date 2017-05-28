package demo;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

public class PlayerManager {

    PlayerManager() {
    
    }

    // Create ArrayList for available players 
    public ArrayList < NFLPlayer > availablePlayers = new ArrayList < NFLPlayer > ();
    
    // Create ArrayList for Offensive players 
    public ArrayList < OffensivePlayer > offensivePlayers = new ArrayList < OffensivePlayer > ();
    
    // Create ArrayList for Defensive Players 
    public ArrayList < DefensivePlayer > defensivePlayers = new ArrayList < DefensivePlayer > (); 
    
    // Create ArrayList for my current roster 
    public ArrayList < Object > currentRoster = new ArrayList < Object > (); 
    
    String [] col = {"Name", "Position", "Age", "Number", "Weight", "Pass TDs", "INTs", "Pass Attempts", "Completions", "Comp %", "Pass Yards", "Rush Yards", 
    		"Rush Attempts", "YrdsPerCarry", "Rush TDs", "Fumbles", "Receiving Yards", "YrdsPerCatch", "Receiving TDs"};
    
    String [] col2 = {"Name", "Position", "Age", "Number", "Weight", "Solo Tkls", "Assist Tkls", "Total Tkls", "Sacks", "INT", "Safety", "Pass Deflect", 
    		"Def TDs", "Forced Fumbles", "Fumble Recoveries"};
    
    String [] col3 = {"Name", "Position", "Age", "Number", "Weight"};
    
    public DefaultTableModel tableModel1 = new DefaultTableModel (col, 0);
    public DefaultTableModel tableModel2 = new DefaultTableModel (col2, 0);
    public DefaultTableModel tableModel3 = new DefaultTableModel (col3, 0);
    public DefaultTableModel tableModel4 = new DefaultTableModel (col3, 0);
    	
    
    
    public DefaultTableModel getModel(){
    	return tableModel1;
    }
    
    public DefaultTableModel getModel2(){
    	return tableModel2;
    }
    
    public DefaultTableModel getModel3(){
    	return tableModel3;
    }
    
    public DefaultTableModel getModel4() {
    	return tableModel4;
    }
    
    public String[] getCol(){
    	return col;
    }


    public void createPlayers() {
        //create offensive Players for draft.
        OffensivePlayer offensivePlayer1 = new OffensivePlayer("Tom Brady", "QB", 39, 12, 225, 28, 2, 432, 291, 67.4, 3554, 0, 0, 0.0, 0, 0, 0, 0, 0.0, 0);
        OffensivePlayer offensivePlayer2 = new OffensivePlayer("Kurt Warner", "QB", 45, 13, 214, 41, 13, 499, 325, 65.1, 4353, 0, 0, 0.0, 0, 0, 0, 0, 0.0, 0);
        OffensivePlayer offensivePlayer3 = new OffensivePlayer("Aaron Rodgers", "QB", 33, 12, 225, 40, 7, 610, 401, 65.7, 4428, 0, 0, 0.0, 0, 0, 0, 0, 0.0, 0);
        OffensivePlayer offensivePlayer4 = new OffensivePlayer("Ezekial Elliot", "RB", 21, 21, 225, 0, 0, 0, 0, 0, 0, 1631, 322, 5.1, 15, 5, 363, 32, 11.3, 1);
        OffensivePlayer offensivePlayer5 = new OffensivePlayer("Devonta Freeman", "RB", 25, 24, 206, 0, 0, 0, 0, 0, 0, 1079, 227, 4.8, 11, 1, 462, 54, 8.6, 2);
        OffensivePlayer offensivePlayer6 = new OffensivePlayer("Julian Edelman", "WR", 31, 11, 200, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1106, 98, 11.3, 3);
        OffensivePlayer offensivePlayer7 = new OffensivePlayer("Julio Jones", "WR", 28, 11, 220, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1409, 83, 17.0, 6);
        OffensivePlayer offensivePlayer8 = new OffensivePlayer("Larry Fitzgerald", "WR", 33, 11, 218, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1023, 107, 9.6, 6);
        OffensivePlayer offensivePlayer9 = new OffensivePlayer("Jason Witten", "TE", 35, 82, 263, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 673, 69, 9.8, 3);
        OffensivePlayer offensivePlayer10 = new OffensivePlayer("Jimmy Graham", "TE", 30, 88, 265, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 923, 65, 14.2, 6);
        
        //add offensive players to offensivePlayers <>.
        offensivePlayers.add(offensivePlayer1);
        offensivePlayers.add(offensivePlayer2);
        offensivePlayers.add(offensivePlayer3);
        offensivePlayers.add(offensivePlayer4);
        offensivePlayers.add(offensivePlayer5);
        offensivePlayers.add(offensivePlayer6);
        offensivePlayers.add(offensivePlayer7);
        offensivePlayers.add(offensivePlayer8);
        offensivePlayers.add(offensivePlayer9);
        offensivePlayers.add(offensivePlayer10);
        
        
        for (int i = 0; i < offensivePlayers.size(); i++) {
        	String name = offensivePlayers.get(i).getName();
        	String position = offensivePlayers.get(i).getPosition();
        	int age = offensivePlayers.get(i).getAge();
        	int number = offensivePlayers.get(i).getNumber();
        	int weight = offensivePlayers.get(i).getWeight();
        	int passingTDs = offensivePlayers.get(i).getPassingTouchdowns();
        	int interceptionsThrown = offensivePlayers.get(i).getInterceptionsThrown();
        	int passingAttempts = offensivePlayers.get(i).getPassAttempts();
        	int passCompletions = offensivePlayers.get(i).getPassCompletions();
        	double completionPercent = offensivePlayers.get(i).getCompletionPercent();
        	int passingYards = offensivePlayers.get(i).getPassingYards();
        	int rushYards = offensivePlayers.get(i).getRushingYards();
        	int rushAttempts = offensivePlayers.get(i).getRushingAttempts();
        	double yardsPerCarry = offensivePlayers.get(i).getYardsPerCarry();
        	int rushTDs = offensivePlayers.get(i).getRushingTouchdowns();
        	int fumbles = offensivePlayers.get(i).getFumbles();
        	int receivingYards = offensivePlayers.get(i).getReceivingYards();
        	int receptions = offensivePlayers.get(i).getReceptions();
        	double yardsPerCatch = offensivePlayers.get(i).getYardsPerCatch();
        	int receivingTDs = offensivePlayers.get(i).getReceivingTouchdowns();

        	
        	Object [] data = {name, position, age, number, weight, passingTDs, interceptionsThrown, passingAttempts, passCompletions, completionPercent, 
        			passingYards, rushYards, rushAttempts, yardsPerCarry, rushTDs, fumbles, receivingYards, receptions, yardsPerCatch, receivingTDs};
        	Object [] data3 = {name, position, age, number, weight};
        	
        	tableModel1.addRow(data);
        	tableModel3.addRow(data3);
        	
        }
        
        //create defensive Players for draft.
        DefensivePlayer defensivePlayer1 = new DefensivePlayer("Trey Flowers", "DE", 23, 98, 265, 1, 22, 23, 7, 0, 0, 1, 0, 0, 0);
        DefensivePlayer defensivePlayer2 = new DefensivePlayer("DeForest Buckner", "DE", 23, 99, 300, 13, 30, 43, 6, 0, 0, 1, 0, 0, 0);
        DefensivePlayer defensivePlayer3 = new DefensivePlayer("Ndamukong Suh", "DT", 30, 93, 305, 40, 32, 72, 5, 0, 0, 6, 0, 0, 0);
        DefensivePlayer defensivePlayer4 = new DefensivePlayer("Khalil Mack", "DE", 26, 52, 250, 54, 19, 73, 11, 1, 0, 3, 1, 5, 3);
        DefensivePlayer defensivePlayer5 = new DefensivePlayer("Bobby Wagner", "LB", 26, 54, 245, 85, 82, 167, 4, 1, 0, 4, 0, 0, 1);
        DefensivePlayer defensivePlayer6 = new DefensivePlayer("Alec Ogletree", "LB", 25, 52, 245, 98, 38, 136, 0, 2, 0, 13, 0, 1, 1);
        DefensivePlayer defensivePlayer7 = new DefensivePlayer("Daryl Worley", "CB", 26, 26, 205, 57, 24, 88, 0, 1, 0, 9, 0, 0, 0);
        DefensivePlayer defensivePlayer8 = new DefensivePlayer("DeShawn Shead", "CB", 35, 27, 212, 1, 22, 23, 7, 0, 0, 14, 0, 1, 0);
        DefensivePlayer defensivePlayer9 = new DefensivePlayer("Landon COllins", "S", 23, 21, 225, 100, 25, 125, 4, 5, 0, 18, 1, 0, 1);
        DefensivePlayer defensivePlayer10 = new DefensivePlayer("Harrison Smith", "S", 28, 22, 214, 69, 22, 91, 2, 0, 0, 0, 0, 0, 1);
        
        
        //add defensive players to defensivePlayers <>.
        defensivePlayers.add(defensivePlayer1);
        defensivePlayers.add(defensivePlayer2);
        defensivePlayers.add(defensivePlayer3);
        defensivePlayers.add(defensivePlayer4);
        defensivePlayers.add(defensivePlayer5);
        defensivePlayers.add(defensivePlayer6);
        defensivePlayers.add(defensivePlayer7);
        defensivePlayers.add(defensivePlayer8);
        defensivePlayers.add(defensivePlayer9);
        defensivePlayers.add(defensivePlayer10);
        
        for (int i = 0; i < defensivePlayers.size(); i ++) {
        	String name = defensivePlayers.get(i).getName();
        	String position = defensivePlayers.get(i).getPosition();
        	int age = defensivePlayers.get(i).getAge();
        	int number = defensivePlayers.get(i).getNumber();
        	int weight = defensivePlayers.get(i).getWeight();
        	int soloTackles = defensivePlayers.get(i).getSoloTackles();
        	int assistedTackles = defensivePlayers.get(i).getAssistedTackles();
        	int totalTackles = defensivePlayers.get(i).getTotalTackles();
        	int sacks = defensivePlayers.get(i).getSacks();
        	int interceptions = defensivePlayers.get(i).getInterceptions();
        	int safety = defensivePlayers.get(i).getSafeties();
        	int passDeflects = defensivePlayers.get(i).getPassDeflections();
        	int defensiveTDs = defensivePlayers.get(i).getDefensiveTDs();
        	int forcedFumbles = defensivePlayers.get(i).getForcedFumbles();
        	int fumbleRecoveries = defensivePlayers.get(i).getFumbleRecoveries();
        
        	
        	Object [] data2 = {name, position, age, number, weight, soloTackles, assistedTackles, totalTackles, sacks, interceptions, safety, passDeflects, 
        			defensiveTDs, forcedFumbles, fumbleRecoveries};
        	Object [] data3 = {name, position, age, number, weight};
        	
        	tableModel2.addRow(data2);
        	tableModel3.addRow(data3);
        }
        	

            	

        
        
        }
        
    }
		
