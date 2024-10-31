import java.util.*;
class Demo1{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1=sc.nextInt();
		System.out.println("Enter Second Number");
		int num2=sc.nextInt();
		if(num1<num2){
			System.out.println("The minimum number amongst"+num1 +" & "+num2 +" is: "+num1);}
		else{
			System.out.println("The minimum number amongst"+num1 +" & "+num2 +" is: "+num2);}


}}

/* Enter First Number
56
Enter Second Number
99
The minimum number amongst56 & 99 is: 56 */