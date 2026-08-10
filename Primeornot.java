import java.util.Scanner;
class Primeornot{
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int i;
		int count=0;
		System.out.print("Enter number:");
		int a=scan.nextInt();
		for(i=1;i<=a;i++) {
			if(a%i==0) {
				count++;
			}
		}
			if(count==2) {
				System.out.println("prime number");
			}
			else {
				System.out.println("it is not prime number");
		}
		
	}

}
