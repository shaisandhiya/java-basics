import java.util.Scanner;
class Secondsmallesttnumber{
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int i;
		int smallest=Integer.MAX_VALUE;
		int second=Integer.MAX_VALUE;
		System.out.print("n=");
		int n=scan.nextInt();
		for(i=1;i<=n;i++) {
			System.out.print("enter number"+i+":");
			int a=scan.nextInt();
			if(a<smallest) {
				second=smallest;
				smallest=a;
			}
	    	else if(a<second&&a!=smallest) {
	    		second=a;
	    	}
		}
	    System.out.println("second smallest number:"+second);
	}
}
