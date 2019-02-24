import java.io.*;
import java.util.Scanner;

public class Bag {
    Item item = new Item();
    Sword s1 = new Sword();
    Bow s2 = new Bow();
    Gun s3 = new Gun();
  
    public void showItem() {
        item.showWeapon();
        item.showPotion();
    } 
    public void potion() {
        item.decreasePotion();
        System.out.println("your potion is "+ item.now_potion());
    }   
}