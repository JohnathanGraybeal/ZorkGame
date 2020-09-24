/*
 * ---------------------------------------------------------------------------
 * File name: Dragon.java
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

public class Dragon extends Enemy
{
	private String name;

	private int strength;
	private int constitution;


	Random r = new Random();
	public Dragon()
	{
		super();

		setName();
		setStrength();
		setConstitution();


	}

	/**
	 * sets the name
	 */
	public void setName()
	{
		name = "Dragon";
	}//end setName

	/**
	 * gets the name of Dragon
	 * @return
	 */
	public String getName()
	{
		return name;
	}//end getName()




	public int getStrength()
	{
		return strength;
	}




	public int getConstitution()
	{
		return constitution;
	}


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


}
