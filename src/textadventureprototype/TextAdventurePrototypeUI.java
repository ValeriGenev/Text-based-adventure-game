package textadventureprototype;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import textadventureprototype.TextAdventurePrototype.ChoiceHandler;

/**
 *
 * @author Valeri
 */
public class TextAdventurePrototypeUI {

    JFrame window;
    Container cont;
    JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel, graphPanel;
    JLabel titleNameLabel, hpLabel, hpLabelNumber, weaponLabel, weaponLabelName, strengthLabel, strengthLabelNumber,
            intelligenceLabel, intelligenceLabelName, dexterityLabel, dexterityLabelName, charismaLabel,
            charismaLabelName, graphLabel, graphLabelName;
    Font titleFont = new Font("Calibri(Body)", Font.PLAIN, 90);// setting a font for the title screen
    Font buttonFont = new Font("Calibri(Body)", Font.PLAIN, 15);
    JButton startButton, exitButton, choice1, choice2, choice3, choice4;
    JTextArea mainTextArea;
    int playerHP, enemyHP, playerDamage, enemyDamage, strength;
    String weapon, position;

    public void CreateUI(ChoiceHandler cHandler, String message) {

        window = new JFrame();
        window.setSize(1920, 1080); // setting the size of the screen
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // making the screen closable
        window.getContentPane().setBackground(Color.BLACK);// setting the color of the window
        window.setLayout(null);// disables the default layout; Opens up the possibility for a custom one
        window.setVisible(true); // makes the thing visible
        cont = window.getContentPane();

        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(250, 100, 850, 175);// place a panel that displays the name of the title
        titleNamePanel.setBackground(Color.BLACK);
        titleNameLabel = new JLabel("ADVENTURE GAME");
        titleNameLabel.setForeground(Color.WHITE);
        titleNameLabel.setFont(titleFont);

        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(400, 300, 500, 300);
        startButtonPanel.setBackground(Color.black);

        startButton = new JButton("Start your adventure");
        startButton.setBackground(Color.black);
        startButton.setBackground(Color.white);
        startButton.setForeground(new Color(0, 100, 0));
        startButton.setFont(buttonFont);
        startButton.setFocusPainted(false); // removes any redundant lines in the button
        startButton.setBorder(null);
        startButton.addActionListener(cHandler);
        startButton.setActionCommand("Start");

        exitButton = new JButton("Exit the game"); // Чудя се дали да не го добавя в отделен панел, ала нейсе
        exitButton.setBackground(Color.black);
        exitButton.setBackground(Color.white);
        exitButton.setForeground(new Color(0, 100, 0));
        exitButton.setFont(buttonFont);
        exitButton.setFocusPainted(false); // removes any redundant lines in the button
        exitButton.setBorder(null);
        exitButton.addActionListener(cHandler);
        exitButton.setActionCommand("Exit");

        titleNamePanel.add(titleNameLabel);// Puts the label in the magenta(currently) panel
        startButtonPanel.add(startButton); // Puts the start button itself on the panel
        startButtonPanel.add(exitButton);
        cont.add(titleNamePanel);// creates a base on which I can place a panel
        cont.add(startButtonPanel);// places the start button panel on the screeen
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100, 100, 1050, 120);
        mainTextPanel.setBackground(Color.BLACK);
        cont.add(mainTextPanel);

