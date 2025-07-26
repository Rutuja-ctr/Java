import java.util.*;

public class ReverseNumber{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number : ");
	int num = sc.nextInt();
    int reverse =0;
	 
	while(num>0){
	int temp = num % 10;
	reverse = reverse * 10 + temp ;
	num = num / 10 ; 
}
	System.out.print("Reverse number is : " +reverse );
}
}
