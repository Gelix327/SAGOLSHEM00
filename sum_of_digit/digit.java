import java.util.*;
public class digit {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = obj.nextInt();
        int sum = 0;
        while (number != 0) {
            int digit = number % 10; 
            sum += digit;          
            number /= 10;           
        }
        System.out.println("The sum of the digits is: " + sum);
    }
}

