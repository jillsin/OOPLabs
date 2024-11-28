package mainn;

import java.util.ArrayList;
public class Cart {
   
    private ArrayList<DigitalVideoDisc> itemsOrdered = new ArrayList<>();


    int number = 0;
    
    public void  addDigitalVideoDisc(DigitalVideoDisc disc){
        if(number < 20){
        number+=1;
        itemsOrdered.add(disc);
        System.out.println("The disc has been added");
    }else{
        System.out.println("The cart is almost full");
    }
}
    public void  removeDigitalVideoDisc(DigitalVideoDisc disc){
 
        for (DigitalVideoDisc d : itemsOrdered){
            if(d.getTitle() == disc.getTitle()){
                itemsOrdered.remove(d);
                System.out.println("The disc has been removed");
                number-=1;
            }else{
                System.out.println("Cant find the disc");
            }
        }
    }
    public float totalCost(){
        float sum = 0 ;
        for (DigitalVideoDisc d : itemsOrdered){
            sum += d.getCost();
        }
        return sum;
    }
    // public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
    //     if(itemsOrdered.size()==20){
    //         System.out.println("The cart is almost full");
            
    //     }
    //     else{
    //     for (DigitalVideoDisc dvd : dvdList) {
          
    //         itemsOrdered.add(dvd);
    //         System.out.println("The disc has been added");
    //         if(itemsOrdered.size()==20){
    //             System.out.println("The cart is almost full");
    //             break;
    //         }
    //     }
    // }
    // }
    public void addDigitalVideoDisc (DigitalVideoDisc... dvdList){
    
        for (DigitalVideoDisc D : dvdList) {
        	itemsOrdered.add(D);
        	System.out.println("The disc has been added");
        	if (itemsOrdered.size() == 20){
                System.out.println("The cart is full");
                break;
        	}
        }
        if (itemsOrdered.size() == 20){
            System.out.println("The cart is full");
        }
    }
    public void addDigitalVideoDisc (DigitalVideoDisc d1, DigitalVideoDisc d2){
        if (itemsOrdered.size() + 2 <= 20) {
        	itemsOrdered.add(d1);
            System.out.println("The disc has been added");
            itemsOrdered.add(d2);
            System.out.println("The disc has been added");
        }
        else if (itemsOrdered.size() == 19) {
        	itemsOrdered.add(d1);
        	System.out.println("The disc has been added");
        }
        if (itemsOrdered.size() == 20){
            System.out.println("The cart is full");
        }
    }
    public String toString(){

        return "DVD"+ "-" + this.title + "-" + this.category+ "-" +this.director + "-" + this.length + "-" + this.cost ;
    }
 
    }
    public void print(){
        System.out.println("***********************CART*********************** ");
        System.out.println("Ordered Items:  ");
        int i =1;
        for (DigitalVideoDisc item : itemsOrdered){
           
            System.out.println(i+"."+ item.toString());
        }


        System.out.println("Total cost :"+ this.totalCost());
        System.out.println("*************************************************** ");

    }
    

    public void searchById(int id){
        boolean found = false;
        for(DigitalVideoDisc item : itemsOrdered){
            if(id == item.getId){
                System.out.println("Dvd  found :"+ item.toString());
                found =true;
                break;
            }

        }if(!found){
            System.out.println("Dvd not found");
        }

    }
    public void searchBytitle(String title){
        boolean found = false;
        for(DigitalVideoDisc item : itemsOrdered){
            if(title == item.getTitle()){
                System.out.println("DVD found :"+item.toString());
                found = true;
                break;
            }
            if(!found){
                System.out.println("Dvd not found");
            }

    }

    
}
