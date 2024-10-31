import java.util.*;
class Demo1{
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a input number");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++){
			if(i%2==0){
			System.out.println("cube of "+i +" is: "+ (i*i*i)+ " square of "+i +" is: "+(i*i));}}		


}




}

/* Enter a input number
   10
   cube of 2 is: 8 square of 2 is: 4 
   cube of 4 is: 64 square of 4 is: 16
   cube of 6 is: 216 square of 6 is: 36
   cube of 8 is: 512 square of 8 is: 64
   cube of 10 is: 1000 square of 10 is: 100 */