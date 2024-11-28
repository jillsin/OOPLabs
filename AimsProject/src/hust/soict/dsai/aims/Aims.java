package hust.soict.dsai.aims;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
public class Aims {

    public static void main(String[] args){
        //TODO to auto_generate method 
        Cart anOrder = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("the lion king","animation",88);

        anOrder.addDigitalVideoDisc(dvd1);
        
        DigitalVideoDisc dvd2= new DigitalVideoDisc("Star war","fightting",56);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Spiderman","hero",112);
        anOrder.addDigitalVideoDisc(dvd3);

        System.out.println("The total cost is " + anOrder.totalCost());

        anOrder.removeDigitalVideoDisc(dvd1);
        
    }

}
