/*
 * ---------------------------------------------------------------------------
 * File name: Enemy.java
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

public abstract class Enemy implements EnemyInterface
{
	private String name;
	private int health = 10;
	private int attackPower = 10;//starting attack power for every character
	private int speed = 10;//starting speed for every character
	private int strength = 10;//holds the value for the characters strength it is increased or decreased when the character is made through a point buy system
	private int dexterity = 10;//holds the value for the characters dexterity score it is increased or decreased when the character is made through the point buy system
	private int constitution = 10;//holds the constitution score for the character it is increased or decreased when the character is made through a point buy system
	private int intelligence = 10;//holds the intelligence score for the character it is increased or decreased when the character is made through a point buy system
	private int wisdom = 10;//holds the wisdom score for the character it is increased or decreased when the character is made through a point buy system
	private int charisma = 10;//holds the charisma score for the character it is increased or decreased when the character is made through the point buy system


	private int max = 25;
	private int min = 8;

	Random r = new Random();





	public Enemy()
	{
		setStrength();
		setDexterity();
		setConstitution();
		setIntelligence();
		setWisdom();
		setCharisma();
		setHealth();
		setSpeed();
		setAttackPower();
	}
	/**
	 * sets the enemies strength
	 */
	public void setStrength()
	{

		strength = r.nextInt((max-min)+1)+min;
	}//ens set strength

	/**
	 * gets the enemies strength
	 * @return strength
	 */
	public int getStrength()
	{
		return strength;
	}	//end get strength

	/**
	 * sets the dexterity
	 */
	public void setDexterity()
	{

		dexterity = r.nextInt((max-min)+1)+min;

	}	//end set dexterity

	/**
	 * gets the enemies dexterity
	 * @return dexterity
	 */
	public int getDexterity()
	{
		return dexterity;
	}//end get dexterity

	/**
	 * sets the enemies constitution score
	 */
	public void setConstitution()
	{
		constitution = r.nextInt((max-min)+1)+min;
	}	//end setConstitution

	/**
	 * gets the enemies constitution score
	 * @return constitution
	 */
	public int getConstitution()
	{
		return constitution;
	}	//end get constitution

	/**
	 * sets the charisma
	 */
	public void setCharisma()
	{
		charisma = r.nextInt((max-min)+1)+min;

	}

	/**
	 * gets the charisma score
	 * @return charisma
	 */
	public int getCharisma()
	{
		return charisma;
	}

	/**
	 * sets the intelligence score
	 */
	public void setIntelligence()
	{
		intelligence = r.nextInt((max-min)+1)+min;
	}

	/**
	 * gets the intelligence score
	 * @return intelligence
	 */
	public int getIntelligence()
	{
		return intelligence;
	}

	/**
	 * sets the wisdom score
	 */
	public void setWisdom()
	{
		wisdom = r.nextInt((max-min)+1)+min;
	}

	/**
	 * returns the wisdom score
	 * @return
	 */
	public int getWisdom()
	{
		return wisdom;
	}//end set wisdom

	/**
	 * sets the enemies health using the constitution score
	 */
	public void setHealth()
	{
		switch (constitution)
		{
			case 8:
				health -= 1;
				break;
			case 9:
				health -= 1;
				break;
			case 10:
				health += 0;
				break;
			case 11:
				health += 0;
				break;
			case 12:
				health += 1;
				break;
			case 13:
				health += 1;
				break;
			case 14:
				health += 2;
				break;
			case 15:
				health += 2;
				break;
			case 16:
				health += 3;
				break;
			case 17:
				health += 3;
				break;
			case 18:
				health += 4;
				break;
			case 19:
				health += 4;
				break;
			case 20:
				health += 5;
				break;
			case 21:
				health += 5;
			case 22:
				health += 6;
				break;
			case 23:
				health += 6;
				break;
			case 24:
				health += 7;
			case 25:
				health += 7;
				break;
			default:
				health = 10;
				break;


		}//end switch(constitution)
	}

	/**
	 * gets the enemies health
	 * @return health
	 */
	public int getHealth()
	{
		return health;
	}

	/**
	 * sets the enemies speed
	 */
	public void setSpeed()
	{
		switch (dexterity)
		{
			case 8:
				speed -=1;
				break;
			case 9:
				speed -=1;
				break;
			case 10:
				speed +=0;
				break;
			case 11:
				speed +=0;
				break;
			case 12:
				speed +=1;
				break;
			case 13:
				speed +=1;
				break;
			case 14:
				speed +=2;
				break;
			case 15:
				speed +=2;
				break;
			case 16:
				speed +=3;
				break;
			case 17:
				speed +=3;
				break;
			case 18:
				speed +=4;
				break;
			case 19:
				speed +=4;
				break;
			case 20:
				speed +=5;
				break;
			case 21:
				speed +=5;
				break;
			case 22:
				speed +=6;
				break;
			case 23:
				speed +=6;
				break;
			case 24:
				speed +=7;
				break;
			case 25:
				speed +=7;
				break;


		}//end switch
	}//end set speed

	/**
	 * gets the enemies speed
	 * @return speed
	 */
	public int getSpeed()
	{
		return speed;
	}	//end getSpeed

	/**
	 * sets the enemies attack power
	 */
	public void setAttackPower()
	{
		switch (strength)
		{
			case 8:
				attackPower -=1;
				break;
			case 9:
				attackPower -=1;
				break;
			case 10:
				attackPower +=0;
				break;
			case 11:
				attackPower +=0;
			case 12:
				attackPower +=1;
				break;
			case 13:
				attackPower +=1;
				break;
			case 14:
				attackPower +=2;
				break;
			case 15:
				attackPower +=2;
				break;
			case 16:
				attackPower +=3;
				break;
			case 17:
				attackPower +=3;
				break;
			case 18:
				attackPower +=4;
				break;
			case 20:
				attackPower +=4;
				break;
			case 21:
				attackPower +=5;
				break;
			case 22:
				attackPower +=5;
				break;
			case 23:
				attackPower +=6;
				break;
			case 24:
				attackPower +=6;
			case 25:
				attackPower +=7;

		}//end switch(strength)
	}//end set attackPower

	/**
	 * gets the attack power
	 * @return attackPower
	 */
	public int getAttackPower()
	{
		return attackPower;
	}//end getAttackPower

	/**
	 * shows the enemies stats
	 */
	public void stats()
	{
		JOptionPane.showMessageDialog(null,"Health:" + this.health + "\n Attack Power:" + this.attackPower
				+ "\n Speed:" + this.speed + "\n Strength:" + this.strength + "\n Dexterity:" + this.dexterity + "\n Constitution:" + this.constitution +
				"\n Intelligence:" + this.intelligence + "\n Wisdom:" + this.wisdom + "\n Charisma:" + this.charisma,"Stats",JOptionPane.INFORMATION_MESSAGE);
	}


	/**
	 * sets the enemies name
	 */
	public abstract void setName();










	// TODO: implement the Enemy class
}
