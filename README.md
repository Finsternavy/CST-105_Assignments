# CST-105_Assignments
Repository for submitting assignments for computer programming

Final project:  NFL Draft Manager

Proposed flow:
  Welcome screen: User click "Start Draft" button.
                  "Start Draft" button generates available players.
                  
  User prompted to search available players or view their draft board:
  Available Players screen allows user to select a position(QB, RB, WR, etc.)
    Clicking a position button will display all available players whos position = user selection and the player's stats are displayed.
    Clicking the players name will display the players profile with more information.
    Clicking a state heading will sort by that stat.
    Add button will be visible next to each player. Clicking this button will add the player to the users draft board.
      User is prompted to enter the players name.
      When player is added, celebration is displayed on screen.
    
 Draft board is empty at start. As user adds players, draft board is populated. Draft board size has a max value of 7 
    (7 rounds in a draft).
    User can remove players from the draft board by clicking a negative button [-].
    
 When draft board is full, message displays "Complete your draft: Y or N ". 
    If user enters "Y" draft is completed and message displayed "Congratulations! You have drafted QB name1, WR name2, MLB name3, etc.."
    If user enters "N", returns to screen. 
 
