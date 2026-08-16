import java.util.Scanner;
class countnumbers{
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter number:");
		int num=scan.nextInt();
		int count=0;
		while(num!=0){
			num= num/10;
			count+=1;
		}
		System.out.println("Count:"+count);
		}
}
