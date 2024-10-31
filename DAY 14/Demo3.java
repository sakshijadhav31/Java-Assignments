import java.util.*;
class Demo3{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int num1=sc.nextInt();
		System.out.println("enter second number");
		int num2=sc.nextInt();
		if(num1>num2){
			System.out.println("The Maximum number amongst "+num1+" & "+num2 +" is " +num1);}
		else{
			System.out.println("The Maximum number amongst "+num1+" & "+num2+ " is " +num2);}


}



}



/* enter first number
56
enter second number
99
The Maximum number amongst 56 & 99 is 99 */