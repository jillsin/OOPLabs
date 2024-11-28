package mainn;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    private static int nbDigitalVideoDiscs = 0;
    private int id ;
      public DigitalVideoDisc(String title) {
        this.title = title;
    }

    public DigitalVideoDisc(String title,String category ,float cost ) {
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
        this.title = title;
        this.category = category;
        this.cost = cost;
      
    }

    public DigitalVideoDisc(String title, String category,String director, float cost ) {
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
       
        
    }

    public DigitalVideoDisc(String title, String category,String director, int length,float cost ) {
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
        this.title = title; 
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        
        
    }
   

    public String getTitle() {
        return title;
    }
    public int getId() {
        return id;
    }

    
    public String getCategory(){
        return category;
    }
    public String getDirector(){
        return director;
    }
    public int getLength(){
        return length;
    }
    public float getCost(){
        return cost;
    }


    public void setTitle(String a){
         title = a;
    }
    public void setCategory(String a){
         category = a;
    }
    public void setDirector(String a){
         director = a;
    }
    public void setLength(int a){
         length = a;
    }
    public void setCost(float a){
         cost = a;
    }
  



}
