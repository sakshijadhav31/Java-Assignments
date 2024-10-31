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
			System.out.println("Addition of " +num1 +" & "+num2 +" is "+(num1+num2));}	
		else if(sign=='-'){
			System.out.println("substarction of " +num1 +" & "+num2 +" is "+(num1-num2));}		
		else if(sign=='*'){
			System.out.println("Multiplication of " +num1 +" & "+num2 +" is "+(num1*num2));}		
		else if(sign=='/'){
			System.out.println("Division of " +num1 +" & "+num2 +" is "+(num1/num2));}		
		else{
			System.out.println("Enter a valid Sign");}

}


}


/*Enter First Number
10
Enter Second Number
20
Enter a sign
+
Addition of 10 & 20 is 30*/