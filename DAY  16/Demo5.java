import java.util.*;
class Demo5{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number");
		int num2 = sc.nextInt();
		System.out.println("Enter Third Number");
		int num3 = sc.nextInt();
		if(num1<num2 && num1<num3){
			System.out.println(+num1+"is a Minimum number among "+num1 +" &"+num2+" &"+num3);}
		else if(num2<num1 && num2<num3){
			System.out.println(+num2+"is a Minimum number among "+num1 +" &" +num2+" &"+num3);}
		else{
			System.out.println(+num3+"is a Minimum number among "+num1  +" &"+num2+" &"+num3);}




}



}


/*Enter First Number
55
Enter Second Number
7
Enter Third Number
99
7is a Minimum number among 55 &7 &99*/