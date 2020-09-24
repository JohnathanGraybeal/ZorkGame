/*
 * ---------------------------------------------------------------------------
 * File name: Warrior.java
 * Project name: ZorkGame
 * ---------------------------------------------------------------------------
 * Creator's name and email: Johnathan Graybeal, graybealjw@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: 4/10/2019
 * ---------------------------------------------------------------------------
 */

package Player;

import javax.swing.*;

public class Warrior extends Player
{
	private int health;
	private String playerClass = "Warrior";
	public Warrior()
	{
		super();
		setStartingHealth();
	}


	@Override
	public void setStartingHealth ( )
	{
		health = super.getStartingHealth() + 20;

	}

	public void stats()
	{
		JOptionPane.showMessageDialog(null,"Player Race:" + super.getRace()   + "\nPlayer Class:" +  playerClass + "\nHealth:" + health +    "\n Attack Power:" + super.getStartingAttackPower()
				+ "\n Speed:" + super.getStartingSpeed() + "\n Strength:" + super.getStrengthScore() + "\n Dexterity:" + super.getDexterityScore() + "\n Constitution:" + super.getConstitutionScore()+
				"\n Intelligence:" + super.getIntelligenceScore() + "\n Wisdom:" + super.getWisdomScore() + "\n Charisma:" + super.getCharismaScore(),"Stats",JOptionPane.INFORMATION_MESSAGE);
	}//end stats



	// TODO: implement the Warrior class
}
