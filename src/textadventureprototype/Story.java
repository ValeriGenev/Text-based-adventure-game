//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textadventureprototype;

import AdditionalPackages.BareHandsWeapon;
import AdditionalPackages.DaggerWeapon;
import AdditionalPackages.LongswordWeapon;
import AdditionalPackages.Monster;
import AdditionalPackages.MonsterAlternativeMage;
import AdditionalPackages.MonsterAlternativeMonk;
import AdditionalPackages.MonsterAlternativePaladin;
import AdditionalPackages.MonsterAlternativeRanger;

public class Story {

    TextAdventurePrototypeUI UI;
    VisibilityManager vm;
    TextAdventurePrototype game;
    Player player = new Player(); // Player will most likely be only used in story, so we instantiate, I guess?
    Monster monster;

    public Story(TextAdventurePrototype gameplay, VisibilityManager vManager, TextAdventurePrototypeUI userInterface) {
        UI = userInterface;
        vm = vManager;
        game = gameplay;
    }

    public void defaultSetup() {
        player.hp = 10;
        player.strength = 20;
        player.charisma = 15;
        player.intelligence = 20;
        player.dexterity = 5;
        UI.hpLabelNumber.setText("" + player.hp);
        player.currentWeapon = new DaggerWeapon();
        UI.weaponLabelName.setText(player.currentWeapon.name);
        UI.dexterityLabelName.setText("" + player.dexterity);
        UI.strengthLabelNumber.setText("" + player.strength);
        UI.charismaLabelName.setText("" + player.charisma);
        UI.intelligenceLabelName.setText("" + player.intelligence);
    }

    public void selectPosition(String nextPosition) {
        switch (nextPosition) {
            case "wakeUpLookAround":
                wakeUpLookAround();
                break;
            case "wakeUpBasement":
                wakeUpBasement();
                break;
            case "wakeUpLongsword":
                wakeUpLongsword();
                break;
            case "exitHouse":
                exitHouse();
                break;
            case "win":
                win();
                break;
            case "lose":
                lose();
                break;
            case "playerAttackPaladin":
                playerAttackPaladin();
                break;
            case "monsterAttackPaladin":
                monsterAttackPaladin();
                break;
            case "playerAttackMage":
                playerAttackMage();
                break;
            case "monsterAttackMage":
                monsterAttackMage();
                break;
            case "playerAttackMonk":
                playerAttackMonk();
                break;
            case "monsterAttackMonk":
                monsterAttackMonk();
                break;
            case "playerAttackRanger":
                playerAttackRanger();
                break;
            case "monsterAttackRanger":
                monsterAttackRanger();
                break;
            case "toTitleScreen":
                toTitleScreen();
                break;
            case "garrison":
                garrison();
                break;
            case "cityHall":
                cityHall();
                break;
            case "pub":
                pub();
                break;
   //         case "library":
    //            library();
     //           break;
            case "cityHallMessengerChaosForm":
                cityHallMessengerChaosForm();
                break;
            case "cityHallMessengerSurrender":
                cityHallMessengerSurrender();
                break;
            case "cityHallMagistrateMessengerEscape":
                cityHallMagistrateMessengerEscape();
                break;
            case "cityHallMagistrateOffice":
                cityHallMagistrateOffice();
                break;
            case "cityHallMagistrateInquiry":
                cityHallMagistrateInquiry();
                break;
            case "cityHallMagistrate":
                cityHallMagistrateInquiry();
                break;
                /*
            case "libraryConfrontation":
                libraryConfrontation();
                break;
            case "libraryInquiry":
                libraryInquiry();
                break;
            case "libraryLost":
                libraryLost();
                break;

                /// */
            case "pubCapture":
                pubCapture();
                break;
            case "pubConvincing":
                pubConvincing();
                break;
            case "pubEscape":
                pubEscape();
                break;
            case "AdventurersMage":
                AdventurersMage();
                break;
            case "AdventurersPaladin":
                AdventurersPaladin();
                break;
            case "AdventurersRanger":
                AdventurersRanger();
                break;
            case "AdventurersMonk":
                AdventurersMonk();
                break;
            case "pubRun":
                pubRun();
                break;
            /*    
            case "libraryLostContinuation":
                libraryLostContinuation();
                break;
            case "libraryTreat":
                libraryTreat();
                break;
            case "libraryTreatContinuation":
                libraryTreatContinuation();
                break;
            case "libraryTreatDeparture":
                libraryTreatContinuation();
                break;
            case "libraryFalseRemorse":
                libraryFalseRemorse();
                break;
            case "libraryGutting":
                libraryGutting();
                break;
                //// */
            case "garrisonSoldiers":
                garrisonSoldiers();
                break;
            case "garrisonCommisar":
                garrisonCommisar();
                break;
            case "garrisonDeafVeteran":
                garrisonDeafVeteran();
                break;
            case "garrisonCommisarDisguise":
                garrisonCommisarDisguise();
                break;
            case "garrisonCommisarGameOver":
                garrisonCommisarGameOver();
                break;
            case "garrisonCommisarGameOverAlternative":
                garrisonCommisarGameOverAlternative();
                break;
            case "alternativeMageCombat":
                alternativeMageCombat();
                break;
            case "alternativePaladinCombat":
                alternativePaladinCombat();
                break;
            case "alternativeRangerCombat":
                alternativeRangerCombat();
                break;
            case "alternativeMonkCombat":
                alternativeMonkCombat();
                break;
            case "loseBySuffocation":
                loseBySuffocation();
                break;
                case "loseByBleedingOut":
                loseByBleedingOut();
                break;
            case "wakeUpLookAroundHopeless":
                wakeUpLookAroundHopeless();
                break;
        }
    }

