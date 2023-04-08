/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textadventureprototype;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Algorithms.AdventureGameGraph;

public class TextAdventurePrototype {

    ChoiceHandler cHandler = new ChoiceHandler(); // instantiating the Choice handler
    TextAdventurePrototypeUI UI = new TextAdventurePrototypeUI();
    VisibilityManager vm = new VisibilityManager(UI);
    Story story = new Story(this, vm, UI); // the this keyword points to the class in question
    String nextPosition1, nextPosition2, nextPosition3, nextPosition4;
    AdventureGameGraph graph = new AdventureGameGraph();
    String message = graph.dijkstra("wakeUpHut", "monster");

    public static void main(String[] args) {
        new TextAdventurePrototype();
    }

    public TextAdventurePrototype() { //constructor
        UI.CreateUI(cHandler, message);
        story.defaultSetup();
        vm.showTitleScreen();
    }

    public class ChoiceHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            String yourChoice = event.getActionCommand();

            switch (yourChoice) {
                case "Exit":
                    System.exit(0);
                    break;
                case "Start":
                    vm.showHutTitle();
                    story.wakeUpHut();
                    break;
                case "c1":
                    story.selectPosition(nextPosition1); // selects the position indicated by the player's choices
                    break;
                case "c2":
                    story.selectPosition(nextPosition2);
                    break;
                case "c3":
                    story.selectPosition(nextPosition3);
                    break;
                case "c4":
                    story.selectPosition(nextPosition4);
                    break;
            }
        }
    }
}
