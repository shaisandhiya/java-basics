import java.util.Scanner;
class Reversenumber{
	public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	System.out.print("enter number to reverse:");
	int n=scan.nextInt();
	int i;
	int rev=0;
	while(n>0) {
		int digit=n%10; //helps to take last digit
		rev=rev*10+digit; // helps to build reverse 
		n=n/10;            // it removes last digit
	}
	System.out.print("Reverse="+rev);
}
}
