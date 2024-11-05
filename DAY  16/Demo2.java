import java.util.*;
class Demo2{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A First Number");
		int num1=sc.nextInt();
		System.out.println("Enter A Second Number");
		int num2=sc.nextInt();
		int fact;
		for(int i=num1;i<=num2;i++){
			fact=1;
			for(int j=1;j<=i;j++){
				fact*=j;}
			System.out.println("Factorial of"+i+"="+fact);
}}}



/* Enter A First Number
2
Enter A Second Number
5
Factorial of2=2
Factorial of3=6
Factorial of4=24
Factorial of5=120 */