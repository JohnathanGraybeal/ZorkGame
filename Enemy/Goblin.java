/*
 * ---------------------------------------------------------------------------
 * File name: Goblin.java
 * Project name: ZorkGame
 * ---------------------------------------------------------------------------
 * Creator's name and email: Johnathan Graybeal, graybealjw@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: 4/10/2019
 * ---------------------------------------------------------------------------
 */

package Enemy;

import javax.swing.*;


public class Goblin extends Enemy
{
	private String name;
	private int health;


	public Goblin()
	{
		super();
		setName();
		setGoblinHealth();

	}//end Goblin();

	/**
	 * sets the name
	 */
	public void setName()
	{
		name = "Goblin";
	}//end setName()

	/**
	 * gets the name
	 * @return name
	 */
	public String getName()
	{
		return name;
	}//end getName()

	/**
	 * sets goblins health
	 * they are weaker enemies so health is cut
	 */
	public void setGoblinHealth()
	{

		health =  super.getHealth() - 4;
	}//end setGoblinHealth

	/**
	 * gets the health of the goblin
	 * @return
	 */
	public int getGoblinHealth()
	{
		return health;
	}//end getGoblinHealth



	public void stats()
	{
		JOptionPane.showMessageDialog(null,"Name: " +this.name  +  "\nHealth:" + this.health + "\n Attack Power:" + super.getAttackPower()
				+ "\n Speed:" + super.getSpeed() + "\n Strength:" + super.getStrength() + "\n Dexterity:" + super.getDexterity() + "\n Constitution:" + super.getConstitution() +
				"\n Intelligence:" + super.getIntelligence() + "\n Wisdom:" + super.getWisdom() + "\n Charisma:" + super.getCharisma()," Enemy Stats",JOptionPane.INFORMATION_MESSAGE);
	}
	// TODO: implement the Goblin class
}
