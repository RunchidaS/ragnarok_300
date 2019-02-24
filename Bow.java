/**
 * Bow
 */
public class Bow extends Item{

    public Bow(){
        Detail ="if you use Bow , when you attack , your exp add 30 and your mana add 15" ;
        Damage = 70;

    }

    public void showDetail() {
        System.out.println(Detail);
        System.out.println("Damage is "+Damage);
        System.out.println("------------------------------------");
    }

    
    
}