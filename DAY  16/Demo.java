import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num/2;i++){
			if(num%i==0){
				sum=sum+i;}}
		if(num>0&&sum==num){
			System.out.println("number is a perfect number");}
		else{
			System.out.println("number is not a perfect number");}

}




}