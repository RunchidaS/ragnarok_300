import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Novice newnovice = new Novice();
		String yourname;
		int weapon;
		int answer;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name :  ");
		yourname = scan.next();

		newnovice.showValue();
		newnovice.b1.item.addPotion();
		newnovice.b1.item.addWeapon();
		
		System.out.println("your items : ");
		newnovice.showAllItem();	

		System.out.println("------------------------------------");
		System.out.println("What weapon you want to use? (1=sword/2=bow/3=gun) : ");
				weapon = scan.nextInt();
		 			if(weapon==1)
		 				newnovice.useSword();
		 			else if(weapon==2)
		 				newnovice.useBow();
		 			else if(weapon==3)
		 				newnovice.useGun();
		
		while(newnovice.yourHP() >= 0) {
			System.out.println("Let's attack? (press 1 to attack)");
			answer = scan.nextInt();
			if(answer==1 ) {
				newnovice.attack();				
		 		newnovice.upLevel();
			}						
		}
		System.out.println("****YOU DIE****");

	while(newnovice.yourHP() <= 0 || newnovice.yourMana() <= 0) {
		System.out.println("Do you want to drink a potion for revive? (1=HP potion/2=mana potion/3=no) : ");
		answer = scan.nextInt();
		if(answer==1)
			newnovice.useHPpotion();			
		else if(answer==2)
			newnovice.useManapotion();
		else if(answer==3) break;			
	}
	newnovice.showValue();
	}
}