        mainTextArea = new JTextArea("This is the main text area");
        mainTextArea.setBounds(100, 100, 1050, 120);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(buttonFont);
        mainTextArea.setLineWrap(true); // Automatically formats longer text
        mainTextPanel.add(mainTextArea);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250, 250, 800, 250);
        choiceButtonPanel.setBackground(Color.BLACK);
        choiceButtonPanel.setLayout(new GridLayout(4, 1));
        cont.add(choiceButtonPanel);

        choice1 = new JButton("PLEASE");
        choice1.setBackground(Color.black);
        choice1.setBackground(Color.white);
        choice1.setFont(buttonFont);
        choice1.setForeground(new Color(0, 100, 0));
        choice1.setFocusPainted(false);
        choice1.addActionListener(cHandler);
        choice1.setActionCommand("c1"); // The result will be the same regardless of the button pressed if this line
                                        // wasn't typed in
        choiceButtonPanel.add(choice1);

        choice2 = new JButton("I BEG OF YOU");
        choice2.setBackground(Color.black);
        choice2.setBackground(Color.white);
        choice2.setForeground(new Color(0, 100, 0));
        choice2.setFont(buttonFont);
        choice2.setFocusPainted(false);
        choice2.addActionListener(cHandler);
        choice2.setActionCommand("c2"); // The result will be the same regardless of the button pressed if this line
                                        // wasn't typed in
        choiceButtonPanel.add(choice2);

        choice3 = new JButton("END MY SUFFERING");
        choice3.setBackground(Color.black);
        choice3.setBackground(Color.white);
        choice3.setFont(buttonFont);
        choice3.setForeground(new Color(0, 100, 0));
        choice3.setFocusPainted(false);
        choice3.addActionListener(cHandler);
        choice3.setActionCommand("c3"); // The result will be the same regardless of the button pressed if this line
                                        // wasn't typed in
        choiceButtonPanel.add(choice3);

        choice4 = new JButton("STRANGER");
        choice4.setBackground(Color.black);
        choice4.setBackground(Color.white);
        choice4.setFont(buttonFont);
        choice4.setForeground(new Color(0, 100, 0));
        choice4.setFocusPainted(false);
        choice4.addActionListener(cHandler);
        choice4.setActionCommand("c4"); // The result will be the same regardless of the button pressed if this line
                                        // wasn't typed in
        choiceButtonPanel.add(choice4);

        playerPanel = new JPanel();
        playerPanel.setBounds(100, 10, 1050, 150);
        playerPanel.setBackground(Color.black);
        playerPanel.setLayout(new GridLayout(1, 4));
        cont.add(playerPanel);

        hpLabel = new JLabel("HP: ");
        hpLabel.setFont(buttonFont);
        hpLabel.setForeground(new Color(0, 100, 0));
        playerPanel.add(hpLabel);

        hpLabelNumber = new JLabel();
        hpLabelNumber.setFont(buttonFont);
        hpLabelNumber.setForeground(new Color(0, 100, 0));
        playerPanel.add(hpLabelNumber);

        strengthLabel = new JLabel("Strength: "); // strengthLabel
        strengthLabel.setFont(buttonFont);
        strengthLabel.setForeground(new Color(0, 100, 0));
        playerPanel.add(strengthLabel);

        strengthLabelNumber = new JLabel();
        strengthLabelNumber.setFont(buttonFont);
        strengthLabelNumber.setForeground(new Color(0, 100, 0));
        playerPanel.add(strengthLabelNumber);

        weaponLabel = new JLabel("Weapon: ");
        weaponLabel.setFont(buttonFont);
        weaponLabel.setForeground(new Color(0, 100, 0));
        playerPanel.add(weaponLabel);

        weaponLabelName = new JLabel();
        weaponLabelName.setFont(buttonFont);
        weaponLabelName.setForeground(new Color(0, 100, 0));
        playerPanel.add(weaponLabelName);

        intelligenceLabel = new JLabel("Intelligence: ");
        intelligenceLabel.setFont(buttonFont);
        intelligenceLabel.setForeground(new Color(0, 100, 0));
        playerPanel.add(intelligenceLabel);

        intelligenceLabelName = new JLabel();
        intelligenceLabelName.setFont(buttonFont);
        intelligenceLabelName.setForeground(new Color(0, 100, 0));
        playerPanel.add(intelligenceLabelName);

        dexterityLabel = new JLabel("Dexterity: ");
        dexterityLabel.setFont(buttonFont);
        dexterityLabel.setForeground(new Color(0, 100, 0));
        playerPanel.add(dexterityLabel);

        dexterityLabelName = new JLabel();
        dexterityLabelName.setFont(buttonFont);
        dexterityLabelName.setForeground(new Color(0, 100, 0));
        playerPanel.add(dexterityLabelName);

        charismaLabel = new JLabel("Charisma: ");
        charismaLabel.setFont(buttonFont);
        charismaLabel.setForeground(new Color(0, 100, 0));
        playerPanel.add(charismaLabel);

        charismaLabelName = new JLabel();
        charismaLabelName.setFont(buttonFont);
        charismaLabelName.setForeground(new Color(0, 100, 0));
        playerPanel.add(charismaLabelName);

        graphPanel = new JPanel();
        graphPanel.setBounds(250, 500, 800, 250);// place a panel that displays the name of the graph
        graphPanel.setBackground(Color.BLACK);
        graphLabel = new JLabel(message);
        graphLabel.setForeground(Color.WHITE);
        graphLabel.setFont(buttonFont);
        graphPanel.add(graphLabel);
        cont.add(graphPanel);
    }

}