    public void wakeUpHouse() {

        UI.mainTextArea.setText(
                "The city is under siege and your house is on fire.\n Escape now and you might just live to fight another day.");
        UI.choice1.setText("Look around you. There might be a way out of this");
        UI.choice2.setText("Grab a weapon, you might need it before you head out.");
        UI.choice3.setText("You might be able hide in the basement below.");
        UI.choice4.setText("Head outside and waste no more time in here.");

        game.nextPosition1 = "wakeUpLookAround";
        game.nextPosition2 = "wakeUpLongsword";
        game.nextPosition3 = "wakeUpBasement";
        game.nextPosition4 = "exitHouse";

        UI.choice3.setVisible(true);
        UI.choice4.setVisible(true);
    }

    public void wakeUpLookAround() {
        // item taken or have a weapon equipped
        UI.mainTextArea.setText(
                "You take a look to your right a notice a golden trinket hanging on the oposite wall. You take it.");
        UI.choice1.setText("Take another look of your residence before it collapses.");
        UI.choice2.setText(
                "Go outside right now. The creaking is getting overwhelming. The place is about to crush you under its weight");
        UI.choice3.setText("Try the basement. You still might have some time left to hide and wait out the invasion");
        UI.choice4.setText("");

        game.nextPosition1 = "wakeUpLookAroundHopeless";
        game.nextPosition2 = "exitHouse";
        game.nextPosition3 = "wakeUpBasement";
        game.nextPosition4 = "";
    }

    public void wakeUpBasement() {

        UI.mainTextArea.setText(
                "As soon as you enter this little cramped hole, a gruesome realization comes upon you, namely that you are stuck here. \n As time ticks on, you realize you are slowly suffocating to death.");
        UI.choice1.setText("Perish in agony");
        UI.choice2.setText("Perish in agony");
        UI.choice3.setText("Perish in agony");
        UI.choice4.setText("Perish in agony");

        game.nextPosition1 = "loseBySuffocation";
        game.nextPosition2 = "loseBySuffocation";
        game.nextPosition3 = "loseBySuffocation";
        game.nextPosition4 = "loseBySuffocation";
    }

    public void wakeUpLookAroundHopeless() {

        UI.mainTextArea.setText(
                "There is nothing of value to acquire. A redudant realization to make, given that your previous home is being destroyed in front of your eyes.\n You hear a loud creak nearby. A moment later you are being crushed under a wall.");
        UI.choice1.setText("Perish in agony");
        UI.choice2.setText("Perish in agony");
        UI.choice3.setText("Perish in agony");
        UI.choice4.setText("Perish in agony");

        game.nextPosition1 = "loseBySuffocation";
        game.nextPosition2 = "loseBySuffocation";
        game.nextPosition3 = "loseBySuffocation";
        game.nextPosition4 = "loseBySuffocation";
    }

    public void wakeUpLongsword() {
        player.currentWeapon = new LongswordWeapon();
        UI.weaponLabelName.setText(player.currentWeapon.name);
        UI.mainTextArea.setText(
                "You notice your trusty blade in the viscinity, ready to be grabbed. You take it in your hand, getting a feel for its weight.");
        UI.choice1.setText("Take another look of your residence before it collapses.");
        UI.choice2.setText(
                "Go outside right now. The creaking is getting overwhelming. The place is about to crush you under its weight");
        UI.choice3.setText("Try the basement. You still might have some time left to hide and wait out the invasion");
        UI.choice4.setText("");

        game.nextPosition1 = "wakeUpLookAroundHopeless";
        game.nextPosition2 = "exitHouse";
        game.nextPosition3 = "wakeUpBasement";
        game.nextPosition4 = "";
    }

    public void exitHouse() {

        UI.mainTextArea.setText(
                "As soon as you rush out of the house, a symphony of horrible shreaking noices starts assaulting your ears. \n There is pain and murder all around you.");
        UI.choice1.setText(
                "The city halls are should be a safe place for me to reside in. Perhaps heading there would secure my chance of survival through the night");
        UI.choice2.setText(
                "The pub is filled with brigands and drunkards day and night, but assuming it to not be fortified by now would be unreasonable");
        UI.choice3.setText(
                "The library has always been a safe haven for everyone willing to take refuge within its walls. Perhaps the mages there can help me live through the siege");
        UI.choice4.setText(
                "Going to the garrison can be a gamble. \n If the building hasn't been overrun yet, I can better equip myself and perhaps even find someone to help me out navigate this mess.");

        game.nextPosition1 = "cityHall";
        game.nextPosition2 = "pub";
        game.nextPosition3 = "library";
        game.nextPosition4 = "garrison";
    }

    public void garrison() {

        UI.mainTextArea.setText(
                "The building seems to have been almost completely razed to the ground. Now that I am here, I ought to scavenge for whatever this place has to offer.");
        UI.choice1.setText(
                "As you enter the ruins, you hear a painful wheezing from someone nearby. Could that be...him?");
        UI.choice2.setText("In spite of your worst guesses, you can hear conversations nearby. Are those soldiers?");
        UI.choice3.setText(
                "After some searching, you take the steps to the Commisar's office. Did he survive the assault?");
        UI.choice4.setText("The armory is one of the first places I should visit.");

        game.nextPosition1 = "garrisonDeafVeteran";
        game.nextPosition2 = "garrisonSoldiers";
        game.nextPosition3 = "garrisonCommisar";
        game.nextPosition4 = "garrisonArmory";

    }

    public void garrisonSoldiers() {

        UI.mainTextArea.setText(
                "Following the voices brings you to one of the barracks. Amongst the scattered corpses of both friends and foes, you can see the two men who were responsible for the noise. \n Their distrustful eyes immediately point at your direction as you enter the room.");
        UI.choice1.setText(
                "The younger of the two doesn't seem to have much fight left in him, but his officer looks healthy enough. Perhaps you can tell them who you are and explain your intentions.");
        UI.choice2.setText("Draw your weapon and fight them. They don't trust you, and neither should you. To battle!");
        UI.choice3.setText("Leave this place immediately, while they are still recovering from the surprise.");
        UI.choice4.setText("");

        game.nextPosition1 = "garrisonSoldiers";
        game.nextPosition2 = "garrisonSoldiersCombat";
        game.nextPosition3 = "garrisonEscape";
        game.nextPosition4 = "";

    }

