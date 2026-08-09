import java.util.Scanner;
class Greatestnumber{
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter number 1:");
		int a=scan.nextInt();
		System.out.print("Enter number 2:");
		int b=scan.nextInt();
		System.out.print("Enter number 3:");
		int c=scan.nextInt();
		if (a>b && a>c) {
			System.out.println("A is greatest");
		}
		else if(b>a&&b>c) {
			System.out.println("B is greatest");
		}
		else {
			System.out.println("C is greatest");
		}
	}
}
