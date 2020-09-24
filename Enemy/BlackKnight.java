/*
 * ---------------------------------------------------------------------------
 * File name: BlackKnight.java
 * Project name: ZorkGame
 * ---------------------------------------------------------------------------
 * Creator's name and email: Johnathan Graybeal, graybealjw@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: 4/10/2019
 * ---------------------------------------------------------------------------
 */

package Enemy;

import javax.swing.*;


public class BlackKnight extends Enemy
{
	private String name;

	public BlackKnight()
	{
		super();
		setName();
	}

	/**
	 * sets the name
	 */
	public void setName()
	{
		name = "Black Knight";

	}//end setName

	/**
	 * gets the name
	 * @return name
	 */
	public String getName()
	{
		return name;
	}//end getName

	/**
	 * sets the primary attack damage
	 */


	/**
	 * shows the enemies stats
	 */

	public void stats()
	{
		JOptionPane
				.showMessageDialog(null,"Name: " +this.name  +  "\nHealth:" + super.getHealth() + "\n Attack Power:" + super.getAttackPower()
						+ "\n Speed:" + super.getSpeed() + "\n Strength:" + super.getStrength() + "\n Dexterity:" + super.getDexterity() + "\n Constitution:" + super.getConstitution() +
						"\n Intelligence:" + super.getIntelligence() + "\n Wisdom:" + super.getWisdom() + "\n Charisma:" + super.getCharisma()," Enemy Stats",JOptionPane.INFORMATION_MESSAGE);
	}


	// TODO: implement the BlackKnight class
}
