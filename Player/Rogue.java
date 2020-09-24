/*
 * ---------------------------------------------------------------------------
 * File name: Rogue.java
 * Project name: ZorkGame
 * ---------------------------------------------------------------------------
 * Creator's name and email: Johnathan Graybeal, graybealjw@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: 4/10/2019
 * ---------------------------------------------------------------------------
 */

package Player;

import javax.swing.*;

public class Rogue extends Player
{
	String playerClass = "Rogue";
	int health;
	int dexterity;
	int attackPower;
	@Override
	public void setStartingHealth ( )
	{

		health = super.getStartingHealth() + 12;

	}


	public void setStartingAttackPower ()
	{
		dexterity = super.getDexterityScore();
		switch (dexterity)
		{
			case 1:
				attackPower = super.getStartingAttackPower( );
				attackPower -= 5;
				break;
			case 2:
				attackPower = super.getStartingAttackPower( );
				attackPower -= 4;
				break;
			case 3:
				attackPower = super.getStartingAttackPower( );
				attackPower -= 4;
				break;
			case 4:
				attackPower = super.getStartingAttackPower( );
				attackPower -= 3;
				break;
			case 5:
				attackPower = super.getStartingAttackPower( );
				attackPower -= 3;
				break;
			case 6:
				attackPower = super.getStartingAttackPower( );
				attackPower -= 2;
				break;
			case 7:
				attackPower = super.getStartingAttackPower( );
				attackPower -= 2;
				break;
			case 8:
				attackPower = super.getStartingAttackPower( );
				attackPower -= 1;
				break;
			case 9:
				attackPower = super.getStartingAttackPower( );
				attackPower -= 1;
				break;
			case 10:
				attackPower = super.getStartingAttackPower( );
				attackPower += 0;
				break;
			case 11:
				attackPower = super.getStartingAttackPower( );
				attackPower += 0;
				break;
			case 12:
				attackPower = super.getStartingAttackPower( );
				attackPower += 1;
				break;
			case 13:
				attackPower = super.getStartingAttackPower( );
				attackPower += 1;
				break;
			case 14:
				attackPower = super.getStartingAttackPower( );
				attackPower += 2;
				break;
			case 15:
				attackPower = super.getStartingAttackPower( );
				attackPower += 2;
				break;
			case 16:
				attackPower = super.getStartingAttackPower( );
				attackPower += 3;
				break;
			case 17:
				attackPower = super.getStartingAttackPower( );
				attackPower += 3;
			case 18:
				attackPower = super.getStartingAttackPower( );
				attackPower += 4;
				break;
			case 19:
				attackPower = super.getStartingAttackPower( );
				attackPower += 4;
				break;
			case 20:
				attackPower = super.getStartingAttackPower( );
				attackPower += 5;
				break;
			default:
				attackPower = 10;
				break;

		}//end switch(strengthScore)
	}


	public void stats()
	{
		JOptionPane.showMessageDialog(null,"Player Race:" + super.getRace()   + "\nPlayer Class:" +  playerClass + "\nHealth:" + health +    "\n Attack Power:" + super.getStartingAttackPower()
				+ "\n Speed:" + super.getStartingSpeed() + "\n Strength:" + super.getStrengthScore() + "\n Dexterity:" + super.getDexterityScore() + "\n Constitution:" + super.getConstitutionScore()+
				"\n Intelligence:" + super.getIntelligenceScore() + "\n Wisdom:" + super.getWisdomScore() + "\n Charisma:" + super.getCharismaScore(),"Stats",JOptionPane.INFORMATION_MESSAGE);
	}//end stats
	// TODO: implement the Rogue class
}
