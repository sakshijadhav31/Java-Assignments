import java.util.Scanner;
class Demo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1=sc.nextInt();
		System.out.println("Enter Second Number");
		int num2=sc.nextInt();
		int add =num1+num2;
		int sub=num1-num2;
		System.out.println("Addition is :"+ add);
		System.out.println("Substraction is :"+ sub);


}


}

/*Enter First Number
10
Enter Second Number
20
Addition is :30
Substraction is :-10*/