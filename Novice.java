import java.io.*;
import java.util.Scanner;

public class Novice {
	private int exp = 0;
	private int hp = 500;
	private int mana= 300;
	private int level = 1;
	private String name;
	private int money = 1000;
	Bag b1 =new Bag();

	// Thief n1 = new Thief();
	// Archer n2 = new Archer();

	public void showAllItem() {
		b1.showItem();
	}
	// public int countPotion() {
	// 	return b1.potion();
	// }
	
	public int yourHP() {
		return hp;
	}
	public int yourMana(){
		return mana;
	}
	public int yourLevel() {
		return level;
	}
	public void attack() {
	  	hp = hp-100;
	  	exp = exp+500;
		money = money+100;
		mana = mana-15;
	}
	public void potion() {
	  	hp = hp+40;
		mana = mana+30;
	}
	public void upLevel() {
	  	if(exp>1000) {
	  		level = level+1;
	  	}
	}
	public void useSword(){
		exp = exp+50;
		mana = mana+20;
	}
	public void useBow(){
		exp = exp+30;
		mana = mana+15;
	}
	public void useGun(){
		exp = exp+40;
		mana = mana+10;
	}
	public void useHPpotion(){
		hp = hp+150;
		b1.potion();
	}
	public void useManapotion(){
		mana = mana+100;
		b1.potion();
	}
	public void showValue(){
		System.out.println("------------------------------------");
		System.out.println("your hp is "+hp);
		System.out.println("your mana is "+mana);
		System.out.println("your exp is "+exp);
		System.out.println("your level is "+level);
		System.out.println("your money is "+money+"coins");
		System.out.println("------------------------------------");
	}	
}