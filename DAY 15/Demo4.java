import java.util.*;
class Demo4{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1=sc.nextInt();
		System.out.println("Enter Second Number");
		int num2=sc.nextInt();
		System.out.println("Enter Third Number");
		int num3=sc.nextInt();
		if(num1>num2&&num1>num3){
			System.out.println("The maximum number amongst"+num1 +" & "+num2 +" & "+num3 +" is: "+num1);}
		else if(num2>num1&&num2>num3){
			System.out.println("The maximum number amongst"+num1 +" & "+num2 +" & "+num3+" is: "+num2);}
		else{
			System.out.println("The maximum number amongst"+num1 +" & "+num2 +" & "+num3+" is: "+num3);}


}}

/* Enter First Number
56
Enter Second Number
7
Enter Third Number
99
The maximum number amongst56 & 7 & 99 is: 99 */
