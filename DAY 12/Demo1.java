import java.util.Scanner;
class Demo1{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1=sc.nextInt();
		System.out.println("Enter Second Number");
		int num2=sc.nextInt();
		int mul =num1*num2;
		int div=num1/num2;
		System.out.println("Multilpication is :"+ mul);
		System.out.println("Division is :"+ div);


}


}


/*Enter First Number
20
Enter Second Number
10
Multilpication is :200
Division is :2*/