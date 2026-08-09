import java.util.Scanner;
class Positivenegativezero{
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter number:");
		int a=scan.nextInt();
		if (a>0) {
			System.out.println("It is positive number");
		}
		else if(a<0) {
			System.out.println("It is negative number");
		}
		else {
			System.out.println("It is zero");
		}
	}
}
