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
    public class MonsterAlternativePaladin  extends Monster{
        public MonsterAlternativePaladin() {
        name = "The Paladin";
        hp = 120;
        attack = 60;
        attackMessage = "He swings the hammer with remarkable grace and hurls it in, unfortunately, your direction.";
        // Or I am wondering whether it would be possible to even do more than one attack
    }
}