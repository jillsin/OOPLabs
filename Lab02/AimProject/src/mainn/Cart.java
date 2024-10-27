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

}
