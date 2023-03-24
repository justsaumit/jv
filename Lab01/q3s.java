import java.util.Scanner;
public class q3s{
    public static void main(String args[]){
		int n;
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int fact=1;
		for(int i=1; i<=n; i++){
			fact=fact*i;
		}
		System.out.println("Factorial is: "+fact);
    }
}
