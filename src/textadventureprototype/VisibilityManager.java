/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textadventureprototype;

/**
 * This class is supposed to establish the connection between the
 * TextAdventurePrototype and the UI class
 *
 * @author Valeri
 */
public class VisibilityManager {

    TextAdventurePrototypeUI UI;

    public VisibilityManager(TextAdventurePrototypeUI userInterface) {
        UI = userInterface;
    }

    public void showTitleScreen() {
        //whenever I want to display the title screen, I need to call this method
        UI.titleNamePanel.setVisible(true);
        UI.startButtonPanel.setVisible(true);
        //hide the panels
        UI.mainTextPanel.setVisible(false);
        UI.choiceButtonPanel.setVisible(false);
        UI.playerPanel.setVisible(false);
    }

    public void showHutTitle() {
        //whenever I want to display the title screen, I need to call this method
        UI.titleNamePanel.setVisible(false);
        UI.startButtonPanel.setVisible(false);
        //hide the panels
        UI.mainTextPanel.setVisible(true);
        UI.choiceButtonPanel.setVisible(true);
        UI.playerPanel.setVisible(true);
    }
}
