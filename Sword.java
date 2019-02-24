public class Sword extends Item{

    public Sword(){
        Detail ="if you use Sword , when you attack , your exp add 50 and your mana add 20" ;
        Damage = 100;

    }

    public void showDetail() {
        System.out.println(Detail);
        System.out.println("Damage is "+Damage);
        System.out.println("------------------------------------");
    }

    
    
}