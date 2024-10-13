import java.util.Scanner;
class Demo2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a=sc.nextInt();
		System.out.println("Enter 2nd number");
		int b=sc.nextInt();
		System.out.println("Enter 3rd number");
		int c=sc.nextInt();
		if(a>b&&a<c||a>c&&a<b){
			System.out.println(a+" "+"is a second largest number");
		}
		else if(b>a&&b<c||b>c&&b<a){
			System.out.println(b+" "+"is a second largest number");
		}
		else{
			System.out.println(c+" "+"is a second largest number");
			
}}}


/* op : Enter 1st number
        20
        Enter 2nd number
        30
        Enter 3rd number
        40
        30 is a second largest number */