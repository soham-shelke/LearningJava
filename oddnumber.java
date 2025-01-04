import java.util.*;

public class oddnumber {
    public static void odd(int a){
        for(int i = 1; i <=a;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find odd numbers till: ");
        int number = sc.nextInt();
        odd(number);
    }
}
