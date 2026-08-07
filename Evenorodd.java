import java.util.Scanner;
public class Evenorodd{
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Number:");
		int x=scan.nextInt();
		if (x%2==0) {
			System.out.println("It is even");
		}
		else {
			System.out.println("It is odd");
		}
	}

}
