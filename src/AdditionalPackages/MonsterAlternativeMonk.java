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
public class MonsterAlternativeMonk  extends Monster{
        public MonsterAlternativeMonk() {
        name = "The Monk";
        hp = 60;
        attack = 10;
        attackMessage = "Her iron fists feel as if they are punching a hole through your chest.";
        // I don't know if a combat with multiple enemies would be possible. Most likely not
    }
}
