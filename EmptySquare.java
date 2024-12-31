import java.util.*;
public class EmptySquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of rows ");
        int row = sc.nextInt();

        
        System.out.print("Enter the Number of columns ");
        int columns = sc.nextInt();
        for(int i = 0; i<row; i++){
            for(int j = 0; j<columns ; j++){
                if(i==0 || i==row-1 || j==0 || j==columns-1){
                 System.out.print("*");}
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        
    }
}
  
