import java.util.*;
class Demo3{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find its factorial");
		int num=sc.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++){
			fact=fact*i;}
		System.out.println("The factorial of"+num  +""+" is: "+" "+fact);
		
}}

/* Enter a number to find its factorial
5
The factorial of5 is:  120 */