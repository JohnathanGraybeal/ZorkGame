/*
 * ---------------------------------------------------------------------------
 * File name: Beholder.java
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

public class Beholder extends Enemy

{
	private String name;
	private int intelligence;
	private int attackPower;
	private int primaryAttackDamage;
	private int secondaryAttackDamage;
	public Beholder()
	{
		super();
		setName();
		setIntelligence();
		setAttackPower();

	}

	/**
	 * sets the name
	 */
	public void setName()
	{

		name = "Beholder";
	}//end setName

	/**
	 * gets the name
	 * @return name
	 */
	public String getName()
	{
		return name;
	}//end get Name

	/**
	 * sets the intelligence
	 */
	@Override
	public void setIntelligence()
	{
		intelligence = 25;

	}//end setIntelligence

	/**
	 * gets the intelligence
	 * @return intelligence
	 */
	@Override
	public int getIntelligence()
	{
		return intelligence;
	}//end getIntelligence

	/**
	 * sets the attack power
	 */
	@Override
	public void setAttackPower ( )
	{
		attackPower = 17;
	}//end setAttackPower

	/**
	 * gets the attack power
	 * @return attackPower
	 */
	@Override
	public int getAttackPower()
	{
		return attackPower;
	}//end getAttackPower


	/**
	 * shows the enemies stats
	 */
	public void stats()
	{
		JOptionPane
				.showMessageDialog(null,"Name: " +this.name  +  "\nHealth:" + super.getHealth() + "\n Attack Power:" + getAttackPower()
						+ "\n Speed:" + super.getSpeed() + "\n Strength:" + super.getStrength() + "\n Dexterity:" + super.getDexterity() + "\n Constitution:" + super.getConstitution() +
						"\n Intelligence:" + getIntelligence() + "\n Wisdom:" + super.getWisdom() + "\n Charisma:" + super.getCharisma()," Enemy Stats",JOptionPane.INFORMATION_MESSAGE);
	}

	// TODO: implement the Beholder class
}
