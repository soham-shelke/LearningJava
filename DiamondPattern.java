import java.util.*;

public class DiamondPattern { 
     public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number of rows: ");
       int rows= sc.nextInt();
        for(int i = 1; i<=rows ;i++){
            for(int j = rows-i;j>0;j--){
                System.out.print(" ");
              
            }
            for(int j = 1; j<=2*i-1;j++){
                System.out.print("*");
            }
          
            System.out.println();

        }
        for(int i = rows; i>=1 ;i--){
            for(int j = rows-i;j>0;j--){
                System.out.print(" ");
              
            }
            for(int j = 1; j<=2*i-1;j++){
                System.out.print("*");
            }
          
            System.out.println();

        }
        

     }}