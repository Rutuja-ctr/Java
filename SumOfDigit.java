import java.util.*;

public class SumOfDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digit : ");
        int digit = sc.nextInt();
        int sum = 0;
       while (digit>0) {

            int temp = digit % 10;
            sum += temp;
            digit = digit / 10;
        }
        System.out.println("Sum of digit is = " + sum);

    }
}