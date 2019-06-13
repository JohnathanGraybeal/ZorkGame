/*
 * ---------------------------------------------------------------------------
 * File name: Lich.java
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

public class Lich extends Enemy
{

	private String name;
	private int intelligence;
	private int attackPower;


	public Lich()
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
		name = "Lich";
	}	//end setName

	/**
	 * gets the name
	 * @return name
	 */
	public String getName()
	{
		return name;
	}//end getName

	@Override
	/**
	 * sets the intelligence
	 */
	public void setIntelligence ( )
	{
		intelligence = 20;
	}//end setIntelligence

	@Override
	/**
	 * gets the intelligence
	 * @return intelligence
	 */
	public int getIntelligence()
	{
		return intelligence;
	}//end getIntelligence

	@Override
	/**
	 * sets the attack power
	 */
	public void setAttackPower()
	{
		attackPower = 15;

	}//end setAttackPower

	@Override
	/**
	 * gets the attack power
	 * @return attackPower
	 */
	public  int getAttackPower()
	{

		return attackPower;
	}//end getAttackPower



	public void stats()
	{
		JOptionPane
				.showMessageDialog(null,"Name: " +this.name  +  "\nHealth:" + super.getHealth() + "\n Attack Power:" + getAttackPower()
						+ "\n Speed:" + super.getSpeed() + "\n Strength:" + super.getStrength() + "\n Dexterity:" + super.getDexterity() + "\n Constitution:" + super.getConstitution() +
						"\n Intelligence:" + getIntelligence() + "\n Wisdom:" + super.getWisdom() + "\n Charisma:" + super.getCharisma()," Enemy Stats",JOptionPane.INFORMATION_MESSAGE);
	}


	// TODO: implement the Lich class
}