    public void garrisonCommisar() {

        UI.mainTextArea.setText("The poor sod has been gutted like a pig. How unfrotunate.");
        UI.choice1
                .setText("Perhaps you can disguise as him and take advantage of the chaos in order to escape quickly.");
        UI.choice2.setText("Look around in his room. Perhaps something of use can be found.");
        UI.choice3.setText("Leave the study immediately. You are running out of time.");
        UI.choice4.setText("");

        game.nextPosition1 = "garrisonCommisarDisguise";
        game.nextPosition2 = "garrisonCommisarLookAround";
        game.nextPosition3 = "garrisonCommisarLeave";
        game.nextPosition4 = "";

    }

    public void garrisonCommisarDisguise() {

        UI.mainTextArea.setText(
                "You strip the corpse of its belongings and start changing. Once you are done, you get out and start wandering. Soon, you see a crowd approaching.");
        UI.choice1.setText(
                "These good people could be my salvation. Perhaps I could make use of their help in evading the surrounding chaos.");
        UI.choice2.setText(
                "The markings on heavily armed fellow's face look familiar, and not of the good kind.\n I should turn around and run while I have the chance to do so.");
        UI.choice3.setText("Hide and lay in wait. You don't know what to expect of these people yet.");
        UI.choice4.setText("Ignore them and press forward. There is no need to concern yourself with strangers.");

        game.nextPosition1 = "garrisonCommisarGameOverAlternative";
        game.nextPosition2 = "garrisonCommisarGameOver";
        game.nextPosition3 = "garrisonCommisarGameOver";
        game.nextPosition4 = "garrisonCommisarGameOver";

    }

    public void garrisonCommisarGameOver() {

        UI.mainTextArea.setText(
                "Before you can act on anything, you feel a strong grip your shoulder. When you turn around, you can see a grimacing brute with a sword pointed at your stomach. This is the end.");
        UI.choice1.setText(
                "You watch helplessly as the monstrous man and his comrades slowly hack you to pieces. \n As you lose conciousness, you wonder whether there's somethig else you could have done differently.");
        UI.choice2.setText("");
        UI.choice3.setText("");
        UI.choice4.setText("");

        game.nextPosition1 = "lose";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";

        UI.choice2.setVisible(false);
        UI.choice4.setVisible(false);
        UI.choice3.setVisible(false);

    }

    public void garrisonCommisarGameOverAlternative() {

        UI.mainTextArea.setText(
                "Rushing towards the mob wasn't that good of an idea. A crossbowman loads an arrow and hurls it towards you. Your drop to the ground, unable to move any of your limbs.");
        UI.choice1.setText("Bleed out slowly on the ground.");
        UI.choice2.setText("Ask him about his work");
        UI.choice3.setText("Inquire about what his brother does.");
        UI.choice4.setText("Talk about the current state of affairs in the garrison");

        game.nextPosition1 = "garrisonCommisarGameOver";
        game.nextPosition2 = "garrisonCommisarWork";
        game.nextPosition3 = "garrisonCommisarBrother";
        game.nextPosition4 = "garrisonCommisarStateOfAffairs";
        UI.choice2.setVisible(false);
        UI.choice4.setVisible(false);
        UI.choice3.setVisible(false);

    }

    public void garrisonDeafVeteran() {

        UI.mainTextArea.setText(
                "It is the Deaf Veteran. What a joy! Finally, someone you can rely on in such desperate times. You attract his attention and tell him the following in sign language: ");
        UI.choice1.setText("'You seem to be in bad shape, my friend. Let me help you up'");
        UI.choice2.setText("'What happened here? Who did this to you?'");
        UI.choice3.setText(
                "Your hands write down gently:'We nothing more to discuss, I will be seeing you another time.'");
        UI.choice4.setText("You decide not to bother and just put him out of his misery");

        game.nextPosition1 = "AdventurersMage";
        game.nextPosition2 = "AdventurersMage";
        game.nextPosition3 = "AdventurersRanger";
        game.nextPosition4 = "AdventurersMonkLocation";

        // to be completed. Perhaps adding a companion would mean a big boost in stats

    }

    public void pub() {

        UI.mainTextArea.setText(
                "Whatever remains of the pub stands before you. As you approach it, you notice a couple of raiders putting the soon-to-be-berieved.\n One of the brigands notices you and cries out to his companions");
        UI.choice1.setText("Turn around and hope your feet can carry you fast enough to escape your untimely demise.");
        UI.choice2.setText(
                "A little convincing could go a long way in times like these. Perhaps you could explain to them that you are not a treat.");
        UI.choice3.setText("Draw your weapon and face them. This ends now.");
        UI.choice4.setText("");

        game.nextPosition1 = "pubEscape";
        game.nextPosition2 = "pubConvincing";
        game.nextPosition3 = "pubFight";
        game.nextPosition4 = "west";

    }

    public void pubEscape() {
        player.hp -= 10;
        UI.hpLabelNumber.setText("" + player.hp); // add death condition later
        UI.mainTextArea.setText(
                "Fortunately enough, your feet can carry you far enough away from your potential assailants. What do I do now?");
        UI.choice1.setText(
                "The city halls are should be a safe place for me to reside in. Perhaps heading there would secure my chance of survival through the night");
        UI.choice4.setText(
                "");
        UI.choice2.setText(
                "The library has always been a safe haven for everyone willing to take refuge within its walls. Perhaps the mages there can help me live through the siege");
        UI.choice3.setText(
                "Going to the garrison can be a gamble. \n If the building hasn't been overrun yet, I can better equip myself and perhaps even find someone to help me out navigate this mess.");
        game.nextPosition1 = "cityHall";
        game.nextPosition2 = "library";
        game.nextPosition3 = "garrison";
        game.nextPosition4 = "";

    }

