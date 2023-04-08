/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textadventureprototype;

import AdditionalPackages.DaggerWeapon;
import AdditionalPackages.LongswordWeapon;
import AdditionalPackages.Monster;
import AdditionalPackages.MonsterAlternativeMage;
import AdditionalPackages.MonsterAlternativeMonk;
import AdditionalPackages.MonsterAlternativePaladin;
import AdditionalPackages.MonsterAlternativeRanger;
import AdditionalPackages.MonsterGoblin;
import AdditionalPackages.MonsterLamya;
import AdditionalPackages.MonsterFakeHydra;


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
        UI.weaponLabelName.setText("" + player.currentWeapon.name);
        UI.dexterityLabelName.setText("" + player.dexterity);
        UI.strengthLabelNumber.setText("" + player.strength);
        UI.charismaLabelName.setText("" + player.charisma);
        UI.intelligenceLabelName.setText("" + player.intelligence);
    }

    public void selectPosition(String nextPosition) {
        switch (nextPosition) {
            case "wakeUpCallRecollection":
                wakeUpCallRecollection();
                break;
            case "wakeUpCallWindow":
                wakeUpCallWindow();
                break;
            case "wakeUpCallKitchen":
                wakeUpCallKitchen();
                break;
            case "wakeUpCallDrawer":
                wakeUpCallDrawer();
                break;
            case "north":
                north();
                break;
            case "east":
                east();
                break;
            case "west":
                west();
                break;
            case "south":
                south();
                break;
            case "rabbitCombat":
                rabbitCombat();
                break;
            case "exitHut":
                exitHut();
                break;
            case "goblinCombat":
                goblinCombat();
                break;
            case "win":
                win();
                break;
            case "lose":
                lose();
                break;
            case "playerAttack":
                playerAttack();
                break;
            case "monsterAttack":
                monsterAttack();
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
            case " pub":
                pub();
                break;
            case "library":
                library();
                break;
            case "cityHallMagistrateBanishment":
                cityHallMagistrateBanishment();
                break;
            case "cityHallMagistrateWomanDenialInvestigationForm":
                cityHallMagistrateWomanDenialInvestigationForm();
                break;
            case "cityHallMagistrateWomanDenialInvestigation":
                cityHallMagistrateWomanDenialInvestigation();
                break;
            case "cityHallMagistrateWomanDenial":
                cityHallMagistrateWomanDenial();
                break;
            case "cityHallMagistrateWoman":
                cityHallMagistrateWoman();
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
            case "home":
                home();
                break;
            case "libraryConfrontation":
                libraryConfrontation();
                break;
            case "libraryInquiry":
                libraryInquiry();
                break;
            case "libraryLost":
                libraryLost();
                break;
            case "pubAdventurers":
                pubAdventurers();
                break;
            case "pubUnusual":
                pubUnusual();
                break;
            case "pubBeer":
                pubBeer();
                break;
            case "pubAdventurersMage":
                pubAdventurersMage();
                break;
            case "pubAdventurersPaladin":
                pubAdventurersPaladin();
                break;
            case "pubAdventurersRanger":
                pubAdventurersRanger();
                break;
            case "pubAdventurersMonk":
                pubAdventurersMonk();
                break;
            case "pubDeludedWoman":
                pubDeludedWoman();
                break;
            case "pubRebels":
                pubRebels();
                break;
            case "pubRipoff":
                pubRipoff();
                break;
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
            case "garrisonSoldiers":
                garrisonSoldiers();
                break;
            case "garrisonCommisar":
                garrisonCommisar();
                break;
            case "garrisonDeafVeteran":
                garrisonDeafVeteran();
                break;
            case "garrisonCommisarStateOfAffairs":
                garrisonCommisarStateOfAffairs();
                break;
            case "garrisonCommisarInquiry":
                garrisonCommisarInquiry();
                break;
            case "garrisonCommisarWork":
                garrisonCommisarWork();
                break;
            case "garrisonCommisarBrother":
                garrisonCommisarBrother();
                break;
            case "deludedWoman;":
                deludedWoman();
                break;
            case "blacksmith":
                blacksmith();
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
        }
    }

    public void wakeUpHut() {

        UI.mainTextArea.setText("The city is under siege. Escape now and you might just live to fight another day.");
        UI.choice1.setText("There is something on the woman's drawer. A clue ot her identity, perhaps?");
        UI.choice2.setText("You sense a faint smell from the kitchen. Maybe this is where your misterious host resides?");
        UI.choice3.setText("A small window just above your bed. Is the woman visible from there?");
        UI.choice4.setText("Sit on the bed and try to recollect last night's events.");

        game.nextPosition1 = "wakeUpCallDrawer";
        game.nextPosition2 = "wakeUpCallKitchen";
        game.nextPosition3 = "wakeUpCallWindow";
        game.nextPosition4 = "wakeUpCallRecollection";

        UI.choice3.setVisible(true);
        UI.choice4.setVisible(true);
    }

    public void wakeUpCallRecollection() {
        // Знаеш ли, като се позамисля, това с позициите не е задължително за ВСЯКА опция. Ще тествам отново. Тествах. Пълни глупости са, извинявай 
        UI.mainTextArea.setText("Woke up, took care of the animals, worked on my parcel, went out to visit someone. I've live alone, and all family members that I know of, are dead. Something's not adding up...");
        UI.choice1.setText("Try to remember more");
        UI.choice2.setText("Leave this place");
        UI.choice3.setText("");
        UI.choice4.setText("");

        game.nextPosition1 = "wakeUpCallRecollection";
        game.nextPosition2 = "exitHut";
        game.nextPosition3 = "wakeUpCallRecollection";
        game.nextPosition4 = "wakeUpCallRecollection";
    }

    public void wakeUpCallWindow() {

        UI.mainTextArea.setText("Noone can be seen outside. Just a beautiful green meadow");
        UI.choice1.setText("What's that to the right? A rabbit to test the combat system on? How lovely!");
        UI.choice2.setText("Leave this place");
        UI.choice3.setText("");
        UI.choice4.setText("");

        game.nextPosition1 = "rabbitCombat";
        game.nextPosition2 = "exitHut";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void wakeUpCallKitchen() {

        UI.mainTextArea.setText("Roast beef, a half-eaten bread, and some fine wine. Still no closer to finding who the owner of this place is");
        UI.choice1.setText("Eat up");
        UI.choice2.setText("");
        UI.choice3.setText("");
        UI.choice4.setText("");

        game.nextPosition1 = "wakeUpCallKitchen";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void wakeUpCallDrawer() {

        UI.mainTextArea.setText("Melinda Karson... I would have known if I had any living relatives...");
        UI.choice1.setText("I have a friend who works at the city hall. Perhaps he can point me to this mysterious chartacter");
        UI.choice2.setText("");
        UI.choice3.setText("");
        UI.choice4.setText("");

        game.nextPosition1 = "cityHall";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void rabbitCombat() {

        UI.mainTextArea.setText("The evil rabbit retaliated your measly attempt for an attack and tripped you. You received 3 damage. You dare not approach the foul beast");
        UI.choice1.setText("Back to the hut I go");
        UI.choice2.setText("");
        UI.choice3.setText("");
        UI.choice4.setText("");
        player.hp -= 3;
        UI.hpLabelNumber.setText("" + player.hp);

        game.nextPosition1 = "wakeUpCallWindow";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";

    }

    public void exitHut() {

        UI.mainTextArea.setText("I have seen enough here. Time to leave this place and search for answers someplace else.");
        UI.choice1.setText("Head north, to the city");
        UI.choice2.setText("Go east, to the Library");
        UI.choice3.setText("Take the road west, into the wilderness");
        UI.choice4.setText("Going south will take you back to your house");

        game.nextPosition1 = "north";
        game.nextPosition2 = "east";
        game.nextPosition3 = "west";
        game.nextPosition4 = "south";
    }

    public void north() {

        UI.mainTextArea.setText("The city. Sometimes I wonder how my life would have turned out if I hadn't become a soldier...");
        UI.choice1.setText("Visit the Mayor");
        UI.choice2.setText("Take a stroll");
        UI.choice3.setText("Visit the pub");
        UI.choice4.setText("See what happens in the garrison");

        game.nextPosition1 = "townHall";
        game.nextPosition2 = "north";
        game.nextPosition3 = "pub";
        game.nextPosition4 = "garrison";
    }

    public void east() {

        UI.mainTextArea.setText("Er...a longsword. I wonder what this thing does in a library");
        UI.choice1.setText("Kura");
        UI.choice2.setText("Take a stroll");
        UI.choice3.setText("Visit the pub");
        UI.choice4.setText("See what happens in the garrison");

        game.nextPosition1 = "goblinCombat";
        game.nextPosition2 = "east";
        game.nextPosition3 = "west";
        game.nextPosition4 = "west";
    }

    public void west() {

        UI.mainTextArea.setText("I need to go on an adventure in the great outdoors");
        UI.choice1.setText("There is a goblin that we can use for the second test of our combat system");
        UI.choice2.setText("Take a stroll");
        UI.choice3.setText("Visit the pub");
        UI.choice4.setText("See what happens in the garrison");

        game.nextPosition1 = "goblinCombat";
        game.nextPosition2 = "west";
        game.nextPosition3 = "west";
        game.nextPosition4 = "west";

    }

    public void south() {

        UI.mainTextArea.setText("Home, sweet home. Just as I remember it");
        UI.choice1.setText("Kill the fake hydra");
        UI.choice2.setText("Take a stroll");
        UI.choice3.setText("Visit the pub");
        UI.choice4.setText("See what happens in the garrison");

        game.nextPosition1 = "goblinCombat";
        game.nextPosition2 = "west";
        game.nextPosition3 = "west";
        game.nextPosition4 = "west";

    }

    public void garrison() {

        UI.mainTextArea.setText("I used to be one of them. The soldiers know this and are willing to help one of their own.");
        UI.choice1.setText("The Deaf Veteran is an old companion from the olden days. Perhaps he's heard of the misterious woman?");
        UI.choice2.setText("Why not try conversing to the group of soldiers nearby?");
        UI.choice3.setText("The Commisar is here, as usual. Why not ask him?");
        UI.choice4.setText("There's nothing else for me here. I should go.");

        game.nextPosition1 = "garrisonDeafVeteran";
        game.nextPosition2 = "garrisonSoldiers";
        game.nextPosition3 = "garrisonCommisar";
        game.nextPosition4 = "cityStreets";

    }

    public void garrisonSoldiers() {

        UI.mainTextArea.setText("The soldiers seem to be engaged in a very interesting conversation. Yet, you aproach them and tell them: ");
        UI.choice1.setText("'Hey, lads, I am looking for a woman named Jane Doe, would you be so kind to help me find her?'");
        UI.choice2.setText("'Troopers, you ought to acknowledge the presence of a raked officer. You answer me or else you will have to be prepared to face the consequences!'");
        UI.choice3.setText("Forget about them, they have enough of their plate already.");
        UI.choice4.setText("There's nothing else to be gained from them. Perhaps I should go.)");

        game.nextPosition1 = "garrisonDeafVeteran";
        game.nextPosition2 = "garrisonSoldiers";
        game.nextPosition3 = "garrisonCommisar";
        game.nextPosition4 = "cityStreets";

    }

    public void garrisonCommisar() {

        UI.mainTextArea.setText("The Commisar is the Magistrate's brother. They are descendants of a nobele family that has been ruling the city for centuries. Unlike other representatives of the upper class, however, the brothers aren't incompetent.");
        UI.choice1.setText("Tell him why you are here.");
        UI.choice2.setText("Ask him about his work");
        UI.choice3.setText("Inquire about what his brother does.");
        UI.choice4.setText("Talk about the current state of affairs in the garrison");

        game.nextPosition1 = "garrisonCommisarInquiry";
        game.nextPosition2 = "garrisonCommisarWork";
        game.nextPosition3 = "garrisonCommisarBrother";
        game.nextPosition4 = "garrisonCommisarStateOfAffairs";

    }

    public void garrisonCommisarStateOfAffairs() {

        UI.mainTextArea.setText("The Commisar is the Magistrate's brother. They are descendants of a nobele family that has been ruling the city for centuries. Unlike other representatives of the upper class, however, the brothers aren't incompetent.");
        UI.choice1.setText("Tell him why you are here.");
        UI.choice2.setText("Ask him about his work");
        UI.choice3.setText("Inquire about what his brother does.");
        UI.choice4.setText("Talk about the current state of affairs in the garrison");

        game.nextPosition1 = "garrisonCommisarInquiry";
        game.nextPosition2 = "garrisonCommisarWork";
        game.nextPosition3 = "garrisonCommisarBrother";
        game.nextPosition4 = "garrisonCommisarStateOfAffairs";

    }

    public void garrisonCommisarInquiry() {

        UI.mainTextArea.setText("The Commisar is the Magistrate's brother. They are descendants of a nobele family that has been ruling the city for centuries. Unlike other representatives of the upper class, however, the brothers aren't incompetent.");
        UI.choice1.setText("Tell him why you are here.");
        UI.choice2.setText("Ask him about his work");
        UI.choice3.setText("Inquire about what his brother does.");
        UI.choice4.setText("Talk about the current state of affairs in the garrison");

        game.nextPosition1 = "garrisonCommisarInquiry";
        game.nextPosition2 = "garrisonCommisarWork";
        game.nextPosition3 = "garrisonCommisarBrother";
        game.nextPosition4 = "garrisonCommisarStateOfAffairs";

    }

    public void garrisonCommisarWork() {

        UI.mainTextArea.setText("The Commisar is the Magistrate's brother. They are descendants of a nobele family that has been ruling the city for centuries. Unlike other representatives of the upper class, however, the brothers aren't incompetent.");
        UI.choice1.setText("Tell him why you are here.");
        UI.choice2.setText("Ask him about his work");
        UI.choice3.setText("Inquire about what his brother does.");
        UI.choice4.setText("Talk about the current state of affairs in the garrison");

        game.nextPosition1 = "garrisonCommisarInquiry";
        game.nextPosition2 = "garrisonCommisarWork";
        game.nextPosition3 = "garrisonCommisarBrother";
        game.nextPosition4 = "garrisonCommisarStateOfAffairs";

    }

    public void garrisonCommisarBrother() {

        UI.mainTextArea.setText("The Commisar is the Magistrate's brother. They are descendants of a nobele family that has been ruling the city for centuries. Unlike other representatives of the upper class, however, the brothers aren't incompetent.");
        UI.choice1.setText("Tell him why you are here.");
        UI.choice2.setText("Ask him about his work");
        UI.choice3.setText("Inquire about what his brother does.");
        UI.choice4.setText("Talk about the current state of affairs in the garrison");

        game.nextPosition1 = "garrisonCommisarInquiry";
        game.nextPosition2 = "garrisonCommisarWork";
        game.nextPosition3 = "garrisonCommisarBrother";
        game.nextPosition4 = "garrisonCommisarStateOfAffairs";

    }

    public void garrisonDeafVeteran() {

        UI.mainTextArea.setText("'You greet him silently and take out your pen and paper. You are somewhat versed in sign language, but not enough to hold on your own in a continuous conversation.'");
        UI.choice1.setText("You scribble the words: 'Why did you ask me here for, friend?' and pass it to him.");
        UI.choice2.setText("You jot down the following: 'How has life been lately to you?'");
        UI.choice3.setText("Your hands write down gently:'We nothing more to discuss, I will be seeing you another time.'");
        UI.choice4.setText("");

        game.nextPosition1 = "pubAdventurersMage";
        game.nextPosition2 = "pubAdventurersPaladin";
        game.nextPosition3 = "pubAdventurersRanger";
        game.nextPosition4 = "pubAdventurersMonkLocation";

    }

    public void pub() {

        UI.mainTextArea.setText("The Broken Pony... Usually the place is almost empty, with its few regular visitors being a couple of drunkards who depend on the Keeper's mercy");
        UI.choice1.setText("Go to the counter and order a beer");
        UI.choice2.setText("Ask the Keeper if he's seen anything unsual later");
        UI.choice3.setText("Go out on the street. This shack reeks of alcohol");
        UI.choice4.setText("");

        game.nextPosition1 = "pubBeer";
        game.nextPosition2 = "pubUnusual";
        game.nextPosition3 = "cityStreets";
        game.nextPosition4 = "west";

    }

    public void pubBeer() {

        UI.mainTextArea.setText("You give the man two golden coins and start sipping on the murky ale.");
        UI.choice1.setText("Ask the Keeper if he's seen anything unsual later");
        UI.choice2.setText("Go out on the street. This shack reeks of alcohol");
        UI.choice3.setText("");
        UI.choice4.setText("");

        game.nextPosition1 = "pubUnusual";
        game.nextPosition2 = "cityStreets";
        game.nextPosition3 = "";
        game.nextPosition4 = "";

    }

    public void pubUnusual() {

        UI.mainTextArea.setText("The man closes in on you. The barkeep loves nothing more than talking to a willing soul. 'There are several new things happening around town. Would you like me to tell you about...'");
        UI.choice1.setText("'...the adventurers that came to town some days ago'");
        UI.choice2.setText("'...the woman who went crazy yesterday over the loss of someone she can't remember");
        UI.choice3.setText("'...the rumors about the rebels pillaging in the outskirts of the country and the possibility of a second civil war'");
        UI.choice4.setText("'...what we have on offer here.'");

        game.nextPosition1 = "pubAdventurers";
        game.nextPosition2 = "pubDeludedWoman";
        game.nextPosition3 = "pubRebels";
        game.nextPosition4 = "pubRipoff";

    }

    public void pubDeludedWoman() {
        //pubDeludedWoman, pubRebels,pubRipoff
        UI.mainTextArea.setText("'Didn't you hear? Yesterday a woman came and //искаше да говори за съпруга и детето си, които знаем, че не съществуват, защоо тя е била мома, откакто се помни.'");
        UI.choice1.setText("'...the adventurers that came to town some days ago'");
        UI.choice2.setText("'...the woman who went crazy yesterday over the loss of someone she can't remember");
        UI.choice3.setText("'...the rumors about the rebels pillaging in the outskirts of the country and the possibility of a second civil war'");
        UI.choice4.setText("'...what we have on offer here.'");

        game.nextPosition1 = "pubAdventurers";
        game.nextPosition2 = "pubDeludedWoman";
        game.nextPosition3 = "pubRebels";
        game.nextPosition4 = "pubRipoff";

    }

    public void pubRebels() {
        //pubDeludedWoman, pubRebels,pubRipoff
        UI.mainTextArea.setText("'Even though you boys ended the civil war, the wilderness still houses some young lads who still can't accept the fact everything is over. Do be careful when heading out of town for business.'");
        UI.choice1.setText("'Don't you ever mention the war again, barkeep.'");
        UI.choice2.setText("'Insurgents you say? Let them come!'");
        UI.choice3.setText("'What more is there to change?'");
        UI.choice4.setText("'Tell me something else'");

        game.nextPosition1 = "pubRebelsConflict";
        game.nextPosition2 = "pubRebelsOffputing";
        game.nextPosition3 = "pubRebelsPolitics";
        game.nextPosition4 = "pubUnusual";

    }

    public void pubRipoff() {
        //pubDeludedWoman, pubRebels,pubRipoff
        UI.mainTextArea.setText("'Ahh, I'm so glad you asked. We have //пържола за 30, салата за 10 и супа за 15. Какво си избираш?'");
        UI.choice1.setText("'...the adventurers that came to town some days ago'");
        UI.choice2.setText("'...the woman who went crazy yesterday over the loss of someone she can't remember");
        UI.choice3.setText("'...the rumors about the rebels pillaging in the outskirts of the country and the possibility of a second civil war'");
        UI.choice4.setText("'...what we have on offer here.'");

        game.nextPosition1 = "pubAdventurers";
        game.nextPosition2 = "pubDeludedWoman";
        game.nextPosition3 = "pubRebels";
        game.nextPosition4 = "pubRipoff";

    }

    public void pubAdventurers() {

        UI.mainTextArea.setText("You NEED to know about the adventurers. 'Well, I gave them a room in the top floor of the inn. They should be resting now.'");
        UI.choice1.setText("'Tell me more about the mage.'");
        UI.choice2.setText("'Did you hear anything about which regiment the paladin was from?'");
        UI.choice3.setText("'Let me know what the ranger is up to.'");
        UI.choice4.setText("'Huh...Any more information on the monk?'");

        game.nextPosition1 = "pubAdventurersMage";
        game.nextPosition2 = "pubAdventurersPaladin";
        game.nextPosition3 = "pubAdventurersRanger";
        game.nextPosition4 = "pubAdventurersMonk";

    }

    public void pubAdventurersMage() {

        UI.mainTextArea.setText("'A tall and stalwart woman with a gentle look in her eyes. She gives off the comfort adn grace a carig mother would.'");
        UI.choice1.setText("'Where can I find her?'");
        UI.choice2.setText("'Inform me on what the paladin is like then.'");
        UI.choice3.setText("'Let me know what the ranger contributes to the party dinamic'");
        UI.choice4.setText("'You haven't told me anythiing about the monk yet.'");

        game.nextPosition1 = "pubAdventurersMageLocation";
        game.nextPosition2 = "pubAdventurersPaladin";
        game.nextPosition3 = "pubAdventurersRanger";
        game.nextPosition4 = "pubAdventurersMonk";

    }

    public void pubAdventurersPaladin() {

        UI.mainTextArea.setText("'What would you expect of the paladin to be like?' He snickers under his nose and continues - 'A big boorish hunk of man who is suprisingly intelligent for a representative of his order. Still, the fierce look in his eyes is something I would never get used to.'");
        UI.choice1.setText("'Tell me more about the mage.'");
        UI.choice2.setText("'Where am I supposed to get in touch with this lovely creature?'");
        UI.choice3.setText("'Let me know what the ranger contributes to the party dinamic'");
        UI.choice4.setText("'You haven't told me anythiing about the monk yet.'");

        game.nextPosition1 = "pubAdventurersMage";
        game.nextPosition2 = "pubAdventurersPaladinLocation";
        game.nextPosition3 = "pubAdventurersRanger";
        game.nextPosition4 = "pubAdventurersMonk";

    }

    public void pubAdventurersRanger() {

        UI.mainTextArea.setText("'She looks like the leader of the group. Unlike the rest of the party, there is something cold and refrained in her politeness. She treats me well and tips the staff handsomely, but gives off the impression she doesn't want me or anyone besides her comrades in arms by her side. Still, if you need to make use of the party's services, I suggest conversing with her first.'");
        UI.choice1.setText("'Tell me more about the mage.'");
        UI.choice2.setText("'Inform me on what the paladin is like then.'");
        UI.choice3.setText("'Is that her sitting in the corner, sipping on a glass of your fine beer?'");
        UI.choice4.setText("'You haven't told me anythiing about the monk yet.'");

        game.nextPosition1 = "pubAdventurersMage";
        game.nextPosition2 = "pubAdventurersPaladin";
        game.nextPosition3 = "pubAdventurersRangerLocation";
        game.nextPosition4 = "pubAdventurersMonk";

    }

    public void pubAdventurersMonk() {

        UI.mainTextArea.setText("'The monk is, as you would expect, quiet, holds to himself, and generally seems to abstain from human interraction. Nothing of note, really.'");
        UI.choice1.setText("'Tell me more about the mage.'");
        UI.choice2.setText("'Inform me on what the paladin is like then.'");
        UI.choice3.setText("'Let me know what the ranger contributes to the party dinamic.'");
        UI.choice4.setText("'Is his shrine nearby, so that I can talk to him?'");

        game.nextPosition1 = "pubAdventurersMage";
        game.nextPosition2 = "pubAdventurersPaladin";
        game.nextPosition3 = "pubAdventurersRanger";
        game.nextPosition4 = "pubAdventurersMonkLocation";

    }

    public void deludedWoman() {

        UI.mainTextArea.setText("Finally, you meet the woman you've heard so much about. Her beauty can't be concealed by the tears pouring down her face and yo ucan't help but feel sorry that you are disturbing such a troubled fellow human being.");
        UI.choice1.setText("Attempt to comfort her in her grief.");
        UI.choice2.setText("Tell her why you are here and how it is that the two of you are talking to each other.");
        UI.choice3.setText("Shake her and force her to spill the tea. You <i>have</i> to know what she's been through and have no time to waste.");
        UI.choice4.setText("Get out of here and wait for her to calm down. Perhaps she will be calmer when you visit her again?");

        game.nextPosition1 = "deludedWomanComfort";
        game.nextPosition2 = "deludedWomanReason";
        game.nextPosition3 = "deludedWomanShake";
        game.nextPosition4 = "cityStreets";
    }

    public void deludedWomanComfort() {

        UI.mainTextArea.setText("You do your best to console her in her grief. Reminiscing about the death of your parents and talking about the loss of the woman you consider your sister seems to have calmed her down.");
        UI.choice1.setText("Attempt to comfort her in her grief.");
        UI.choice2.setText("Tell her why you are here and how it is that the two of you are talking to each other.");
        UI.choice3.setText("Give her a hard slap and talk some sense into her. You are not in the mood of arguing with sobbing women.");
        UI.choice4.setText("Get out of here and wait for her to calm down. Perhaps she will be calmer when you visit her again?");

        game.nextPosition1 = "deludedWomanComfort";
        game.nextPosition2 = "deludedWomanReason";
        game.nextPosition3 = "deludedWomanSlap";
        game.nextPosition4 = "cityStreets";
    }

    public void deludedWomanReason() {

        UI.mainTextArea.setText("You wait on her to calm down and stop weeping. You give her a practical explanation of why you are here. The trauma seems to have brought you two closer together.");
        UI.choice1.setText("Attempt to comfort her in her grief.");
        UI.choice2.setText("Tell her why you are here and how it is that the two of you are talking to each other.");
        UI.choice3.setText("Give her a hard slap and talk some sense into her. You are not in the mood of arguing with sobbing women.");
        UI.choice4.setText("Get out of here and wait for her to calm down. Perhaps she will be calmer when you visit her again?");

        game.nextPosition1 = "deludedWomanComfort";
        game.nextPosition2 = "deludedWomanReason";
        game.nextPosition3 = "deludedWomanSlap";
        game.nextPosition4 = "cityStreets";
    }

    public void deludedWomanShake() {

        UI.mainTextArea.setText("You take the initiative and physically force her out of her trance. You inquire about what has been disturbing her. She accepted you into her home, she has the obligation to tell you what is going on. Even though she is shocked by your brute behaviour, the poor creature starts divulging information about:");
        UI.choice1.setText("Attempt to comfort her in her grief.");
        UI.choice2.setText("Tell her why you are here and how it is that the two of you are talking to each other.");
        UI.choice3.setText("Give her a hard slap and talk some sense into her. You are not in the mood of arguing with sobbing women.");
        UI.choice4.setText("Get out of here and wait for her to calm down. Perhaps she will be calmer when you visit her again?");

        game.nextPosition1 = "deludedWomanComfort";
        game.nextPosition2 = "deludedWomanReason";
        game.nextPosition3 = "deludedWomanSlap";
        game.nextPosition4 = "cityStreets";
    }

    public void cityHall() {

        UI.mainTextArea.setText("The city hall...The Mayor is usually preocupied with handling the aftermat of the arduous war effort. Still, this place is always worth checking out when I am in need of information about missing persons.");
        UI.choice1.setText("Enter and head for the Mayor's office");
        UI.choice2.setText("Go to the archives. The clerks there are usually nice. Usually.");
        UI.choice3.setText("Perhaps I needn't bother myself with bureocracy anymore.");
        UI.choice4.setText("");

        game.nextPosition1 = "cityHallMagistrate";
        game.nextPosition2 = "cityHallArchives";
        game.nextPosition3 = "cityStreets";
        game.nextPosition4 = "west";

    }

    public void cityHallMagistrate() {

        UI.mainTextArea.setText("The Magistrate, slighly pale and weakly looking, sits on his desk scribbling small letters on a piece of parchment");
        UI.choice1.setText("Greet him and get to the business at hand");
        UI.choice2.setText("Examine his office. He doesn't seem to be in any sort of a rush to speak with you");
        UI.choice3.setText("Wait for him to finish his work");
        UI.choice4.setText("Leave");

        game.nextPosition1 = "cityHallMagistrateInquiry";
        game.nextPosition2 = "cityHallMagistrateOffice";
        game.nextPosition3 = "cityHallMagistrateWaitingGame";
        game.nextPosition4 = "cityHall";

    }

    public void cityHallMagistrateInquiry() {

        UI.mainTextArea.setText("'Magistrate, I have a question for you...' He lifts up his head and nods.");
        UI.choice1.setText("'Yesterday I woke up in the home of a woman who seems to carry my family name. I don't have any living family members. Can you help me find her?'");
        UI.choice2.setText("'Your Excellency, I came up here to inquire whether you are in need of assistance'");
        UI.choice3.setText("'Your foul breath reeks of decaying corpses'");
        UI.choice4.setText("You reconsider addressing the Magistrate. Perhaps another time would be in order...");

        game.nextPosition1 = "cityHallMagistrateWoman";
        game.nextPosition2 = "cityHallMagistrateHelp";
        game.nextPosition3 = "cityHallMagistrateBanishment";
        game.nextPosition4 = "cityHallBanishment";
    }

    public void cityHallMagistrateOffice() {

        UI.mainTextArea.setText("The office is surprisingly modestly furnished. The only object besides the desk and the two comfy looking chairs is the bookshelf on the left. The sun showers the small room with light through a small window.");
        UI.choice1.setText("'Yesterday I woke up in the home of a woman who seems to carry my family name. Can you help me find her?'");
        UI.choice2.setText("");
        UI.choice3.setText("'I want to press this option and not have access to the cityHall anymore'");
        UI.choice4.setText("You reconsider addressing the Magistrate. Perhaps another time would be in order...");

        game.nextPosition1 = "cityHallMagistrateInquiry";
        game.nextPosition2 = "";
        game.nextPosition4 = "cityHallMagistrateWaitingGame";
        game.nextPosition3 = "cityHallBanishment";

    }

    public void cityHallMagistrateWoman() {

        UI.mainTextArea.setText("Your question is met with a concerned look. 'Curious. You are the 5th person to come in the last three days asking me to grant a similar request.'");
        UI.choice1.setText("'Well, will you help me then?'");
        UI.choice2.setText("'So?'");
        UI.choice3.setText("");
        UI.choice4.setText("");

        game.nextPosition1 = "cityHallMagistrateWomanDenial";
        game.nextPosition2 = "cityHallMagistrateWomanDenial";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void cityHallMagistrateWomanDenial() {

        UI.mainTextArea.setText("'The other night I had a woman ask me about a husband she never knew, yesterday I had two young people who weren't expecting a child waking up to an empty crib in a room they couldn't recongnize. And now you.'");
        UI.choice1.setText("'You are opening an investigation, right?'");
        UI.choice2.setText("'Where can I find this woman?'");
        UI.choice3.setText("'What are the whereabouts of the couple?'");
        UI.choice4.setText("");

        game.nextPosition1 = "cityHallMagistrateWomanDenialInvestigation";
        game.nextPosition2 = "cityHallMagistrateWidow";
        game.nextPosition3 = "cityHallMagistrateChildlessCouple";
        game.nextPosition4 = "";
    }

    public void cityHallMagistrateWomanDenialInvestigation() {

        UI.mainTextArea.setText("The Magistrare taps one of the many high stacks of papers on the desk gently. 'Be my guest. I will get to it when I can.' The sight of his tired smile doesn't inspire any hope that your little mistery will be solved any time soon.");
        UI.choice1.setText("Filling out the form wouldn't hurt. <i>You</i> have no reason to doubt authority, right?");
        UI.choice2.setText("'Where can I find this woman'");
        UI.choice3.setText("'What are the whereabouts of the couple?'");
        UI.choice4.setText("");

        game.nextPosition1 = "cityHallMagistrateWomanDenialInvestigationForm";
        game.nextPosition2 = "cityHallMagistrateWidow";
        game.nextPosition3 = "cityHallMagistrateChildlessCouple";
        game.nextPosition4 = "";
    }

    public void cityHallMagistrateWomanDenialInvestigationForm() {

        UI.mainTextArea.setText("It takes you a notable amount of time and some blood, sweat and tears, but have finally made it. The man sitting opposite you adds the report to the towering pile and looks at you expectingly.");
        UI.choice1.setText("Filling out the form wouldn't hurt. <i>You</i> have no reason to doubt authority, right?");
        UI.choice2.setText("'Where can I find this woman?'");
        UI.choice3.setText("'What are the whereabouts of the couple?'");
        UI.choice4.setText("");

        game.nextPosition1 = "cityHallMagistrateWomanDenialInvestigationForm";
        game.nextPosition2 = "cityHallMagistrateWidow";
        game.nextPosition3 = "cityHallMagistrateChildlessCouple";
        game.nextPosition4 = "";
    }

    public void cityHallMagistrateBanishment() {

        UI.mainTextArea.setText("A barely audible click is heard. Soon, two guards come hurdling in and drag you out of the City Hall. Perhaps a different approach was in order?");
        UI.choice1.setText("...");
        UI.choice2.setText("...");
        UI.choice3.setText("...");
        UI.choice4.setText("...");

        game.nextPosition1 = "cityStreets";
        game.nextPosition2 = "cityStreets";
        game.nextPosition3 = "cityStreets";
        game.nextPosition4 = "cityStreets";

    }

    public void cityStreets() {

        UI.mainTextArea.setText("I find myself in the city streets. The stillness of the air is interrupted by the occasional shout of an eager salesman.");

        UI.choice1.setText("Go to the pub");
        UI.choice2.setText("To the garrisons, immediately.");
        UI.choice3.setText("I am simply not there");
        UI.choice4.setText("Having pink nightmares");

        game.nextPosition1 = "cityStreets";
        game.nextPosition2 = "cityStreets";
        game.nextPosition3 = "cityStreets";
        game.nextPosition4 = "cityStreets";

    }

    public void home() {

        UI.mainTextArea.setText("Home, sweet home!");
        UI.choice1.setText("I'm feeling hungry. Perhaps a snack is in order?");
        UI.choice2.setText("A search through my home may surface some proof of this woman's existence");
        UI.choice3.setText("Take a long look at my comfortable bed, lock the door, and head outside");
        UI.choice4.setText("");
        game.nextPosition1 = "homeSnack";
        game.nextPosition2 = "homeSearch";
        game.nextPosition3 = "homeOutside"; // Сега, не съм сигурен дали трябва да слагам твърде много междинни точки, ама кот такоа. Ще ги чертая по-дълги, баце
        game.nextPosition4 = "west";

    }
// Веско, въпрос: Има ли вселена, в която може да прегледаш набързо това видео и все пак ми кажеш как евентуално да вкарам това видео. Линкът е следният - https://www.youtube.com/watch?v=-BBC_tJkD_E&list=PL_QPQmz5C6WVDAle3owLhbI-YhXXAwD3n&index=14&t=434s . Ако не стане, може просто леко да преработя правилата и ще сме ок, но трябва да знам. Благодаря ти предварително

    public void library() {

        UI.mainTextArea.setText("The Librarian is not the one that would help me find the one. Or anyone for that matter. His knowledge of monsters, however, is immense. Perhaps he can tell me who did this to he woman in question");
        player.currentWeapon = new LongswordWeapon();
        UI.weaponLabelName.setText(player.currentWeapon.name);
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
        UI.mainTextArea.setText("The Librarian. A dirty creature with missing teeth and clothes soaked in filth. He mumbles something through his rancid breath.");
        UI.choice1.setText("'Greetings, Librarian. I have an inquiry to make'");
        UI.choice2.setText("'I have to go, never mind.'");
        UI.choice3.setText("");
        UI.choice4.setText("");

        game.nextPosition1 = "libraryInquiry";
        game.nextPosition2 = "library";
        game.nextPosition3 = "";
        game.nextPosition4 = "";

    }

    public void libraryInquiry() {
        UI.mainTextArea.setText("'Aha, I know you...' A flurry of incomprehensible words follows as you hold back your disgust. After you wipe your face from the man's repulsive spit, you brace yourself for another question.");
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
        UI.mainTextArea.setText("The hobo's gaze brightens upon reaching the realization you intend on staying in here for a little while. You make the unsettling revelation that the skin on his face shifts as if something underneath it has just started shifting around. His orifce slowly expands and starts to belch out some suprisingly sophisticated words.");
        UI.choice1.setText("Stay awhile and listen for a little longer. He might say something of use.");
        UI.choice2.setText("Enough of this. I need something and I cannot afford to listen any more of this creature's ramblings...");
        UI.choice3.setText("Draw your hidden sheath. This ought to make him shut up");
        UI.choice4.setText("");

        game.nextPosition1 = "libraryLostContinuation";
        game.nextPosition2 = "libraryLost";
        game.nextPosition3 = "libraryTreat";
        game.nextPosition4 = "";

    }

    public void libraryLostContinuation() {
        UI.mainTextArea.setText("There is, of course, nothing of value to be heard. You have just lost 30 minutes of your precious remaining time on the Continent listening to this nonsense. Great...");
        UI.choice1.setText("'As I was saying, I need some information. About a monster I'm hunting. Help me find it.");
        UI.choice2.setText("Enough of this. I need something and I cannot afford to listen any more of this creature's ramblings...");
        UI.choice3.setText("'I have to go, never mind.'");
        UI.choice4.setText("");

        game.nextPosition1 = "libraryInquiry";
        game.nextPosition2 = "libraryLost";
        game.nextPosition3 = "library";
        game.nextPosition4 = "";

    }

    public void libraryTreat() {
        UI.mainTextArea.setText("A justified bewildered reaction quickly takes over his grimace. This ought to make his answers more comprehensible.");
        UI.choice1.setText("'Now, listen to me carefully and answer briefly if want to live.'");
        UI.choice2.setText("'I am aware it is forbidden. I am partly responsible for the ban on pointy metal rods. Now tell me what I want to hear'");
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
        UI.choice2.setText("'I am aware my approach was a little confrontational, but I really need answers from you. Now.'");
        UI.choice3.setText("Loosen your grip and get out of this place");
        UI.choice4.setText("");

        game.nextPosition1 = "libraryGutting";
        game.nextPosition2 = "libraryFalseRemorse";
        game.nextPosition3 = "libraryTreatDeparture";
        game.nextPosition4 = "";

    }

    public void libraryGutting() {
        UI.mainTextArea.setText("You unsheathe your weapon and slice the man's throat. You press your hands on the wound and let him drown in his own blood. Afterwards, you let his lifeless corpse drop to the ground while his hands lay soaked in his blood(Honestly, I need some feedback here. Do I make this a game over screen or try to squeeze out a little storyline out of him?)");
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
        UI.choice2.setText("Leave him be. The library's doors will be closed for you from now on, but you can at least live knowing you aren't getting pursued by the law.");
        UI.choice3.setText("");
        UI.choice4.setText("");

        game.nextPosition1 = "lose";
        game.nextPosition2 = "cityStreets";
        game.nextPosition3 = "";
        game.nextPosition4 = "";

    }

    public void libraryTreatDeparture() {
        UI.mainTextArea.setText("He won't budge. I didn't want to visit him anyways<From now on, you will not be able to gain access to the secrets the Library might offer>");
        UI.choice1.setText("Go out on the streets");
        UI.choice2.setText("Head home");
        UI.choice3.setText("Pay a visit to the pub");
        UI.choice4.setText("Visit the Town Hall");

        game.nextPosition1 = "cityStreets";
        game.nextPosition2 = "home";
        game.nextPosition3 = "pub";
        game.nextPosition4 = "cityHall";

    }

    public void blacksmith() {

        UI.mainTextArea.setText("The furnace in his shop radiates a pleseant heat. When he sees you approaching, the owner stops for a second and greets you. 'What is that you want, friend?'");
        UI.choice1.setText("'That chestplate over there.'");
        UI.choice2.setText("'One of your finest helmets, please.'");
        UI.choice3.setText("'A pair of shoes is in order today.'");
        UI.choice4.setText("'Nothing yet. Thank you for asking.'");
        game.nextPosition1 = "homeSnack";
        game.nextPosition2 = "homeSearch";
        game.nextPosition3 = "homeOutside"; // Сега, не съм сигурен дали трябва да слагам твърде много междинни точки, ама кот такоа. Ще ги чертая по-дълги, баце
        game.nextPosition4 = "west";

    }

    public void goblinCombat() {
        //  int i = new java.util.Random().nextInt(100) + 1;

        //     if (i < 90) {
        //        monster = new MonsterGoblin();
        //    } else {
        //        monster = new MonsterLamya();
        //   }
        monster = new MonsterGoblin();
        UI.mainTextArea.setText("You have entered combat with the goblin");
        UI.choice1.setText("Strike it down with your mighty weapon");
        UI.choice2.setText("Retreat like a lowly coward");
        UI.choice3.setText("");
        UI.choice4.setText("");

        game.nextPosition1 = "playerAttack";
        game.nextPosition2 = "west";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void alternativeRangerCombat() {
        monster = new MonsterAlternativeRanger();
        UI.mainTextArea.setText("It was unwise to anger the Ranger. Kill him before his arrows wear you down.");
        UI.choice1.setText("Attack him while you have the advantage");
        UI.choice2.setText("Try to escape combat");
        UI.choice3.setText("");
        UI.choice4.setText("");

        game.nextPosition1 = "playerAttack";
        game.nextPosition2 = "attemptedEscape";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void alternativeMonkCombat() {

        monster = new MonsterAlternativeMonk();
        UI.mainTextArea.setText("You managed to agitate the tranquil monk. Prepare to face the futy of his fists");
        UI.choice1.setText("You can see his hesitation. Attempt to defeat him now, while you still have a fighting chance.");
        UI.choice2.setText("Try to escape combat");
        UI.choice3.setText("");
        UI.choice4.setText("");

        game.nextPosition1 = "playerAttack";
        game.nextPosition2 = "attemptedEscape";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void alternativePaladinCombat() {

        monster = new MonsterAlternativePaladin();
        UI.mainTextArea.setText("The migthy Paladin is not someone who you'd want as your enemy. Brace yourself and get ready to fight fro your life.");
        UI.choice1.setText("His defenses are down. Take the chance to take the initiative now.");
        UI.choice2.setText("Try to escape combat");
        UI.choice3.setText("");
        UI.choice4.setText("");

        game.nextPosition1 = "playerAttack";
        game.nextPosition2 = "attemptedEscape";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void alternativeMageCombat() {
        monster = new MonsterAlternativeMage();
        UI.mainTextArea.setText("Mages are few and far between. Even if you manage to strike this one down, his brethren will eventually find you and hunt you down.");
        UI.choice1.setText("You can see an opening to strike. Attack him now while you still have time!");
        UI.choice2.setText("Try to escape combat");
        UI.choice3.setText("");
        UI.choice4.setText("");

        game.nextPosition1 = "playerAttack";
        game.nextPosition2 = "attemptedEscape";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void playerAttack() {
        int playerDamage = new java.util.Random().nextInt(player.currentWeapon.damage); // Inflicts damage based on the weapon stats. It is of note that if the damage is 12, the actual damage will be 0 to 11
        UI.mainTextArea.setText("You attacked the " + monster.name + " and inflicted " + playerDamage + " damage!");
        monster.hp -= playerDamage;
        UI.choice1.setText("Your turn to suffer!");
        UI.choice2.setText("");
        UI.choice3.setText("");
        UI.choice4.setText("");

        if (monster.hp > 0) {
            game.nextPosition1 = "monsterAttack";
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

    public void monsterAttack() {
        int monsterDamage = new java.util.Random().nextInt(monster.attack);
        UI.mainTextArea.setText(monster.attackMessage + "You received " + monsterDamage + " damage!");
        player.hp -= monsterDamage;
        UI.hpLabelNumber.setText("" + player.hp);
        UI.choice1.setText("Your turn to srtike!");
        UI.choice2.setText("");
        UI.choice3.setText("");
        UI.choice4.setText("");
        if (player.hp > 0) {
            game.nextPosition1 = "goblinCombat";
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

        UI.mainTextArea.setText("The beast has been slain, and everyone killed by it was avenged. You obtained a silver ring.");
        UI.choice1.setText("Start over?");
        UI.choice2.setText("Exit game?");
        UI.choice3.setText("");
        UI.choice4.setText("");
        UI.choice3.setVisible(false);
        UI.choice4.setVisible(false);

        game.nextPosition1 = "wakeUpHut";
        game.nextPosition2 = "exitProgram";
        game.nextPosition3 = "";
        game.nextPosition4 = "";

    }
//Do you have any clue how I can make italic letters? Cause the HTML cases are of no use

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

    public void exitProgram() {
        System.exit(0); // have no idea how to exit yet
    }

    public void toTitleScreen() {
        defaultSetup();
        vm.showTitleScreen();
    }

}
