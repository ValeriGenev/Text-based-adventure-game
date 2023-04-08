/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdditionalPackages;

/**
 *
 * @author Valeri
 */
public class MonsterAlternativeMage extends Monster {

    public MonsterAlternativeMage() {
        name = "The Mage";
        hp = 50;
        attack = 30;
        attackMessage = "She readies her staff and hurls a fireball at you";
        // If I have some more time, I can try to have multiple attack messages and/or different attacks
    }
}
