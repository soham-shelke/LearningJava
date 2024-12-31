import java.util.*;
public class InvertedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of rows ");
        int row = sc.nextInt();

        for(int i = 1; i<=row; i++){
            for(int j = 1; j<=row ; j++){
                int x = row - i;
                if(j<=x){
                    System.out.print(" ");
                }
                else System.out.print("*");
            }
            System.out.println();
        }
}
}
  
