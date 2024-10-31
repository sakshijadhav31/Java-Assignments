import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("min of series");
		int num1=sc.nextInt();
		System.out.println("max of series");
		int num2=sc.nextInt();
		System.out.println("Series of even numbers ranging between"+num1 +" & " +num2 +" is: ");
		for(int i=num1;i<=num2;i++){
			if(i%2==0){
				System.out.print(i+",");
}
}


}}


/* min of series
4
max of series
60
Series of even numbers ranging between4 & 60 is:
4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40,42,44,46,48,50,52,54,56,58,60 */