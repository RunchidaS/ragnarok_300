public class Gun extends Item{

    public Gun(){
        Detail ="if you use Gun , when you attack , your exp add 40 and your mana add 10" ;
        Damage = 80;

    }

    public void showDetail() {
        System.out.println(Detail);
        System.out.println("Damage is "+Damage);
        System.out.println("------------------------------------");
    }   
    
}