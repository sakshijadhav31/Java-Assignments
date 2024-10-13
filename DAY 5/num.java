import java.util.*;
class num{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a =sc.nextInt();
		System.out.println("Enter Second number");
		int b =sc.nextInt();
		System.out.println("Enter Third number");
		int c =sc.nextInt();
		if(a>b&&a>c){
			System.out.println(a+"is a largest number");}
		else if(b>a&&b>c){
			System.out.println(b+"is a largest number");}

		else {
			System.out.println(c+ "is a largest number");}
}}


/* op: Enter first number
       20
       Enter Second number
       30
       Enter Third number
       40
       40is a largest number */