import java.io.*;
import java.util.Scanner;

public class Bag {
    Item item = new Item();
    public void showItem() {
        item.showWeapon();
        item.showPotion();
    } 
    public void potion() {
        item.decreasePotion();
        System.out.println("your potion is "+ item.now_potion());
    }   
}