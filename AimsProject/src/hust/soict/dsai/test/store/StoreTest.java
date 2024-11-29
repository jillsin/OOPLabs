package hust.soict.dsai.test.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        // Create a new store
        Store store = new Store();

        // Create some DVD objects
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("the lion king","animation",88);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star war","fightting",56);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Spiderman","hero",112);

        // Test adding DVDs
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);

        // Display items in store
        store.displayStore();

        // Test removing a DVD
        store.removeDVD(dvd2);

        // Display items in store after removal
        store.displayStore();

        // Try removing a non-existing DVD
        store.removeDVD(dvd2);
    }
}