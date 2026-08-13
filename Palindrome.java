import java.util.Scanner;
class Palindrome{
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter:");
		int s=scan.nextInt();
		int original=s;
		int rev=0;
		while(s>0){
			int digit=s%10;
			rev=rev*10+digit;
			s=s/10;
		}
		if(original==rev){
			System.out.println("palindrome");
			}
		else {
			System.out.println("not palinrome");
			
		}
	}
}
