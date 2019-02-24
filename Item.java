import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Item {
private int count_potion = 10;

public String Detail;   
public int Damage;


public Item() {
    
}



ArrayList<String> weapon = new ArrayList<String>();
ArrayList<String> potion = new ArrayList<String>();

    public void addWeapon() {
        weapon.add("sword");
        weapon.add("bow");
        weapon.add("gun");
    }
    public void addPotion() {
        potion.add("HP potion");
        potion.add("mana potion");
        
    }
    public void showWeapon() {
        System.out.println("-Weapon-");
        for (int i=0; i<weapon.size();i++) {
            System.out.println(weapon.get(i));

        }
    }
    public void showPotion() {
        System.out.println("-Potion-");
        for (int i = 0; i <potion.size(); i++) {
            System.out.println(potion.get(i));
        }
    }  
    public int decreasePotion() {
        return count_potion = count_potion-1;
    }
    public int now_potion(){
        return count_potion;
    }
}