import java.util.Scanner;

public class greater {
    public static void greater(int c, int d){
        if(c<d){
            System.out.println("B is greater.");
        }else if(c>d){
            System.out.println("A is greater.");
        }else{
            System.out.println("Both numbers are equal.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number A: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number B: ");
        int b = sc.nextInt();
        greater(a, b);
    }
}
