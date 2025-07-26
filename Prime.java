import java.util.*;

public class Prime{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number to check whether it is prime or not :");
	int num = sc.nextInt();
	Boolean prime = true;
	for(int i= 2 ; i < num ; i++){
	if(num %2==0){
	prime = false;
	break;	
}
    }
	System.out.println(prime);

}
}