    public void pubConvincing() {
        player.currentWeapon = new BareHandsWeapon();
        UI.weaponLabelName.setText(player.currentWeapon.name);
        UI.mainTextArea.setText(
                "The men close in on you and start encircling you. As they slowly make theri approach to you, you drop your weapon and start to desperately explain how harmless you are.");
        UI.choice1.setText("One of them smirks slightly. Perhaps, you might have convinced them. Keep it up.");
        UI.choice2.setText(
                "A member of the brigands takes an arrow from his quiver and draws his bow. Perhaps this wasn't as good of an idea as you though it would be?");
        UI.choice3.setText("");
        UI.choice4.setText("");

        game.nextPosition1 = "pubCapture";
        game.nextPosition2 = "pubRun";
        game.nextPosition3 = "";
        game.nextPosition4 = "";

    }

    public void pubRun() {
        UI.mainTextArea.setText(
                "You decide to make a run for it but the arrow catches up to you and pierces your throat. In your last moments you look up and realize that you didn't have to go through this, as the archer wanted to target a member of the city militia.");
        UI.choice1.setText("Spend your last few remaining minutes drowning in your own blood.");
        UI.choice2.setText("'...the woman who went crazy yesterday over the loss of someone she can't remember");
        UI.choice3.setText(
                "'...the rumors about the rebels pillaging in the outskirts of the country and the possibility of a second civil war'");
        UI.choice4.setText("'...what we have on offer here.'");

        game.nextPosition1 = "lose";
        game.nextPosition2 = "pubRun";
        game.nextPosition3 = "pubRebels";
        game.nextPosition4 = "pubRipoff";
        UI.choice2.setVisible(false);
        UI.choice4.setVisible(false);
        UI.choice3.setVisible(false);

    }

    public void pubCapture() {
        UI.mainTextArea.setText(
                "Your charismatic ways seem to have enchanted the loving hearts of the gruff mercenaries.  \n You are put into chains and escorted out of the city along with the rest of the prisoners of war");
        UI.choice1.setText("Hooray?");
        UI.choice2.setText("");
        UI.choice3.setText("");
        UI.choice4.setText("");

        game.nextPosition1 = "win";
        game.nextPosition2 = "pubRebelsOffputing";
        game.nextPosition3 = "pubRebelsPolitics";
        game.nextPosition4 = "pubConvincing";
        UI.choice2.setVisible(false);
        UI.choice4.setVisible(false);
        UI.choice3.setVisible(false);

    }

    public void AdventurersMage() {

        UI.mainTextArea.setText(
                "A tall and stalwart woman with a gentle look in her eyes. She gives off the comfort and grace a caring mother would. Too bad you have to kill her.");
        UI.choice1.setText(
                "'Accoring to latest reports, she was last seen pillaging some houses in the rich neighborhood. Hurry and you might catch her.'");
        UI.choice2.setText("Ask about the paladin");
        UI.choice3.setText("Ask about the ranger");
        UI.choice4.setText("Ask about the monk");

        game.nextPosition1 = "AdventurersMageLocation";
        game.nextPosition2 = "AdventurersPaladin";
        game.nextPosition3 = "AdventurersRanger";
        game.nextPosition4 = "AdventurersMonk";

    }

    public void AdventurersPaladin() {

        UI.mainTextArea.setText(
                "A big boorish hunk of man who has a suprisingly intelligent spark in his eyes for a representative of his order. The fury his boy gives off is enough to negate this small observation.He is the one responsible for the massacre in the barracks.'");
        UI.choice1
                .setText("'He can't be too far away. Perhaps you can catch him off guard, provided that he is tired.'");
        UI.choice2.setText("Ask about the mage");
        UI.choice3.setText("Ask about the ranger");
        UI.choice4.setText("Ask about the monk");

        game.nextPosition2 = "AdventurersMage";
        game.nextPosition1 = "AdventurersPaladinLocation";
        game.nextPosition3 = "AdventurersRanger";
        game.nextPosition4 = "AdventurersMonk";

    }

    public void AdventurersRanger() {
        UI.mainTextArea.setText(
                "'She looks like the leader of the group. She is the one who lead the assault on the garrison and ought to be the mastermind behind the whole affair.  \n I suggest murdering with her first.'");
        UI.choice1.setText("'Tell me more about the mage.'");
        UI.choice2.setText("'Inform me on what the paladin is like then.'");
        UI.choice3.setText("'Is that her sitting in the corner, sipping on a glass of your fine beer?'");
        UI.choice4.setText("'You haven't told me anythiing about the monk yet.'");

        game.nextPosition3 = "AdventurersMage";
        game.nextPosition2 = "AdventurersPaladin";
        game.nextPosition1 = "AdventurersRangerLocation";
        game.nextPosition4 = "AdventurersMonk";
    }

    // to be rewritten in the image of AdventurersPaladin
    public void AdventurersMonk() {

        UI.mainTextArea.setText(
                "'The monk is, as you would expect, quiet, holds to himself, and generally seems to abstain from human interraction. He didn't even lay a finger on any of our boys. Provided that he is the weakest link of the chain, it might be a good idea to priorize him for destruction.'");
        UI.choice1.setText("'Tell me more about the mage.'");
        UI.choice2.setText("'Inform me on what the paladin is like then.'");
        UI.choice3.setText("'Let me know what the ranger contributes to the party dinamic.'");
        UI.choice4.setText(
                "'He was, ironically, last seen by our shrine. Hurry and you might find him by there tending for the wounded.'");

        game.nextPosition1 = "AdventurersMage";
        game.nextPosition2 = "AdventurersPaladin";
        game.nextPosition3 = "AdventurersRanger";
        game.nextPosition4 = "AdventurersMonkLocation";

    }

