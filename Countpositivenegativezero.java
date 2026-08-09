import java.util.Scanner;
class Countpositivenegativezero{
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int i;
		int p_count=0;
		int n_count=0;
		int z_count=0;
		System.out.print("enter numbers to find:");
		int n=scan.nextInt();
		for(i=1;i<=n;i+=1) {
			System.out.print("enter number"+i+":");
			int a=scan.nextInt();
			if(a>0) {
				p_count+=1;
			}
			else if(a<0) {
				n_count+=1;
			}
			else{
				z_count+=1;
			}
		}
		System.out.println("Postive number:"+p_count);
		System.out.println("Negative number:"+n_count);
		System.out.println("Zero count:"+z_count);
	}
}
