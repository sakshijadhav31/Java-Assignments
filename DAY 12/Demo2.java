import java.util.Scanner;
class Demo3{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1=sc.nextInt();
		System.out.println("Enter Second Number");
		int num2=sc.nextInt();
		System.out.println("Enter a sign");
		char sign =sc.next().charAt(0);
		if(sign=='+'){
			System.out.println("Addition of"+num1 " & "+num2 +"is"+(num1+num2));}			
		
}


}
