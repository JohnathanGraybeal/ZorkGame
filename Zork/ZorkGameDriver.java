package Zork;



import Enemy.*;//imports everything from the Enemy package
import Player.*;//imports everything from the Player package
import javafx.application.Application;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;

import java.util.Random;


public class ZorkGameDriver extends Application implements EventHandler<ActionEvent>
{
    Button submitBtn;//used for the submit character creation button

    Scene characterCreation;//used for the character creation scene
    Scene battle;

   VBox leftRegion;//creates a vertical box to be put into the left region
   HBox topRegion;//creates a horizontal box to be put into the top region
   VBox centerRegion;//creates a vertical box to be put into the center region
   HBox bottomRegion;//creates a horizontal box to be put into the bottom region

   TextField name;//text field where the name will be input
    Label characterRace;//label for character race
    Label characterClass;//label for character class
    Label strength;//label for strength
    Label dex;//label for dex
    Label constitution;//label for constitution
    Label intelligence;//label for intelligence
    Label wisdom;//label for wisdom
    Label charisma;//label for charisma
    ChoiceBox str;//choice box for strength
    ChoiceBox dexterity;//choice box for dexterity
    ChoiceBox con;//choice box for constitution
    ChoiceBox inte;//choice box for intelligence
    ChoiceBox wis;//choice box for wisdom
    ChoiceBox chr;//choice box for charisma
    ChoiceBox race;//choice box for character race
    ChoiceBox cClass;//choice box for character class

    /*
    imported from the player class/package needed to make an object outside of its package
     */
    Warrior warrior;
    Rogue rogue;
    Mage mage;



    String playerName;
    String playerRace;
    String playerClass;
    String strengthValue;
    String dexterityValue;
    String constitutionValue;
    String intelligenceValue;
    String wisdomValue;
    String charismaValue;


    int strengthVal;
    int dexterityVal;
    int constitutionVal;
    int intelligenceVal;
    int wisdomVal;
    int charismaVal;

    Stage window;

    //start battle scene items..
    Button attackBtn;
    Button exitBtn;
    HBox battleScene;
    int pickEnemy;//contains a random number that picks what enemy the player will be facing
    Random r;//need to get a random number
    Beholder beholder;
    BlackKnight blackKnight;
    Dragon dragon;
    Goblin goblin;
    Lich lich;
    Orc orc;
    Troll troll;








    public static void main (String [ ] args)
    {
       launch(args);


    }

    @Override
    public void start (Stage primaryStage) throws Exception
    {
        window = primaryStage;


        window.getIcons().add(new Image("/Assets/zorkIcon.png"));
        window.setTitle("Character Creation");


        /*
            Goes into the top region of the gui
         */


        name = new TextField("Enter your character name here");
        characterRace = new Label("Race:");
        race = new ChoiceBox();
        race.setItems(FXCollections.observableArrayList("HUMAN",new Separator(),"ELF","GOLIATH","DWARF"));
        race.setTooltip(new Tooltip("Humans get +1 to all stats\nElfs get +2 to dexterity and +1 to intelligence\n" +
                "Goliaths get +2 to strength and +1 to constitution\nDwarfs get +2 to constitution and strength"));
        characterClass = new Label("Class:");
        cClass = new ChoiceBox();
        cClass.setItems(FXCollections.observableArrayList("Warrior", new Separator(),"Rogue","Mage"));
        cClass.setTooltip(new Tooltip("Warrior uses your strength score to calculate attacks\nRogue uses dexterity to calculate attacks\n" +
                "Mage uses intelligence to calculate attacks"));




        /*
        goes into the left region of the gui as descriptor labels
         */
        strength = new Label("Strength: ");
        dex = new Label("Dexterity: ");
        constitution = new Label( "Constitution: ");
        intelligence = new Label("Intelligence: ");
        wisdom = new Label("Wisdom: ");
        charisma = new Label("Charisma: ");

        /*
        create character and cancel buttons they go on the bottom of the gui screen
         */
        submitBtn = new Button();
        submitBtn.setText("Create Character ");
        submitBtn.setOnAction(this);

        //for the battle scene
        attackBtn = new Button();
        attackBtn.setText("Attack");
        attackBtn.setOnAction(this);
        exitBtn = new Button();
        exitBtn.setText("Exit");
        exitBtn.setOnAction(this);


        /*
        creates all choice boxes to be added to the center
         */
         str = new ChoiceBox();
        str.setItems(FXCollections.observableArrayList(
                10, new Separator(),1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));
        str.setTooltip(new Tooltip("This determines your attack power if you are a warrior "));

        dexterity = new ChoiceBox();
        dexterity.setItems(FXCollections.observableArrayList(
                10, new Separator(),1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));
        dexterity.setTooltip(new Tooltip("This determines your attack power if you are a rogue and it determines how easy it is for enemies to hit you  "));


        con = new ChoiceBox();
        con.setItems(FXCollections.observableArrayList(
                10, new Separator(),1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));
        con.setTooltip(new Tooltip("This determines your starting health"));

        inte = new ChoiceBox();
        inte.setItems(FXCollections.observableArrayList(
                10, new Separator(),1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));
        inte.setTooltip(new Tooltip("This determines your attack power if you are a mage"));

        wis = new ChoiceBox();
        wis.setItems(FXCollections.observableArrayList(
                10, new Separator(),1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));
        wis.setTooltip(new Tooltip("This determines how much common sense that your character has "));

        chr = new ChoiceBox();
        chr.setItems(FXCollections.observableArrayList(
                10, new Separator(),1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));
        chr.setTooltip(new Tooltip("This determines how much you pay for items "));




        /*
        creates regions to be displayed within the gui
         */

         leftRegion = new VBox(30);
         topRegion = new HBox(15);
         bottomRegion = new HBox(100);
         centerRegion = new VBox(20);

         //for battle scene

         battleScene = new HBox(400);



         /*
         assigns components to each region
          */
         topRegion.getChildren().addAll(name,characterRace,race,characterClass,cClass);
        leftRegion.getChildren().addAll(strength,dex,constitution,intelligence,wisdom,charisma);
        bottomRegion.getChildren().addAll(submitBtn);
        centerRegion.getChildren().addAll(str,dexterity,con,inte,wis,chr);

        //for battle scene

        battleScene.getChildren().addAll(attackBtn,exitBtn);

        /*
        creates a new border pane and sets each region
         */
        BorderPane layout = new BorderPane();
        layout.setTop(topRegion);
        layout.setLeft(leftRegion);
        layout.setBottom(bottomRegion);
        layout.setCenter(centerRegion);



        characterCreation = new Scene(layout,300,200);
        window.setScene(characterCreation);
        window.show();

        //for battle scene
        battle = new Scene(battleScene,300,200);



    }

