package OtherProjects.hust.soict.dsai.Lab01;
import java.util.Scanner;
public class ex62{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("what's your name?");
        
        String strName = keyboard.nextLine();
        
        System.out.println("How old are you?");
        
        int age = keyboard.nextInt();
        
        System.out.println("How tall are you ?");
        
        double height = keyboard.nextDouble();
        
        System.out.println("Mr/Mrs "+ strName +"," +age+"years old, height is :"+ height +"." );
    } 
}