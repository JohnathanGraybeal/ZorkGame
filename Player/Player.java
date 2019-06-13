/*
 * ---------------------------------------------------------------------------
 * File name: Player.java
 * Project name: ZorkGame
 * ---------------------------------------------------------------------------
 * Creator's name and email: Johnathan Graybeal, graybealjw@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: 4/10/2019
 * ---------------------------------------------------------------------------
 */

package Player;

import javax.swing.*;

public abstract class Player implements PlayerInterface
{

	private String playerName;//stores the players chosen name for their character

	private int startingHealth = 30;//starting health for every character
	private int startingAttackPower = 10;//starting attack power for every character
	private int startingSpeed = 10;//starting speed for every character
	private PlayerRace race;//enumeration for each race that the player can choose to be
	private int strengthScore = 10;//holds the value for the characters strength it is increased or decreased when the character is made through a point buy system
	private int dexterityScore = 10;//holds the value for the characters dexterity score it is increased or decreased when the character is made through the point buy system
	private int constitutionScore = 10;//holds the constitution score for the character it is increased or decreased when the character is made through a point buy system
	private int intelligenceScore = 10;//holds the intelligence score for the character it is increased or decreased when the character is made through a point buy system
	private int wisdomScore = 10;//holds the wisdom score for the character it is increased or decreased when the character is made through a point buy system
	private int charismaScore = 10;//holds the charisma score for the character it is increased or decreased when the character is made through the point buy system


	public Player()
	{

		setPlayerName("Player");
		setStrengthScore(strengthScore);
		setRace("HUMAN");
		setDexterityScore(dexterityScore);
		setConstitutionScore(constitutionScore);
		setIntelligenceScore(intelligenceScore);
		setWisdomScore(wisdomScore);
		setCharismaScore(charismaScore);
		setStartingAttackPower();
		setStartingSpeed();
		setStartingHealth();

	}


	public void setPlayerName (String playerName)
	{
		this.playerName = playerName;
	}

	public String getPlayerName ( )
	{
		return playerName;
	}

	/**
	 * sets the strength  score
	 * @param strengthScore user input for their score
	 */
	public void setStrengthScore(int strengthScore)
	{
		this.strengthScore = strengthScore;
	}//end setStrengthScore

	/**
	 * gets the strength score
	 * @return strength score
	 */
	public int getStrengthScore()
	{
		return strengthScore;
	}//end getStrengthScore

	/**
	 * sets the dexterity
	 * @param dexterityScore user input for their dexterity score
	 */
	public void setDexterityScore( int dexterityScore)
	{
		this.dexterityScore = dexterityScore;
	}//end setDexterityScore

	/**
	 * gets the dexterity score
	 * @return dexterityScore
	 */
	public int getDexterityScore()
	{
		return dexterityScore;
	}

	/**
	 * sets the constitution score
	 * @param constitutionScore user input for constitution score
	 */
	public void setConstitutionScore(int constitutionScore)
	{
		this.constitutionScore = constitutionScore;
	}

	/**
	 * gets the constitution score
	 * @return constitution score
	 */
	public int getConstitutionScore()
	{
		return constitutionScore;
	}

	/**
	 * sets the intelligence score
	 * @param intelligenceScore user input for intelligence score
	 */
	public void setIntelligenceScore(int intelligenceScore)
	{
		this.intelligenceScore = intelligenceScore;
	}

	/**
	 * gets the intelligence score
	 * @return intelligence score
	 */
	public int getIntelligenceScore()
	{
		return intelligenceScore;
	}

	/**
	 * sets the wisdom score
	 * @param wisdomScore user input for wisdom score
	 */
	public void setWisdomScore(int wisdomScore)
	{
		this.wisdomScore = wisdomScore;
	}//end setWisdomScore

	/**
	 * gets the wisdom score
	 * @return wisdom score
	 */
	public int getWisdomScore()
	{
		return wisdomScore;
	}//end getWisdomScore

	/**
	 * gets the charisma score
	 * @param charismaScore user input for charisma score
	 */
	public void setCharismaScore(int charismaScore)
	{
		this.charismaScore = charismaScore;
	}//end charisma score

	public int getCharismaScore()
	{
		return charismaScore;
	}//end getCharismaScore