    @Override
    public void handle (ActionEvent event)
    {

        if (event.getSource() == submitBtn)
        {
            try
            {
                playerName = name.getText( );
                playerRace = race.getValue( ).toString( );
                playerClass = cClass.getValue( ).toString( );
                strengthValue = str.getValue( ).toString( );
                strengthVal = Integer.parseInt(strengthValue);
                dexterityValue = dexterity.getValue( ).toString( );
                dexterityVal = Integer.parseInt(dexterityValue);
                constitutionValue = con.getValue( ).toString( );
                constitutionVal = Integer.parseInt(constitutionValue);
                intelligenceValue = inte.getValue( ).toString( );
                intelligenceVal = Integer.parseInt(intelligenceValue);
                charismaValue = chr.getValue( ).toString( );
                charismaVal = Integer.parseInt(charismaValue);
                wisdomValue = wis.getValue( ).toString( );
                wisdomVal = Integer.parseInt(wisdomValue);
            }
            catch (NullPointerException npe)
            {
                JOptionPane
                        .showMessageDialog(null, "All fields weren't completed setting default values ", "Incomplete Character", JOptionPane.INFORMATION_MESSAGE);
            }
            catch (Exception e)
            {
                JOptionPane
                        .showMessageDialog(null, "All fields weren't completed setting default values ", "Incomplete Character", JOptionPane.INFORMATION_MESSAGE);
            }


            if (playerClass.equals("Warrior"))
            {
                try
                {
                    warrior = new Warrior( );
                    warrior.setPlayerName(playerName);
                    warrior.setRace(playerRace);
                    warrior.setStrengthScore(strengthVal);
                    warrior.setDexterityScore(dexterityVal);
                    warrior.setConstitutionScore(constitutionVal);
                    warrior.setIntelligenceScore(intelligenceVal);
                    warrior.setCharismaScore(charismaVal);
                    warrior.setWisdomScore(wisdomVal);
                    warrior.setStartingHealth( );
                    warrior.setStartingSpeed( );
                    warrior.setStartingAttackPower( );

                }
                catch (NullPointerException npe)
                {
                    JOptionPane
                            .showMessageDialog(null, "All fields weren't completed setting default values ", "Incomplete Character", JOptionPane.INFORMATION_MESSAGE);
                }
                catch (Exception e)
                {
                    JOptionPane
                            .showMessageDialog(null, "All fields weren't completed setting default values ", "Incomplete Character", JOptionPane.INFORMATION_MESSAGE);
                }
            }//end if

            if (playerClass.equals("Rogue"))
            {
                try
                {
                    rogue = new Rogue( );
                    rogue.setPlayerName(playerName);
                    rogue.setRace(playerRace);
                    rogue.setStrengthScore(strengthVal);
                    rogue.setDexterityScore(dexterityVal);
                    rogue.setConstitutionScore(constitutionVal);
                    rogue.setIntelligenceScore(intelligenceVal);
                    rogue.setCharismaScore(charismaVal);
                    rogue.setWisdomScore(wisdomVal);
                    rogue.setStartingHealth( );
                    rogue.setStartingSpeed( );
                    rogue.setStartingAttackPower( );
                }
                catch (NullPointerException npe)
                {
                    JOptionPane
                            .showMessageDialog(null, "All fields weren't completed setting default values ", "Incomplete Character", JOptionPane.INFORMATION_MESSAGE);
                }
                catch (Exception e)
                {
                    JOptionPane
                            .showMessageDialog(null, "All fields weren't completed setting default values ", "Incomplete Character", JOptionPane.INFORMATION_MESSAGE);
                }
            }//end if

            if (playerClass.equals("Mage"))
            {
                try
                {
                    mage = new Mage( );
                    mage.setPlayerName(playerName);
                    mage.setRace(playerRace);
                    mage.setStrengthScore(strengthVal);
                    mage.setDexterityScore(dexterityVal);
                    mage.setConstitutionScore(constitutionVal);
                    mage.setIntelligenceScore(intelligenceVal);
                    mage.setCharismaScore(charismaVal);
                    mage.setWisdomScore(wisdomVal);
                    mage.setStartingHealth( );
                    mage.setStartingSpeed( );
                    mage.setStartingAttackPower( );
                }
                catch (NullPointerException npe)
                {
                    JOptionPane
                            .showMessageDialog(null, "All fields weren't completed setting default values ", "Incomplete Character", JOptionPane.INFORMATION_MESSAGE);
                }
                catch (Exception e)
                {
                    JOptionPane
                            .showMessageDialog(null, "All fields weren't completed setting default values ", "Incomplete Character", JOptionPane.INFORMATION_MESSAGE);
                }
            }//end


            window.close( );
            switch (playerClass)
            {
                case "Warrior":
                    warrior.stats( );
                    break;
                case "Rogue":
                    rogue.stats( );
                    break;
                case "Mage":
                    mage.stats( );
                    break;

            }
            r = new Random( );
            pickEnemy = r.nextInt((7 - 1) + 1) + 1;

            switch (pickEnemy)
            {
                case 1:
                    beholder = new Beholder( );
                    JOptionPane.showMessageDialog(null, "An enemy approaches...");
                    beholder.stats( );
                    break;
                case 2:
                    blackKnight = new BlackKnight( );
                    JOptionPane.showMessageDialog(null, "An enemy approaches...");
                    blackKnight.stats( );
                    break;
                case 3:
                    dragon = new Dragon( );
                    JOptionPane.showMessageDialog(null, "An enemy approaches...");
                    dragon.stats( );
                    break;
                case 4:
                    goblin = new Goblin( );
                    JOptionPane.showMessageDialog(null, "An enemy approaches...");
                    goblin.stats( );
                    break;
                case 5:
                    lich = new Lich( );
                    JOptionPane.showMessageDialog(null, "An enemy approaches...");
                    lich.stats( );
                    break;
                case 6:
                    orc = new Orc( );
                    JOptionPane.showMessageDialog(null, "An enemy approaches...");
                    orc.stats( );
                case 7:
                    troll = new Troll( );
                    JOptionPane.showMessageDialog(null, "An enemy approaches...");
                    troll.stats( );


            }
        }



            window.setScene(battle);
            window.setTitle("Battle");
            window.show( );
            if (event.getSource() == attackBtn)
            {




                 switch (pickEnemy)
                 {
                     case 1:


                             JOptionPane.showMessageDialog(null,"You won congrats ");
                             window.close();

                         break;
                     case 2:

                             JOptionPane.showMessageDialog(null,"You won congrats ");
                             window.close();

                         break;
                     case 3:


                             JOptionPane.showMessageDialog(null,"You won congrats ");
                             window.close();

                         break;

                     case 4:


                             JOptionPane.showMessageDialog(null,"You won congrats ");
                             window.close();

                         break;

                     case 5:


                             JOptionPane.showMessageDialog(null,"You won congrats ");
                             window.close();

                         break;

                     case 6:


                             JOptionPane.showMessageDialog(null,"You won congrats ");
                             window.close();

                         break;

                     case 7:


                             JOptionPane.showMessageDialog(null,"You won congrats ");
                             window.close();

                         break;


                 }



            }

            if(event.getSource() == exitBtn)
            {
                JOptionPane.showMessageDialog(null,"Goodbye thanks for playing ");
                window.close();
            }










    }//end handle





}//end ZorkGameDriver
