package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;


public class CartTest {
    public static void main(String[] args) {
        // Create a new cart
        Cart cart = new Cart();
 // Create new DVD objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("the lion king","animation",88);
        cart.addDigitalVideoDisc(dvd1);
       DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star war","fightting",56);
        cart.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Spiderman","hero",112);
        cart.addDigitalVideoDisc(dvd3);

        // Test the print method
        cart.print();
        // To-do: Test the search methods here
        cart.searchBytitle("Star war");
        cart.searchBytitle("aladinn");
        cart.searchById(1);
        cart.searchById(100);
    }
}
