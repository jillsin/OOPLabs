package hust.soict.dsai.test.disc;

import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class TestPassingParameter {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        swap(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }

    public static void swap(Object o1, Object o2) {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }

 //tatic void swap(DigitalVideoDisc o1, DigitalVideoDisc o2){
    //     String ti = o1.getTitle();
    //     String cat = o1.getCategory();
    //     int len = o1.getLength();
    //     String dir = o1.getDirector();
    //     float cost = o1.getCost();

    //     o1.setTitle(o2.getTitle());
    //     o1.setCategory(o2.getCnategory());
    //     o1.setLength(o2.getLength());
    //     o1.setDirector(o2.getDirector());
    //     o1.setCost(o2.getCost());

    //     o2.setTitle(ti);
    //     o2.setCategory(cat);
    //     o2.setLength(len);
    //     o2.setDirector(dir);
    //     o2.setCost(cost);
    // }
}