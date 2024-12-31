import java.util.*;
public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of rows ");
        int row = sc.nextInt();

        
        System.out.print("Enter the Number of columns ");
        int columns = sc.nextInt();
        for(int i = 0; i<row; i++){
            for(int j = 0; j<columns ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
}
  
