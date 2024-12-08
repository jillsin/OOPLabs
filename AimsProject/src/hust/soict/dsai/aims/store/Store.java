package hust.soict.dsai.aims.store;
import java.util.ArrayList;
import hust.soict.dsai.aims.media.Media;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<>();
    private int itemCount;
    
    public Store() {
        itemsInStore = new ArrayList<>();
       
    }
   
    public void addMedia(Media media) {
        if (media== null) {
            System.out.println("Cannot add null media to the store.");
            return;
        }

        if (itemCount < itemsInStore.size()) {
            itemsInStore.add(media);
            itemCount++;
            System.out.println(media.getTitle() + " has been added to the store.");
        } else {
            System.out.println("The store is full. Cannot add more media.");
        }
    }

    public void removeMedia(Media media) {
        if (media == null) {
            System.out.println("Cannot remove null media from the store.");
            return;
        }

        boolean found = false;
        for (Media m : itemsInStore) {
            if (m.getTitle().equals(media.getTitle())) {
                itemsInStore.remove(itemsInStore.indexOf(m));
                itemCount--;
                System.out.println(media.getTitle() + " has been removed from the store.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(media.getTitle() + " is not found in the store.");
        }
    }
  
    public void displayStore() {
        System.out.println("Items currently in the store:");
        if (itemCount == 0) {
            System.out.println("The store is empty.");
        } else {
        	int i = 1;
            for (Media media : itemsInStore) {
                System.out.println(i + ". "+ media.toString());
                i++;
            }
        }
    }
    public Media searchByTitle(String title) {
        for (Media item : itemsInStore) {
            if (item.getTitle().equals(title)) {  
                System.out.println(item.toString());
                return item;
            }
        }
    
        System.out.println("No item found");
        return null;
    }

	public ArrayList<Media> getItemsInStore() {
		return itemsInStore;
	}
}