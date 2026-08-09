import java.util.Scanner;
class GradeCalculator{
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter mark:");
		int a=scan.nextInt();
		if(a>=90&&a<101) {
			System.out.println("Grade A");
		}
		else if(a>=80&&a<90) {
			System.out.println("Grade B");
		}
		else if(a>=70&&a<80) {
			System.out.println("Grade C");
		}
		else if(a>=60&&a<70) {
			System.out.println("Grade D");
		}
		else if(a<60&&a>=0) {
			System.out.println("Grade F");
		}
		else {
			System.out.println("invalid");
		}
	}
}
