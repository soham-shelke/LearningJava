import java.util.*;

public class Parellelogram { 
     public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number of rows: ");
       int rows= sc.nextInt();
    for(int i = 1; i<=rows; i++ ){
        for(int j = rows-i; j>=0 ;j--){
            System.out.print(" ");
        }
        for(int j = 1; j<=i; j++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}}
