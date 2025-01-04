import java.util.*;

public class average {
    public static void average(int a,int b,int c)
    {
        int sum = a + b + c;
        int average=sum/3;    
        System.out.println("The average of "+ a +", "+ b +", "+ c +" is " +average);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a,b,c :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        average(a,b,c);
    }
    
}
