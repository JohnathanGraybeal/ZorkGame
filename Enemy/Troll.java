/*
 * ---------------------------------------------------------------------------
 * File name: Troll.java
 * Project name: ZorkGame
 * ---------------------------------------------------------------------------
 * Creator's name and email: Johnathan Graybeal, graybealjw@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: 4/10/2019
 * ---------------------------------------------------------------------------
 */

package Enemy;

import javax.swing.*;
import java.util.Random;

public class Troll extends Enemy
{
	private String name;
	private int strength;

	public Troll()
	{
		super();
		setName();
		setStrength();

	}

	/**
	 * sets the name
	 */
	public void setName()
	{
		name =  "Troll";
	}//end setName

	/**
	 * gets the name
	 * @return name
	 */
	public String getName()
	{
		return name;
	}	//end getName

	/**
	 * sets the strength
	 */
	@Override
	public void setStrength()
	{
		strength = 18;

	}//end setStrength

	/**
	 * gets the strength
	 * @return strength
	 */
	@Override
	public int getStrength()
	{
		return strength;
	}//end getStrength



	public void stats()
	{
		JOptionPane
				.showMessageDialog(null,"Name: " +this.name  +  "\nHealth:" + super.getHealth() + "\n Attack Power:" + super.getAttackPower()
						+ "\n Speed:" + super.getSpeed() + "\n Strength:" + getStrength() + "\n Dexterity:" + super.getDexterity() + "\n Constitution:" + super.getConstitution() +
						"\n Intelligence:" + super.getIntelligence() + "\n Wisdom:" + super.getWisdom() + "\n Charisma:" + super.getCharisma()," Enemy Stats",JOptionPane.INFORMATION_MESSAGE);
	}
	// TODO: implement the Troll class
}
