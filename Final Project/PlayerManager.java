package demo;

import java.util.Scanner;

public class PlayerManager {
	
	PlayerManager() {
		//used for testing purposes.
		System.out.println("Pos\tName\t\t#\tAtt\tComp\tPerc\tTDs\tInt\tYds");
		System.out.println("-------------------------------------------------"
				+ "---------------------------");
		NFLPlayer[] undraftedPlayers = createPlayer(102);
		
	}
	
	// method that creates x amount of players based on user input when called
	public static NFLPlayer[] createPlayer(int createPlayer) {
		NFLPlayer[] myPlayers = new NFLPlayer[102];
		for (int i = 0; i < myPlayers.length; i++) {
			myPlayers[i] = new NFLPlayer();
			myPlayers[i] .setNumber(i+1);
			myPlayers[i] .setName("First Last");
			
			//Assigns players in index 0-5 to the QB position.		
			if (i < 6) {
				//int assigned to generate random pass attempts
				int randomNumber1 = 100 + (int)(Math.random()*150);
				//int assigned to generate random completions
				int randomNumber2 = 100 + (int)(Math.random()*100);
				
				//Makes sure attempts is always more that completions
				if (randomNumber1 < randomNumber2) {
				    int temp = randomNumber1;
				    randomNumber1 = randomNumber2;
				    randomNumber2 = temp;
				}
				//used to compute completion percentage
				float compPerc = (randomNumber2 * 100 / randomNumber1);
				//generates random passing touchdown stat.
				int passingTouchdowns = 5 + (int)(Math.random() * 20);
				//generates random passing interception stat.
				int interceptions = 0 + (int)(Math.random() * 10);
				//generates random passing yards stat.
				int passYards = 1000 + (int)(Math.random() * 5000);
	
				myPlayers[i].setPosition("QB");
				myPlayers[i].setInterceptionsThrown(interceptions);
				myPlayers[i].setPassAttempts((int)randomNumber1);
				myPlayers[i].setPassCompletions((int)randomNumber2 - interceptions);
				myPlayers[i].setCompletionPercent(compPerc);
				myPlayers[i].setPassingTouchdowns(passingTouchdowns);
				myPlayers[i].setPassingYards(passYards);
				
			//Assigns players in index 5-11 to the RB position
			}else if (i < 12) {
				myPlayers[i].setPosition("RB");
				myPlayers[i].setPosition("RB"); 
				//generates random rushing yards stat. 
				int rushingYards = 700 + (int)(Math.random() * 1000); 
				//int assigned to generate random rushing attempts 
				int rushAttempts = 100 + (int)(Math.random() * 100); 
				//used to compute yards per carry 
				float yardsPerCarry= (rushingYards / rushAttempts); 
				//generates random rushing touchdown stat. 
				int rushTD = 5 + (int)(Math.random() * 20);
				//generates random fumbles
				int fumbles = (int)(Math.random() * 10);   
				
				myPlayers[i].setRushingAttempts(rushAttempts); 
				myPlayers[i].setRushingYards(rushingYards); 
				myPlayers[i].setYardsPerCarry(yardsPerCarry); 
				myPlayers[i].setRushingTouchdowns(rushTD); 
				myPlayers[i].setFumbles(fumbles);  
				//Set weight between 180 - 279.
				myPlayers[i].setWeight(180 + (int)(Math.random() * 100));
				
			//Assigns players in index 12-17 to the FB position 
			}else if (i < 18) { 
				myPlayers[i].setPosition("FB"); 
				//generates random rushing yards stat. 
				int rushingYards = 200 + (int)(Math.random() * 1000); 					
				//int assigned to generate random rushing attempts 
				int rushAttempts = 50 + (int)(Math.random() * 100); 
				//used to compute yards per carry 
				float yardsPerCarry= (rushingYards / rushAttempts); 
				//generates random rushing touchdown stat. 
				int rushTD = (int)(Math.random() * 20);
				//generates random fumbles
				int fumbles = (int)(Math.random() * 10);   

				myPlayers[i].setRushingAttempts(rushAttempts); 
				myPlayers[i].setRushingYards(rushingYards); 
				myPlayers[i].setYardsPerCarry(yardsPerCarry); 
				myPlayers[i].setRushingTouchdowns(rushTD); 
				myPlayers[i].setFumbles(fumbles);  
				//Set weight between 180 - 259.
				myPlayers[i].setWeight(225 + (int)(Math.random() * 100));
					
			//Assigns players in index 18-23 to the WR position 
			}else if (i < 24) { 

				myPlayers[i].setPosition("WR"); 
				//generates random receiving yards stat. 
				int receivingYards = 700 + (int)(Math.random() * 1000); 
				//int assigned to generate random rushing attempts 
				int receptions = 60 + (int)(Math.random() * 100); 
				//used to compute yards per catch 
				float yardsPerCatch= (receivingYards / receptions); 
				//generates random receiving touchdown stat. 
				int receivingTD = (int)(Math.random() * 20);

				//generates random fumbles
				int fumbles = (int)(Math.random() * 3);   
	 
				myPlayers[i].setReceptions(receptions); 
				myPlayers[i].setReceivingYards(receivingYards); 
				myPlayers[i].setYardsPerCatch(yardsPerCatch); 
				myPlayers[i].setReceivingTouchdowns(receivingTD); 
				myPlayers[i].setFumbles(fumbles);  

				//Set weight between 160 - 224.

				myPlayers[i].setWeight(160 + (int)(Math.random() * 65));

			//Assigns players in index 24-29 to the TE position 
			}else if (i < 30) { 

				myPlayers[i].setPosition("TE"); 
				//generates random receiving yards stat. 
				int receivingYards = 300 + (int)(Math.random() * 700); 
				//int assigned to generate random rushing attempts 
				int receptions = 20 + (int)(Math.random() * 80); 
				//used to compute yards per catch 
				float yardsPerCatch= (receivingYards / receptions); 
				//generates random receiving touchdown stat. 
				int receivingTD = (int)(Math.random() * 20);
				//generates random fumbles
				int fumbles = (int)(Math.random() * 3);   

				myPlayers[i].setReceptions(receptions); 
				myPlayers[i].setReceivingYards(receivingYards); 
				myPlayers[i].setYardsPerCatch(yardsPerCatch); 
				myPlayers[i].setReceivingTouchdowns(receivingTD); 
				myPlayers[i].setFumbles(fumbles);  
				//Set weight between 180 - 279.
				myPlayers[i].setWeight(180 + (int)(Math.random() * 100));
					
			//Assigns players in index 30-35 to the T position 
			}else if (i < 36) { 

				myPlayers[i].setPosition("T"); 		
				//Sets weight between 280 - 379
				myPlayers[i].setWeight(280 + (int)(Math.random() * 100));

			//Assigns players in index 36-41 to the G position 
			}else if (i < 42) { 

				myPlayers[i].setPosition("G"); 
				//Sets weight between 280 - 379
				myPlayers[i].setWeight(280 + (int)(Math.random() * 100));

			//Assigns players in index 42-47 to the C position 
			}else if (i < 48) { 

				myPlayers[i].setPosition("C"); 
				//Sets weight between 280 - 379
				myPlayers[i].setWeight(280 + (int)(Math.random() * 100));

			//Assigns players in index 48-53 to the DE position 
			}else if (i < 54) { 

				myPlayers[i].setPosition("DE"); 
				myPlayers[i].setTackles(20 + (int)(Math.random() * 80));				
				myPlayers[i].setSacks(1 + (int)(Math.random() * 20));
				//Sets weight between 225 - 324
				myPlayers[i].setWeight(225 + (int)(Math.random() * 100));

			//Assigns players in index 54-59 to the DT position 
			}else if (i < 60) { 

				myPlayers[i].setPosition("DT"); 
				myPlayers[i].setTackles(20 + (int)(Math.random() * 80));
				myPlayers[i].setSacks(1 + (int)(Math.random() * 20));
				//Sets weight between 225 - 324
				myPlayers[i].setWeight(225 + (int)(Math.random() * 100));

			//Assigns players in index 60-65 to the OLB position 
			}else if (i < 66) { 

				myPlayers[i].setPosition("OLB"); 
				myPlayers[i].setInterceptions((int)(Math.random() * 5));
				myPlayers[i].setTackles(20 + (int)(Math.random() * 100));
				myPlayers[i].setSacks(1 + (int)(Math.random() * 10));
				//Sets weight between 225 - 374
				myPlayers[i].setWeight(225 + (int)(Math.random() * 50));

			//Assigns players in index 66-71 to the MLB position 
			}else if (i < 72) { 

				myPlayers[i].setPosition("MLB"); 
				myPlayers[i].setInterceptions((int)(Math.random() * 5));
				myPlayers[i].setTackles(20 + (int)(Math.random() * 100));
				myPlayers[i].setSacks(1 + (int)(Math.random() * 10));
				//Sets weight between 225 - 274
				myPlayers[i].setWeight(225 + (int)(Math.random() * 50));

			//Assigns players in index 72-77 to the CB position 
			}else if (i < 78) { 

				myPlayers[i].setPosition("CB"); 
				myPlayers[i].setInterceptions((int)(Math.random() * 10));
				myPlayers[i].setTackles(20 + (int)(Math.random() * 80));
				myPlayers[i].setSacks((int)(Math.random() * 5));
				//Sets weight between 160 - 224
				myPlayers[i].setWeight(160 + (int)(Math.random() * 65));

			//Assigns players in index 78-83 to the FS position 
			}else if (i < 84) { 

				myPlayers[i].setPosition("FS"); 
				myPlayers[i].setInterceptions((int)(Math.random() * 10));
				myPlayers[i].setTackles(20 + (int)(Math.random() * 80));				
				myPlayers[i].setSacks((int)(Math.random() * 5));
				//Sets weight between 180 - 249
				myPlayers[i].setWeight(180 + (int)(Math.random() * 70));

			//Assigns players in index 84-89 to the SS position 
			}else if (i < 90) { 

				myPlayers[i].setPosition("SS"); 
				myPlayers[i].setInterceptions((int)(Math.random() * 10));
				myPlayers[i].setTackles(20 + (int)(Math.random() * 80));
				myPlayers[i].setSacks((int)(Math.random() * 5));
				//Sets weight between 180 - 249
				myPlayers[i].setWeight(180 + (int)(Math.random() * 70));

			//Assigns players in index 90-95 to the K position 
			}else if (i < 96) { 

				myPlayers[i].setPosition("K"); 
				int fieldgoalAttempts = (10 + (int)(Math.random() * 30));
				int fieldgoalsMade = fieldgoalAttempts - (int)(Math.random() * 10);
				float fieldgoalPercent = (fieldgoalsMade * 100f) / (float)fieldgoalAttempts;
				myPlayers[i].setFieldgoalAttempts(fieldgoalAttempts);		
				myPlayers[i].setFieldgoalsMade(fieldgoalsMade);
				myPlayers[i].setFieldgoalPercent(fieldgoalPercent);
				//Sets weight between 150-249
				myPlayers[i].setWeight(150 + (int)(Math.random() * 100));
				//Assigns players in index 96+ to the P position 
			}else 

				myPlayers[i].setPosition("P"); 
				int punts = (10 + (int)(Math.random() * 50));
				int puntYards = punts * (35 + (int)(Math.random() * 20));
				double puntAverage = (double)puntYards / (double)punts;
				myPlayers[i].setPunts(punts);
				myPlayers[i].setPuntYards(puntYards);
				myPlayers[i].setPuntAverage(puntAverage);
				//Sets weight between 150-249
				myPlayers[i].setWeight(150 + (int)(Math.random() * 100));
				
				StringBuilder sb = new StringBuilder();
				sb.append(myPlayers[i].getPosition());
				sb.append(myPlayers[i].getName());
				sb.append(myPlayers[i].getNumber());
				sb.append(myPlayers[i].getPassAttempts());
				sb.append(myPlayers[i].getPassCompletions());
				sb.append(myPlayers[i].getCompletionPercent());
				sb.append(myPlayers[i].getPassingTouchdowns());
				sb.append(myPlayers[i].getInterceptionsThrown());
				sb.append(myPlayers[i].getPassingYards());

			//Used to for testing purposes.
			System.out.println(myPlayers[i].getPosition() + "\t" + myPlayers[i].getName() 
					+ "\t" + myPlayers[i].getNumber() + "\t" + myPlayers[i].getPassAttempts()
					+ "\t" + myPlayers[i].getPassCompletions() + "\t" 
					+ myPlayers[i].getCompletionPercent() + "%" + "\t" 
					+ myPlayers[i].getPassingTouchdowns() + "\t" 
					+ myPlayers[i].getInterceptionsThrown() + "\t" 
					+ myPlayers[i].getPassingYards());
	
		}
		
		return myPlayers;
	}
		
}
	