    public void cityHall() {

        UI.mainTextArea.setText(
                "The city hall...Whoever survived the initial onslaught seems to have sheltered in the great halls of this place. Fortunately for you, an underground path known only to a select few leads to the heart of the building. \n After emerging out of tunnel and nearly being slaughtered by your neighbours, you get up and wonder where to head next.");
        UI.choice1.setText("Head for the Magistrate's office");
        UI.choice2.setText("Check up on the defenders upstairs");
        UI.choice3.setText("Open the doors and let the invaders enter. We are done for anyways.");
        UI.choice4.setText(
                "Grab that dead soldier's armor and brace for the worst. You can hear them battering the gates from the outside.");

        game.nextPosition1 = "cityHallMagistrate";
        game.nextPosition2 = "cityHallDefenders";
        game.nextPosition3 = "cityHallSurrender";
        game.nextPosition4 = "cityHallEquipment";

    }

    public void cityHallMagistrate() {

        UI.mainTextArea.setText(
                "The Magistrate, slighly pale and weakly looking, sits on his desk scribbling small letters on a piece of parchment. It seems that wants to send out word with through the messendger sitting outside.");
        UI.choice1.setText("Greet him and ask if there is anything you can assist with.");
        UI.choice2.setText(
                "Examine his office. He doesn't seem to be in any sort of a rush to speak with you. You shouldn't blame him, there's so much on his head anyways.");
        UI.choice3.setText("Go see the defenders upstairs");
        UI.choice4.setText("Leave at once and let the assailants win. There is nothing you can do right now.");

        game.nextPosition1 = "cityHallMagistrateInquiry";
        game.nextPosition2 = "cityHallMagistrateOffice";
        game.nextPosition3 = "cityHallDefenders";
        game.nextPosition4 = "cityHallSurrender";

    }

    public void cityHallMagistrateInquiry() {

        UI.mainTextArea.setText(
                "'Magistrate, I have a question for you...' He lifts up his head and nods. - 'How can I assist you?'");
        UI.choice1.setText(
                "'Well, you can always escort my messenger out of the city, given that you already know how the city is set up.'");
        UI.choice2.setText("'There are groups of militia in desperate need of more men. Go there and help them.'");
        UI.choice3.setText("'If none of these options suit you, leave at once.'");
        UI.choice4.setText("");

        game.nextPosition1 = "cityHallMagistrateMessenger";
        game.nextPosition2 = "cityHallDefenders";
        game.nextPosition3 = "cityHall";
        game.nextPosition4 = "";
    }

    public void cityHallMagistrateOffice() {

        UI.mainTextArea.setText(
                "The office is surprisingly modestly furnished. The only object besides the desk and the two comfy looking chairs is the bookshelf on the left.  \n The smoldering fire from the outside showers the small room with light through a small window and give the interior of the place a more grim look.");
        UI.choice1.setText(
                "Try to get his attention now. He seems to have noticed your presence.");
        UI.choice2.setText("");
        UI.choice3.setText("");
        UI.choice4.setText("");

        game.nextPosition1 = "cityHallMagistrateInquiry";
        game.nextPosition2 = "";
        game.nextPosition4 = "";
        game.nextPosition3 = "";

    }

    public void cityHallMagistrateMessenger() {

        UI.mainTextArea.setText(
                "It takes a little while before the clerk finishes his letter. He bids you and the Messenger farewell and gazes through the open window. \n You are on your own now.");
        UI.choice1.setText("Suggest you two go the hills and make a run for it.");
        UI.choice2.setText(
                "He proposes talking to the soldiers on the balcony providing cover fire and you both escaping in the chaos.");
        UI.choice3.setText(
                "The thought of unsealing the doors and dooming your comrades for your safety still lingers in your mind. After sharing your thoughts, your interlocutor seems to be of the same opinion.");
        UI.choice4.setText("");

        game.nextPosition1 = "cityHallMagistrateMessengerEscape";
        game.nextPosition2 = "cityHallMagistrateMessengerChaos";
        game.nextPosition3 = "cityHallSurrender";
        game.nextPosition4 = "";
    }

    public void cityHallMagistrateMessengerEscape() {

        UI.mainTextArea.setText(
                "You take the tunnel and make it out of the city. Carefully, you both sneak past their defences and go over the hills and far away. Perhaps help will come for whoever is left by the time you arrive.");
        UI.choice1.setText(
                "Run for your lives, for you might save the ones defending here. Remember, they are counting on you.");
        UI.choice2.setText("'Where can I find this woman?'");
        UI.choice3.setText("'What are the whereabouts of the couple?'");
        UI.choice4.setText("");

        game.nextPosition1 = "win";
        game.nextPosition2 = "cityHallMagistrateWidow";
        game.nextPosition3 = "cityHallMagistrateChildlessCouple";
        game.nextPosition4 = "";

        UI.choice2.setVisible(false);
        UI.choice4.setVisible(false);
        UI.choice3.setVisible(false);
    }

    public void cityHallMessengerSurrender() {

        UI.mainTextArea.setText(
                "The lieutenant looks at you puzzled, but decides to oblige, given that he doesn't even know what else to do.");
        UI.choice1.setText("You charge in the ensuing chaos, as the soldiers and citizens alike charge headlong into the enemy assailants.  \n Unfortunately for you, a friendly trooper stabs you through the artery and you find yourself lying helpless on the ground, as the battle rages on all around you.");
        UI.choice2.setText("'Where can I find this woman'");
        UI.choice3.setText("'What are the whereabouts of the couple?'");
        UI.choice4.setText("");

        game.nextPosition1 = "loseByBleedingOut";
        game.nextPosition2 = "cityHallMagistrateWidow";
        game.nextPosition3 = "cityHallMagistrateChildlessCouple";
        game.nextPosition4 = "";

        UI.choice2.setVisible(false);
        UI.choice4.setVisible(false);
        UI.choice3.setVisible(false);

    }

