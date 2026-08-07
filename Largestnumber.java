import java.util.Scanner;
public class Largestnumber{
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter first Number:");
		int x=scan.nextInt();
		System.out.print("Enter Second Number:");
		int y=scan.nextInt();
		if (x>y) {
			System.out.println("Largest:"+x);
		}
		else {
			System.out.println("Largest:"+y);
		}
	}
}