	/**
	 * sets the players attack power depending on their strength score. it starts at 10 and increments or decrements
	 * by 1 for ever 2 points above or below 10 the ability score is
	 */
	public void setStartingAttackPower ()
	{
		switch (strengthScore)
		{
			case 1:
				startingAttackPower -=5;
				break;
			case 2:
				startingAttackPower -=4;
				break;
			case 3:
				startingAttackPower -=4;
				break;
			case 4:
				startingAttackPower -=3;
				break;
			case 5:
				startingAttackPower -=3;
				break;
			case 6:
				startingAttackPower -=2;
				break;
			case 7:
				startingAttackPower -=2;
				break;
			case 8:
				startingAttackPower -=1;
				break;
			case 9:
				startingAttackPower -=1;
				break;
			case 10:
				startingAttackPower  +=0;
				break;
			case 11:
				startingAttackPower +=0;
				break;
			case 12:
				startingAttackPower +=1;
				break;
			case 13:
				startingAttackPower +=1;
				break;
			case 14:
				startingAttackPower +=2;
				break;
			case 15:
				startingAttackPower +=2;
				break;
			case 16:
				startingAttackPower +=3;
				break;
			case 17:
				startingAttackPower +=3;
			case 18:
				startingAttackPower +=4;
				break;
			case 19:
				startingAttackPower +=4;
				break;
			case 20:
				startingAttackPower +=5;
				break;
			default:
				startingAttackPower = 10;
				break;

		}//end switch(strengthScore)





	}//end setStartingAttackPower


	public int getStartingAttackPower()
	{
		return startingAttackPower;
	}

	/**
	 * health depends on the constitution modifier and what class and race the player picks so it is to be set later
	 */
	 public abstract void setStartingHealth();

	 public int getStartingHealth()
	 {
	 	return startingHealth;
	 }

	/**
	 * sets the starting speed for the player
	 */
	public void setStartingSpeed()
	 {
	 	switch (dexterityScore)
	    {
		    case 1:
		    	startingSpeed -=5;

		    	break;
		    case 2:
		    	startingSpeed -=4;

		    	break;
		    case 3:
		    	startingSpeed -=4;

		    	break;
		    case 4:
		    	startingSpeed -=3;

		    	break;
		    case 5:
		    	startingSpeed -=3;

		    	break;
		    case 6:
		    	startingSpeed -=2;

		    	break;
		    case 7:
		    	startingSpeed -=2;

		    	break;
		    case 8:
		    	startingSpeed -=1;

		    	break;
		    case 9:
		    	startingSpeed -=1;

		    	break;
		    case 10:
		    	startingSpeed +=0;

		    	break;
		    case 11:
		    	startingSpeed +=0;

		    	break;
		    case 12:
		    	startingSpeed +=1;

		    	break;
		    case 13:
		    	startingSpeed +=1;

		    	break;
		    case 14:
		    	startingSpeed +=2;

		    	break;
		    case 15:
		    	startingSpeed +=2;

		    	break;
		    case 16:
		    	startingSpeed +=3;

		    	break;
		    case 17:
		    	startingSpeed +=3;

		    	break;
		    case 18:
		    	startingSpeed +=4;

		    	break;
		    case 19:
		    	startingSpeed +=4;

		    	break;
		    case 20:
		    	startingSpeed +=5;

		    	break;
		    default:
		    	startingSpeed = 10;

		    	break;


	    }//end switch(dexterityScore
	 }//end setStartingSpeed

	/**
	 * gets the starting speed
	 * @return startingSpeed
	 */
	public int getStartingSpeed ( )
	{
		return startingSpeed;
	}//end getStartingSpeed

	public void setRace(String playerRace)
	{
		switch (playerRace)
		{
			case "GOLIATH":
				race = PlayerRace.GOLIATH;
				break;
			case "DWARF":
				race = PlayerRace.DWARF;
			case "ELF":
				race = PlayerRace.ELF;
			default:
				race = PlayerRace.HUMAN;


		}//end switch(playerRace)
	}//end setRace(String playerRace)

	public PlayerRace getRace()
	{
		return race;
	}



	/**
	 * Override
	 * @return formatted version of relevant info from the Player class
	 */
	public void stats()
	{
		 JOptionPane.showMessageDialog(null,"Player Race:" + this.race + "\n Attack Power:" + this.startingAttackPower
		 + "\n Speed:" + this.startingSpeed + "\n Strength:" + this.strengthScore + "\n Dexterity:" + this.dexterityScore + "\n Constitution:" + this.constitutionScore +
				"\n Intelligence:" + this.intelligenceScore + "\n Wisdom:" + this.wisdomScore + "\n Charisma:" + this.charismaScore,"Stats",JOptionPane.INFORMATION_MESSAGE);
	}//end stats



	// TODO: implement the Player class
}
