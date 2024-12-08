package hust.soict.dsai.test.store;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
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
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);

        // Display items in store
        store.displayStore();

        // Test removing a DVD
        store.removeMedia(dvd2);

        // Display items in store after removal
        store.displayStore();

        // Try removing a non-existing DVD
        store.removeMedia(dvd2);
    }
}