package org.amalitech;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Character a = new Character("Alien A", 0, 5, 3);
        Character t = new Character("Alien B", 0,7,3);
        a.attackTargetD(t);
        t.defendAttack();
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your character's name: ");
//        Character myCharacter = new Character();
//        ch1.getAp(4);
//        ch1.getDp(5);
//        ch1.getHp(0);
//        System.out.println("Attack = " + ch1.attackTarget(ch1.defendAttack(), ch1));
//        System.out.println("Defend = " + ch1.defendAttack());
    }
}