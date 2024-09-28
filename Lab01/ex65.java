import java.util.Arrays;
import java.util.Scanner;
public class ex65{
    public static void main (String[] args){
    Scanner scanner =new Scanner(System.in);
    int n = scanner.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = scanner.nextInt();
    }
    Arrays.sort(arr);
    
    int sum = 0;
    for(int i=0;i<n;i++){
        sum+=i;
    }
    
    double aver = (double) sum/n ;
  System.out.println("sort arr :" + Arrays.toString(arr));
  System.out.println("sum :" + sum );
  System.out.println("average :"+ aver);
}
}