    public void cityHallMessengerChaosForm() {

        UI.mainTextArea.setText(
                "It takes you a notable amount of time and some blood, sweat and tears, but have finally made it. The man sitting opposite you adds the report to the towering pile and looks at you expectingly.");
        UI.choice1.setText("Filling out the form wouldn't hurt. <i>You</i> have no reason to doubt authority, right?");
        UI.choice2.setText("'Where can I find this woman?'");
        UI.choice3.setText("'What are the whereabouts of the couple?'");
        UI.choice4.setText("");

        game.nextPosition1 = "cityHallMessengerChaosForm";
        game.nextPosition2 = "cityHallMagistrateWidow";
        game.nextPosition3 = "cityHallMagistrateChildlessCouple";
        game.nextPosition4 = "";
    }
/*
    public void library() {

        UI.mainTextArea.setText(
                "The Librarian is not the one that would help me find the one. Or anyone for that matter. His knowledge of monsters, however, is immense. Perhaps he can tell me who did this to he woman in question");
        UI.choice1.setText("I am not ready to face him yet. Perhaps a browse through the place is in order first.");
        UI.choice2.setText("I am ready to face him. I think. I hope...");
        UI.choice3.setText("Leave this cursed place");
        UI.choice4.setText("");

        game.nextPosition1 = "goblinCombat";
        game.nextPosition2 = "west";
        game.nextPosition3 = "libraryConfrontation";
        game.nextPosition4 = "west";

    }

    public void libraryConfrontation() {
        UI.mainTextArea.setText(
                "The Librarian. A dirty creature with missing teeth and clothes soaked in filth. He mumbles something through his rancid breath.");
        UI.choice1.setText("'Greetings, Librarian. I have an inquiry to make'");
        UI.choice2.setText("'I have to go, never mind.'");
        UI.choice3.setText("");
        UI.choice4.setText("");

        game.nextPosition1 = "libraryInquiry";
        game.nextPosition2 = "library";
        game.nextPosition3 = "";
        game.nextPosition4 = "";

    }
    // shorter(because I don't feel like writing a story for it anymore, and modify
    // the graphs in case I have any sanity left. Also, upload the new vertices and
    // ask Vesko whether we can make the game not travel from one verice to another
    // when I don't have the required stats.)
    public void libraryInquiry() {
        UI.mainTextArea.setText(
                "'Aha, I know you...' A flurry of incomprehensible words follows as you hold back your disgust. After you wipe your face from the man's repulsive spit, you brace yourself for another question.");
        UI.choice1.setText("'Still, I have something I would like to learn some more information about...'");
        UI.choice2.setText("'I have to go, never mind.'");
        UI.choice3.setText("");
        UI.choice4.setText("");

        game.nextPosition1 = "libraryLost";
        game.nextPosition2 = "library";
        game.nextPosition3 = "";
        game.nextPosition4 = "";

    }

    public void libraryLost() {
        UI.mainTextArea.setText(
                "The hobo's gaze brightens upon reaching the realization you intend on staying in here for a little while. You make the unsettling revelation that the skin on his face shifts as if something underneath it has just started shifting around. His orifce slowly expands and starts to belch out some suprisingly sophisticated words.");
        UI.choice1.setText("Stay awhile and listen for a little longer. He might say something of use.");
        UI.choice2.setText(
                "Enough of this. I need something and I cannot afford to listen any more of this creature's ramblings...");
        UI.choice3.setText("Draw your hidden sheath. This ought to make him shut up");
        UI.choice4.setText("");

        game.nextPosition1 = "libraryLostContinuation";
        game.nextPosition2 = "libraryLost";
        game.nextPosition3 = "libraryTreat";
        game.nextPosition4 = "";

    }

    public void libraryLostContinuation() {
        UI.mainTextArea.setText(
                "There is, of course, nothing of value to be heard. You have just lost 30 minutes of your precious remaining time on the Continent listening to this nonsense. Great...");
        UI.choice1.setText("'As I was saying, I need some information. About a monster I'm hunting. Help me find it.");
        UI.choice2.setText(
                "Enough of this. I need something and I cannot afford to listen any more of this creature's ramblings...");
        UI.choice3.setText("'I have to go, never mind.'");
        UI.choice4.setText("");

        game.nextPosition1 = "libraryInquiry";
        game.nextPosition2 = "libraryLost";
        game.nextPosition3 = "library";
        game.nextPosition4 = "";

    }

    public void libraryTreat() {
        UI.mainTextArea.setText(
                "A justified bewildered reaction quickly takes over his grimace. This ought to make his answers more comprehensible.");
        UI.choice1.setText("'Now, listen to me carefully and answer briefly if want to live.'");
        UI.choice2.setText(
                "'I am aware it is forbidden. I am partly responsible for the ban on pointy metal rods. Now tell me what I want to hear'");
        UI.choice3.setText("Draw your hidden sheath. This ought to make him shut up");
        UI.choice4.setText("");

        game.nextPosition1 = "libraryTreatContinuation";
        game.nextPosition2 = "libraryLost";
        game.nextPosition3 = "libraryTreat";
        game.nextPosition4 = "";

    }

    public void libraryTreatContinuation() {
        UI.mainTextArea.setText("The man gazes you coldly. A simple, yet hard 'NO' escapes his lips");
        UI.choice1.setText("Gut him.");
        UI.choice2.setText(
                "'I am aware my approach was a little confrontational, but I really need answers from you. Now.'");
        UI.choice3.setText("Loosen your grip and get out of this place");
        UI.choice4.setText("");

        game.nextPosition1 = "libraryGutting";
        game.nextPosition2 = "libraryFalseRemorse";
        game.nextPosition3 = "libraryTreatDeparture";
        game.nextPosition4 = "";

    }

    public void libraryGutting() {
        UI.mainTextArea.setText(
                "You unsheathe your weapon and slice the man's throat. You press your hands on the wound and let him drown in his own blood.");
        UI.choice1.setText("Game over?");
        UI.choice2.setText("");
        UI.choice3.setText("");
        UI.choice4.setText("");

        game.nextPosition1 = "lose";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void libraryFalseRemorse() {
        UI.mainTextArea.setText("His look remains unyielding. His answer isn't changing anytime soon.");
        UI.choice1.setText("Cut him open like a pig. He is of no use to you anyways.");
        UI.choice2.setText(
                "Leave him be. The library's doors will be closed for you from now on, but you can at least live knowing you aren't getting pursued by the law.");
        UI.choice3.setText("");
        UI.choice4.setText("");

        game.nextPosition1 = "lose";
        game.nextPosition2 = "pubFight";
        game.nextPosition3 = "";
        game.nextPosition4 = "";

    }

    public void libraryTreatDeparture() {
        UI.mainTextArea.setText(
                "He won't budge. I didn't want to visit him anyways<From now on, you will not be able to gain access to the secrets the Library might offer>");
        UI.choice1.setText("Go out on the streets");
        UI.choice2.setText("Head home");
        UI.choice3.setText("Pay a visit to the pub");
        UI.choice4.setText("Visit the Town Hall");

        game.nextPosition1 = "pubFight";
        game.nextPosition2 = "home";
        game.nextPosition3 = "pub";
        game.nextPosition4 = "cityHall";

    }
 */
    public void alternativeRangerCombat() {
        monster = new MonsterAlternativeRanger();
        UI.mainTextArea.setText("It was unwise to anger the Ranger. Kill him before his arrows wear you down.");
        UI.choice1.setText("Attack him while you have the advantage");
        UI.choice2.setText("Try to escape combat");
        UI.choice3.setText("");
        UI.choice4.setText("");

        game.nextPosition1 = "playerAttackRanger";
        game.nextPosition2 = "attemptedEscape";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void alternativeMonkCombat() {

        monster = new MonsterAlternativeMonk();
        UI.mainTextArea.setText("You managed to agitate the tranquil monk. Prepare to face the futy of his fists");
        UI.choice1.setText(
                "You can see his hesitation. Attempt to defeat him now, while you still have a fighting chance.");
        UI.choice2.setText("Try to escape combat");
        UI.choice3.setText("");
        UI.choice4.setText("");

        game.nextPosition1 = "playerAttackMonk";
        game.nextPosition2 = "attemptedEscape";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void alternativePaladinCombat() {

        monster = new MonsterAlternativePaladin();
        UI.mainTextArea.setText(
                "The migthy Paladin is not someone who you'd want as your enemy. Brace yourself and get ready to fight fro your life.");
        UI.choice1.setText("His defenses are down. Take the chance to take the initiative now.");
        UI.choice2.setText("Try to escape combat");
        UI.choice3.setText("");
        UI.choice4.setText("");

        game.nextPosition1 = "playerAttackPaladin";
        game.nextPosition2 = "attemptedEscape";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void alternativeMageCombat() {
        monster = new MonsterAlternativeMage();
        UI.mainTextArea.setText(
                "Mages are few and far between. Fighting a master of magic shouldn't be an easy task.");
        UI.choice1.setText("You can see an opening to strike. Attack him now while you still have time!");
        UI.choice2.setText("Try to escape combat");
        UI.choice3.setText("");
        UI.choice4.setText("");

        game.nextPosition1 = "playerAttackMage";
        game.nextPosition2 = "attemptedEscape";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
    public void attemptedEscape() {
        
        UI.mainTextArea.setText(
                "Attempting escape wasn't the most brilliant of ideas. Perhaps you should have tried to see how it would play out. Your foe strikes you dead, because you tried to take the easy way out.");
        UI.choice1.setText("You have failed to complete your task. Maybe next time should be better.");
        UI.choice2.setText("");
        UI.choice3.setText("");
        UI.choice4.setText("");

        game.nextPosition1 = "lose";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void playerAttackPaladin() {
        int playerDamage = new java.util.Random().nextInt(player.currentWeapon.damage + player.strength); // Inflicts
                                                                                                          // damage
                                                                                                          // based on
                                                                                                          // the
        // weapon stats. It is of note
        // that if the damage is 12, the
        // actual damage will be 0 to 11
        UI.mainTextArea.setText("You attacked the " + monster.name + " and inflicted " + playerDamage + " damage!");
        monster.hp -= playerDamage;
        UI.choice1.setText("Your turn to suffer!");
        UI.choice2.setText("");
        UI.choice3.setText("");
        UI.choice4.setText("");

        if (monster.hp > 0) {
            game.nextPosition1 = "monsterAttackPaladin";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        } else if (monster.hp < 1) {
            game.nextPosition1 = "win";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }

    }

    public void playerAttackMage() {
        int playerDamage = new java.util.Random().nextInt(player.currentWeapon.damage + player.strength); 
        UI.mainTextArea.setText("You attacked the " + monster.name + " and inflicted " + playerDamage + " damage!");
        monster.hp -= playerDamage;
        UI.choice1.setText("Your turn to suffer!");
        UI.choice2.setText("");
        UI.choice3.setText("");
        UI.choice4.setText("");

        if (monster.hp > 0) {
            game.nextPosition1 = "monsterAttackMage";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        } else if (monster.hp < 1) {
            game.nextPosition1 = "win";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }

    }

    public void playerAttackMonk() {
        int playerDamage = new java.util.Random().nextInt(player.currentWeapon.damage + player.strength);
        UI.mainTextArea.setText("You attacked the " + monster.name + " and inflicted " + playerDamage + " damage!");
        monster.hp -= playerDamage;
        UI.choice1.setText("Your turn to suffer!");
        UI.choice2.setText("");
        UI.choice3.setText("");
        UI.choice4.setText("");

        if (monster.hp > 0) {
            game.nextPosition1 = "monsterAttackMonk";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        } else if (monster.hp < 1) {
            game.nextPosition1 = "win";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }

    }

    public void playerAttackRanger() {
        int playerDamage = new java.util.Random().nextInt(player.currentWeapon.damage + player.strength); 
        UI.mainTextArea.setText("You attacked the " + monster.name + " and inflicted " + playerDamage + " damage!");
        monster.hp -= playerDamage;
        UI.choice1.setText("Your turn to suffer!");
        UI.choice2.setText("");
        UI.choice3.setText("");
        UI.choice4.setText("");

        if (monster.hp > 0) {
            game.nextPosition1 = "monsterAttackRanger";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        } else if (monster.hp < 1) {
            game.nextPosition1 = "win";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }

    }

    public void monsterAttackPaladin() {
        int monsterDamage = new java.util.Random().nextInt(monster.attack);
        UI.mainTextArea.setText(monster.attackMessage + "You received " + monsterDamage + " damage!");
        player.hp -= monsterDamage;
        UI.hpLabelNumber.setText("" + player.hp);
        UI.choice1.setText("Your turn to strike!");
        UI.choice2.setText("");
        UI.choice3.setText("");
        UI.choice4.setText("");
        if (player.hp > 0) {
            game.nextPosition1 = "alternativePaladinCombat";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        } else if (player.hp < 1) {
            game.nextPosition1 = "lose";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }

    }

    public void monsterAttackMage() {
        int monsterDamage = new java.util.Random().nextInt(monster.attack);
        UI.mainTextArea.setText(monster.attackMessage + "You received " + monsterDamage + " damage!");
        player.hp -= monsterDamage;
        UI.hpLabelNumber.setText("" + player.hp);
        UI.choice1.setText("Your turn to strike!");
        UI.choice2.setText("");
        UI.choice3.setText("");
        UI.choice4.setText("");
        if (player.hp > 0) {
            game.nextPosition1 = "alternativeMageCombat";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        } else if (player.hp < 1) {
            game.nextPosition1 = "lose";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }

    }

    public void monsterAttackRanger() {
        int monsterDamage = new java.util.Random().nextInt(monster.attack);
        UI.mainTextArea.setText(monster.attackMessage + "You received " + monsterDamage + " damage!");
        player.hp -= monsterDamage;
        UI.hpLabelNumber.setText("" + player.hp);
        UI.choice1.setText("Your turn to strike!");
        UI.choice2.setText("");
        UI.choice3.setText("");
        UI.choice4.setText("");
        if (player.hp > 0) {
            game.nextPosition1 = "alternativeRangerCombat";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        } else if (player.hp < 1) {
            game.nextPosition1 = "lose";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }

    }

    public void monsterAttackMonk() {
        int monsterDamage = new java.util.Random().nextInt(monster.attack);
        UI.mainTextArea.setText(monster.attackMessage + "You received " + monsterDamage + " damage!");
        player.hp -= monsterDamage;
        UI.hpLabelNumber.setText("" + player.hp);
        UI.choice1.setText("Your turn to strike!");
        UI.choice2.setText("");
        UI.choice3.setText("");
        UI.choice4.setText("");
        if (player.hp > 0) {
            game.nextPosition1 = "alternativeMonkCombat";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        } else if (player.hp < 1) {
            game.nextPosition1 = "lose";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }

    }

    public void win() {

        UI.mainTextArea.setText(
                "You managed to escape the city. Looking back on your destroyed home, you realize how hollow your victory actually was. Still, congratulations for your efforts are in order.");
        UI.choice1.setText("Start over?");
        UI.choice2.setText("Exit game?");
        UI.choice3.setText("");
        UI.choice4.setText("");
        UI.choice3.setVisible(false);
        UI.choice4.setVisible(false);

        game.nextPosition1 = "wakeUpHouse";
        game.nextPosition2 = "exitProgram";
        game.nextPosition3 = "";
        game.nextPosition4 = "";

    }

    public void lose() {

        UI.mainTextArea.setText("You are dead");
        UI.choice1.setText("Start over?");
        UI.choice2.setText("Exit game?");
        UI.choice3.setText("");
        UI.choice4.setText("");
        UI.choice3.setVisible(false);
        UI.choice4.setVisible(false);

        game.nextPosition1 = "toTitleScreen";
        game.nextPosition2 = "exitProgram";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void loseBySuffocation() {

        UI.mainTextArea.setText(
                "You struggled to crawl out of the trap you put yourself into, but to no avail. As you gasp for the last remaining breathable air in the cramped space, a sinlge question circulates your mind. - 'How could I have prevented this?'");
        UI.choice1.setText("Start over?");
        UI.choice2.setText("Exit game?");
        UI.choice3.setText("");
        UI.choice4.setText("");
        UI.choice3.setVisible(false);
        UI.choice4.setVisible(false);

        game.nextPosition1 = "toTitleScreen";
        game.nextPosition2 = "exitProgram";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
    public void loseByBleedingOut() {

        UI.mainTextArea.setText(
                "A comforting feeling washes over your body as your mind slowly drifts to sleep for the very last time.");
        UI.choice1.setText("Start over?");
        UI.choice2.setText("Exit game?");
        UI.choice3.setText("");
        UI.choice4.setText("");
        UI.choice3.setVisible(false);
        UI.choice4.setVisible(false);

        game.nextPosition1 = "toTitleScreen";
        game.nextPosition2 = "exitProgram";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void exitProgram() {
        System.exit(0);
    }

    public void toTitleScreen() {
        defaultSetup();
        vm.showTitleScreen();
    }

}

