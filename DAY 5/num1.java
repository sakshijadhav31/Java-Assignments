import java.util.*;
class num1{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a =sc.nextInt();
		System.out.println("Enter Second number");
		int b =sc.nextInt();
		System.out.println("Enter Third number");
		int c =sc.nextInt();
		if(a<b&&a<c){
			System.out.println(a+"is a Smallest number");}
		else if(b<a&&b<c){
			System.out.println(b+"is a Smallest number");}

		else {
			System.out.println(c+ "is a Smallest number");}
}}


/* op: Enter first number
       20
       Enter Second number
       30
       Enter Third number
       40
       20is a Smallest number */