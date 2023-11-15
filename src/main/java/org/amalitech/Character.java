package org.amalitech;

import java.util.ArrayList;
import java.util.List;

public class Character {
    String name;
    private int health_points;
    private int attack_point;
    private int defend_point;
    public static boolean defense = false;
    private List<Item> inventory;

    public Character(String name, int health_points, int attack_point, int defend_point) {
        this.attack_point = attack_point;
        this.defend_point = defend_point;
        this.health_points = health_points;
        this.name = name;

        inventory = new ArrayList<>();
    }

//        Character createCharacter() {
//            System.out.println("Enter your character's name: ");
//            cH = input.next;
//
//        }

    public void attackTargetD (Character cht){
        if (!defense) {
            int nHp = (cht.defend_point - attack_point);
            cht.health_points -= nHp;
            System.out.println("You have attacked " + cht.name + ", now with Health points: " + cht.health_points);
        } else
            cht.health_points -= attack_point;
        System.out.println("Attacked "+ cht.name + " now with Health points: "+ cht.health_points);

    }
    public void defendAttack () {
        defense = true;
    }
    public void noDefense () {
        defense = false;
    }

//        int getAp(int newAp) {
//            Ap = newAp;
//            return newAp;
//        }
//
//        int getDp(int newDp) {
//            Dp = newDp;
//            return newDp;
//        }
//
//        int getHp(int newHp) {
//            Hp += newHp;
//            return newHp;
//        }

    public void add_item (Item item){
        inventory.add(item);
        System.out.println();
    }
    public void remove_item (String itemName){
        inventory.removeIf(item -> item.name.equals(itemName));
        System.out.println(name + " removed " + itemName + " from the inventory.");
    }

    public void list_items () {
        System.out.println(name + "'s Inventory:");
        for (Item item : inventory) {
            System.out.println(item.name + " - " + item.description);
        }
    }

}
