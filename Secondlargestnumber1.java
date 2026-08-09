class Secondlargestnumber1{
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int i;
		int largest=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		System.out.print("n=");
		int n=scan.nextInt();
		for(i=1;i<=n;i++) {
			System.out.print("enter number"+i+":");
			int a=scan.nextInt();
			if(a>largest) {
				second=largest;
				largest=a;
			}
	    	else if(a>second&&a!=largest) {
	    		second=a;
	    	}
		}
	    System.out.println("second largest number:"+second);
	}
}
