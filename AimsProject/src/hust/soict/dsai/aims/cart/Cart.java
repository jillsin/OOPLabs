package hust.soict.dsai.aims.cart;

import java.util.ArrayList;
import java.util.Collections;

import hust.soict.dsai.aims.media.Media;


public class Cart {

    private ArrayList<Media> itemsOrdered = new ArrayList<>();

    int number = 0;

    public void addMedia(Media media) {
        if (number < 20) {
            number += 1;
            itemsOrdered.add(media);
            System.out.println("The disc has been added");
        } else {
            System.out.println("The cart is almost full");
        }
    }

    public void removeMedia(Media media)  {

        for (Media d : itemsOrdered) {
            if (d.getTitle().equals(media.getTitle())) {
                itemsOrdered.remove(d);
                System.out.println("The disc has been removed");
                number -= 1;
            } else {
                System.out.println("Cant find the disc");
            }
        }
    }

    public float totalCost() {
        float sum = 0;
        for (Media d : itemsOrdered) {
            sum += d.getCost();
        }
        return sum;
    }
    // public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
    // if(itemsOrdered.size()==20){
    // System.out.println("The cart is almost full");

    // }
    // else{
    // for (DigitalVideoDisc dvd : dvdList) {

    // itemsOrdered.add(dvd);
    // System.out.println("The disc has been added");
    // if(itemsOrdered.size()==20){
    // System.out.println("The cart is almost full");
    // break;
    // }
    // }
    // }
    // }
    // public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {

    //     for (DigitalVideoDisc D : dvdList) {
    //         itemsOrdered.add(D);
    //         System.out.println("The disc has been added");
    //         if (itemsOrdered.size() == 20) {
    //             System.out.println("The cart is full");
    //             break;
    //         }
    //     }
    //     if (itemsOrdered.size() == 20) {
    //         System.out.println("The cart is full");
    //     }
    // }

    // public void addDigitalVideoDisc(DigitalVideoDisc d1, DigitalVideoDisc d2) {
    //     if (itemsOrdered.size() + 2 <= 20) {
    //         itemsOrdered.add(d1);
    //         System.out.println("The disc has been added");
    //         itemsOrdered.add(d2);
    //         System.out.println("The disc has been added");
    //     } else if (itemsOrdered.size() == 19) {
    //         itemsOrdered.add(d1);
    //         System.out.println("The disc has been added");
    //     }
    //     if (itemsOrdered.size() == 20) {
    //         System.out.println("The cart is full");
    //     }
    // }

    public void print() {
        System.out.println("***********************CART*********************** ");
        System.out.println("Ordered Items:  ");
        int i = 1;
        for (Media item : itemsOrdered) {

            System.out.println(i + "." + item.toString());
        }

        System.out.println("Total cost :" + this.totalCost());
        System.out.println("*************************************************** ");

    }

    public void searchById(int id) {
        boolean found = false;
        for (Media item : itemsOrdered) {
            if (id == item.getId()) {
                System.out.println("Dvd  found :" + item.toString());
                found = true;
                break;
            }

        }
        if (!found) {
            System.out.println("Dvd not found");
        }

    }
    public void sortCartCostTitle() {
    	Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
    }
    
    public void sortCartTitleCost() {
    	Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
    }

    public void searchByTitle(String title){
        boolean found = false;
        for(Media item : itemsOrdered){
            if(title == item.getTitle()){
                System.out.println("DVD found :"+item.toString());
                found = true;
                break;
            }
           
    } if(!found){
                System.out.println("Dvd not found");
            }
        }
        public Media takeByTitle(String title) {
            boolean found = false;
            for (int i = 0; i < itemsOrdered.size(); i++) {
                if (itemsOrdered.get(i).getTitle().equals(title)) {
                    System.out.println("Media found: " + itemsOrdered.get(i).toString());
                    found = true;
                    return itemsOrdered.get(i);
                }
            }
    
            if (!found) {
                System.out.println("No Media found with title: " + title);
            }
            return null;
        }
	public ArrayList<Media> getItemsOrdered() {
		return itemsOrdered;
	}
    public void clear() {
		this.itemsOrdered = new ArrayList<Media>();
	}

    
}