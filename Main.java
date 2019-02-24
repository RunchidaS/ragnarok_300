import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Novice newnovice = new Novice();
		String yourname;
		int weapon;
		int answer;

		// Thief n1 = new Thief();
		// Archer n2 = new Archer();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name :  ");
		yourname = scan.next();

		newnovice.showValue();
		newnovice.b1.item.addPotion();
		newnovice.b1.item.addWeapon();

		while(true){
			System.out.println("Do you want to do? (press 1 to attack / press 2 to show bag / press 3 to exit)");	
			answer = scan.nextInt();
			if(answer==1 ) {
				System.out.println("------------------------------------");
				System.out.println("What weapon you want to use? (1=sword/2=bow/3=gun) : ");
						weapon = scan.nextInt();
							if(weapon==1){
								newnovice.useSword();
								newnovice.b1.s1.showDetail();
							}				

							else if(weapon==2){
								newnovice.useBow();
							 	newnovice.b1.s2.showDetail();
							}								

							else if(weapon==3){
								newnovice.useGun();
								newnovice.b1.s3.showDetail();
							}
								

				
				while(newnovice.yourHP() >= 0) {
					System.out.println("Let's attack? (press 1 to attack / press 2 to stop)");
					answer = scan.nextInt();
					if(answer==1 ) {
						newnovice.attack();				
						 newnovice.upLevel();
						 newnovice.showValue();

						 if(newnovice.yourLevel()==3) {
							System.out.println("_______You can choose your Job_______");
							System.out.println("1.Thief \n2.Archer");
							answer = scan.nextInt();
							// if(answer==1)
							// 	newnovice.n1.showDetailJob();
							// else if(answer==2)
							// 	newnovice.n2.showDetailJob();
						}

					}

					else if(answer==2)
					{
							while(newnovice.yourHP() <= 0 || newnovice.yourMana() <= 0 || newnovice.yourHP() != 0) {
							System.out.println("Do you want to drink a potion for revive? (1=HP potion / 2=mana potion / 3=no) : ");
							answer = scan.nextInt();
							if(answer==1)
								newnovice.useHPpotion();			
							else if(answer==2)
								newnovice.useManapotion();
							else if(answer==3) break;	
							newnovice.showValue();
					}		
					break;					
					}	
				}
			}

			else if(answer==2){
				System.out.println("your items : ");
				newnovice.showAllItem();	
			}

			else if(answer==3){
				newnovice.showValue();
				System.out.println("***END GAME***");
				break;
			}
		}
	}
}


